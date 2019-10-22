import { Injectable } from '@angular/core';
import { AnimalCompañia } from '../modelo/animal-compañia';
import { PublicacionAdopcion } from '../modelo/publicacion-adopcion';
import { PublicacionAEncontrado } from '../modelo/publicacion-aencontrado';
import { PublicacionAPerdido } from '../modelo/publicacion-aperdido';
import { Animal } from '../modelo/animal';

@Injectable({
  providedIn: 'root'
})
export class PublicacionService {
  private tipoPublicacion: string = '';
  private publicacionAdopcion: PublicacionAdopcion;
  private publicacionEncontrado: PublicacionAEncontrado;
  private publicacionPerdido: PublicacionAPerdido;
  private animal: Animal;

  setTipoPublicacion(nom: string){
    this.tipoPublicacion = nom;
    console.log(this.tipoPublicacion);
  }

  send(animal: AnimalCompañia){
    this.animal = new Animal;
    this.animal.nombre = animal.nombre;
    this.animal.especie = animal.especie;
    this.animal.color = animal.color1;
    this.animal.sexo = (animal.esHembra == true? 'Hembra' : 'Macho');
    this.animal.esterilizado = (animal.esterilizado == true? 'Esterilizado' : 'Sin esterilizar');

    if(this.tipoPublicacion == 'adopcion'){
      this.publicacionAdopcion = new PublicacionAdopcion;
      this.publicacionAdopcion.animalAsociado = this.animal;
      this.publicacionAdopcion.descripcion = animal.descripcion;
      this.publicacionAdopcion.localidad = 'Bogota';
      this.publicacionAdopcion.adoptado = false;
    }
    else if(this.tipoPublicacion == 'encontrado'){
      this.publicacionEncontrado = new PublicacionAEncontrado;
      this.publicacionEncontrado.animalAsociado = this.animal;
      this.publicacionEncontrado.descripcion = animal.descripcion;
      this.publicacionEncontrado.localidad = 'Bogota';
      this.publicacionEncontrado.lugarEncontrado = 'Bogota';
      this.publicacionEncontrado.encontrado = false;
    }
    else if(this.tipoPublicacion == 'perdido'){
      this.publicacionPerdido = new PublicacionAPerdido;
      this.publicacionPerdido.animalAsociado = this.animal;
      this.publicacionPerdido.descripcion = animal.descripcion;
      this.publicacionPerdido.localidad = 'Bogota';
      this.publicacionPerdido.lugarPerdido = 'Bogota';
      this.publicacionPerdido.encontrado = false;
    }
  }

  constructor(http: HTT) { }
}

import { Injectable } from '@angular/core';
import { AnimalCompañia } from '../modelo/animal-compañia';
import { PublicacionAdopcion } from '../modelo/publicacion-adopcion';
import { PublicacionAEncontrado } from '../modelo/publicacion-aencontrado';
import { PublicacionAPerdido } from '../modelo/publicacion-aperdido';
import { Animal } from '../modelo/animal';
import { HttpClient, HttpHeaders } from '@angular/common/http';

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

  getTipoPublicacion():string{
    return this.tipoPublicacion;
  }

  send(animal: AnimalCompañia){

    this.animal = new Animal;
    this.animal.nombre = animal.nombre;
    this.animal.especie = animal.especie;
    this.animal.color = animal.color1;
    this.animal.sexo = (animal.esHembra == true? 'H' : 'M');
    this.animal.esterilizado = (animal.esterilizado == true? 'true' : 'false');
    const formHeaders = new HttpHeaders();
      formHeaders.append('Content-Type', 'application/x-www-form-urlencoded');

    if(this.tipoPublicacion == 'adopcion'){
      this.publicacionAdopcion = new PublicacionAdopcion;
      this.publicacionAdopcion.animal = this.animal;
      this.publicacionAdopcion.descripcion = animal.descripcion;
      this.publicacionAdopcion.localidad = 'Bogota';
      this.publicacionAdopcion.adoptado = false;

      
      console.log(this.publicacionAdopcion);
      //console.log(
        this.http.post('http://localhost:9890/usuario/1/publicacionAAdopcion',
        this.publicacionAdopcion).subscribe(data=> {
          console.log('entra');
        },
        err => {
          console.log('error');
          console.log(err);
        })
        //)
        ;
    }
    else if(this.tipoPublicacion == 'encontrado'){
      this.publicacionEncontrado = new PublicacionAEncontrado;
      this.publicacionEncontrado.animal = this.animal;
      this.publicacionEncontrado.descripcion = animal.descripcion;
      this.publicacionEncontrado.localidad = 'Bogota';
      this.publicacionEncontrado.lugarEncontrado = 'Bogota';
      this.publicacionEncontrado.encontrado = false;
      this.http.post('http://localhost:9890/usuario/1/publicacionAEncontrado',
        this.publicacionEncontrado).subscribe(data=> {
          console.log('entra');
        },
        err => {
          console.log('error');
          console.log(err);
        })
        //)
        ;
    }
    else if(this.tipoPublicacion == 'perdido'){
      this.publicacionPerdido = new PublicacionAPerdido;
      this.publicacionPerdido.animal = this.animal;
      this.publicacionPerdido.descripcion = animal.descripcion;
      this.publicacionPerdido.localidad = 'Bogota';
      this.publicacionPerdido.lugarPerdido = 'Bogota';
      this.publicacionPerdido.encontrado = false;
      this.http.post('http://localhost:9890/usuario/1/publicacionAPerdido',
        this.publicacionPerdido).subscribe(data=> {
          console.log('entra');
        },
        err => {
          console.log('error');
          console.log(err);
        })
        //)
        ;
    }
  }

  constructor(private http: HttpClient) { }
}

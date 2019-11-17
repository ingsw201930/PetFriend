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
  urls: any[] = [];

  setTipoPublicacion(nom: string){
    this.tipoPublicacion = nom;
    console.log(this.tipoPublicacion);
  }

  getTipoPublicacion():string{
    return this.tipoPublicacion;
  }

  getRandom(): PublicacionAdopcion[]{
    this.http.get('http://localhost:9890/public/paginaPrincipal').subscribe(data=> {
      console.log(data);
      return data;
    },
    err => {
      console.log('error');
      console.log(err);
    })
    return null;
    //)
    ;
  }

  send(animal: AnimalCompañia){

    this.animal = new Animal;
    this.animal.nombre = animal.nombre;
    this.animal.especie = animal.especie;
    this.animal.color1 = animal.color1;
    this.animal.sexo = (animal.esHembra == true? 'H' : 'M');
    this.animal.esterilizado = (animal.esterilizado == true? 'true' : 'false');
    const formHeaders = new HttpHeaders();
      formHeaders.append('Content-Type', 'application/x-www-form-urlencoded');

    if(this.tipoPublicacion == 'adopcion'){
      this.publicacionAdopcion = new PublicacionAdopcion;
      this.publicacionAdopcion.animal = this.animal;
      this.publicacionAdopcion.descripcion = animal.descripcion;
      this.publicacionAdopcion.localidad = 'Bogota'; //TODO
      this.publicacionAdopcion.adoptado = false;
      if(this.urls[0] !== 'assets/pet.png')
        this.publicacionAdopcion.imagen1 = this.urls[0];
      if(this.urls[1] !== 'assets/pet.png')
        this.publicacionAdopcion.imagen2 = this.urls[1];
      if(this.urls[2] !== 'assets/pet.png')
        this.publicacionAdopcion.imagen3 = this.urls[2];
      if(this.urls[3] !== 'assets/pet.png')
        this.publicacionAdopcion.imagen4 = this.urls[3];

      
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
      this.publicacionEncontrado.localidad = 'Bogota'; //TODO
      this.publicacionEncontrado.lugarEncontrado = 'Bogota'; //TODO
      this.publicacionEncontrado.encontrado = false;
      if(this.urls[0] !== 'assets/pet.png')
        this.publicacionEncontrado.imagen1 = this.urls[0];
      if(this.urls[1] !== 'assets/pet.png')
        this.publicacionEncontrado.imagen2 = this.urls[1];
      if(this.urls[2] !== 'assets/pet.png')
        this.publicacionEncontrado.imagen3 = this.urls[2];
      if(this.urls[3] !== 'assets/pet.png')
        this.publicacionEncontrado.imagen4 = this.urls[3];

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
      this.publicacionPerdido.localidad = 'Bogota'; //TODO
      this.publicacionPerdido.lugarPerdido = 'Bogota'; //TODO
      this.publicacionPerdido.encontrado = false;
      if(this.urls[0] !== 'assets/pet.png')
        this.publicacionPerdido.imagen1 = this.urls[0];
      if(this.urls[1] !== 'assets/pet.png')
        this.publicacionPerdido.imagen2 = this.urls[1];
      if(this.urls[2] !== 'assets/pet.png')
        this.publicacionPerdido.imagen3 = this.urls[2];
      if(this.urls[3] !== 'assets/pet.png')
        this.publicacionPerdido.imagen4 = this.urls[3];

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

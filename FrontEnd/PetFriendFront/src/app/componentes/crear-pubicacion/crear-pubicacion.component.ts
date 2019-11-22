import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AnimalCompañiaService } from 'src/app/servicios/animal-compañia.service';
import { AnimalCompañia } from 'src/app/modelo/animal-compañia';
import { PublicacionService } from 'src/app/servicios/publicacion.service';

@Component({
  selector: 'app-crear-pubicacion',
  templateUrl: './crear-pubicacion.component.html',
  styleUrls: ['./crear-pubicacion.component.css']
})
export class CrearPubicacionComponent implements OnInit {
  nombre: string = '';
  especie: string = '';
  raza: string = '';
  edad: string = '';
  color1: string = '';
  color2: string = '';
  descripcion: string = '';
  generoAnimal: string;
  esterilizadoAnimal: string;
  animal: AnimalCompañia = new AnimalCompañia;
  title: string = 'imagen';
  fecha: string = '';
  ban: boolean =this.servP.getTipoPublicacion() == 'adopcion';
  generos: string[] = ['Macho','Hembra'];
  opciones: string[] = ['Si', 'No'];
  lat = 4.628385;
  lng = -74.064968;
  drag = true;

  imgURL: any;
  public message: string;

  imageSrc: string;

  url1: any = 'assets/pet.png';
  url2: any = 'assets/pet.png';
  url3: any = 'assets/pet.png';
  url4: any = 'assets/pet.png';

  urls: any[] = [];
  constructor(private router: Router, private service: AnimalCompañiaService, private servP: PublicacionService) { }

  ngOnInit() {
    this.servP.urls=[];
  }
  preview(files) {
    const mimeType = files[0].type;
    if (mimeType.match(/image\/*/) == null) {
      console.log('Only images are supported.');
      return;
    }
    const reader = new FileReader();
    reader.readAsDataURL(files[0]);
    // tslint:disable-next-line: variable-name
    reader.onload = (_event) => {
      if (this.url1 === 'assets/pet.png') {
        this.servP.urls[0]=reader.result;
        this.url1 = this.servP.urls[0];
        //console.log(this.url1);
        return;
      }

      if (this.url2 === 'assets/pet.png') {
        this.servP.urls[1]=reader.result;
        this.url2 = this.servP.urls[1];
        return;
      }
      if (this.url3 === 'assets/pet.png') {
        this.servP.urls[2]=reader.result;
        this.url3 = this.servP.urls[2];
        return;
      }
      if (this.url4 === 'assets/pet.png') {
        this.servP.urls[3]=reader.result;
        this.url4 = this.servP.urls[3];
        return;
      }
    };
  }

  publicar(){
    this.animal.nombre = this.nombre;
    this.animal.especie = this.especie;
    this.animal.raza = this.raza;
    this.animal.edad = this.edad;
    this.animal.color1 = this.color1;
    this.animal.color2 = this.color2;
    this.animal.genero = this.generoAnimal;
    this.animal.esterilizado = (this.esterilizadoAnimal == 'Si'? true : false);
    this.animal.descripcion = this.descripcion;
    this.animal.fecha = this.fecha;
    this.service.animal = this.animal;
    this.router.navigate(['/VistaPrevia']);
  }




  onChoseLocation(event){
    console.log(event);
    this.lat = event.coords.lat;
    this.lng = event.coords.lng;
  }
}

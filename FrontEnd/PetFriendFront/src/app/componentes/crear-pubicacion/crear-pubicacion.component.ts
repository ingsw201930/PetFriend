import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AnimalCompañiaService } from 'src/app/servicios/animal-compañia.service';
import { AnimalCompañia } from 'src/app/modelo/animal-compañia';

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
  esHembra: boolean = false;
  esterilizado: boolean = false;
  animal: AnimalCompañia = new AnimalCompañia;
  title: string = 'imagen';

  imgURL: any;
  public message: string;

  imageSrc: string;

  url1: any = 'assets/pet.png';
  url2: any = 'assets/pet.png';
  url3: any = 'assets/pet.png';
  url4: any = 'assets/pet.png';

  urls: any[] = [];
  constructor(private router: Router, private service: AnimalCompañiaService) { }

  ngOnInit() {

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
        this.url1 = reader.result;
        console.log(this.url1);
        return;
      }

      if (this.url2 === 'assets/pet.png') {
        this.url2 = reader.result;
        return;
      }
      if (this.url3 === 'assets/pet.png') {
        this.url3 = reader.result;
        return;
      }
      if (this.url4 === 'assets/pet.png') {
        this.url4 = reader.result;
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
    this.animal.esHembra = this.esHembra;
    this.animal.esterilizado = this.esterilizado;
    this.animal.descripcion = this.descripcion;
    this.service.animal = this.animal;
    this.router.navigate(['/VistaPrevia']);
  }

}

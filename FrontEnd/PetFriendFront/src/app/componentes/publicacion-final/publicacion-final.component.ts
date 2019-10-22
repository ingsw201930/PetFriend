import { Component, OnInit } from '@angular/core';
import { AnimalCompañia } from 'src/app/modelo/animal-compañia';
import { Router } from '@angular/router';
import { AnimalCompañiaService } from 'src/app/servicios/animal-compañia.service';

@Component({
  selector: 'app-publicacion-final',
  templateUrl: './publicacion-final.component.html',
  styleUrls: ['./publicacion-final.component.css']
})
export class PublicacionFinalComponent implements OnInit {
  title: string;
  nombreAnimal: string;
  especieAnimal: string;
  edadAnimal: string;
  generoAnimal: string;
  razaAnimal: string;
  color1Animal: string;
  color2Animal: string;
  esterilizadoAnimal: string;
  localidadAnimal: string;
  descripcionPublicacion: string;
  animal: AnimalCompañia;
  // tslint:disable-next-line: max-line-length
  constructor(private router: Router, private servicio: AnimalCompañiaService) {}
  ngOnInit() {
    this.animal = this.servicio.getAnimal();
    this.nombreAnimal = this.animal.nombre;
    this.especieAnimal = this.animal.especie;
    this.edadAnimal = this.animal.edad;
    this.generoAnimal = (this.animal.esHembra == true? 'Hembra' : 'Macho');
    this.razaAnimal = this.animal.raza;
    this.color1Animal = this.animal.color1;
    this.color2Animal = this.animal.color2;
    this.esterilizadoAnimal = (this.animal.esHembra == true? 'Esterilizado' : 'Sin esterilizar');
    this.descripcionPublicacion = this.animal.descripcion;
    this.localidadAnimal = 'Bogotá';
  }
}

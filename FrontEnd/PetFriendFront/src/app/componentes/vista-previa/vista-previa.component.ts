import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AnimalCompañiaService } from 'src/app/servicios/animal-compañia.service';
import { AnimalCompañia } from 'src/app/modelo/animal-compañia';
import { Publicacion } from 'src/app/modelo/publicacion';
import { PublicacionService } from 'src/app/servicios/publicacion.service';

@Component({
  selector: 'app-vista-previa',
  templateUrl: './vista-previa.component.html',
  styleUrls: ['./vista-previa.component.css']
})
export class VistaPreviaComponent implements OnInit {
    
  
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
  constructor(private router: Router, private servAnimal: AnimalCompañiaService, private servPub: PublicacionService) {}
  ngOnInit() {
    this.animal = this.servAnimal.getAnimal();
    this.nombreAnimal = this.animal.nombre;
    this.especieAnimal = this.animal.especie;
    this.edadAnimal = this.animal.edad;
    this.generoAnimal = (this.animal.esHembra == true? 'Hembra' : 'Macho');
    this.razaAnimal = this.animal.raza;
    this.color1Animal = this.animal.color1;
    this.color2Animal = this.animal.color2;
    this.esterilizadoAnimal = (this.animal.esterilizado == true? 'Esterilizado' : 'Sin esterilizar');
    this.descripcionPublicacion = this.animal.descripcion;
    this.localidadAnimal = 'Bogotá';
  }

  enviarPublicacion() {
    this.servPub.send(this.animal);
  }
}

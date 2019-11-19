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
  fecha: string;
  ban: boolean;
  // tslint:disable-next-line: max-line-length
  constructor(private router: Router, private servAnimal: AnimalCompañiaService, private servPub: PublicacionService) {}
  url1: any = this.servAnimal.urls[0];
  url2: any = this.servAnimal.urls[1];
  url3: any = this.servAnimal.urls[2];
  url4: any = this.servAnimal.urls[3];
  ngOnInit() {
    this.ban = this.servPub.getTipoPublicacion() == 'adopcion';

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
    this.fecha = this.animal.fecha;
  }

  enviarPublicacion() {
    console.log("llegamos aquí");
    this.servPub.send(this.animal);
    this.router.navigate(['/PublicacionFinal']);
  }
}

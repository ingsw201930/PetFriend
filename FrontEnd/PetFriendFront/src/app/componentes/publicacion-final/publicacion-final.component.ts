import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-publicacion-final',
  templateUrl: './publicacion-final.component.html',
  styleUrls: ['./publicacion-final.component.css']
})
export class PublicacionFinalComponent implements OnInit {
  title = 'PetFriend';
  nombreAnimal = 'Nombre';
  especieAnimal = 'Especie';
  edadAnimal = 'Edad';
  generoAnimal = 'Genero';
  razaAnimal = 'Raza';
  color1Animal = 'Color1';
  color2Animal = 'Color2';
  esterilizadoAnimal = 'Si';
  localidadAnimal = 'LocalidadAnimal';
  // tslint:disable-next-line: max-line-length
  descripcionPublicacion = 'Descripción Descripción Descripción Descripción Descripción Descripción Descripción Descripción Descripción Descripción Descripción Descripción ';
  ngOnInit() {
  }
}

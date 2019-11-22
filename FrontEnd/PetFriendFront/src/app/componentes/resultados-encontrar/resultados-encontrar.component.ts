import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-resultados-encontrar',
  templateUrl: './resultados-encontrar.component.html',
  styleUrls: ['./resultados-encontrar.component.css']
})
export class ResultadosEncontrarComponent implements OnInit {
  cantidadPublicaciones: number = 10; 
  tituloPublicacion: string;
  descripcionPublicacion: string;
  show: boolean = true;
  items = ['First', 'Second', 'Third','First', 'Second', 'Third'];
  constructor() { }

  ngOnInit() {
    this.tituloPublicacion = 'Titulo';
    this.descripcionPublicacion = 'Descripcion';
    this.show = true;
  }

}

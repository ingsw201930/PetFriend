import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-resultados-servicios',
  templateUrl: './resultados-servicios.component.html',
  styleUrls: ['./resultados-servicios.component.css']
})
export class ResultadosServiciosComponent implements OnInit {
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

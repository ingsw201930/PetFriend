import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-resultados-busqueda',
  templateUrl: './resultados-busqueda.component.html',
  styleUrls: ['./resultados-busqueda.component.css']
})
export class ResultadosBusquedaComponent implements OnInit {
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

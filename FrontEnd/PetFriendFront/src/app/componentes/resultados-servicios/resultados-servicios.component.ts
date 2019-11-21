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
  constructor() { }

  ngOnInit() {
    this.tituloPublicacion = 'Titulo';
    this.descripcionPublicacion = 'Descripcion';
    
  }

}

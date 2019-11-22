import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-resultados-adopta',
  templateUrl: './resultados-adopta.component.html',
  styleUrls: ['./resultados-adopta.component.css']
})
export class ResultadosAdoptaComponent implements OnInit {
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

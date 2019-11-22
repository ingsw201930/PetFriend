import { Component, OnInit,Output,  EventEmitter } from '@angular/core';

@Component({
  selector: 'app-adopta-avanzado',
  templateUrl: './adopta-avanzado.component.html',
  styleUrls: ['./adopta-avanzado.component.css']
})
export class AdoptaAvanzadoComponent implements OnInit {
  Basico: boolean = true;
  especie: string = '';
  raza: string = '';
  edad: string = '';
  color1: string = '';
  color2: string = '';
  genero: string='';
  esterilizado: string='';
  constructor() { }

  ngOnInit() {
  }


  buscar(){}
  cambiarMetodo(){}

}

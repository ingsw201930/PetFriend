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

  @Output() salidaEspecie = new EventEmitter<string>();
  @Output() salidaRaza = new EventEmitter<string>();
  @Output() salidaEdad = new EventEmitter<string>();
  @Output() salidaColor1 = new EventEmitter<string>();
  @Output() salidaColor2 = new EventEmitter<string>();
  @Output() salidaGenero = new EventEmitter<string>();
  @Output() salidaEsterilizado = new EventEmitter<string>();
  constructor() { }

  ngOnInit() {
  }



  onClick(){
    this.salidaEspecie.emit(this.especie);
    this.salidaRaza.emit(this.raza);
    this.salidaEdad.emit(this.edad);
    this.salidaColor1.emit(this.color1);
    this.salidaColor2.emit(this.color2);
    this.salidaGenero.emit(this.genero);
    this.salidaEsterilizado.emit(this.esterilizado);
  }

}

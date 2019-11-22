import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-encontrar-avanzado',
  templateUrl: './encontrar-avanzado.component.html',
  styleUrls: ['./encontrar-avanzado.component.css']
})
export class EncontrarAvanzadoComponent implements OnInit {
  Basico: boolean = true;
  especie: string = '';
  raza: string = '';
  edad: string = '';
  color1: string = '';
  color2: string = '';
  genero: String='';
  esterilizado: String='';
  constructor() { }

  ngOnInit() {
  }

  cambiarMetodo(){
    if(this.Basico == false){
      this.Basico = true;
    }
    else{
      this.Basico = false;
    }
  }

  buscar(){
    
  }
}

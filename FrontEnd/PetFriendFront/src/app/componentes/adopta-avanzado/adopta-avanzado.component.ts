import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-adopta-avanzado',
  templateUrl: './adopta-avanzado.component.html',
  styleUrls: ['./adopta-avanzado.component.css']
})
export class AdoptaAvanzadoComponent implements OnInit {
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

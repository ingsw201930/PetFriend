import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-buscar-encontrados',
  templateUrl: './buscar-encontrados.component.html',
  styleUrls: ['./buscar-encontrados.component.css']
})
export class BuscarEncontradosComponent implements OnInit {
  Basico: boolean = true;
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

}

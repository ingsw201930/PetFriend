import { Component, OnInit, Input } from '@angular/core';
import { Router } from '@angular/router';
import { Servicio } from 'src/app/modelo/servicio';
import { BuscarServicioService } from 'src/app/servicios/buscar-servicio.service';


@Component({
  selector: 'app-buscar-servicio',
  templateUrl: './buscar-servicio.component.html',
  styleUrls: ['./buscar-servicio.component.css']
})
export class BuscarServicioComponent implements OnInit {
  Basico: boolean = true;
  Buscar: string;
  algo: string;
  resultado: string;
  servicioBuscar: Servicio;

  constructor( private serv: BuscarServicioService) { }

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

  algoF(){
    this.servicioBuscar = this.serv.getServicio();
    this.resultado = this.servicioBuscar.especie;
  }
  
}

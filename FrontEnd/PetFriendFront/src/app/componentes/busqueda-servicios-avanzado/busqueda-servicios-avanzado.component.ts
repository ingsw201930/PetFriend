import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { BuscarServicioService } from 'src/app/servicios/buscar-servicio.service';
import { Servicio } from 'src/app/modelo/servicio';

@Component({
  selector: 'app-busqueda-servicios-avanzado',
  templateUrl: './busqueda-servicios-avanzado.component.html',
  styleUrls: ['./busqueda-servicios-avanzado.component.css']
})
export class BusquedaServiciosAvanzadoComponent implements OnInit {
  especie1: string = 'felino';
  veterinaria = false;
  refugio = false;
  peluqueria = false;
  comida = false;
  accesorios = false;
  paseo = false;
  guarderia = false;
  banos = false;
  aseo = false;
  juguetes = false;
  snacks = false;
  theCheckbox = false;
  marked = false;
  servicioBuscar:Servicio;
  nombreBusqueda:string = 'www';
  show:boolean = false;;

  @Output() salida = new EventEmitter<string>();

  constructor(private serv: BuscarServicioService) { }

  ngOnInit() {

  }

  toggleVisibility(e){
    this.marked= e.target.checked;
  }

  func1(){

    if(this.show == false){
      this.salida.emit(this.especie1);
      this.servicioBuscar = this.serv.getServicio();
      this.servicioBuscar.especie = this.especie1;
      this.show = true;
      this.serv.setServicio(this.servicioBuscar);
      
    }
    else{
      this.show = false;
    }

    
    console.log("algo");
    
  }

}

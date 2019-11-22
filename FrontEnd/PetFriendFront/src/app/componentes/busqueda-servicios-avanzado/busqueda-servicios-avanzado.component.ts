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
  especie: string;
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
  servicioAvanzado:Servicio;
  show:boolean = false;;

  @Output() salidaVeterinaria = new EventEmitter<boolean>();
  @Output() salidaRefugio = new EventEmitter<boolean>();
  @Output() salidaPeluqueria = new EventEmitter<boolean>();
  @Output() salidaComida = new EventEmitter<boolean>();
  @Output() salidaAccesorios = new EventEmitter<boolean>();
  @Output() salidaPaseo = new EventEmitter<boolean>();
  @Output() salidaGuarderia = new EventEmitter<boolean>();
  @Output() salidaBanos = new EventEmitter<boolean>();
  @Output() salidaAseo = new EventEmitter<boolean>();
  @Output() salidaJuguetes = new EventEmitter<boolean>();
  @Output() salidaSnacks = new EventEmitter<boolean>();
  @Output() salidaEspecie = new EventEmitter<string>();

  constructor() { }

  ngOnInit() {

  }

  toggleVisibility(e){
    this.marked = e.target.checked;

    this.salidaVeterinaria.emit(this.veterinaria);
    this.salidaRefugio.emit(this.refugio);
    this.salidaPeluqueria.emit(this.peluqueria);
    this.salidaComida.emit(this.comida);
    this.salidaAccesorios.emit(this.accesorios);
    this.salidaPaseo.emit(this.paseo);
    this.salidaGuarderia.emit(this.guarderia);
    this.salidaBanos.emit(this.banos);
    this.salidaAseo.emit(this.aseo);
    this.salidaJuguetes.emit(this.juguetes);
    this.salidaSnacks.emit(this.snacks);
    
  }

  onClick(){
      this.salidaEspecie.emit(this.especie);
    
  }

}

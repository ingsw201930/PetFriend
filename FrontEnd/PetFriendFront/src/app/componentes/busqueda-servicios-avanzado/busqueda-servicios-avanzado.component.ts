import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-busqueda-servicios-avanzado',
  templateUrl: './busqueda-servicios-avanzado.component.html',
  styleUrls: ['./busqueda-servicios-avanzado.component.css']
})
export class BusquedaServiciosAvanzadoComponent implements OnInit {
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

  constructor() { }

  ngOnInit() {

  }

  toggleVisibility(e){
    this.marked= e.target.checked;
  }

}

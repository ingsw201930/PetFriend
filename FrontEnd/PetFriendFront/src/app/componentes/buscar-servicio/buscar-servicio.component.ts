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
  veterinaria: boolean = false;
  refugio:boolean = false;
  peluqueria:boolean = false;
  comida:boolean = false;
  accesorio:boolean = false;
  paseo:boolean = false;
  guarderia:boolean = false;
  banos:boolean = false;
  aseo:boolean = false;
  juguetes:boolean = false;
  snacks:boolean = false;
  especie:boolean = false;

  constructor(private router: Router) { }

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
    this.router.navigate(['Resultados-Servicios']);
  }

}

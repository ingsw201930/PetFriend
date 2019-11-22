import { Component, OnInit } from '@angular/core';
import { Servicio } from 'src/app/modelo/servicio';

@Component({
  selector: 'app-registro-servicio',
  templateUrl: './registro-servicio.component.html',
  styleUrls: ['./registro-servicio.component.css']
})
export class RegistroServicioComponent implements OnInit {

  servicio: Servicio;
  url1: any = 'assets/selfService.png';

  constructor() { }

  ngOnInit() {
  }

}

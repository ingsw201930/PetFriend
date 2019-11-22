import { Injectable } from '@angular/core';
import { Servicio } from '../modelo/servicio';

@Injectable({
  providedIn: 'root'
})
export class BuscarServicioService {
  servicio: Servicio;
  constructor() { }
  setServicio(serv: Servicio) {
    this.servicio = serv;
  }
  getServicio():Servicio{
    return this.servicio;
  }

}

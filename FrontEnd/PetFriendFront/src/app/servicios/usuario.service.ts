import { Injectable } from '@angular/core';
import { Sesion } from '../modelo/sesion';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  sesion: Sesion = new Sesion();

  setSesion(sesion: Sesion){
    this.sesion = sesion;
  }

  getCorreo(){
    return this.sesion.correo;
  }

  getId(){
    return this.sesion.id;
  }

  getSesionIniciada(){
    return this.sesion.sesion_iniciada;
  }
}

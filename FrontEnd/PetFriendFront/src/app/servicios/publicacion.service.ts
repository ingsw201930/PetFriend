import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PublicacionService {
  private tipoPublicacion: string = '';

  setTipoPublicacion(nom: string){
    this.tipoPublicacion = nom;
    console.log(this.tipoPublicacion);
  }

  constructor() { }
}

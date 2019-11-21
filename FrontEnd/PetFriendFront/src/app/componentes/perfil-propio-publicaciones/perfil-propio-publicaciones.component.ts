import { Component, OnInit } from '@angular/core';
import { Publicacion } from 'src/app/modelo/publicacion';
import { Router } from '@angular/router';

@Component({
  selector: 'app-perfil-propio-publicaciones',
  templateUrl: './perfil-propio-publicaciones.component.html',
  styleUrls: ['./perfil-propio-publicaciones.component.css']
})
export class PerfilPropioPublicacionesComponent implements OnInit {
  nombreUsuario: string;
  tituloPublicacion: string;
  descripcionPublicacion: string;
  cantidadPublicaciones: number = 0; 
  show: boolean = true;
  publicaciones: Publicacion[];
  items = ['First', 'Second', 'Third'];
  public stuff:any[] = [];


  constructor(private router: Router) { }

  ngOnInit() {
    this.nombreUsuario = 'aaa';
    this.tituloPublicacion = 'Titulo';
    this.descripcionPublicacion = 'Descripcion';
    
    if(this.cantidadPublicaciones >= 1){
      this.show = true;
    }
    else{
      this.show = false;
      this.router.navigate(['/VistaPrevia']);
    }
  }


}

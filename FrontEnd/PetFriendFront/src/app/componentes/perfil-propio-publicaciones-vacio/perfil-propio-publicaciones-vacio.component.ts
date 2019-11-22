import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-perfil-propio-publicaciones-vacio',
  templateUrl: './perfil-propio-publicaciones-vacio.component.html',
  styleUrls: ['./perfil-propio-publicaciones-vacio.component.css']
})
export class PerfilPropioPublicacionesVacioComponent implements OnInit {
  nombreUsuario: string;
  cantidadPublicaciones: number = 0; 
  imagen: any = 'assets/Perro.png';
  constructor(private router: Router) { }
  url1: any;
  ngOnInit() {
    this.nombreUsuario = 'aaa';
    if(this.cantidadPublicaciones >= 1){
      this.router.navigate(['/Perfil-Publicaciones']);
    }
  }

  irAPublicar(){
    this.router.navigate(['/TiposDePublicacion']);
  }


}

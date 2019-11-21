import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-perfil-entidad',
  templateUrl: './perfil-entidad.component.html',
  styleUrls: ['./perfil-entidad.component.css']
})
export class PerfilEntidadComponent implements OnInit {
  nombreEntidad: string;
  correoEntidad: string;
  direccionEntidad: string;
  nitEntidad: string;
  constructor() { }

  ngOnInit() {
    this.nombreEntidad = 'aaa';
    this.correoEntidad = 'aaa';
    this.direccionEntidad = 'aaa';
    this.nitEntidad = '12345';
  }

}

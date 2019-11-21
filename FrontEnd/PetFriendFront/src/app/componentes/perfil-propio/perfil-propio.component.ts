import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-perfil-propio',
  templateUrl: './perfil-propio.component.html',
  styleUrls: ['./perfil-propio.component.css']
})
export class PerfilPropioComponent implements OnInit {
  nombreUsuario: string;
  correoUsuario: string;
  direccionUsuario: string;

  constructor() { }

  ngOnInit() {
    this.nombreUsuario = 'aaa';
    this.correoUsuario = 'aaa';
    this.direccionUsuario = 'aaa';
  }

}

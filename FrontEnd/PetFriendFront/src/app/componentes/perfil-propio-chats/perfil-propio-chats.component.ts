import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-perfil-propio-chats',
  templateUrl: './perfil-propio-chats.component.html',
  styleUrls: ['./perfil-propio-chats.component.css']
})
export class PerfilPropioChatsComponent implements OnInit {
  nombreUsuario: string;
  nombreUsuarioChat: string;
  descripcionMensaje: string;
  cantidadMensajes: number;
  url1:any;
  constructor() { }

  ngOnInit() {
    this.nombreUsuario = 'aaa';
    this.nombreUsuarioChat = 'usuario2';
    this.descripcionMensaje = 'Descripcion descripcion Descripcion descripcion Descripcion descripcion Descripcion descripcion';
    this.cantidadMensajes = 2;
  }

}

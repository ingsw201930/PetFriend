import { Component, OnInit } from '@angular/core';
import { Usuario} from 'src/app/modelo/usuario';

@Component({
  selector: 'app-registrar-usuario',
  templateUrl: './registrar-usuario.component.html',
  styleUrls: ['./registrar-usuario.component.css']
})
export class RegistrarUsuarioComponent implements OnInit {
  nombre: string = '';
  correo: string = '';
  contrasena: string = '';
  ccontrasena: string = '';
  direccion: string = '';
  telefono: string = '';
  usuario: Usuario = new Usuario;

  constructor() { }

  ngOnInit() {
  }
registrarUsuario(){
this.usuario.nombre=this.nombre;
this.usuario.correo=this.correo;
this.usuario.contrasenha=this.contrasena;
this.usuario.direccion=this.direccion;
this.usuario.telefono=this.telefono;


}
}

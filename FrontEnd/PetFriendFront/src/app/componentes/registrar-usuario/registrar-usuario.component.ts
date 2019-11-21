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
  imgURL: any;
  public message: string;

  imageSrc: string;

  url1: any = 'assets/user.png';
  constructor() { }

  ngOnInit() {
   
  }

  preview(files) {
    const mimeType = files[0].type;
    if (mimeType.match(/image\/*/) == null) {
      console.log('Only images are supported.');
      return;
    }
    const reader = new FileReader();
    reader.readAsDataURL(files[0]);
    // tslint:disable-next-line: variable-name
    reader.onload = (_event) => {
     
       // this.service.urls[0]=reader.result;
        //this.url1 = this.service.urls[0];
        //console.log(this.url1);
        this.url1 = reader.result;
        console.log(this.url1);
        return;
      
    };
  }
registrarUsuario(){
this.usuario.nombre=this.nombre;
this.usuario.correo=this.correo;
this.usuario.contrasenha=this.contrasena;
this.usuario.direccion=this.direccion;
this.usuario.telefono=this.telefono;


}
}

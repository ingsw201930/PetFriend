import { Component, OnInit } from '@angular/core';
import { Usuario} from 'src/app/modelo/usuario';
import { RestClientService } from 'src/app/servicios/rest-client.service';
import { Router } from '@angular/router';

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
  constructor(private servicio: RestClientService, private router: Router) { }

  ngOnInit() {
   
  }

  preview(files) {
    const mimeType = files[0].type;
    if (mimeType.match(/image\/*/) == null) {

      return;
    }
    const reader = new FileReader();
    reader.readAsDataURL(files[0]);
    // tslint:disable-next-line: variable-name
    reader.onload = (_event) => {
     
       //this.service.urls[0]=reader.result;
        //this.url1 = this.service.urls[0];

        this.url1 = reader.result;
        return;
      
    };
  }

  registrarUsuario(){
    this.usuario.nombre=this.nombre;
    this.usuario.correo=this.correo;
    this.usuario.contrasenha=this.contrasena;
    this.usuario.direccion=this.direccion;
    this.usuario.telefono=this.telefono;
    this.usuario.foto = this.url1;

    this.servicio.registrarUsuario(this.usuario);

    this.router.navigate(['/']);
  }
}

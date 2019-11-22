import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/modelo/usuario';
import { RestClientService } from 'src/app/servicios/rest-client.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registrar-entidad',
  templateUrl: './registrar-entidad.component.html',
  styleUrls: ['./registrar-entidad.component.css']
})
export class RegistrarEntidadComponent implements OnInit {
  nombre: string = '';
  correo: string = '';
  contrasena: string = '';
  ccontrasena: string = '';
  direccion: string = '';
  telefono: string = '';
  nit:String= '';
  imgURL: any;
  public message: string;

  usuario: Usuario = new Usuario();
  imageSrc: string;

  url1: any = 'assets/user.png';
  constructor(private servicio: RestClientService, private router: Router) { }


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

    this.servicio.registrarTienda(this.usuario);

    this.router.navigate(['/']);
  }
}

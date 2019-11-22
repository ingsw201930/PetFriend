import { Component, OnInit } from '@angular/core';
import { RestClientService } from 'src/app/servicios/rest-client.service';
import { Usuario } from 'src/app/modelo/usuario';
import { Router } from '@angular/router';
import { Global } from 'src/app/modelo/global';

@Component({
  selector: 'app-iniciar-sesion',
  templateUrl: './iniciar-sesion.component.html',
  styleUrls: ['./iniciar-sesion.component.css']
})
export class IniciarSesionComponent implements OnInit {

  private titulo = 'Petfriend';
  user = '';
  password = '';
  result: any;
  message: any;
  isError = false;

  constructor(private restClient: RestClientService, private router: Router, private global: Global) {
  }

  ngOnInit() { }

  async doLogin(): Promise<void> {

    let rol = await this.restClient.authenticate(this.user, this.password);
    if(rol === 'USUARIO'){
      this.global.role = 'USUARIO';
      this.global.nameCurrentUser = this.user;
    }
    else if(rol == 'ADMIN'){
      this.global.role = 'ADMIN';
      this.global.nameCurrentUser = this.user;
    }
    else if(rol == 'TIENDA'){
      this.global.role = 'TIENDA';
      this.global.nameCurrentUser = this.user;
    }
    else
     this.global.role = null;

    if(this.global.role != null){
      this.global.id = parseInt(await this.restClient.obtenerId(this.global.nameCurrentUser), 10);
    }
    else{
      this.global.id = null;
    }

     this.router.navigate(['/']);
  }
}

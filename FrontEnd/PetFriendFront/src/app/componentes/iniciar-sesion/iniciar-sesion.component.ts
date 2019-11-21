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

  constructor(private restClient: RestClientService, private router: Router, private global: Global) {
  }

  ngOnInit() { }

  doLogin() {
    console.log(this.user + ' - ' + this.password);
    // TODO Obtain Role and Name current user
    // this.global.role = 'ENTIDAD';
    // this.global.nameCurrentUser = 'LOLO';
    if (this.restClient.login(this.user, this.password)) {
      //HERE after get response replace into global variable (this.global). 
      // this.global.nameCurrentUser = res.name;
      // this.global.role = res.name;
      this.router.navigate([``]);
    }
    else {

    }
  }
}

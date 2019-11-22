import { Component, OnInit } from '@angular/core';
import { RestClientService } from 'src/app/servicios/rest-client.service';
import { Usuario } from 'src/app/modelo/usuario';
import { Router } from '@angular/router';

@Component({
  selector: 'app-iniciar-sesion',
  templateUrl: './iniciar-sesion.component.html',
  styleUrls: ['./iniciar-sesion.component.css']
})
export class IniciarSesionComponent implements OnInit {

  private titulo: string = 'Petfriend';

  user = '';
  password = '';
  
  result: any;
  
  message: any;
  
  constructor(private restClient: RestClientService, private router: Router) {
  }

  ngOnInit() {}

  doLogin() {
    console.log(this.user + ' - ' + this.password);
    //this.restClient.authenticate(this.user, this.password);
    this.restClient.register(this.user, this.password);
  }
}

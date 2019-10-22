import { Component, OnInit } from '@angular/core';
import { RestClientService } from 'src/app/servicios/rest-client.service';
import { Usuario } from 'src/app/modelo/usuario';

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
  
  constructor(private restClient: RestClientService) {}

  ngOnInit() {}

  doLogin() {
    console.log(this.user + ' - ' + this.password);
    this.restClient.login(this.user, this.password).subscribe(data => {
        //Exito
        console.log('YASSSSSSSSSSSS');

      }, error => {
        //Fracaso


        console.error(error);
        this.message = JSON.stringify(error);
      });
  }
}

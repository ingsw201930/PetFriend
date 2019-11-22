import { Component} from '@angular/core';
import { Global } from './modelo/global';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'PetFriendFront';
  rol: string;
  nombre: string;

  constructor(public global: Global, private router: Router) {
    this.nombre = this.global.nameCurrentUser;
    this.rol = this.global.role;
   }

   cerrarSesion(){
    this.global.id = null;
    this.global.nameCurrentUser = null;
    this.global.role = null;

    this.router.navigate(['/']);
   }
}

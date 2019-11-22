import { Component} from '@angular/core';
import { Global } from './modelo/global';
import { MouseEvent } from '@agm/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'PetFriendFront';
  rol: string;
  nombre: string;

  constructor(public globals: Global) {
    this.nombre = this.globals.nameCurrentUser;
    this.rol = this.globals.role;
   }

}

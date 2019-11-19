import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PublicacionService } from 'src/app/servicios/publicacion.service';

@Component({
  selector: 'app-tipos-de-publicacion',
  templateUrl: './tipos-de-publicacion.component.html',
  styleUrls: ['./tipos-de-publicacion.component.css']
})
export class TiposDePublicacionComponent implements OnInit {

  constructor(private router: Router, private servicio: PublicacionService) { }

  publicacionAdopcion(){
    this.servicio.setTipoPublicacion('adopcion');
    this.router.navigate(['/CrearUnaPublicacion']);
  }

  publicacionPerdido(){
    this.servicio.setTipoPublicacion('perdido');
    this.router.navigate(['/CrearUnaPublicacion']);
  }

  publicacionEncontrado(){
    this.servicio.setTipoPublicacion('encontrado');
    this.router.navigate(['/CrearUnaPublicacion']);
  }

  ngOnInit() {
  }

}

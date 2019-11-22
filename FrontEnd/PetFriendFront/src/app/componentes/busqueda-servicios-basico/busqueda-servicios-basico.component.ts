import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Publicacion } from 'src/app/modelo/publicacion';

@Component({
  selector: 'app-busqueda-servicios-basico',
  templateUrl: './busqueda-servicios-basico.component.html',
  styleUrls: ['./busqueda-servicios-basico.component.css']
})
export class BusquedaServiciosBasicoComponent implements OnInit {
  publicaciones: Publicacion[];
  items = ['First', 'Second', 'Third','First', 'Second', 'Third'];
  urls: any[] = [];
  show: boolean = true;


  constructor(private router: Router) { }

  ngOnInit() {
  }

  buscar(){
    this.router.navigate(['/Resultados-Servicios']);
  }

}

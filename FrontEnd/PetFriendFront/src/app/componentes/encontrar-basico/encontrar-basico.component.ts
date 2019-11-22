import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Publicacion } from 'src/app/modelo/publicacion';

@Component({
  selector: 'app-encontrar-basico',
  templateUrl: './encontrar-basico.component.html',
  styleUrls: ['./encontrar-basico.component.css']
})
export class EncontrarBasicoComponent implements OnInit {
  publicaciones: Publicacion[];
  items = ['First', 'Second', 'Third','First', 'Second', 'Third'];
  show: boolean = true;
  constructor(private router: Router) { }

  ngOnInit() {
  }
  
  buscar(){
    this.router.navigate(['/Resultados-Servicios']);
  }

}

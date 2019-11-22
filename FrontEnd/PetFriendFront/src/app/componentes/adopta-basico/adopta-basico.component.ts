import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Publicacion } from 'src/app/modelo/publicacion';

@Component({
  selector: 'app-adopta-basico',
  templateUrl: './adopta-basico.component.html',
  styleUrls: ['./adopta-basico.component.css']
})
export class AdoptaBasicoComponent implements OnInit {
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

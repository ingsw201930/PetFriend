import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Publicacion } from 'src/app/modelo/publicacion';

@Component({
  selector: 'app-buscar-encontrados',
  templateUrl: './buscar-encontrados.component.html',
  styleUrls: ['./buscar-encontrados.component.css']
})
export class BuscarEncontradosComponent implements OnInit {
  Basico: boolean = true;
  constructor(private router: Router) { }

  ngOnInit() {
  }

  cambiarMetodo(){
    if(this.Basico == false){
      this.Basico = true;
    }
    else{
      this.Basico = false;
    }
  }

  buscar(){
    this.router.navigate(['Resultados-Servicios']);
  }

}

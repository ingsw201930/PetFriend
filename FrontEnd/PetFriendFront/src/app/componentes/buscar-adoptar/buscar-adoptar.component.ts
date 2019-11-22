import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Publicacion } from 'src/app/modelo/publicacion';

@Component({
  selector: 'app-buscar-adoptar',
  templateUrl: './buscar-adoptar.component.html',
  styleUrls: ['./buscar-adoptar.component.css']
})
export class BuscarAdoptarComponent implements OnInit {
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

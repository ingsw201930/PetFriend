import { Component, OnInit,Input, Output,  EventEmitter} from '@angular/core';
import { Router } from '@angular/router';
import { Publicacion } from 'src/app/modelo/publicacion';

@Component({
  selector: 'app-buscar-adoptar',
  templateUrl: './buscar-adoptar.component.html',
  styleUrls: ['./buscar-adoptar.component.css']
})
export class BuscarAdoptarComponent implements OnInit {
  Basico: boolean = true;

  especie: string = '';
  raza: string = '';
  edad: string = '';
  color1: string = '';
  color2: string = '';
  genero: string ='';
  esterilizado: string ='';

  

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
    this.router.navigate(['/ResultadosAdopta']);
  }
}

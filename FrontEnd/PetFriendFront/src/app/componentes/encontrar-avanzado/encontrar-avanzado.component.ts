import { Component, OnInit } from '@angular/core';
import { PublicacionService } from 'src/app/servicios/publicacion.service';
import { Filtros } from 'src/app/modelo/filtros';
import { RouterLink, Router } from '@angular/router';

@Component({
  selector: 'app-encontrar-avanzado',
  templateUrl: './encontrar-avanzado.component.html',
  styleUrls: ['./encontrar-avanzado.component.css']
})
export class EncontrarAvanzadoComponent implements OnInit {
  Basico: boolean = true;
  especie: string = '';
  raza: string = '';
  edad: string = '';
  color1: string = '';
  color2: string = '';
  genero: string='';
  esterilizado: String='';
  filtro:Filtros;
  constructor(private pubServ: PublicacionService,private router:Router) { }

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
    if(this.especie!='')
    {
      this.filtro.especie=this.especie;
    }
    if(this.raza!='')
    {
      this.filtro.raza=this.raza;
    }
    if(this.edad!='')
    {
      this.filtro.edad=this.edad;
    }
    if(this.color1!='')
    {
      this.filtro.color1=this.color1;
    }
    if(this.color2!='')
    {
      this.filtro.color2=this.color2;
    }
    if(this.genero!='')
    {
      this.filtro.sexo=this.genero;
    }
    if(this.esterilizado!='')
    {
      this.filtro.esterilizado=(this.esterilizado=="Si"? true:false);
    }
    //[routerLink]="['/ResultadosEncontrar']"
    this.pubServ.setFiltro(this.filtro);
    this.router.navigate(['/ResultadosEncontrar']);
  }
}

import { Component, OnInit, Input } from '@angular/core';
import { Router } from '@angular/router';
import { Servicio } from 'src/app/modelo/servicio';
import { BuscarServicioService } from 'src/app/servicios/buscar-servicio.service';
import { PublicacionService } from 'src/app/servicios/publicacion.service';
import { Publicacion } from 'src/app/modelo/publicacion';


@Component({
  selector: 'app-buscar-servicio',
  templateUrl: './buscar-servicio.component.html',
  styleUrls: ['./buscar-servicio.component.css']
})
export class BuscarServicioComponent implements OnInit {
  Basico: boolean = true;
  veterinaria: boolean = false;
  refugio:boolean = false;
  peluqueria:boolean = false;
  comida:boolean = false;
  accesorio:boolean = false;
  paseo:boolean = false;
  guarderia:boolean = false;
  banos:boolean = false;
  aseo:boolean = false;
  juguetes:boolean = false;
  snacks:boolean = false;
  especie:boolean = false;

  constructor(private router: Router, private pubSer:PublicacionService) { }
  publicaciones: Publicacion[];
  items = ['First', 'Second', 'Third','First', 'Second', 'Third'];
  async ngOnInit(): Promise<void> {
    this.publicaciones = await this.pubSer.getPublicacionesServicios();
    console.log(this.publicaciones);
    if (this.publicaciones == null)
    {
      return;
    }
    for (let index = 0; index < this.publicaciones.length; index++) {
      if(index == 6)
        break;
      const element = this.publicaciones[index];
      this.items[index] = element.imagen1;
    }
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

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Publicacion } from 'src/app/modelo/publicacion';
import { PublicacionService } from 'src/app/servicios/publicacion.service';

@Component({
  selector: 'app-encontrar-basico',
  templateUrl: './encontrar-basico.component.html',
  styleUrls: ['./encontrar-basico.component.css']
})
export class EncontrarBasicoComponent implements OnInit {
  publicaciones: Publicacion[];
  items = ['First', 'Second', 'Third','First', 'Second', 'Third'];
  show: boolean = true;
  constructor(private router: Router, private pubSer:PublicacionService) { }

  async ngOnInit(): Promise<void> {
    console.log("papa");
    this.publicaciones = await this.pubSer.getPublicacionesPerdidos();
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

  buscar(){
    this.router.navigate(['/Resultados-Servicios']);
  }

}

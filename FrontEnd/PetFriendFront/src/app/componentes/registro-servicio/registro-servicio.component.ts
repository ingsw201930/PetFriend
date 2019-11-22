import { Component, OnInit } from '@angular/core';
import { Servicio } from 'src/app/modelo/servicio';

@Component({
  selector: 'app-registro-servicio',
  templateUrl: './registro-servicio.component.html',
  styleUrls: ['./registro-servicio.component.css']
})
export class RegistroServicioComponent implements OnInit {

  servicio: Servicio = {
    descripcion: '',
    fecha: new Date(),
    localidad: '',
  };

  url1: any = 'assets/selfService.png';

  constructor() {

  }

  ngOnInit() {
  }

  preview(files) {
    const mimeType = files[0].type;
    if (mimeType.match(/image\/*/) == null) {
      console.log('Only images are supported.');
      return;
    }
    const reader = new FileReader();
    reader.readAsDataURL(files[0]);
    // tslint:disable-next-line: variable-name
    reader.onload = (_event) => {
      this.url1 = reader.result;
      console.log(this.url1);
      return;

    };
  }

  crearServicio() {
    console.log(this.servicio);
  }
}

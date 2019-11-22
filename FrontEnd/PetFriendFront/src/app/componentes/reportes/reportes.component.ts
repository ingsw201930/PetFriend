import { Component, OnInit } from '@angular/core';
import { Reporte } from 'src/app/modelo/reporte';

@Component({
  selector: 'app-reportes',
  templateUrl: './reportes.component.html',
  styleUrls: ['./reportes.component.css']
})
export class ReportesComponent implements OnInit {

  reports: Reporte[] = [
    {
      id: 1,
      // tslint:disable-next-line: max-line-length
      descripcion: 'viéndole don Quijote de aquella manera, con muestras de tanta tristeza, le dijo: Sábete, Sancho, que no es un hombre más que otro si no hace más que otro. Todas estas borrascas que nos suceden son señales de que presto ha de serenar el tiempo y han de sucedernos bien las cosas; porque no es posible que el mal.',
      fecha: new Date(),
      estado: 'RESUELTO',
      // tslint:disable-next-line: max-line-length
      conclusion: 'Reina en mi espíritu una alegría admirable, muy parecida a las dulces alboradas de la primavera, de que gozo aquí con delicia. Estoy solo, y me felicito de vivir en este país'
    },
    {
      id: 2,
      descripcion: 'descrip2',
      fecha: new Date(),
      estado: 'NO RESUELTO',
    },
    {
      id: 3,
      descripcion: 'descrip3',
      fecha: new Date(),
      estado: 'NO RESUELTO',
    }
  ];

  constructor() { }

  ngOnInit() { }

  resolve(report: Reporte) {
    // TODO enviar peticion para que se almacene la conclusion.
    report.estado = 'RESUELTO';
  }

  remove(report: Reporte) {
    //TODO eviar peticion para que se elimine ese reporte con id report.id
    const index = this.reports.indexOf(report, 0);
    if (index > -1) {
      this.reports.splice(index, 1);
    }
  }
}

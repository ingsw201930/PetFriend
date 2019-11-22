import { Usuario } from './usuario';

export class Servicio {
  especie?: string;
  id?: number;
  fecha: Date;
  descripcion: string;
  localidad: string;
  titulo: string;
  dueno?: Usuario;
  veterinaria?= false;
  refugio?= false;
  peluqueria?= false;
  comida?= false;
  accesorios?= false;
  paseo?= false;
  guarderia?= false;
  banos?= false;
  aseo?= false;
  juguetes?= false;
  snacks?= false;
  theCheckbox?= false;
  marked?= false;
}

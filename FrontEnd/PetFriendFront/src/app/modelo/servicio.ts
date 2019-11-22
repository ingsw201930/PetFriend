import { Usuario } from './usuario';

export class Servicio {
  especie?: string;
  id?: number;
  fecha: Date;
  descripcion: string;
  localidad: string;
  titulo: string;
  dueno?: Usuario;
}

import { Usuario } from './usuario';

export class Reporte {
    id: number;
    descripcion: string;
    fecha: Date;
    estado: string;
    conclusion?: string;
    reportado?: Usuario;
}

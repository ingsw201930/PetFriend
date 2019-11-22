export class Sesion {
    id: number;
    correo: string;
    sesion_iniciada: boolean;

    constructor(){
        this.id = 0;
        this.correo = "";
        this.sesion_iniciada = false;
    }
}
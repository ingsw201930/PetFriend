import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Sesion } from '../modelo/sesion';
import { UsuarioService } from './usuario.service';
import { Usuario } from '../modelo/usuario';

@Injectable()
export class RestClientService {
  constructor(private http: HttpClient, private sesionService: UsuarioService) {}

  authenticate(username: string, password: string) {
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa("user" + ':' + "password") });
    let params = new HttpParams();
    params = params.append('correo', username);
    params = params.append('pass', password);
    this.http.get('http://localhost:9890/usuario/validateLogin', {headers: headers, withCredentials: true, params: params})
    .subscribe(data => {
      console.log(data);
      let temp = new Sesion();
      Object.assign(temp, data);
      this.sesionService.setSesion(temp);
    },
    err => {
      console.log('error');
      console.log(err);
      this.sesionService.setSesion(new Sesion());
    })
    ;
  }

  register(username: string, password: string){
    let nuevoUsuario = new Usuario();
    nuevoUsuario.contrasenha = password;
    nuevoUsuario.correo = username;
    this.http.post('http://localhost:9890/public/registrar', nuevoUsuario, {responseType: 'text' as 'text' })
    .subscribe(data => {
      console.log(data);
    },
    err => {
      console.log('error');
      console.log(err);
      this.sesionService.setSesion(new Sesion());
    })
    ;

  }

  getCompanies() {
    return this.http.get('http://localhost:9890/public/companies');
  }

  getEmployees() {
    return this.http.get('http://localhost:9890/api/employees', {
      withCredentials: true
    });
  }

  getAdminData() {
    return this.http.get('http://localhost:9890/admin/test', {
      withCredentials: true
    });
  }

  logout() {
    return this.http.post('http://localhost:9890/logout', '', {
      withCredentials: true
    });
  }
}

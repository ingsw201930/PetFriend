import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Sesion } from '../modelo/sesion';
import { UsuarioService } from './usuario.service';
import { Usuario } from '../modelo/usuario';
import { Router } from '@angular/router';
import { stringify } from 'querystring';

@Injectable()
export class RestClientService {
  constructor(private http: HttpClient, private sesionService: UsuarioService) {}

  async authenticate(username: string, password: string): Promise<string> {
    return new Promise(resolve => {
      const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa("user" + ':' + "password") });
      let params = new HttpParams();
      params = params.append('correo', username);
      params = params.append('pass', password);
      this.http.get('http://localhost:9890/usuario/validateLogin', {headers: headers, withCredentials: true, params: params, responseType: 'text' as 'text' })
      .subscribe(data => {
        console.log(data);
        resolve(data);
      },
      err => {
        console.log('error');
        console.log(err);
        resolve(null);
      })
      ;
    });
  }

  async obtenerId(correo: string): Promise<string>{
    return new Promise(resolve => {
      const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa("user" + ':' + "password") });
      this.http.post('http://localhost:9890/usuario/getId', correo,{headers: headers, withCredentials: true, responseType: 'text' as 'text'})
      .subscribe(data => {
        resolve(data);
      },
      err => {
        console.log('error');
        console.log(err);
        resolve(null);
      })
      ;
    });

  }

  registrarUsuario(usuario: Usuario){
    this.http.post('http://localhost:9890/public/registrarUsuario', usuario, {responseType: 'text' as 'text' })
    .subscribe(data => {
      console.log(data);
    },
    err => {
      console.log('error');
      console.log(err);
    })
    ;
  }

  registrarTienda(usuario: Usuario){
    this.http.post('http://localhost:9890/public/registrarTienda', usuario, {responseType: 'text' as 'text' })
    .subscribe(data => {
      console.log(data);
    },
    err => {
      console.log('error');
      console.log(err);
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

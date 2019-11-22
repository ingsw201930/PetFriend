import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Sesion } from '../modelo/sesion';

@Injectable()
export class RestClientService {
  constructor(private http: HttpClient) {}




  authenticate(username: string, password: string) {
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
    let params = new HttpParams();
    params = params.append('correo', 'user@correo.com');
    this.http.get('http://localhost:9890/usuario/validateLogin', {headers: headers, withCredentials: true, params: params})
    .subscribe(data=> {
      console.log('entra');
    },
    err => {
      console.log('error');
      console.log(err);
    })
    //)
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
    return this.http.get('http://localhost:9890/admin/test',  {
      withCredentials: true
    });
  }

  logout() {
    return this.http.post('http://localhost:9890/logout', '', {
      withCredentials: true
    });
  }
}

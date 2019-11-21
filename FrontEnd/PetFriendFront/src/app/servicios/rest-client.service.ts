import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';

@Injectable()
export class RestClientService {
  constructor(private http: HttpClient) {}




  authenticate(username: string, password: string) {
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
    console.log(this.http.get('http://localhost:9890/usuario/1/validateLogin',{headers}));
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

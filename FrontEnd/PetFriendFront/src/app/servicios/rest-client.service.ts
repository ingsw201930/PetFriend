import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Global } from '../modelo/global';

@Injectable()
export class RestClientService {
  constructor(private http: HttpClient) { }

  usuarios: string[] = ['Brayan', 'Karen', 'Camilo', 'Leyder', 'Dorian', 'user'];
  contras: string[] = ['Brayan', 'Karen', 'Camilo', 'Leyder', 'Dorian', 'user'];

  login(username: string, password: string) {
    for (let i = 0; i < this.usuarios.length; ++i) {
      if (username === this.usuarios[i] && password === this.contras[i]) {
        return true;
      }
    }
    return false;
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

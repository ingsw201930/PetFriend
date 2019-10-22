import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';

@Injectable()
export class RestClientService {
  constructor(private http: HttpClient) {}

  login(username: string, password: string) {
    const formHeaders = new HttpHeaders();
    formHeaders.append('Content-Type', 'application/x-www-form-urlencoded');
    const formParams = new HttpParams()
      .set('username', username)
      .set('password', password);
    return this.http.post('http://localhost:9890/login', null, {
      headers: formHeaders,
      params: formParams,
      withCredentials: true
    });
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

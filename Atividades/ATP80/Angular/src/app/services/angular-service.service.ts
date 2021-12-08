import { HttpClient, HttpClientJsonpModule, HttpClientModule } from '@angular/common/http';
import { Angular } from './../model/Angular';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AngularServiceService {
  private url:string

  constructor(private httpClien: HttpClient) {
    this.url = 'http://localhost:8081/api/spring';
  }

  salvar(angular:Angular):Observable<string>{
    return this.httpClien.post(this.url, angular, {responseType: 'text'})
  }
  listar():Observable<Angular[]> {
    return this.httpClien.get<Angular[]>(this.url);
  }
}

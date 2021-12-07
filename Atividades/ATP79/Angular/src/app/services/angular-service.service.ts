import { Angular } from './../model/Angular';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AngularServiceService {
  private lista:Angular[];

  constructor() {
    this.lista = []
  }

  salvar(angular:Angular):void{
    this.lista.push(angular);
  }
  listar():Angular[]{
    return this.lista;
  }
}

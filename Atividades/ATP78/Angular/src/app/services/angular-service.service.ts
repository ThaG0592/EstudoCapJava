import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AngularServiceService {
  private lista:any[];

  constructor() {
    this.lista = []
  }

  salvar(angular:any):void{
    this.lista.push(angular);
  }
  listar(){
    return this.lista;
  }
}

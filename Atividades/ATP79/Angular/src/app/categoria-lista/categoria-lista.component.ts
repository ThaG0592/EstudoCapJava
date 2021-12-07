import { Angular } from './../model/Angular';
import { AngularServiceService } from './../services/angular-service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-categoria-lista',
  templateUrl: './categoria-lista.component.html',
  styleUrls: ['./categoria-lista.component.css']
})
export class CategoriaListaComponent implements OnInit {
  lista: Angular[]
  constructor(private angularServiceService:AngularServiceService) {
    this.lista = [];
    this.listar();
  }

  ngOnInit(): void {
  }

  private listar(){
    this.lista = this.angularServiceService.listar();
  }

}

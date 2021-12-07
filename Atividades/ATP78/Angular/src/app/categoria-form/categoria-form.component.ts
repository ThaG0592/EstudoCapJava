import { Component, OnInit } from '@angular/core';
import { AngularServiceService } from '../services/angular-service.service';

@Component({
  selector: 'app-categoria-form',
  templateUrl: './categoria-form.component.html',
  styleUrls: ['./categoria-form.component.css']
})
export class CategoriaFormComponent implements OnInit {
  id:number = 0;
  nome:string = "";
  tipo:string = "";
  constructor(private angularServiceService:AngularServiceService) { }

  ngOnInit(): void {
  }

  salvar(){
    let angular = {
      "id" : this.id,
      "nome" : this.nome,
      "tipo" : this.tipo
    };
    console.log(angular);
    this.angularServiceService.salvar(angular);
  }
  private limpar(){
    this.id = 0;
    this.nome = "";
    this.tipo = "";
  }
}

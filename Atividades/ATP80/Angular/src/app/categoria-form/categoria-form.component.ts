import { Angular } from './../model/Angular';
import { Component, OnInit } from '@angular/core';
import { AngularServiceService } from '../services/angular-service.service';

@Component({
  selector: 'app-categoria-form',
  templateUrl: './categoria-form.component.html',
  styleUrls: ['./categoria-form.component.css']
})
export class CategoriaFormComponent implements OnInit {
  angular = {} as Angular;

  constructor(private angularServiceService:AngularServiceService) {

  }

  ngOnInit(): void {
  }

  salvar(){
     this.angularServiceService.salvar(this.angular);
     this.limpar();
  }
  private limpar(){
    this.angular = {} as Angular;
  }
}

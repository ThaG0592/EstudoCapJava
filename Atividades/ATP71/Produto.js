import { Categoria } from './Categoria';

export class Produto extends Categoria{
    constructor(marcaProduto){
    super.marca = marcaProduto;
    }
}
import { Cliente } from "./Cliente";

export class Vendas extends Cliente{
    constructor(primeiravenda:number){
       super();
       super.valor = primeiravenda; 
    }
}
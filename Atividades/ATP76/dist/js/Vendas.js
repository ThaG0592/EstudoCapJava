import { Cliente } from "./Cliente";
export class Vendas extends Cliente {
    constructor(primeiravenda) {
        super();
        super.valor = primeiravenda;
    }
}

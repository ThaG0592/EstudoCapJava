import { Vendas } from "./Vendas";
import { Vendedores } from "./Vendedores";

console.log('Clientes');

const venda = new Vendas(3);
venda.idade = '29';
venda.nome = 'Jojo';
venda.sobrenome = 'todinho';
venda.valor = 150.00;


console.log(venda.nome, venda.sobrenome, venda.idade, venda.valor)
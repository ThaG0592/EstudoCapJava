import Conta from "./model/Conta";

console.log('============Banco============')

const conta1 = new Conta();
conta1.numero = 123;
conta1.agencia = 2345;
conta1.saldo = 123,45;

console.log(conta1.agencia,conta1.numero, conta1.saldo );

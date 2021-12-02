import { PessoaFisica } from "./PessoaFisica";
import { PessoaJuridica } from "./PessoaJuridica";

const pf = new PessoaFisica();
pf.nome  = "José João";
pf.cpf = "000.000.000-00";
console.log(pf);

const pj = new PessoaJuridica();
pj.nome = "Empresa zica";
pj.cnpj = "11.111.111/1111-11"
console.log(pj);
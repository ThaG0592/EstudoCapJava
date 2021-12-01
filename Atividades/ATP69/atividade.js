const nome = "Thais";
const sobrenome = "Gaiardo";
const dataNascimento = "05/05/1992";
const cpf  = "000.000.000.00";
const rg  = "99.999.999.99";

console.log(nome, sobrenome, dataNascimento, cpf, rg);

let benVindo = 1;
while(benVindo < 6){
    console.log("Bem vido ao Mundo");
    benVindo ++;
}

let numero1 = 23;
let numero2 = 45;
console.log(numero1 + numero2);
console.log(numero1 - numero2);
console.log(numero1 * numero2);
console.log(numero1 / numero2);

if(numero1 >=20){
    console.log("Maior que 20")
}else{
    console.log("Menor que 20")
}

for(let cont =0; cont < 6; cont ++){
    console.log(cont)
}

const turma = ["Rentana", "Renata","Thais"];
console.log(turma);
console.log("Lista dos Doidos: ",turma.indexOf("Thais"))
const valor = turma.pop();
console.log(turma);
const novaturma = turma.slice(0,2);
console.log(novaturma);
turma.splice(0,1);
console.log(turma)

elefante = new Array(1,2,3,4,5);
elefante.forEach(elemento=>console.log(elemento));
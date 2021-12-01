const lista = ["Inex", "Jojo","Guga"];
const lista2 = new Array("Inex", "Jojo","Guga");

console.log(lista);
console.log(lista2);

lista.push("Chimbinha");
console.log(lista);

console.log(lista.length);

console.log("Lista da Jojo: ",lista.indexOf("Jojo"))

console.log("Lista da Jojo: ",lista.indexOf("0"))

const valor = lista.pop();
console.log(valor);
console.log(lista);

const novalista = lista.slice(0,2);
console.log(novalista);

lista.splice(0,2);
console.log(lista)

console.log(lista[lista]);

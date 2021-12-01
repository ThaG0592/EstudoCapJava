function imprimirNomes(){
    console.log("Nome qualquer");
}

function imprimirNomesEspecifico(nome){
    console.log("Nome: "+ nome);
}

function imprimirNomesEspecificoComIntepolacao(nome){
    console.log(`Nome: ${nome}`);
}

function imprimirNomeSobrenome(nome, sobrenome){
    console.log(`Nome: ${nome} \nSobrenome: ${sobrenome}`);
}

imprimirNomes();
imprimirNomesEspecifico('Inex');
imprimirNomesEspecificoComIntepolacao('Jojo');
imprimirNomeSobrenome('Inex', 'Brasil')
class Conta{
    #numero;
    #agencia;
    #saldo;

    get numero(){
        return this.#numero;
    }
    set numero(numero){
        this.#numero = numero;
    }
    get agencia(){
        return this.#agencia;
    }
    set agencia(agencia){
        this.#agencia = agencia;
    }
    get saldo(){
        return this.#saldo;
    }
    set saldo(saldo){
        this.#saldo = saldo;
    }

}
export default Conta;
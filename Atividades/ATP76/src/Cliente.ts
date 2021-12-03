export class Cliente{
    private _nome: string;
    private _sobrenome: string;
    private _idade: string;
    private _valor: number;

    set nome(nome:string){
        this._nome;
    }
    get nome():string{
        return this._nome;
    }
    set sobrenome(nome:string){
        this._sobrenome;
    }
    get sobrenome():string{
        return this._sobrenome;
    }
    set idade(idade:string){
        this._idade;
    }
    get idade():string{
        return this._idade;
    }
    set valor(valor:number){
        this._valor;
    }
    get valor():number{
        return this._valor;
    }
}
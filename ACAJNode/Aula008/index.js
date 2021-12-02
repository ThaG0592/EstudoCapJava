import Express  from 'express';
import bodyParser from 'body-parser';
import Conta from './model/Conta.js'
import ContaRepository from './repository/ContaRepository.js'

const repository = new ContaRepository()

const api = Express();
api.use(bodyParser.json());
api.listen(3000, ()=>console.log('Rodando...'));

api.use('/',async(req, resp)=>{
    const lista = await repository.findAll();
    rep.send(lista)
});



import Express from 'express'
import bodyParser from 'body-parser'
import Cliente from './model/Cliente.js'
import ClienteRepository from './repository/ClienteRepository.js'

const repository = new ClienteRepository();

const api = Express();
api.use(bodyParser.json());
api.listen(3000);

api.use('/',async(req,resp)=>{
    const lista = await repository.findAll();
    resp.send(lista)
})
import { Router } from "express";
import Cliene from './../model/Cliente.js';
import ClienteRepository from './../repository/ClienteRepository.js'

const ClienteApi = Router();

const repository = new ClienteRepository();

ClienteApi.get('/',async (req,resp)=>{
    const lista = await repository.findAll();
    resp.send(lista);
});
ClienteApi.post('/',async (req,resp)=>{
    let {nome, sobrenome} = req.body;
    const cliente = new Cliene(nome, sobrenome);
    const retorno = await repository.creat(cliente);
    resp.send(retorno);
})
ClienteApi.put('/',async (req,resp)=>{
    let id = req.params.id;
    let {nome, sobrenome} = req.body;
    const cliente = new Cliene(nome, sobrenome);
    const retorno = await repository.update(cliente);
    resp.send(retorno);
})
ClienteApi.delete('/',async (req,resp)=>{
    let id = req.params.id;
    const retorno = await repository.delete(id);
    resp.send(JSON.stringify(retorno));
})
export default ClienteApi;
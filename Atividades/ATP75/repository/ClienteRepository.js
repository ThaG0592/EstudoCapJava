import ClienteTable from "../Database/ClienteTable.js";

class ClienteRepository{
    findAll(){
        const lista = await ClienteTable.findAll({raw:true});
        return lista;
    }
    creat(model){
        return await ClienteTable.create(model);
    }
    update(model){
        return await ClienteTable.update(model,{where:{id:model.id}});
    }
    destroy(id){
        return await ClienteTable.destroy({where:{id:id}});
    }
}
export default ClienteRepository;
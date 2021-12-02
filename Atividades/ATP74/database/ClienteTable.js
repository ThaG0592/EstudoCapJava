import { Sequelize } from "sequelize";
import Database from "./Database.js";

const ClienteTable = Database.define('cliente',{
    id:{
        type: Sequelize.INTEGER, allwNull: false, autoIncrement: true, primaryKey:true
    },
    nome:{
        type: Sequelize.INTEGER, allwNull: false
    },
    sobrenome:{
        type: Sequelize.INTEGER, allwNull: false
    }    
});
export default ClienteTable;
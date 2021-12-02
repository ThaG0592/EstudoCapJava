
import { Sequelize } from "sequelize";
import { Database } from "/Database.js";

const ContaTabel = Database.define('conta',{
    id:{
        type: Sequelize.INTEGER, 
        allowNull: false,
        autoIncrement: true,
        primaryKey: true
    },
    agencia:{
        type: Sequelize.STRING,
        allowNull: false,
    },
    numero:{
        type: Sequelize.STRING,
        allowNull: false,
    },
    saldo:{
        type: Sequelize.FLOAT,
        allowNull: false,
    }

})
export default ContaTabel;
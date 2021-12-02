import Database from "./Database.js";
import ContaTabel from "./ContaTable.js";

Database
    .sync()
    .then(()=>console.log('Sincronizado o DataBase'))
    .catch(()=>console.log('Deu erro'));


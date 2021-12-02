import Database from "./Database.js";
import ClienteTable from "./ClienteTable.js";

Database .sync().then(()=> console.log('Deu certo!')).catch(()=> console.log('Deu ruim...'));
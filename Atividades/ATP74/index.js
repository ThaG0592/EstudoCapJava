import Cliente from './model/Cliente.js'
import ClienteRepository from './repository/ClienteRepository.js'

console.log('==========Cliente==========')

const cli1 = new Cliente();
cli1.id = 1
cli1.nome = 'Zé';
cli1.sobrenome = 'Zinho';

const repository = new ContaRepository();
//const listar = await repository.findAll();
//const create = await repository.create();
//const update = await repository.update();
const destroy = await repository.destroy();

//console.log(listar);
//console.log(create);
//console.log(update);
console.log(destroy);
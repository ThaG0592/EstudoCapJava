--Crie uma tabela de Produto com as seguintes colunas: 
--id(identidade e incremental), nome, descrição, codigo e preço. 
--Todas devem ser de preenchimento obrigatório.
create table Produto(
	id int generated always as  identity
	,nome varchar (50) null
	,descricao varchar (100) null
	,codigo int null
	,preco varchar (10) null
);

--Crie uma tabela de Categoria com as seguintes colunas: 
--id(identidade e incremental), nome, descrição. Apenas a coluna 
--descrição deve permitir valores nulos.
create table Categoria(
	id int generated always as  identity
	,nome varchar (50) null
	,descricao varchar (100) not null
);

--Crie uma tabela de Carro com as seguintes colunas: 
--id(identidade e incremental), modelo e marca. 
--Todas devem ser de preenchimento obrigatório.

create table Carro(
	id int generated always as  identity
	,modelo  varchar (50) null
	,marca varchar (30) null
);

--Adicione duas novas colunas em carro. 
--As colunas devem ser: chassi e ano. 
--As duas colunas devem ser de preenchimento obrigatório. 
alter table Carro
	add column chassi varchar (50) null;
alter table Carro
	add column ano int null;

--Remove a coluna códido, da tabela Produto.
alter  table produto 
	drop column codigo;

--Delete a tabela Carro.
drop table carro 

--Adicione uma nova coluna na tabela Produto. 
--A coluna deve ser o id da categoria e não deve permitir nulos.
alter table produto 
	add column id_categoria int not null;	

--Adicione uma constraint a coluna id de categoria da tabela 
--Produto. A constraint deve ser uma Foreign Key para a coluna Id, da tabela Categoria.
alter table produto 
	add constraint fk_categoria foreign key (id_categoria) references categoria(id);

--Crie uma estrutura de transação para executar duas inserções. 
--Entao, utilize o conjunto de begin, transaction, commit e end para 
--criar um bloco de instruções.
begin transaction 
	
--Dentro do bloco, execute a inserção de um produto novo e uma categoria nova. 
--Faça com que o produto contenha o id de uma categoria inexistente para que ocorra um erro. 
--Verifique que nenhum dos dados foi inserido.
	insert into categoria (nome,descricao)values('geladeira','branca');
	rollback transaction
	insert into produto (nome,descricao,preco,id_categoria)values('GelaMuito',' Brastemp', '5000,00',5);

	savepoint insert_categoria	
--Crie uma tabela Carros com id, marca e modelo. 
	create table Carro(
	id int generated always as  identity
	,modelo  varchar (50) null
	,marca varchar (30) null
);
	rollback criacao_carro
--Insira dois novos carros dentro desta tabela. 
	insert into Carro (modelo,marca)values('911',' PORSCHE');
	insert into Carro (modelo,marca)values('F-TYPE',' JAGUAR');	

-- Execute todos os comandos em uma única transação.
commit;
end;
--Crie uma tabela país com id(PK), nome e sigla.
create table pais(
	id int primary key generated always as  identity
	,nome  varchar (50) null
	,sigla varchar (3) null
);

--Crie uma tabela estado com id(PK), nome, sigla e pais_id(FK);
create table estado(
	id int primary key generated always as  identity
	,nome  varchar (50) null
	,sigla varchar (3) null
	,id_pais int not null
	,constraint fk_pais foreign key (id_pais) references pais(id)
);


--Crie uma tabela cidade com id(PK), nome e estado_id(FK);
create table cidade(
	id int primary key generated always as  identity
	,nome  varchar (50) null
	,id_estado int not null
	,constraint fk_estado foreign key (id_estado) references estado(id)
);

--Adicione um país, um estado e uma cidade. Execute os DDL e DML em uma mesma transação 
insert into pais (nome,sigla)values('Brasil','BR');
insert into estado (nome,sigla,id_pais)values('São Paulo','SP',1);
insert into cidade (nome,id_estado)values('São Paulo',1);

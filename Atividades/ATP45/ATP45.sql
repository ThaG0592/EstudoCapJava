--Dentro de uma �nica transa��o, adicione um p�is, 3 estados e 6 cidades.

	insert into pais (nome,sigla)values('Bosnia','BA');
	insert into estado (nome,sigla,id_pais)values('Goias','GO',1);
	insert into estado (nome,sigla,id_pais)values('Amazonas','AM',1);
	insert into estado (nome,sigla,id_pais)values('Espirito Santo','ES',1);
	insert into cidade (nome,id_estado)values('Goiania',2);
	insert into cidade (nome,id_estado)values('Formosa',2);
	insert into cidade (nome,id_estado)values('Manaus',3);
	insert into cidade (nome,id_estado)values('Tefe',3);
	insert into cidade (nome,id_estado)values('Vitoria',4);
	insert into cidade (nome,id_estado)values('Serra',4);

--Selecione todas as cidades, seus estados e pa�ses. Deve exibir o id da cidade, 
--o nome, o id do estado, o nome do estado, a sigla do estado, o id do pa�s e a sigla do pa�s.
	select * from cidade;
	select * from estado;
	select * from pais;

--Para a atividade do select, utilize: join, alias(as) para as tabelas e colunas para 
--diferenciar as colunas nome e id entre as tabelas.
	

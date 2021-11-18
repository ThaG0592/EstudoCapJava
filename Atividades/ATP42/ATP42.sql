--Insira 3 categorias na tabela categoria.

insert into categoria (nome,descricao)values('smartphone',' prata');
insert into categoria (nome,descricao)values('geladeira','branca');
insert into categoria (nome,descricao)values('bola','quadrada');

--Insira 6 produtos na tabela produto.
insert into produto (nome,descricao,preco,id_categoria)values('G200',' motorola', '1000,00',1);
insert into produto (nome,descricao,preco,id_categoria)values('G400',' motorola', '2000,00',1);
insert into produto (nome,descricao,preco,id_categoria)values('GelaMuito',' Brastemp', '5000,00',2);
insert into produto (nome,descricao,preco,id_categoria)values('GelaMaisOuMenos',' Consul', '2500,00',2);
insert into produto (nome,descricao,preco,id_categoria)values('Laranja',' DoKiko', '100,00',3);
insert into produto (nome,descricao,preco,id_categoria)values('Azul','DoChaves', '50,00',3);

--Altere a descrição de dois produtos.
update produto set descricao = 'Sansung' where id > 5 and id < 6;

--Delete um produto e uma categoria. 
delete from categoria where id=2;
delete from produto where id= 5;
delete from produto where id= 6;

--Altere uma categoria de um produto.
update produto set id_categoria = 1 where id = 8;

--Altere o preço de todos os produtos tirando R$1,00 do preço atual.
update produto set preco  = '1,00' where id > 0 and id < 10;



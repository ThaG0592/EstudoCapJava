--Liste todos os dados de todas as colunas da tabela Categoria.
select * from categoria;

--Liste todos os dados de todas as colunas da tabela Produto.
select * from produto;

--Liste os dados de todas as colunas da tabela Categoria, 
--para as linhas que possuam uma descrição preenchida.
select * from categoria where descricao = 'quadrada';

--Liste os dados das colunas Id, nome e preço da tabela Produto, 
--para as linhas que possuem um nome iniciando com C.
select * from produto where nome = '%c';

--Liste os dados das colunas Id, nome e preço da tabela Produto e os dados id, 
--nome e descrição da tabela Categoria para as linhas que possuem um preço maior que 0.
select * from produto where preco < 0;

--Liste os dados de todas as colunas da tabela Produto que possuem categoria com Id maior que 2.
select * from produto where id < 2;

--Liste os dados de todas as colunas da tabela Categoria e o os dados da coluna nome da tabela Produto, 
--para as categorias que estão sendo utilizadas por produtos.
select * from produto where id_categoria < 0;

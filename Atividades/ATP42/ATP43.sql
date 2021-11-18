--Liste todos os dados de todas as colunas da tabela Categoria.
select * from categoria;

--Liste todos os dados de todas as colunas da tabela Produto.
select * from produto;

--Liste os dados de todas as colunas da tabela Categoria, 
--para as linhas que possuam uma descri��o preenchida.
select * from categoria where descricao = 'quadrada';

--Liste os dados das colunas Id, nome e pre�o da tabela Produto, 
--para as linhas que possuem um nome iniciando com C.
select * from produto where nome = '%c';

--Liste os dados das colunas Id, nome e pre�o da tabela Produto e os dados id, 
--nome e descri��o da tabela Categoria para as linhas que possuem um pre�o maior que 0.
select * from produto where preco < 0;

--Liste os dados de todas as colunas da tabela Produto que possuem categoria com Id maior que 2.
select * from produto where id < 2;

--Liste os dados de todas as colunas da tabela Categoria e o os dados da coluna nome da tabela Produto, 
--para as categorias que est�o sendo utilizadas por produtos.
select * from produto where id_categoria < 0;

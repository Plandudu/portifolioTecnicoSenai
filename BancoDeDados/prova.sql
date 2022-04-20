create table filmes(
	id varchar primary key,
	tipo varchar,
	titulo varchar,
	diretor varchar,
	atores varchar,
	pais varchar,
	data_adicionado date,
	ano_lancamento varchar,
	classificacao_indicativa varchar,
	duracao varchar,
	genero varchar,
	descricao varchar
);
--exercicio 1 importacao feito --
-- exercicio 2 filtrando visualizacao --
select titulo, pais, classificacao_indicativa, duracao, genero from filmes;

-- exercicio 3 feito: --
-- \copy (select titulo, pais, classificacao_indicativa, duracao, genero from filmes) 
-- to 'C:\Users\felipe_apio-souza\Documents\visualizacao.csv' delimiter ',' csv header encoding 'UTF8';

-- exercicio 4 --
select * from filmes where data_adicionado >= '2019-06-01' and data_adicionado <= '2019-12-31' order by data_adicionado;

-- exercicio 5 --
select * from filmes where atores like 'Adam Sandler';

-- exercicio 6 --
select descricao from filmes where diretor like 'Quentin Tarantino';

-- exercicio 7 --
select * from filmes where genero like '%Dramas';

--exercicio  8 feito --
create table laptop(
	id int primary key,
	empresa varchar,
	produto varchar,
	tipoNome varchar,
	polegadas decimal,
	screenResolution varchar,
	cpu varchar,
	ram varchar,
	memoria varchar,
	gpu varchar,
	opSys varchar,
	peso varchar,
	preco decimal
);

-- exercicio 9 --

select preco, (preco + (preco*10/100)) as preco_sugerido from laptop;

-- exercicio 11 --
select preco, round((preco + (preco*10/100))) as preco_sugerido from laptop;
select sum(preco) as preco_total from laptop;





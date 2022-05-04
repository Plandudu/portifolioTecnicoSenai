create table contas(
	id serial primary key,
	mes_ano varchar(7),
	entrada_bilheteria decimal(7, 2),
	entrada_aluguel decimal(7, 2),
	custo_func decimal(7, 2),
	custo_manutencao decimal(7, 2),
	custo_brinquedos decimal(7, 2)
);

create table funcionario(
	pis varchar(14) primary key,
	funcao varchar,
	salario decimal(7, 2),
	nome varchar,
	email varchar,
	telefone varchar(10)
);

create table empresas_parceiras(
	cnpj varchar(18),
	localizacao_parque varchar,
	alugues decimal(7, 2),
	nicho varchar
);

create table cliente(
	id serial primary key,
	cpf varchar(14),
	data_nasc date,
	telefone varchar(10)
);

create table bilheteria(
	id_ingresso varchar primary key,
	id_cliente int references cliente(id),
	preco decimal(5, 2),
	tipo varchar,
	esta_parque boolean,
	
);

create table fornecedores(
	cnpj varchar(18) primary key,
	nome varchar,
	localizacao varchar
);

create table brinquedos(
	id varchar primary key,
	cnpj_fornecedor varchar(18) references fornecedores(cnpj),
	preco decimal(8, 2),
	data_compra date,
	capacidade integer,
	data_manutencao date,
	tipo varchar,
	restricao_idade varchar,
	observacao varchar
);



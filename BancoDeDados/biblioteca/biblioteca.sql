create table cliente(
	id serial primary key,
	cpf varchar(11),
	nome varchar,
	email varchar
)

create table editora(
	id serial primary key,
	nome varchar
)

create table livro(
	codigo int primary key,
	idEditora int,
	foreign key (idEditora) references editora(id),
	autor varchar
)

create table emprestimo(
	id serial primary key,
	dataEntrega date,
	idCliente int,
	idLivro int,
	foreign key (idCliente) references cliente(id),
	foreign key (idLivro) references livro(codigo)
)

insert into cliente
	(cpf, nome, email)
values 
	('11111111111', 'felipe', 'felipe@hotmail.com'),
	('12345678911', 'joao', 'j@gmail.com'),
	('15478953621', 'ana', 'ana@gmail.com');
	
insert into editora
	(nome)
values
	('nova'),
	('senai'),
	('brasil');
	
insert into livro
	(codigo, idEditora, autor)
values
	(7999878, 2, 'pedro'),
	(7898941, 1, 'ana'),
	(7898942, 1, 'paula');
	
insert into emprestimo
	(dataEntrega, idCliente, idLivro)
values
	('2022-01-15', 1, 7999878),
	('2021-12-20', 3, 7898941),
	('2022-01-20', 2, 7898941);
	
select * from emprestimo 
inner join cliente on  emprestimo.idCliente = cliente.id
inner join livro on emprestimo.idLivro = livro.codigo
inner join editora on livro.idEditora = editora.id;
	


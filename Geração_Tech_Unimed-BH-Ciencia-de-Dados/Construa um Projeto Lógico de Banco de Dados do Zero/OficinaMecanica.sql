-- criação do banco de dados para o cenário de Oficina Mecanica
-- drop database oficina;
create database oficina;
use oficina;

-- criar tabela cliente
-- drop table client;

show tables;

create table clients(
		idClient int auto_increment,
        Fname varchar(60),
        cpf char(11) not null,
        address varchar(255),
        primary key (idClient, cpf),
        constraint unique_cpf_client unique (cpf)
);
    
    alter table clients auto_increment=1;
    desc clients;
-- criar tabela veiculo
-- modelo, ano, cor, placa
create table vehicle( 
		idVehicle int auto_increment,
        veiculoPlaca char(11) not null,
        ano char(8),
        modelo varchar(45) not null,
        cor varchar(45) not null,
        CPFclient char(11) not null,
        primary key (idVehicle, veiculoPlaca),
		constraint fk_CPF_client foreign key (CPFclient) references clients(CPF)
);

desc vehicle;

-- criar tabela Ordem de Serviço(Inicial)
//-- codOS, motivo, data
create table orderService (
		codOS int not null auto_increment primary key,
        motivo varchar(200),
        dataDeSolicitacao datetime not null, 
        CPFclientCPF char(11) not null,
        codEquipeMech int not null,
        Placacarro char(7) not null,
        constraint fk_Placa_carro foreign key (Placacarro) references vehicle(veiculoPlaca),
        constraint fk_CPF_client_CPF foreign key (CPFclientCPF) references clients(CPF),
        constraint fk_cod_Equipe_Mech foreign key (codEquipeMech) references team(codEquipe)
);

-- criar tabela Ordem de Serviço(Execusão)
create table orders(
		valorTotal decimal (5,3) primary key not null,
		orderStatus enum('Cancelado', 'Confirmado','Em processamento') default 'Em processamento',
		dataConclusao datetime not null,
        constraint fk_veiculoPlaca foreign key (veiculoPlaca) references vehicle(veiculoPlaca),
        constraint fk_clienteCPF foreign key (clienteCPF) references clients(clienteCPF),
        constraint fk_codEquipe foreign key (codEquipe) references team(codEquipe),
        constraint fk_codServicoPeca foreign key (codServicoPeca) references serviceParts(codServicoPeca),
        constraint fk_descricaoServicoPeca foreign key (descricaoServicoPeca) references serviceParts(descricaoServicoPeca),
        constraint fk_valorServicoPeca foreign key (valorServicoPeca) references serviceParts(valorServicoPeca)
        on update cascade
);

desc orders;

desc serviceParts;
-- criar tabela serviços e pecas
create table serviceParts (
		codServicoPeca int auto_increment,
		descricaoServicoPeca varchar(255) not null,
        valorServicoPeca decimal (5,2) not null,
        estoque enum('Sem estoque','Em estoque') default 'Em estoque',
        primary key(codServicoPeca, descricaoServicoPeca, valorServicoPeca)      
);




-- equipe
create table team(
	codEquipe int auto_increment primary key
 );
 
desc team;

-- criar tabela mecanico
create table mechanical (
		codEquipe int not null,
        
        Fname_Mint_Lname varchar(150) not null,
		codMecânicos int not null,
        especialidade varchar(50) not null,
        primary key(Fname_Mint_Lname, codEquipe, codMecânicos, especialidade),
        constraint fk_cod_Equipe foreign key (codEquipe) references team(codEquipe),
        
        constraint fk_fname_Mint_Lname foreign key (Fname_Mint_Lname) references Clients(Fname, Mint, Lname)
);

desc mechanical;


show tables;
-- drop table prductstorage;

desc orderSevice;

show tables;

show databases;
use information_schema;
show tables;
desc table_constraints;
desc referential_constraints;

select * from referential_constraints where constraint_schema = 'ecommerce';


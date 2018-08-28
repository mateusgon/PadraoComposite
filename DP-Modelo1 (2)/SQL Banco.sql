create table empresa (
    id_empresa integer primary key,
    nome varchar(100)
);

create table contato (
    id_contato integer primary key generated always as identity,
    nome varchar(100),
    email varchar(100),
    fk_idEmpresa integer,
    foreign key (fk_idEmpresa) references empresa (id_empresa)
);

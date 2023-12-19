CREATE SCHEMA IF NOT EXISTS `db_projeto`;
USE `db_projeto`;

CREATE TABLE IF NOT EXISTS `db_projeto`.`projeto`(
	id_projeto INT,
    descricao VARCHAR(100) NOT NULL,
    datainicio DATE NOT NULL,
    
    PRIMARY KEY(id_projeto)
);

CREATE TABLE IF NOT EXISTS `db_projeto`.`funcao`(
	id_funcao INT,
    descricao VARCHAR(50) NOT NULL,
    
    PRIMARY KEY(id_funcao)
);

CREATE TABLE IF NOT EXISTS `db_projeto`.`desenvolvedor`(
	id_desenvolvedor INT,
    id_projeto INT,
    id_funcao INT,
    nome VARCHAR(50) NOT NULL,
    telefone VARCHAR(10) NOT NULL,
    email VARCHAR(30),
    
    PRIMARY KEY(id_desenvolvedor),
    FOREIGN KEY (id_funcao) REFERENCES funcao(id_funcao) ON DELETE SET NULL ON UPDATE CASCADE,
    FOREIGN KEY (id_projeto) REFERENCES projeto(id_projeto) ON DELETE SET NULL ON UPDATE CASCADE
);

INSERT INTO projeto (id_projeto, descricao, datainicio) VALUES (0,"projeto 1", "2002-05-28");
INSERT INTO projeto (id_projeto, descricao, datainicio) VALUES (1,"projeto 2", "2002-05-28");
TABLE projeto;

INSERT INTO funcao (id_funcao, descricao) VALUES (0,"funcao 1");
INSERT INTO funcao (id_funcao, descricao) VALUES (1,"funcao 2");
TABLE funcao;

INSERT INTO desenvolvedor (id_desenvolvedor, nome, telefone, email, id_funcao, id_projeto) VALUES (0,"Ivanilso", "112341234", "ivanilso@mail.com", 0, 0);
INSERT INTO desenvolvedor (id_desenvolvedor, nome, telefone, email, id_funcao, id_projeto) VALUES (1,"Caike", "112341235", "caike@mail.com", 1, 1);
TABLE desenvolvedor;

DELETE FROM desenvolvedor WHERE `nome` = "Caike";
UPDATE funcao SET `descricao` = "projeto 1000" WHERE `id_funcao` = 0;

TABLE projeto;
TABLE funcao;
TABLE desenvolvedor;
DROP DATABASE IF EXISTS `db_academia`;
CREATE DATABASE IF NOT EXISTS `db_academia`;
USE `db_academia`;

CREATE TABLE `db_academia`.`academia` (
	id INT,
    nome VARCHAR(255),
    
    PRIMARY KEY(id)
);

CREATE TABLE `db_academia`.`endereco` (
	id INT,
    pais VARCHAR(255),
    estado VARCHAR(255),
    cidade VARCHAR(255),
    distrito VARCHAR(255),
	rua VARCHAR(255),
    numero VARCHAR(255),
    cep VARCHAR(255),
    
    PRIMARY KEY(id)
);

CREATE TABLE `db_academia`.`telefone` (
	id INT,
    ddd VARCHAR(4),
    ddi VARCHAR(4),
    numero VARCHAR(9),
    
    PRIMARY KEY(id)
);

CREATE TABLE `db_academia`.`filial` (
	id INT,
    id_academia INT,
    id_endereco INT,
    id_telefone INT,
	cnpj VARCHAR(45) unique,
    razao_social VARCHAR(255) unique,
    
    PRIMARY KEY(id),
	FOREIGN KEY (id_academia) REFERENCES academia(id),
	FOREIGN KEY (id_endereco) REFERENCES endereco(id),
	FOREIGN KEY (id_telefone) REFERENCES telefone(id)
);

CREATE TABLE `db_academia`.`treinador` (
	id INT,
    id_filial INT,
    nome VARCHAR(255),
    cpf VARCHAR(11) UNIQUE,
    salario DOUBLE,
    especializacao VARCHAR(255),
        
    PRIMARY KEY(id),
	FOREIGN KEY (id_filial) REFERENCES filial(id)
);

CREATE TABLE `db_academia`.`cliente` (
	id INT,
    id_filial INT,
    nome VARCHAR(255),
    cpf VARCHAR(11) UNIQUE,
    altura DOUBLE,
    peso DOUBLE,
        
    PRIMARY KEY(id),
	FOREIGN KEY (id_filial) REFERENCES filial(id)
);

CREATE TABLE `db_academia`.`aula` (
	id INT,
    id_treinador INT,
    horario DATE,
        
    PRIMARY KEY(id),
	FOREIGN KEY (id_treinador) REFERENCES treinador(id)
);

CREATE TABLE `db_academia`.`aula_cliente` (
    id_aula INT,
    id_cliente INT,
        
    PRIMARY KEY(id_aula, id_cliente),
	FOREIGN KEY (id_aula) REFERENCES aula(id),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);
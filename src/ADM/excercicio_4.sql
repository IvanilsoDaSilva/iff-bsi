CREATE SCHEMA IF NOT EXISTS `db_imobiliaria`;
USE `db_imobiliaria`;

CREATE TABLE IF NOT EXISTS `corretor`(
	id_corretor INT,
    nome VARCHAR(255),
    cpf VARCHAR(255),
    
    PRIMARY KEY(id_corretor)
);

CREATE TABLE IF NOT EXISTS `cliente`(
	id_cliente INT,
    nome VARCHAR(255),
    telefone VARCHAR(255),
    
    PRIMARY KEY(id_cliente)
);

CREATE TABLE IF NOT EXISTS `endereco`(
	id_endereco INT,
    rua VARCHAR(255),
    estado VARCHAR(255),
    cidade VARCHAR(255),
    bairro VARCHAR(255),
    complemento VARCHAR(255),
    
    PRIMARY KEY(id_endereco)
);

CREATE TABLE IF NOT EXISTS `imovel`(
	id_imovel INT,
	id_endereco INT,
    id_corretor INT,
    descricao VARCHAR(255),
    area INT,
    preco FLOAT,
    tipo ENUM("Apartamento", "Casa", "Terreno"),
    dt_cadastro DATE,
    
    PRIMARY KEY(id_imovel),
    FOREIGN KEY (id_endereco) REFERENCES endereco(id_endereco) ON DELETE SET NULL ON UPDATE CASCADE,
    FOREIGN KEY (id_corretor) REFERENCES corretor(id_corretor) ON DELETE SET NULL ON UPDATE CASCADE,
    INDEX endereco(id_endereco),
    INDEX corretor(id_corretor)
);

CREATE TABLE IF NOT EXISTS `reserva`(
	id_reserva INT,
	id_imovel INT,
    id_cliente INT,
    data DATE,
    hora TIME,

    PRIMARY KEY(id_reserva),
    FOREIGN KEY (id_imovel) REFERENCES imovel(id_imovel) ON DELETE SET NULL ON UPDATE CASCADE,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente) ON DELETE SET NULL ON UPDATE CASCADE,
    INDEX imovel(id_imovel),
    INDEX cliente(id_cliente)
);
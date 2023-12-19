/* DDL */
CREATE SCHEMA `empresa_generica`; /* Não havia criado o SCHEMA do BD */ 
USE `empresa_generica`; 

CREATE TABLE areaNegocio (
	idArea INT(11) NOT NULL AUTO_INCREMENT,
	descricao VARCHAR(50) NOT NULL,
	PRIMARY KEY (idArea)
);

CREATE TABLE funcao (
	idFuncao INT(11) NOT NULL,
	descricao VARCHAR(50) NOT NULL,
	PRIMARY KEY (idFuncao) /* PRIMARE KEY inexistente */ 
);

CREATE TABLE desenvolvedor (
	idDesenvolvedor INT(11) NOT NULL AUTO_INCREMENT,
	idFuncao INT(11),
	nome VARCHAR(50) NOT NULL,
	telefone CHAR(11) DEFAULT NULL, /* telefone com 50 CHAR */
	dataNascimento DATE DEFAULT NULL,
	PRIMARY KEY (idDesenvolvedor),
	FOREIGN KEY (idFuncao) REFERENCES funcao(idFuncao)
);

CREATE TABLE gerente (
	idGerente INT(11) NOT NULL, /* Adição de chave exclusiva para a primary key '´ */
	cpf CHAR(11) NOT NULL, /* CPF como INT e campo com nome maisculo '´ */
	nome VARCHAR(50) NOT NULL,
	telefone CHAR(11) NOT NULL, /* telefone como INT '´ */
	dataNascimento DATE NOT NULL,
	PRIMARY KEY (idGerente)
);

CREATE TABLE projeto ( /* Nome de tabela no plural */
	idProjeto INT(11) NOT NULL,
	idGerente INT(11) NOT NULL,
	dataInicio DATE NOT NULL,
	dataFimEstimada DATE DEFAULT NULL,
	custoAproximado FLOAT DEFAULT NULL,
	statusDesenvolvimento enum('inicial','em desenvolvimento','em implantação','concluído') NOT NULL,
	dataFim DATE DEFAULT NULL,
	idArea INT(11) NOT NULL,
	linguagemProgramacao enum('java','ruby','python','outra') NOT NULL, /* simbolo errado '´ */
	breveDescricao CHAR(100) NOT NULL,
	PRIMARY KEY(idProjeto),
	FOREIGN KEY (idArea) REFERENCES areaNegocio(idArea),
	FOREIGN KEY (idGerente) REFERENCES gerente(idGerente)
);/* ; a mais */

CREATE TABLE projeto_desenvolvedor (
	id_projeto_desenvolvedor int(11) NOT NULL,
	idDesenvolvedor INT(11) NOT NULL,
	idProjeto INT(11) NOT NULL,
	dataInicio DATE NOT NULL,
	PRIMARY KEY(id_projeto_desenvolvedor),
	FOREIGN KEY (idProjeto) REFERENCES projeto(idProjeto),
	FOREIGN KEY (idDesenvolvedor) REFERENCES desenvolvedor(idDesenvolvedor)
); /* ; a mais */

/* DML */
-- Inserir dados na tabela areaNegocio
INSERT INTO empresa_generica.areaNegocio (descricao) VALUES
('Vendas'), ('RH'), ('Marketing'), ('TI'), ('Logística');

-- Inserir dados na tabela funcao
INSERT INTO empresa_generica.funcao (idFuncao, descricao) VALUES
(1, 'Desenvolvedor'), (2, 'Analista de Sistemas'), (3, 'Gerente de Projeto');

-- Inserir dados na tabela desenvolvedor
INSERT INTO empresa_generica.desenvolvedor (idFuncao, nome, telefone, dataNascimento) VALUES
(1, 'João Silva', '12345678901', '1990-05-15'),
(1, 'Maria Souza', '98765432109', '1988-10-20'),
(2, 'Carlos Oliveira', '11122233344', '1995-03-25');

-- Inserir dados na tabela gerente
INSERT INTO empresa_generica.gerente (idGerente, cpf, nome, telefone, dataNascimento) VALUES
(1, '12345678901', 'Roberto Santos', '9988776655', '1975-08-12'),
(2, '98765432109', 'Ana Oliveira', '5544332211', '1980-12-05');

-- Inserir dados na tabela projetos
INSERT INTO empresa_generica.projeto (idProjeto, idGerente, dataInicio, dataFimEstimada, custoAproximado, statusDesenvolvimento, dataFim, idArea, linguagemProgramacao, breveDescricao) VALUES
(1, 1, '2023-01-01', '2023-06-30', 50000.00, 'inicial', NULL, 1, 'java', 'Sistema de Vendas Online'),
(2, 2, '2023-02-15', '2023-08-31', 75000.00, 'em desenvolvimento', NULL, 4, 'python', 'Sistema de Logística');

-- Inserir dados na tabela projeto_desenvolvedor
INSERT INTO empresa_generica.projeto_desenvolvedor(id_projeto_desenvolvedor, idDesenvolvedor, idProjeto, dataInicio) VALUES
(1, 1, 1, '2023-01-01'),
(2, 2, 2, '2023-02-15'),
(3, 3, 2, '2023-02-15');

SELECT d.nome, f.descricao
	FROM desenvolvedor d
    INNER JOIN funcao f
    ON d.idFuncao = f.idFuncao;

SELECT d.nome desenvolvedor, p.breveDescricao projeto
	FROM desenvolvedor d
    INNER JOIN projeto_desenvolvedor pd
    ON d.idDesenvolvedor = pd.idDesenvolvedor
		INNER JOIN projeto p
		ON p.idProjeto = pd.idProjeto;
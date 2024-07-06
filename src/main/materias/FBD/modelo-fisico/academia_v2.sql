-- DDL
/*
	DESCRIÇÃO:
		DDL significa "Data Definition Language" (Linguagem de Definição de Dados) e é uma categoria 
        de comandos utilizados em sistemas de gerenciamento de bancos de dados (SGBDs) para definir,
        estruturar e modificar a estrutura de um banco de dados. Em outras palavras, a DDL é usada para
        criar, alterar e excluir objetos no banco de dados, como tabelas, índices, visões e restrições.
	COMANDOS:
		CREATE
        DROP
        ALTER
*/
-- -- DROP SCHEMA
/*
	DESCRIÇÃO
		O comando "DROP SCHEMA" exclui um esquema inteiro, incluindo todos os objetos dentro dele.
    SINTAXE:
		DROP SCHEMA [IF EXISTS] nome_do_esquema [CASCADE | RESTRICT];
			nome_do_esquema: O nome do esquema que você deseja excluir.
            IF EXISTS: Isso inidica que, a ação so será feita caso exista o esquema.
			CASCADE (opcional): Isso indica que, se o esquema contiver objetos, eles também
            serão excluídos.
			RESTRICT (opcional): Isso indica que a exclusão do esquema será cancelada se
            houver objetos dentro dele. Essa é a opção padrão se você não especificar "CASCADE".
*/
DROP SCHEMA IF EXISTS `academia`;
-- -- CREATE SCHEMA
/*
	DESCRIÇÃO:
		O comando "DROP SCHEMA" é usado para excluir um esquema inteiro em um banco de dados, 
        incluindo todos os objetos dentro dele.
	SINTAXE:
		CREATE SCHEMA [IF NOT EXISTS] nome_do_esquema;
			nome_do_esquema: O nome do esquema que você deseja criar.
            IF NOT EXISTS: Isso inidica que, a ação so será feita caso não exista o esquema.
        
*/
CREATE SCHEMA IF NOT EXISTS `academia`;
-- -- USE
/*
	DESCRIÇÃO:
		**Não faz parte do grupo de comandos DDL**
		Seleciona um banco de dados específico para operações subsequentes.
    SINTAXE: 
		USE nome_do_esquema;
			nome_do_esquema: O nome do esquema que você deseja usar.
*/
USE `academia`;
-- DROP TABLE
/*
	DESCRIÇÃO:
		O comando "DROP TABLE" é uma instrução SQL usada para remover uma tabela existente de um
        banco de dados relacional.
	SINTAXE:
		DROP TABLE nome_da_tabela;
			nome_da_tabela: O nome da tabela que você deseja excluir.
*/
DROP TABLE IF EXISTS `franquia`;
DROP TABLE IF EXISTS `endereco`;
DROP TABLE IF EXISTS `telefone`;
DROP TABLE IF EXISTS `filial`;
DROP TABLE IF EXISTS `treinador`;
DROP TABLE IF EXISTS `cliente`;
DROP TABLE IF EXISTS `aula`;
DROP TABLE IF EXISTS `aula_cliente`;
-- -- CREATE TABLE
/*
	DESCRIÇÃO:
		O comando "CREATE TABLE" é usado para criar uma nova tabela em um banco de dados.
    SINTAXE:
		CREATE TABLE nome_da_tabela (
			nome_da_coluna1 tipo_de_dado,
			nome_da_coluna2 tipo_de_dado,
			...
		);
			nome_da_tabela: O nome que você deseja atribuir à nova tabela.
			nome_da_coluna1, nome_da_coluna2, etc.: Os nomes das colunas que você deseja criar dentro
            da tabela.
			tipo_de_dado: O tipo de dado que cada coluna irá armazenar (por exemplo, INT, VARCHAR,
            DATE, etc.).
*/
CREATE TABLE IF NOT EXISTS `franquia`(
	id INT,
    nome VARCHAR(255),
    site VARCHAR(255),
    
    PRIMARY KEY(id)
);
CREATE TABLE IF NOT EXISTS `endereco`(
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
CREATE TABLE IF NOT EXISTS `telefone`(
	id INT,
    ddd VARCHAR(4),
    ddi VARCHAR(4),
    numero VARCHAR(9),
    
    PRIMARY KEY(id)
);
CREATE TABLE IF NOT EXISTS `especializacao`(
	id INT,
    descricao VARCHAR(255),
    salario FLOAT,
    
    PRIMARY KEY(id)
);
CREATE TABLE IF NOT EXISTS `filial`(
	id INT,
    id_franquia INT,
    id_telefone INT,
    id_endereco INT,
    cnpj VARCHAR(15),
    razao_socal VARCHAR(255),
    
    PRIMARY KEY(id),
    FOREIGN KEY(id_franquia) REFERENCES academia.franquia(id),
    FOREIGN KEY(id_telefone) REFERENCES academia.telefone(id),
    FOREIGN KEY(id_endereco) REFERENCES academia.endereco(id)
);
CREATE TABLE IF NOT EXISTS `treinador`(
	id INT,
    id_filial INT,
    id_especializacao INT,
    nome VARCHAR(255),
    cpf VARCHAR(12),
    data_nascimento DATE,
    
    PRIMARY KEY(id),
    FOREIGN KEY(id_filial) REFERENCES academia.filial(id),
    FOREIGN KEY(id_especializacao) REFERENCES academia.especializacao(id)
);
CREATE TABLE IF NOT EXISTS `aluno`(
	id INT,
    id_filial INT,
    nome VARCHAR(255),
    cpf VARCHAR(12),
    -- data_nascimento DATE, -- Criarei a tabela sem esse campo para cria-lo futuramente em um alter
    altura DOUBLE, -- Criarei esse campo como double para futuramente altera-lo como float em um alter
    a int, -- Criarei esse campo para futuramente remove-lo em um alter
    peso FLOAT,
    
    PRIMARY KEY(id),
    FOREIGN KEY(id_filial) REFERENCES academia.filial(id)
);
CREATE TABLE IF NOT EXISTS `aula`(
	id INT,
    id_treinador INT,
    horario DATETIME,
    
    PRIMARY KEY(id),
    FOREIGN KEY(id_treinador) REFERENCES academia.treinador(id)
);
CREATE TABLE IF NOT EXISTS `aula_cliente`(
	id_aula INT,
    id_aluno INT,
    
    PRIMARY KEY(id_aula, id_aluno),
    FOREIGN KEY(id_aula) REFERENCES academia.aula(id),
    FOREIGN KEY(id_aluno) REFERENCES academia.aluno(id)
);
-- -- ALTER TABLE
/*
	DESCRIÇÃO:
		O comando "ALTER TABLE" é uma instrução SQL usada para modificar a estrutura de uma tabela
        existente em um banco de dados relacional.
    SINTAXE:
		ALTER TABLE nome_da_tabela AÇÃO;
			nome_da_tabela: O nome que você deseja atribuir à nova tabela.
            AÇÃO: 
				ADD: Usado para adicionar uma nova coluna à tabela.
				MODIFY: Usado para alterar as propriedades de uma coluna existente.
				DROP: Usado para excluir uma coluna da tabela.
				ADD CONSTRAINT: Usado para adicionar restrições à tabela (como chaves primárias,
                chaves estrangeiras, restrições de verificação, etc.).
				DROP CONSTRAINT: Usado para remover uma restrição da tabela.
				ADD INDEX: Usado para adicionar um índice à tabela.
				DROP INDEX: Usado para remover um índice da tabela.
*/
ALTER TABLE `aluno` ADD data_nascimento DATE;
ALTER TABLE `aluno` MODIFY altura FLOAT;
ALTER TABLE `aluno` DROP a;
-- DML
/*
	DESCRIÇÃO:
		DML significa "Data Manipulation Language" (Linguagem de Manipulação de Dados) e é uma categoria
        de comandos em SQL usada para interagir com os dados dentro de um banco de dados relacional.
        Ao contrário da DDL (Linguagem de Definição de Dados) que é usada para definir a estrutura do
        banco de dados, a DML é usada para consultar, inserir, atualizar e excluir dados.
	COMANDOS:
		SELECT
        INSERT
        UPDATE
        DELETE
*/

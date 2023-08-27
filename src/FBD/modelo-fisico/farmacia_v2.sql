-- DDL
/*
DDL significa "Data Definition Language" (Linguagem de Definição de Dados) e é uma categoria de comandos
utilizados em sistemas de gerenciamento de bancos de dados (SGBDs) para definir, estruturar e modificar
a estrutura de um banco de dados. Em outras palavras, a DDL é usada para criar, alterar e excluir objetos
no banco de dados, como tabelas, índices, visões e restrições.
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
DROP SCHEMA IF EXISTS `farmacia`;
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
CREATE SCHEMA IF NOT EXISTS `farmacia`;
-- -- USE
/*
	DESCRIÇÃO:
		**Não faz parte do grupo de comandos DDL**
		Seleciona um banco de dados específico para operações subsequentes.
    SINTAXE: 
		USE nome_do_esquema;
			nome_do_esquema: O nome do esquema que você deseja usar.
*/
USE `farmacia`;
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
DROP TABLE IF EXISTS `farmacia`;
-- CREATE TABLE
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
CREATE TABLE IF NOT EXISTS ``(

)
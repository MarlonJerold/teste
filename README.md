# Start

# Teste Prático de Programação

## Descrição do Projeto

Este projeto foi desenvolvido como parte de um teste prático para uma indústria. O objetivo é gerenciar uma lista de funcionários, realizando diversas operações de manipulação e impressão de dados.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

1. **Pessoa**: Representa uma pessoa com atributos `nome` (String) e `dataNascimento` (LocalDate).
2. **Funcionario**: Extende a classe Pessoa, adicionando os atributos `salario` (BigDecimal) e `funcao` (String).
3. **Principal**: Classe principal que executa todas as ações solicitadas.

## Requisitos Implementados

1. **Classe Pessoa**
   - Atributos: `nome` (String) e `dataNascimento` (LocalDate).

2. **Classe Funcionario**
   - Atributos: `salario` (BigDecimal) e `funcao` (String).

3. **Classe Principal**
   - **Inserção de Funcionários**: Inserir todos os funcionários conforme a tabela fornecida.
   - **Remoção de Funcionário**: Remover o funcionário “João” da lista.
   - **Impressão de Funcionários**: Imprimir todos os funcionários com todas suas informações:
     - Data no formato `dd/MM/yyyy`.
     - Salário formatado com separador de milhar como ponto e decimal como vírgula.
   - **Aumento de Salário**: Aplicar um aumento de 10% no salário de todos os funcionários.
   - **Agrupamento por Função**: Agrupar os funcionários por função em um `Map`.
   - **Impressão por Função**: Imprimir os funcionários agrupados por função.
   - **Aniversariantes**: Imprimir os funcionários que fazem aniversário nos meses 10 e 12.
   - **Funcionário mais velho**: Imprimir o nome e a idade do funcionário com a maior idade.
   - **Ordenação Alfabética**: Imprimir a lista de funcionários em ordem alfabética.
   - **Total de Salários**: Imprimir o total dos salários dos funcionários.
   - **Salários Mínimos**: Imprimir quantos salários mínimos cada funcionário ganha, considerando o salário mínimo de R$1212,00.

## Ferramentas Utilizadas

- IDE: Eclipse
- Spring Boot
- Linguagem: Java
- Biblioteca: `java.time` para manipulação de datas, `java.math.BigDecimal` para manipulação de valores monetários.

## Instruções para Execução

1. **Clonar o repositório**:
   ```sh
   git clone https://github.com/MarlonJerold/teste

#### Pensamentos sobre o teste!

Poderia ter feito o teste técnico sem usar frameworks, porém quis adicionar porque achei interessante quando estamos falando de um contexto real, precisamos de facilidade em configurações, também, adicionei dependências para caso o projeto seguisse para APIs, que no caso não foi o pedido, a regra de negócio está no Main, onde para determinados Models, criei o método para o contexto presente na Classe. Planos para o futuro? Poderia se conectar a um banco de dados, também adicionei dependendência para banco H2, utilizando Spring Data JPA, para uma futura persistencia assim como a adição de um Hibernate para o projeto.

Em seguida, poderia criar Controllers, onde teria as rotas das funcionalidades que poderia ser escrita em um serviço, onde o serviço teria instancia de um repositôrio, dando acesso ao banco.

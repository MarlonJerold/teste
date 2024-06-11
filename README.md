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

## Retorno do programa

### Funcionários:

- **Maria (Operador):** Salário: 2210.384
- **Caio (Coordenador):** Salário: 10819.754
- **Miguel (Diretor):** Salário: 21031.868
- **Alice (Recepcionista):** Salário: 2458.148
- **Heitor (Operador):** Salário: 1740.992
- **Arthur (Contador):** Salário: 4479.024
- **Laura (Gerente):** Salário: 3319.195
- **Heloísa (Eletricista):** Salário: 1767.535
- **Helena (Gerente):** Salário: 3079.923

### Funcionários agrupados por função:

- **Operador:**
  - Maria (Salário: 2210.384)
  - Heitor (Salário: 1740.992)
- **Eletricista:**
  - Heloísa (Salário: 1767.535)
- **Recepcionista:**
  - Alice (Salário: 2458.148)
- **Diretor:**
  - Miguel (Salário: 21031.868)
- **Gerente:**
  - Laura (Salário: 3319.195)
  - Helena (Salário: 3079.923)
- **Coordenador:**
  - Caio (Salário: 10819.754)
- **Contador:**
  - Arthur (Salário: 4479.024)

### Funcionários que fazem aniversário em outubro (10) e dezembro (12):

- Maria (Data de Nascimento: 2000-10-18)
- Miguel (Data de Nascimento: 1988-10-14)

### Funcionário mais velho:

- **Nome:** Caio
- **Idade:** 63

### Funcionários em ordem alfabética:

- Alice
- Arthur
- Caio
- Heitor
- Helena
- Heloísa
- Laura
- Maria
- Miguel

### Total dos salários dos funcionários:

50906.823

### Salários mínimos dos funcionários:

- Alice: 2.02
- Arthur: 3.69
- Caio: 8.92
- Heitor: 1.43
- Helena: 2.54
- Heloísa: 1.45
- Laura: 2.73
- Maria: 1.82
- Miguel: 17.35

![image](https://github.com/MarlonJerold/teste/assets/63025001/4c53ef71-a287-40a2-a656-ff681381bbc3)

![image](https://github.com/MarlonJerold/teste/assets/63025001/0389deeb-835d-42df-8ce5-63c1313ccee3)
![image](https://github.com/MarlonJerold/teste/assets/63025001/cdca675f-08ca-425a-a073-6a50429098b2)
![image](https://github.com/MarlonJerold/teste/assets/63025001/1aed8282-8705-4b42-9d73-3ef892de14d7)
![image](https://github.com/MarlonJerold/teste/assets/63025001/5ff9c0a2-0f24-41b6-aa6b-f85bc6749722)
![image](https://github.com/MarlonJerold/teste/assets/63025001/54f608ae-4cc7-47ef-9a69-f293e4df2433)

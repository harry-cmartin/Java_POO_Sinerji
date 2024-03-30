# Projeto: Sistema empresarial de gerenciamento - Teste para Vaga de Estágio em Desenvolvimento Java

---

## Descrição do Projeto

O Projeto é um sistema de gestão de funcionários desenvolvido em Java orientado a objetos. Ele foi criado como parte do processo de seleção para a vaga de estágio em desenvolvimento Java na empresa Sinerji - Gestão e Sistemas.

## Funcionalidades

O sistema possui as seguintes funcionalidades:

1. Método que recebe uma lista de funcionários, mês e ano e retorna o valor total 
pago (salário e benefício) a esses funcionários no mês. 
2.  Um método que recebe uma lista de funcionários, mês e ano e retorna o total pago 
somente em salários no mês. 
3.  Um método que recebe uma lista somente com os funcionários que recebem 
benefícios, mês e ano e retorna o total pago em benefícios no mês. 
4. Um método que recebe uma lista de funcionários, mês e ano e retorna o que 
recebeu o valor mais alto no mês. 
5. Um método que recebe uma lista somente com os funcionários que recebem 
benefícios, mês e ano e retorna o nome do funcionário que recebeu o valor mais 
alto em benefícios no mês. 
6. Um método que recebe uma lista de vendedores, mês e ano e retorna o que mais 
vendeu no mês. 

## Tecnologias Utilizadas

O projeto foi desenvolvido utilizando as seguintes tecnologias:

- Linguagem de Programação: Java
- Paradigma de Programação: Orientação a Objetos
- Ferramentas de Desenvolvimento: Visual Studio Code - Microsoft
- Controle de Versão: Git e Github


## Estrutura do Projeto

O projeto é dividido em pacotes e classes conforme a seguinte estrutura:

- `Java_-_Orientação_a_ojetos.TesteEstágio.model`: Contém as classes que representam os modelos de dados do sistema, como `Funcionario`, `Vendedor`, `Gerente`, etc.
- `Java_-_Orientação_a_ojetos.TesteEstágio.Utils`: Contém classes utilitárias, como `Verificadata`, etc.

## Instruções de Uso

1. Clone o repositório do projeto para sua máquina local usando o comando `git clone`.
2. Abra o projeto em sua IDE de preferência .
3. Compile e execute o projeto.
4. Para compilar utilizando o terminal linux digite o seguinte comando: `javac -cp . TesteEstágio/AdministracaoEmpresa.java`
5. Para executa-lo: `java -cp . TesteEstágio.AdministracaoEmpresa`
6. Para obter diferentes resultados para os métodos implementados e observar o funcionamento do sistema, mude os parâmetros "mes" e "ano", conforme necessário e possível, localizados no arquivo AdministracaoEmpresa, das seguintes chamadas:

![Img](/TesteEstágio/assets/Img.png)



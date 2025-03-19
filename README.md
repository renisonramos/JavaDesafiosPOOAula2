# Desafios de Programação Orientada a Objetos em Java

Este repositório contém a resolução de três desafios de programação que visam a prática de conceitos fundamentais da Programação Orientada a Objetos (POO) em Java. Os desafios envolvem a criação de classes, atributos (privados e públicos), métodos getters e setters, e a implementação de lógica de negócios dentro dos métodos das classes.
Ainda faltam dois desafios a serem compridos.
## Estrutura do Repositório

A estrutura do repositório é organizada da seguinte forma:

├── src/
│ ├── ContaBancaria.java # Classe para o Desafio 1
│ ├── IdadePessoa.java # Classe para o Desafio 2
│ ├── Produto.java # Classe para o Desafio 3
│ └── Principal.java # Classe Principal para executar os desafios
├── README.md # Este arquivo

*   **`src/`**: Diretório que contém todos os arquivos fonte Java.
*   **`ContaBancaria.java`**: Implementação da classe `ContaBancaria` conforme descrito no Desafio 1.
*   **`IdadePessoa.java`**: Implementação da classe `IdadePessoa` conforme descrito no Desafio 2.
*   **`Produto.java`**: Implementação da classe `Produto` conforme descrito no Desafio 3.
*   **`Main.java`**: Classe principal que contém o método `main` para instanciar e testar as classes criadas nos desafios. Este arquivo demonstra o uso das classes e seus métodos.
*   **`README.md`**: Este arquivo, contendo a descrição dos desafios e a estrutura do repositório.

## Descrição dos Desafios

### Desafio 1: Classe ContaBancaria

Crie uma classe `ContaBancaria` com os seguintes atributos:

*   `numeroConta` (privado): Número da conta bancária.
*   `saldo` (privado): Saldo da conta bancária.
*   `titular` (público): Nome do titular da conta.

Implemente os métodos getters e setters para os atributos privados `numeroConta` e `saldo`.

### Desafio 2: Classe IdadePessoa

Crie uma classe `IdadePessoa` com os seguintes atributos:

*   `nome` (privado): Nome da pessoa.
*   `idade` (privado): Idade da pessoa.

Utilize métodos getters e setters para acessar e modificar os atributos privados `nome` e `idade`. Adicione um método `verificarIdade` que imprime se a pessoa é maior de idade ou não (considerando maior de idade a partir de 18 anos).

### Desafio 3: Classe Produto

Desenvolva uma classe `Produto` com os seguintes atributos:

*   `nome` (privado): Nome do produto.
*   `preco` (privado): Preço do produto.

Utilize métodos getters e setters para acessar e modificar os atributos privados `nome` e `preco`. Adicione um método `aplicarDesconto` que recebe um valor percentual como argumento e reduz o preço do produto de acordo com o percentual fornecido.

### Desafio 4: Classe Aluno

Desenvolva uma classe `Aluno` com os seguintes atributos:

*   `nome` (privado): Nome do aluno.
*   `notas` (privado): Notas do aluno (considerei que seriam duas notas para simplificar).

Utilize métodos getters e setters para acessar e modificar os atributos privados. Adicione um método `calcularMedia` que retorna a média das notas do aluno.

### Desafio 5: Classe Livro

Desenvolva uma classe `Livro` com os seguintes atributos:

*   `titulo` (privado): Título do livro.
*   `autor` (privado): Autor do livro.

Utilize métodos getters e setters para acessar e modificar os atributos privados. Adicione um método `exibirDetalhes` que imprime o título e o autor do livro.

## Como Executar os Desafios

1.  Clone este repositório para a sua máquina local.
2.  Certifique-se de ter o Java Development Kit (JDK) instalado e configurado corretamente.
3.  Navegue até o diretório `src/`.
4.  Compile os arquivos Java usando o comando: `javac *.java`
5.  Execute a classe `Main` usando o comando: `java Main`

A classe `Main` irá demonstrar a criação de objetos das classes `ContaBancaria`, `IdadePessoa` e `Produto`, e a utilização de seus respectivos métodos.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests com melhorias, correções ou novas funcionalidades.


## Autor
Renison B. Ramos

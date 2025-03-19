public class Main {
    public static void main(String[] args) {
        System.out.println("Desafios Aula 2 POO");
        System.out.println("Desafio 1: Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.");


        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(16381);
        contaBancaria.setSaldo(2758.56);
        contaBancaria.titular = "Renison Borralho Ramos";

        System.out.println("Titular da conta: " + contaBancaria.titular);
        System.out.println("Número da Conta: " + contaBancaria.getNumeroConta());
        System.out.println("Saldo: R$" + contaBancaria.getSaldo());

        contaBancaria.setSaldo(1245.44);
        System.out.println("Novo Saldo: " + contaBancaria.getSaldo());
        System.out.println("FIM DO DESAFIO 1 ");


        System.out.println("Desafio 2: Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não. ");


        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Renison");
        pessoa1.setIdade(26);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Lara Sophie");
        pessoa2.setIdade(10);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());

        pessoa2.verificarIdade();

        System.out.println("FIM DO DESAFIO 2");
        System.out.println();
        System.out.println("Desafio 3: Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.");


        Produto produto = new Produto("Celular", 2000.0);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());

        System.out.println("FIM DO DESAFIO 3");
        System.out.println("Desafio 4: Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.");

        Aluno aluno1 = new Aluno("Renison", 10,8);
        aluno1.calcularMedia();
        System.out.println("Aluno: " + aluno1.getNomeAluno());
        System.out.println("Média: " + aluno1.calcularMedia());

        Aluno aluno2 = new Aluno("Lara", 10 , 10);
        aluno2.calcularMedia();
        System.out.println("Aluno: " + aluno2.getNomeAluno());
        System.out.println("Média: " + aluno2.calcularMedia());


        System.out.println("FIM DO DESAFIO 4");

        System.out.println("Desafio 5: Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.");

        Livro livro1 = new Livro("A lista de Convidados", "Sarah Bernete");
        livro1.exibirDetalhes();
        Livro livro2 = new Livro("A volta dos que não foram", "Charles Henrique Pedia");
        livro2.exibirDetalhes();


    }

}
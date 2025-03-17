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
    }

}
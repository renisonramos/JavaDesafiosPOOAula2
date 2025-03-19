//Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um metodo calcularMedia que retorna a média das notas do aluno.

 class Aluno {
    private String nomeAluno;
    private double nota1;
    private double nota2;


    // Construtores
  public Aluno(String nomeAluno, double nota1, double nota2) {
   this.nomeAluno = nomeAluno;
   this.nota1 = nota1;
   this.nota2 = nota2;
  }

  // Getters And Setters
  public String getNomeAluno() {
   return nomeAluno;
  }

  public void setNomeAluno(String nomeAluno) {
   this.nomeAluno = nomeAluno;
  }

  public double getNota1() {
   return nota1;
  }

  public void setNota1(double nota1) {
   this.nota1 = nota1;
  }

  public double getNota2() {
   return nota2;
  }

  public void setNota2(double nota2) {
   this.nota2 = nota2;
  }

  // Metodo calcularMedia
  public double calcularMedia() {
   return (nota1 + nota2) / 2;
  }
 }

package javabasico.cap6;

public class Empregado {

  private String nome;
  private String cpf;
  private final float Insalubridade = 2.21f;
  public float salario(){
    return 0f;
  }


  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getInsalubridade() {
    return Insalubridade;
  }

  public Empregado(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }
  public String toString(){
    return "Nome: " + nome + "\nCPF: " + cpf;
  }




}

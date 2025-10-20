package javabasico.cap6;

public class EmpregadoAssalariado extends Empregado {
  private float salarioMensal;

  public float getSalarioMensal() {
    return salarioMensal;
  }

  public void setSalarioMensal(float salarioMensal) {
    if(salarioMensal < 0){
      this.salarioMensal = 0;
    }
    else{
      this.salarioMensal = salarioMensal;
    }
  }

  public EmpregadoAssalariado(String nome, String cpf, float salarioMensal) {
    super(nome, cpf);
    this.salarioMensal = salarioMensal;
  }

  public float salario(){
    return getSalarioMensal() * getInsalubridade();

  }

  @Override
  public String toString() {
    return super.toString()+salario();
  }

}

package javabasico.cap6;

public class EmpregadoComissionado extends Empregado {

  private float vendaBrutaMensal;
  private float comissao;

  public float getVendaBrutaMensal() {
    return vendaBrutaMensal;
  }

  public void setVendaBrutaMensal(float vendaBrutaMensal) {
    if(vendaBrutaMensal < 0){
      this.vendaBrutaMensal = 0;
    }
    else{
      this.vendaBrutaMensal = vendaBrutaMensal;
    }
  }

  public float getComissao() {
    return comissao;
  }

  public void setComissao(float comissao) {
    if(comissao < 0){
      this.comissao = 0;
    }
    else{
      this.comissao = comissao;
    }
  }

  public EmpregadoComissionado(String nome,String cpf,float vendaBrutaMensal,float comissao) {
    super(nome,cpf);
    this.vendaBrutaMensal = vendaBrutaMensal;
    this.comissao = comissao;
  }
  public float salario(){
    return getComissao() * getVendaBrutaMensal() * getInsalubridade();
  }
}

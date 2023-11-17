package atividade.carro;

public class Condutor {
    private String codHabilitacao;
    public Condutor(){}
    public Condutor(String codHabilitacao){
        this.codHabilitacao = codHabilitacao;
    }
    public void setCodHabilitacao(String codHabilitacao) {
        this.codHabilitacao = codHabilitacao;
    }
    public String getCodHabilitacao() {
        return codHabilitacao;
    }
    public void dirigir(Carro carro){
        System.out.println("Condutor "+codHabilitacao+" dirigindo um carro ");
        System.out.println("É um modelo "+carro.getModelo());
        System.out.println("Motor: "+carro.getMotor().getCilindrada());
    }
}

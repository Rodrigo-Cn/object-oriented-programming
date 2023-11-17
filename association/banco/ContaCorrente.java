package atividade.banco;

public class ContaCorrente {
    float saldo;
    public ContaCorrente(){}
    public ContaCorrente(float saldo){
        this.saldo = saldo;
    }
    public void saque(){
        saldo -= 100.0f;
        System.out.println("Novo Saldo: "+saldo);
    }
    public void deposito(){
        saldo += 100.0f;
        System.out.println("Novo Saldo: "+saldo);
    }
}

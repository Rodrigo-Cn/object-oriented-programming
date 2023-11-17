package atividade.banco;

public class Poupanca {
        float saldo;

        public Poupanca(){}
        public Poupanca(float saldo){
            this.saldo = saldo;
        }
        public void saque(){
            saldo -= 10.0f;
            System.out.println("Novo Saldo: "+saldo);
        }
        public void deposito(){
            saldo += 10.0f;
            System.out.println("Novo Saldo: "+saldo);
        }
}


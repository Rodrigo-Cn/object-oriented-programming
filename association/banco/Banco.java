package atividade.banco;

import java.util.ArrayList;

public class Banco {
        Poupanca[] poupancas;
        ContaCorrente[] contasCorrentes;
        public int numConta, numPoupanca;
        public void iniciarBanco(){
                poupancas = new Poupanca[100];
                contasCorrentes = new ContaCorrente[100];
                numConta = 1;
                numPoupanca = 1;
        }
        public void abreConta(){
                contasCorrentes[numConta] = new ContaCorrente();
                numConta++;
        }
        public void abrePoupanca(){
                poupancas[numPoupanca] = new Poupanca();
                numPoupanca++;
        }
        public void falencia(){
                for (int i=0; i<100; i++){
                        poupancas[i] = null;
                        contasCorrentes[i] = null;
                }
        }
}

package atividade.carro;

public class Carro {
    private String modelo;
    private int velocidadeMax;
    private int velocidadeAtual;
    private Motor motor;
    public Carro(){
    }
    public Carro(String modelo, int velocidadeMax, Motor motor){
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
        this.motor = motor;
        this.velocidadeAtual = 0;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void ligarCarro(){
        System.out.println("O carro ligou");
    }
    public void desligarCarro(){
        System.out.println("O carro desligou");
    }
    public void acelerar(int velocidade){
        if(this.velocidadeAtual+velocidade<=this.velocidadeMax){
            this.velocidadeAtual += velocidade;
            System.out.println("Acelerando ! Velocidade atual: "+this.velocidadeAtual+"km/h");
        }else {
            System.out.println("Não pode ultrapassar a velocidade máxima !!!");
        }
    }
    public void desacelerar(int velocidade){
        if (this.velocidadeAtual==0){
            System.out.println("O carro está parado");
        } else if (this.velocidadeAtual-velocidade<0) {
            System.out.println("Não é possível diminuir abaixo de "+this.velocidadeAtual+" km/h");
        } else{
            this.velocidadeAtual -= velocidade;
            System.out.println("Desacelerando ! Velocidade atual: "+this.velocidadeAtual+"km/h");
            if (this.velocidadeAtual == 0){
                pararCarro();
            }
        }
    }

    public void pararCarro(){
        this.velocidadeAtual = 0;
        System.out.println("O carro parou.");
    }
}

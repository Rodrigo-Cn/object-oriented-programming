package atividade.carro;

public class Motor {
    private String fabricante;
    private double cilindrada;
    private String combustivel;

    public Motor(){}

    public Motor(String fabricante, double cilindrada, String combustivel){
        this.fabricante = fabricante;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }
}


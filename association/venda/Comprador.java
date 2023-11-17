package atividade.venda;

public class Comprador {
    protected float verba;
    public Comprador(float verba){
        this.verba = verba;
    }

    public void setVerba(float verba) {
        this.verba = verba;
    }

    public float getVerba() {
        return verba;
    }
    public void comprado(){
        System.out.println("Comprado");
    }
}

package atividade.venda;

public class Vendedor {
    protected float comissao;
    public Vendedor(float comissao){
        this.comissao = comissao;
    }
    public void setComissao(float comissao) {
        comissao = comissao;
    }
    public float getComissao() {
        return comissao;
    }
    public void vende(){
        System.out.println("Vendido");
    }
}

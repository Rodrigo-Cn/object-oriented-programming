package atividade.venda;

public class Venda {
    private Comprador c;
    private Vendedor v;
    private Produto p;
    public Venda(Comprador c, Vendedor v, Produto p){
        this.c = c;
        this.v = v;
        this.p = p;
    }

    public void setC(Comprador c) {
        this.c = c;
    }

    public Comprador getC() {
        return c;
    }

    public void setV(Vendedor v) {
        this.v = v;
    }

    public Vendedor getV() {
        return v;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public Produto getP() {
        return p;
    }
    public void concretizarVenda(){
        System.out.println("Venda realizada");
        c.verba -= p.getPreco();
        v.comissao = p.getPreco() * 0.1f;
        p.vendido();
    }
    public void cancelarVenda(){
    System.out.println("Venda cancelada");
    }
}

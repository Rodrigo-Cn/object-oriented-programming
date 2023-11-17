package atividade.venda;

public class Produto {
    private float preco;
    private int tamanho;
    public Produto(float preco, int tamanho){
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }
    public void vendido(){
        System.out.println("Vendido");
    }
}

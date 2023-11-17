package atividade.carro;

public class testarCarro {
    public static void main(String[] args) {
        Condutor meuCondutor = new Condutor("a1a3ef");
        Motor meuMotor = new Motor("Audi",4.0,"Gasolina");
        Carro meuCarro  = new Carro("A3",300,meuMotor);

        System.out.println(meuCarro.getModelo());
        System.out.println(meuCarro.getMotor().getFabricante());
        meuCondutor.dirigir(meuCarro);
    }
}

package eletronicos;

/**
 *
 * @author EU MESMO
 */
public class Tv extends Eletronicos {

    public Tv(String tipo, double iD, String fabricante, double preco, String cor, double altura, double largura) {
        super(tipo, iD, fabricante, preco, cor, altura, largura);
    }





    public void mudarcanal(){
        System.out.println("O canal foi alterado");
    }
            
            
            
            
}

package eletronicos;

/**
 *
 * @author EU MESMO
 */
public class Som extends Eletronicos {

    public Som(String tipo, int iD, String fabricante, double preco, String cor, double altura, double largura) {
        super(tipo, iD, fabricante, preco, cor, altura, largura);
    }

    public void mudarcanal(){
        System.out.println("O canal foi alterado");
    }
    
    
    
    
    
    
}

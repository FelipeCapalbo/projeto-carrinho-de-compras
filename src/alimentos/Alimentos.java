package alimentos;

import Produto.Produto;

/**
 *
 * @author EU MESMO
 */
public class Alimentos extends Produto{

    protected double kg;

    public Alimentos(String tipo, double iD, String fabricante, double preco,double kg) {
        super(tipo, iD, fabricante, preco);
        this.kg = kg;
    }

 

    public double getKg() {
        return kg;
    }


 
    
}

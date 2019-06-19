package higiene;

import Produto.Produto;

/**
 *
 * @author EU MESMO
 */
public class Higiene extends Produto{
    
   
    protected double Peso;

    public Higiene(String tipo, double iD, String fabricante, double preco, double Peso) {
        super(tipo,iD,fabricante,preco);
        
        this.Peso = Peso;
    }
    

    

    public double getPeso() {
        return Peso;
    }


    
    
    
 
    
}

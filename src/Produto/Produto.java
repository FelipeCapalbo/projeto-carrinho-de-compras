package Produto;

/**
 *
 * @author EU MESMO
 */
public abstract class Produto {
    protected String tipo;
    protected double iD;
    protected String fabricante;
    protected double preco;
    
    public Produto() {}
    
    public Produto(String tipo, double iD, String fabricante, double preco) {
        this.tipo = tipo;
        this.iD = iD;
        this.fabricante = fabricante;
        this.preco = preco;
    }




    public String getTipo() {
        return tipo;
    }

    public double getID() {
        return iD;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getPreco() {
        return preco;
    }
    
    @Override
    public String toString(){
        return "----"+tipo + fabricante + String.format(" R$%.2f", preco) ;
        
    }

}

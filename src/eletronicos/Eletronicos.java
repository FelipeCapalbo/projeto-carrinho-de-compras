package eletronicos;

import Produto.Produto;

/**
 *
 * @author EU MESMO
 */
public class Eletronicos extends Produto{

    protected String cor;
    protected double altura;
    protected double largura;

    public Eletronicos(String tipo, double iD, String fabricante, double preco,String cor, double altura, double largura) {
        super(tipo, iD, fabricante, preco);
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
    }





    public void estado(){
        System.out.println("O aparelho encontra-se desligado.");
    }

    public void aumentarSom(){
        System.out.println("O som foi aumentado");
    }

    public String getCor() {
        return cor;
    }

    public void getTamanho(){
        System.out.println(altura + " X " + largura );
    }



    
    
}

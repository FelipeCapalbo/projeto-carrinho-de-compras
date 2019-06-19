/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletronicos;

/**
 *
 * @author EU MESMO
 */
public class Smartphone extends Eletronicos{

    public Smartphone(String tipo, int iD, String fabricante, double preco, String cor, double altura, double largura) {
        super(tipo, iD, fabricante, preco, cor, altura, largura);
    }


    public void fazerChamada(){
            System.out.println("Realizando uma chamada...");
    }
    
}

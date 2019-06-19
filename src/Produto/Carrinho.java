package Produto;

import java.util.ArrayList;



public class Carrinho extends Produto {

	private static ArrayList<Produto> carrin = new ArrayList<>();

	public static ArrayList<Produto> getCarrin() {
		return carrin;
	}

	static public void adicionar(Produto p) {
		carrin.add(p);
	}
	
	
	static public String listarProd () {
		String saida = "";
		
		for(Produto p : carrin) {
			saida += p.toString() + "\n";
		}
		
		return saida ;
	}
	
	//tamanho do array
	static public int tam() {
		int qtd= 0;
		qtd = carrin.size();
		
		return qtd;
	}
	
 
    static public double totalCompra() {
		double total = 0;
		for(Produto p : carrin) {
			total += p.getPreco();
		}
		
	return total;
	}
    
    static public void esvaziar(){
        carrin.clear();
    }
    
    

}



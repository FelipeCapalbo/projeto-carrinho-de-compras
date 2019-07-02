package projetoav;


import eletronicos.Tv;
import eletronicos.Smartphone;
import eletronicos.Som;
import alimentos.Alimentos;
import higiene.Higiene;
import java.util.Scanner;
import Produto.Carrinho;
import java.util.Locale;

/**
 *
 * @author EU MESMO
 */
public class ProjetoAV {

        public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        //DECLARAÇÃO DAS VARIAVEIS DE : NUM , NUM1 : PARA OS SWITCH     QUANTT: RECEBE A QUANTIDADE DE PRODUTROS DO CARRIN NO WILLE
        // QTD : RECEBE A SOLUCAO PARA SAIR DO PROGRAMA DE COMPRAS
        int num , num1, qtd = 0, quant =0 ;
        
        int tam1=0, tam2=0 ,tam=0,tamEletro=0,tamAlimentos=0,tamHigi=0;
        Scanner sc,sd;
       
        //SCANNER DE INTEIROS 
        sc = new Scanner(System.in) ;
       sd = new Scanner(System.in) ;
        
        
    //instanciacao dos Alimentos
    Alimentos arrozagulhinha = new Alimentos("Arroz Agulhinha", 20190001, "Qualita", 12.90, 1.0);
    Alimentos arrozintegral = new Alimentos("Arroz Integral Tipo 1", 20190002, "TAEQ", 4.15, 1.0);
    Alimentos feijaocarioca = new Alimentos("Feijão Carioca tipo 1",20190003, "Qualita", 5.79, 1.0);
    Alimentos feijaofradinho  = new Alimentos("Feijão Fradinho em conserva ", 20190004, "Camil", 5.15, 1.0);
    Alimentos carnefraldinha = new Alimentos("Fraldinha Bovina Resfriada", 20190005, "FriBoi", 43.56, 1.0); 
    Alimentos carnefile = new Alimentos("Contra Filé Bovino Resfriado", 20190006, "Angus", 50.99, 1.0);
  
    //instanciacao dos Eletronicos
    Tv tv55 = new Tv("Smart Tv Led 55 Ultra Hd 4k", 20190007, "LG", 2699.00, "Preta", 83.4, 124.9);
    Tv tv65 = new Tv("Smart Tv Led 65 4k", 20190008, "Sony", 6369.00, "Branco", 84.4, 146.0);
    Som sommine = new Som("Mini System 2150W RMS", 20190009, "Philco", 1999.00, "Preto", 33.5, 31.0);
    Som somtorre = new Som("Mini System Torre Bluetooth", 20190010, "Sony", 4499.00, "Azul", 170.0, 53.2);
    Smartphone iphone = new Smartphone("iPhone XR 64GB iOS 12", 20190011, "Apple", 4399.00, "Vermelho", 15.7, 5.0);
    Smartphone s10 = new Smartphone("Smartphone Galaxy S10 128GB ", 20190012, "Samsung", 41999.00, "Branco", 14.9, 7.0);
   
    //instanciacao dos Higiene
    Higiene pastaC = new Higiene("Creme Dental Tripla Ação 90g", 20190013, "Colgate", 3.39, 90 );
    Higiene pastaB = new Higiene("Gel dental Pro-White 90g", 20190014, "Hinode", 11.99, 90 );
    Higiene ShampooD = new Higiene("Shampo Anti-Idade Nutri Repair Caviar & Pérolas 300ml", 20190015, "Lacan", 39.02, 300);
    Higiene ShampooE = new Higiene("Shampoo Anticaspa  Ice Cool Menthol 400ml", 20190016, "Clear Men", 21.50, 400);
    Higiene saboneteF = new Higiene("Sabonete em Barra Óleo de Argan 90g", 20190017, "Dove.39,", 2.89, 90);
    Higiene saboneteG = new Higiene("Sabonete em Barra Iluminadora 90g", 20190018, "Johnson`s", 2.15, 90);
    
   
 //CENRT
            System.out.println("");
        System.out.println("          ---------------SEJA BEM VINDO AO SMARTCAR---------------");
        System.out.println("\n\n      Comece as suas compras...\n"); //
        
 
        while ( quant < 10) {
                
                
           
        	System.out.println("\n\n== Selecione o Tipo do "+(quant+1)+"° Produto Que Você Deseja Adicionar no Carrinho ==");
        	mostrarProdutos();
        	num=sc.nextInt();
        
        	switch (num){
                    
                        // APRESENTA ELETRONICOS 
            	case 1:
                tamEletro=Carrinho.tam();   
                while ( tamEletro < 10){
                    mostrarEletronicos();
                    num1=sc.nextInt();
                    switch(num1){
                        case 1: Carrinho.adicionar(tv55);
                        
                            break;    
                        case 2:
                            Carrinho.adicionar(tv65);
                            break;
                        
                        case 3:
                            Carrinho.adicionar(sommine);
                            break;
                        
                        case 4:
                            Carrinho.adicionar(somtorre);
                            break;
                        
                        case 5:
                            Carrinho.adicionar(iphone);
                            break;
                        
                        case 6:
                            Carrinho.adicionar(s10);
                            break ;
                        case 7:
                            System.out.println("\n\n         ====== SEU CARRINHO ====== \n");
                            System.out.println(Carrinho.listarProd());
                            System.out.println("\nTotal de Produtos \n"
                                             + "        no Carrin ====> "+quant);
                            System.out.println("                  =========> TOTAL : R$" + Carrinho.totalCompra());
                            System.out.println("\n\n");   
                            break;
                        case 8:
                           tam=11;
                           
                            break; 
                    
                    case 9:
                       System.out.println(Carrinho.listarProd());
                       System.out.println("                  =========> TOTAL : R$" + Carrinho.totalCompra());
                       System.out.println("\n\n");
                       qtd=11;
                       Carrinho.esvaziar();
                       System.out.println("==== COMPRA CONCLUIDA COM SUCESSO ====");
                    break;    
                    
                  
                             }
                      //se entrar no 9
                       tamEletro=Carrinho.tam()+tam+qtd;
                       //se entrar no 8
                       
                      quant = Carrinho.tam()+qtd;
                }
           
                         break;       

           
                    // APRESENTA HIGIENE 
            case 2:
               tamHigi=Carrinho.tam();
                while ( tamHigi < 10){
                mostrarHigiene();
                num1=sd.nextInt();
                switch (num1){
                    case 1:
                        Carrinho.adicionar(pastaC);
                        break;
                    case 2:
                        Carrinho.adicionar(pastaB);
                        break;
                    case 3:
                        Carrinho.adicionar(ShampooD);
                        break;
                    case 4:
                        Carrinho.adicionar(ShampooE);
                        break;
                    case 5:
                        Carrinho.adicionar(saboneteF);
                        break;
                    case 6:
                        Carrinho.adicionar(saboneteG);
                        break;
                    case 7:
                        //mostrar lista
                            System.out.println("\n\n         ====== SEU CARRINHO ====== \n");
                            System.out.println(Carrinho.listarProd());
                            System.out.println("\nTotal de Produtos \n"
                                             + "        no Carrin ====> "+quant);
                            System.out.println("                  =========> TOTAL : R$" + Carrinho.totalCompra());
                            System.out.println("\n\n");   
                            break;
                    case 8:
                        tam1=11;
                        
                        
                        break;
                    case 9:
                       System.out.println(Carrinho.listarProd());
                       System.out.println("                  =========> TOTAL : R$" + Carrinho.totalCompra());
                       System.out.println("\n\n");
                       qtd=11;
                       Carrinho.esvaziar();
                       System.out.println("==== COMPRA CONCLUIDA COM SUCESSO ====");                      
                       break;            
                }
                        //se entrar no 9
                       tamHigi=Carrinho.tam()+tam1+qtd;
                       //se entrar no 8
                       quant = Carrinho.tam()+qtd;
                }
                
                break;
                
                // APRESENTA ALIMENTOS
            case 3:
                tamAlimentos=Carrinho.tam();
                while ( tamAlimentos < 10){
                mostrarAlimentos();
    		num1=sc.nextInt();
    		switch(num1){
                    case 1:
                    Carrinho.adicionar(arrozagulhinha);
                 	break;
                     
                    case 2:
                        Carrinho.adicionar(arrozintegral);
                 	break;
                    case 3:
                        Carrinho.adicionar(feijaocarioca);
                     	break;
                    case 4:
                        Carrinho.adicionar(feijaofradinho);
                     	break;
                    case 5:
                        Carrinho.adicionar(carnefraldinha);
                     	break;
                    case 6:
                        Carrinho.adicionar(carnefile);
                     	break ;
                    case 7:
                            System.out.println("\n\n         ====== SEU CARRINHO ====== \n");
                            System.out.println(Carrinho.listarProd());
                            System.out.println("\n\nTotal de Produtos \n"
                                             + "        no Carrin ====> "+quant);
                            System.out.println("                  =========> TOTAL : R$" + Carrinho.totalCompra());
                            System.out.println("\n\n");   
                            break;
                    case 8:
                        
                        tam2=11;
                        
                        
                        break;
                    case 9:
                       System.out.println(Carrinho.listarProd());
                       System.out.println("                  =========> TOTAL : R$" + Carrinho.totalCompra());
                       System.out.println("\n\n");
                       qtd=11;
                       Carrinho.esvaziar();
                       System.out.println("==== COMPRA CONCLUIDA COM SUCESSO ====");
                    break;                        
                     }
                       //se entrar no 9
                       tamAlimentos=Carrinho.tam()+tam2+qtd;
                       //se entrar no 8
                       quant = Carrinho.tam()+qtd;
                }//fechamento do whille de alimentos
    		break ;	
            case 4:
                System.out.println("\n\n         ====== SEU CARRINHO ====== \n");
                System.out.println(Carrinho.listarProd());
                System.out.println("\nTotal de Produtos \n"
                                             + "        no Carrin ====> "+quant);
                System.out.println("                  =========> TOTAL : R$" + Carrinho.totalCompra());
                System.out.println("\n\n");
                break ;
            case 5:
                System.out.println(Carrinho.listarProd());
                System.out.println("                  =========> TOTAL : R$" + Carrinho.totalCompra());
                System.out.println("\n\n");
                qtd=11;
                System.out.println("\nTotal de Produtos \n"
                                + "        no Carrin ====> "+quant);
                Carrinho.esvaziar();
                System.out.println("==== COMPRA CONCLUIDA COM SUCESSO ====");
                quant = Carrinho.tam()+qtd;
                break ;
                
        }//fim switch num
        
        
 
         	
}// fim do laço Wille
        
        
        
                // ISSO SÓ APARECE SE A COMPRA CHEGAR A 10 PRODUTOS :
                
                        if(qtd != 11){
                        System.out.println(Carrinho.listarProd());
                        System.out.println("                  =========> TOTAL : R$" + Carrinho.totalCompra());
                        System.out.println("\n\n");
                        System.out.println("\nTotal de Produtos \n"
                                             + "        no Carrin ====> "+quant);
                        Carrinho.esvaziar();
                        System.out.println("==== COMPRA CONCLUIDA COM SUCESSO ====");
                        }
                        
                        
             // FECHAMENTO DO SCANNER            
       sc.close();
       sd.close();
       
// fim do pacote       
}
        
        /// METODOS QUE VÃO APARECER NA TELA, TALVEZ DAVA PRA TER COLOCADO EM UMA CLASSE MAS...
        
	
    static void mostrarProdutos() {
    	System.out.println("         ==============================================================\n"
                                 + "                                    1- Eletronicos\n\n"
                   			+ "                                    2- Higiene\n\n"
                  				+ "                                    3- Alimentos\n\n"
                   			+"                       4- Ver carrinho     5-Concluir compra \n\n"
                                       + "         ==============================================================");
    	

}
static void mostrarEletronicos(){
        System.out.println("\n   ================================== SELECIONE UM ELETRONICO ==================================");
        System.out.println("                                                                                   PRODUTOS \n"
        				 + "                                                                                    NO CARRIN => " +Carrinho.tam()+"\n\n");
        
	System.out.println(   "   1-Smart Tv Led 55 Ultra Hd 4k LG Preta R$2.690,00" + "         " + "4-Mini System Torre Bluetooth Sony R$4.499,00 Azul \n"
			+ "\n   2-Smart Tv Led 65 4k Sony Branco R$6.369,00" + "              " + "5-iPhone XR 64GB iOS 12 Vermelho R$4.399,00 \n"
		+ "\n   3-Mini System 2150W RMS Philco Preto R$1.999,00" + "          " + "6-Smartphone Galaxy S10 128GB Samsung Branco R$4.999,00 \n"
											
							+ "\n                7- VER CARRINHO   8- ADICIONAR OUTROS PRODUTOS   9- CONCLUIR COMPRA  "
				);
    }
    
    static void mostrarHigiene(){
        System.out.println("\n   ================================== SELECIONE UM PRODUTO DE HIGIENE ==================================\n");
            System.out.println("                                                                                   PRODUTOS \n"
        				 + "                                                                                    NO CARRIN => " +Carrinho.tam()+"\n\n");
        
	System.out.println(   "   1-Creme Dental Tripla Ação Colgate  R$3.39 90g"+"                "+"4-Shampoo Anticaspa  Ice Cool Menthol 400ml Clear Men R$21.50 400ml \n"
			+ "\n   2-Gel dental Pro-White Hinode R$11.99 90g"  +"                     "+  "5-Sabonete em Barra Óleo de Argan Dove R$2.89 90g \n"
		+ "\n   3-Shampo Anti-Idade Nutri Repair Caviar R$39.02 300ml"  +"         "+  "6-Sabonete em Barra Iluminadora Johnson's R$2.15 90g  \n"
												
	                    + "\n                7- VER CARRINHO   8- ADICIONAR OUTROS PRODUTOS   9- CONCLUIR COMPRA  "
		);
        
        
        
    }
    
    static void mostrarAlimentos() {
	System.out.println("\n   ================================== SELECIONE UM ALIMENTO==================================\n");
            System.out.println("                                                                                   PRODUTOS \n"
        				 + "                                                                                    NO CARRIN => " +Carrinho.tam()+"\n\n");
        
	System.out.println(   "   1-Arroz Agulhinha Qualitá 1Kg R$12.90" + "         " + "4-Feijão Fradinho em conserva Camil R$5.15 1Kg \n"
			+ "\n   2-Arroz Integral Tipo 1 1Kg TAEQ R$4.15" + "              " + "5-Fraldinha Bovina Resfriada FriBo R$43.56 1Kg\n"
			+ "\n   3-Feijão Carioca tipo 1 Qualita R$5.79 1Kg" + "          " + "6-Contra Filé Bovino Resfriado Angus R$50.99 1Kg \n"
											
			+ "\n                7- VER CARRINHO   8- ADICIONAR OUTROS PRODUTOS   9- CONCLUIR COMPRA  "
				);    	
    	
    	
    }
	
    
}
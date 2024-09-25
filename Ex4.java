
package ADO3;
import java.util.Scanner;
public class Ex4 {
    public static void main (String[]args){
         
        //criando Scanner 
        Scanner ent = new Scanner (System.in);
        
        //pede e le o que foi consumido 
        System.out.println("Insira o codigo do produto que foi consumido:");
        int cod = ent.nextInt();
        
        //pede e le a quantidade que foi consumido 
        System.out.println("Insira a quantidade do produto consumido:");
        int quant = ent.nextInt(); 
        
        double preco = 0.00;
        
        switch (cod){
            
            case 100:
                preco = 1.70;
            break;
            
            case 101:
                preco = 2.30;
            break;
            
            case 102:
                preco = 2.60;
            break;
            
            case 103:
                preco = 2.40;
            break;
            
            case 104:
                preco = 2.50;
            break;
            
            case 105:
                preco = 1.00;
            break; 
            
            default:
                System.out.println("Codigo inválido");
            break;     
        }
        double total = preco * quant;
        System.out.printf("O valor a pagar: %.2f", total);
    }
}

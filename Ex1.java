
package ADO3;
import java.util.Scanner;
public class Ex1 {
    public static void main (String[]args){
      //cria scanner
    Scanner ent = new Scanner (System.in);
 
    //pede e le o codigo do produto
    System.out.println("Insira o cod do produto:");
    int prod = ent.nextInt();
 
    //utiliza switch e decide o q vai acontecer se cada condicao for atendida
    switch (prod){
 
    case 1:
        System.out.println("Alimento nao perecivel");
    break;
    
    case 2:
    case 3:
    case 4:
        System.out.println("Alimento perecivel");
    break;
 
    case 5:
    case 6:
        System.out.println("vestuario");
    break;
 
    case 7:
        System.out.println("Higiene pessoal");
    break;
 
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14: 
    case 15:
        System.out.println("Limpeza e utensilios domesticos");
    break;
 
    default:
        System.out.println("codigo invalido"); 
    }
}
}
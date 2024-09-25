
package ADO3;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[]args){
        
        //cria scanner
        Scanner ent = new Scanner (System.in);
        
        //pede e le os dois numeros
        System.out.println("Insira um numero:");
        float n1 = ent.nextFloat();
        System.out.println("Insira o outro numero");
        float n2 = ent.nextFloat();
        
        //pede e le que tipo de operação o switch vai fazer
        System.out.println(" INSIRA:\n"+
                           "1- para a Media\n" +
                           "2– para a Diferenca do primeiro pelo segundo\n" +
                           "3– para o Produto\n" +
                           "4- para a Divisão do primeiro pelo segundo");
        byte ope = ent.nextByte();
        
        switch (ope){
            
            case 1:
                 System.out.printf("a media: %.2f",(n1+n2)/2);
            break;
            
            case 2 :
                System.out.printf("a diferenca: %.2f", n1-n2);
            break;
            
            case 3 :
                System.out.printf("o produto: %.2f", n1*n2);
            break;
            
            case 4 :
                System.out.printf("a divisao do primeiro pelo segundo: %.2f", n1/n2);
            break;
            
            default:
                System.out.println("Numero invalido");
        }
        
    }
}

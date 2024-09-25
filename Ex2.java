
package ADO3;
import java.util.Scanner;
public class Ex2 {
        public static void main(String[]args){
 
 // cria o scanner
    Scanner ent = new Scanner (System.in);
 
 //pede e ele as 3 notas
    System.out.println("Insira nota 1");
    float n1 = ent.nextFloat();
 
    System.out.println("Insira nota 2");
    float n2 = ent.nextFloat(); 
 
    System.out.println("Insira nota 3");
    float n3 = ent.nextFloat();
 
  //faz a media 
    float med = (n1+n2+n3)/3;
 
  // condicioais, a media determina qual mensagem vai aparecer
    if (med>7&&med<=10) {
        System.out.println("Aprovado");
    }else if (med<=7&&med>4){
        System.out.println("Exame");
    }else if (med<=4){
        System.out.println("Reprovado");
} 
} 
}
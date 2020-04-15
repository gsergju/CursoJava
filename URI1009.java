import java.util.Scanner;

public class URI1009 {
    public static void main(String arg[]){ 
    
     Scanner teclado;
     teclado = new Scanner(System.in);
     String nome = teclado.next();
     double salario = teclado.nextDouble();
     double vendas = teclado.nextDouble();

     vendas = (vendas * 15)/100;    
     salario = vendas + salario;
     System.out.printf("TOTAL = R$ %.2f\n",salario);       
        }
    }
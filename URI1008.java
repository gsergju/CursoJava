import java.util.Scanner;

public class URI1008 {
    public static void main(String arg[]){ 
    
     Scanner teclado;
     teclado = new Scanner(System.in);
     int numero = teclado.nextInt();
     int horas = teclado.nextInt();
     double valor = teclado.nextDouble();

     double salario = valor * horas;    

     System.out.println("NUMBER = "+numero);
     System.out.printf("SALARY = U$ %.2f\n" ,salario);
       
        }
    }
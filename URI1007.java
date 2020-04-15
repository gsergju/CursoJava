import java.util.Scanner;

public class URI1007 {
    public static void main(String arg[]){ 
    
     Scanner teclado;
     teclado = new Scanner(System.in);
     int a = teclado.nextInt();
     int b = teclado.nextInt();
     int c = teclado.nextInt();
     int d = teclado.nextInt();
     
    int diferenca = (a * b)-(c * d);
     System.out.println("DIFERENCA = " +diferenca);
        }
    }
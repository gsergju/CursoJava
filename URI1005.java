import java.util.Scanner;

public class URI1005 {
    public static void main(String arg[]){ 
    
     Scanner teclado;
     teclado = new Scanner(System.in);
     double A = teclado.nextDouble();
     double B = teclado.nextDouble();
     
    double media = ((A * 3.5)+(B * 7.5))/11.0;
     System.out.printf("MEDIA = %.5f\n" ,media);
        }
    }
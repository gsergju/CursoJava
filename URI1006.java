import java.util.Scanner;

public class URI1006 {
    public static void main(String arg[]){ 
    double A, B, C, media;
     Scanner teclado;
     teclado = new Scanner(System.in);
     A = teclado.nextDouble();
     B = teclado.nextDouble();
     C = teclado.nextDouble();
     media = ((A * 2)+(B * 3)+(C * 5))/10;
     System.out.printf("%.1f\n" ,media);
        }
    }
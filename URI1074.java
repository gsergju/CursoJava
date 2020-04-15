import java.util.Scanner;

public class URI1074 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);         
        int num = teclado.nextInt();
        int i = 0;

        while ( i < num){        
            int valor2 = teclado.nextInt();
            int resto = valor2 % 2;
                    
            if (valor2 == 0){
             System.out.println("NULL");
            }
            else if ((resto == 0) && (valor2 > 0)){
             System.out.println("EVEN POSITIVE");
            }
                else if ((resto == 0) && (valor2 < 0)){
                System.out.println("EVEN NEGATIVE");
                }
                   else if ((resto != 0) && (valor2 < 0)){
                   System.out.println("ODD NEGATIVE");
                   }
                      else {
                      System.out.println("ODD POSITIVE");
                      }
            i++;
        }
    }
}
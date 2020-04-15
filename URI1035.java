import java.util.Scanner;

public class URI1035 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
 
        int a = teclado.nextInt(); 
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();
        
        int soma = a + b;
        int soma2 = c + d;
        

        if((b > c) && (d > a) && (soma2 > soma) && (c > 0) && (d > 0) && (a%2 == 0)){
            System.out.println("Valores aceitos");
        }
        else
        {
            System.out.println("Valores nao aceitos");
        }
        
    }
}
import java.util.Scanner;

public class URI1013 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
    
        int maior;
        if((a > b) && (a > c)){
            maior = a;
        System.out.println(+maior +" eh o maior");
        }
        else if (b > c) {
        maior = b;
        System.out.println(+maior +" eh o maior");
        }
           else{
           maior = c;
           System.out.println(+maior +" eh o maior");
           }
    }
}
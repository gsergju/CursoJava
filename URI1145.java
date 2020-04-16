import java.util.Scanner;

public class URI1143 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        for (int i=0; i < valor; i++){
            i=1;
            System.out.println(+i +" "+i*i+" "+" "+i*+i*+i) ; 
        }
    }
}
import java.util.Scanner;

public class URI1143 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        for (int i=1; i <= valor; i++){
            System.out.println(+i +" "+i*i +" "+i*i*i); 
        }
    }
}
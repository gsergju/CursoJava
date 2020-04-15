import java.util.Scanner;

public class URI1073 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        for(i=2, i < valor, i+2){
            System.out.println(+i+"^"+valor +" = " +i);     
        }
    }
}
import java.util.Scanner;

public class URI1177 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int t = teclado.nextInt();
        int x = 0;
        int vetor[] = new int[1000];

        for (int i=0; i < 1000; i++){
        
            vetor[i] = x;
            System.out.println("N["+i +"]" + " = " +x);

            x++;

            if (x == t){
                x = 0;
            }
        }
    }
}
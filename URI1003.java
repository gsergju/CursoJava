import java.util.Scanner;

public class URI1003 {
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = a + b;

        System.out.println("SOMA = " +c);

    }
}
import java.util.Scanner;

public class URI1011 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double raio = teclado.nextDouble();
        double pi   = 3.14159;
        raio = raio * raio * raio;
        double volume = ((4.0/3)* pi * raio);

        System.out.printf("VOLUME = %.3f " ,volume);
    }
}
import java.util.Scanner;
public class URI1002 {
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        a = a * a;
        double area = 3.14159 * a;
        System.out.printf("A=%.4f\n" ,area);
    }
}
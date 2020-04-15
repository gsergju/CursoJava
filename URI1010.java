import java.util.Scanner;

public class URI1010 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int codpeca = teclado.nextInt(); 
        int quantidade = teclado.nextInt();
        double valor = teclado.nextDouble();

        int codpeca2 = teclado.nextInt(); 
        int quantidade2 = teclado.nextInt();
        double valor2 = teclado.nextDouble();
        
        valor = quantidade * valor;
        valor2 = quantidade2 * valor2;   
        
        valor = valor + valor2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valor);       
    }
}
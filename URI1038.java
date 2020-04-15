import java.util.Scanner;

public class URI1038 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
 
        int codigo = teclado.nextInt(); 
        int quantidade = teclado.nextInt();
        double valor;

        switch (codigo){
            case 1:
            valor = quantidade * 4;
            System.out.printf("Total: R$ %.2f\n" ,valor);
            break;

            case 2:
            valor = quantidade * 4.50;
            System.out.printf("Total: R$ %.2f\n" ,valor);
            break;

            case 3:
            valor = quantidade * 5;
            System.out.printf("Total: R$ %.2f\n" ,valor);
            break;

            case 4:
            valor = quantidade * 2;
            System.out.printf("Total: R$ %.2f\n" ,valor);
            break;

            case 5:
            valor = quantidade * 1.50;
            System.out.printf("Total: R$ %.2f\n" ,valor);
            break;

            default:
            System.out.println("Codigo inválido");
        
        }
                             
    }
}
import java.util.Scanner;

public class URI1145 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int valor;
        do{
            valor = teclado.nextInt();
            if(valor != 2002){
            System.out.println("Senha Invalida");
            }
        }while (valor != 2002);
        System.out.println("Acesso Permitido");    
    }
}
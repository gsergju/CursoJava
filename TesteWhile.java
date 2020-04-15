import java.util.Scanner;

public class URI1074 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner.nextInt();         
        int valor = teclado.nextInt();

        while ( i < valor){
            teclado = new Scanner.nextInt();         
            int valor2 = teclado.nextInt();
            int resto = valor2 % 2;
                    
            if ((resto == 0) && (valor2 > 0)){
             System.out.println("EVEN POSITIVE");
            }
            else if ((resto == 0) && (valor2 < 0)){
                     System.out.println("EVEN POSITIVE");
                    }
                    else if ((resto != 0) && (valor2 < 0)){
                     System.out.println("ODD NEGATIVE");
                    }
                    else{
                        System.out.println("ODD PSOTIVE");
                    }
            i++;
        }
    }
}
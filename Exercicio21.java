import java.util.Scanner;

public class Exercicio21 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Informe sua idade");
        int idade = teclado.nextInt();
            
        if ( idade < 16){
            System.out.println("Não Eleitores menores de 16 anos de idade");
        }
         else if 
         ((idade >= 18) && (idade <= 65)) {
           System.out.println("Obrigatorios entre 18 anos e 65 anos");
         }
         else{
            System.out.println("Voto Facultativo");
             }
        
    }
}
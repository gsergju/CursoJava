import java.util.Scanner;

public class Exercicio20 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Informe M para (Masculino) ou F para (feminino)");
        String sexo = teclado.nextLine();
        System.out.println("Informe sua Altura");
        float altura = teclado.nextFloat(); 
        float peso;

        if ((sexo.equals ("F")) || (sexo.equals("f"))){
            peso = ((62.1f * altura) - 44.7f);
            System.out.printf("Seu peso ideal : " +peso);
        }
         else if 
        ((sexo.equals("M")) || (sexo.equals("m"))) {
          peso = ((72.7f * altura) - 58);
         System.out.printf("Seu peso ideal : " +peso);
         }
         else {
            System.out.println("Sexo informado inválido");
        } 
        
    }
}
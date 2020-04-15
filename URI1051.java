import java.util.Scanner;

public class URI1051 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
 
        double salario = teclado.nextDouble(); 
        double imposto;
        
        if (salario <= 2000){
            System.out.println("Isento");
        }
        else if(salario <= 3000){
            imposto =  (8.00f * (salario - 2000.0f));
             System.out.printf("R$ %.2f\n" ,imposto);
        } 
            else if(salario <= 4500){
                imposto = (80.0f + (salario - 3000))*0.18f;
                System.out.printf("R$ %.2f\n" ,imposto);
            }  
                else if(salario > 4500.00){
                    imposto = 80.f + 270.0f + (salario - 4500.0f) * 0.28f;
                    System.out.printf("R$ %.2f\n" ,imposto);
                }   
   }
}
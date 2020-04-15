import java.util.Scanner;

public class URI1115 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int i = 1;

        do{
            int x = teclado.nextInt();
            int y = teclado.nextInt();

            if((x == 0) || (y == 0)){
                i = 0;
            }
            else if((x > 0) && (y >0)){
                System.out.println("primeiro");
            }
                else if((x < 0) && (y < 0)){
                    System.out.println("terceiro");
                }
                    else if((x < 0) && (y > 0)){
                    System.out.println("segundo");
                    }  
                        else{
                        System.out.println("quarto");
                        }
        }while (i != 0);
    }
}
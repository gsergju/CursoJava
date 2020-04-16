import java.util.Scanner;

public class URI1160 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int quantidade = teclado.nextInt();
        int pa, pb;
        float ga,gb;


        for (int i=0; i < quantidade; i++){
            
            pa =  teclado.nextInt();
            pb =  teclado.nextInt();
            ga =  teclado.nextFloat();
            gb =  teclado.nextFloat();
            
            int resto = 0;
            pa =(int)(pa+pa*ga/100);
            pb = (int)(pb+pb*gb/100);

            do{
                pa =  (pa+pa)/100;
                resto = resto+1;

                if (resto >= 100){
                    System.out.println("Mais de 1 seculo");
                    break;
                }

            }while (pa <= pb);
           System.out.println(+resto);
        }
    }
}
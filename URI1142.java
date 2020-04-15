import java.util.Scanner;

public class URI1142 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        
        int i;
        int c = 1;
        int d = 0;
        int e = 0;

        for (i=0; i < valor; i++){ 
          System.out.println(+c +" " +d +" "  +e + " PUM");         
          c = e + 2;
        }    
    }
}
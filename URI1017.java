import java.util.Scanner;

public class URI1017 {
    public static void main(String arg[]){ 
    double tempo, velocidade, quantidade_litros;
     Scanner teclado;
     teclado = new Scanner(System.in);
     tempo = teclado.nextInt();
     velocidade = teclado.nextInt();
     
      quantidade_litros = (velocidade / 12) * tempo;
     System.out.printf("%.3f\n" ,quantidade_litros);
        }
    }
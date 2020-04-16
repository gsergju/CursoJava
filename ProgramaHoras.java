
import java.util.Scanner;

public class ProgramaHoras{
    public static void main(String args[]){
        Horas t1;
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("INFORME AS HORAS HHMMSS");
        int hora    = teclado.nextInt();
        int minuto  = teclado.nextInt();
        int segundo = teclado.nextInt();


        t1 = new Horas(hora, minuto, segundo);
        
        
        t1.setTime();
        t1.horaPadrao();
        t1.horaUniversal();

    }
}
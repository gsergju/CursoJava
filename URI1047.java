import java.util.Scanner;

public class URI1047 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
 
        int horai = teclado.nextInt(); 
        int mini = teclado.nextInt();
        int horaf = teclado.nextInt(); 
        int minf = teclado.nextInt();
        
        if ((horai == horaf) && (minf > mini)){
            horaf = horaf - horai;
            minf = minf - mini;
            System.out.println("O JOGO DUROU "+horaf +" HORA(S) E " +minf +" MINUTO(S)");
        } 
        else if ((minf < mini) && (horaf > horai)) {
            minf  = 60 - (mini - minf);
            horaf = (horaf - horai) - 1;
            System.out.println("O JOGO DUROU " +horaf +" HORA(S) E " +minf +" MINUTO(S)");
        }
            else if ((minf == mini) && (horaf == horai)) {
            minf = minf - mini;
            horaf = 24;
            System.out.println("O JOGO DUROU " +horaf +" HORA(S) E " +minf +" MINUTO(S)");
            }
               else if ((horai > horaf) && (mini > minf)) {
                minf  = 60 - (mini - minf);
                horaf = 24 - (horai - horaf);
                System.out.println("O JOGO DUROU " +horaf +" HORA(S) E " +minf +" MINUTO(S)");
               }
                    else if ((horai > horaf) && (minf > mini)){
                        minf = 60 - (minf - mini);
                         horaf = 24 - (horai - horaf);
                        System.out.println("O JOGO DUROU " +horaf +" HORA(S) E " +minf +" MINUTO(S)");
                    }
                        else if ((horai > horaf) && (minf == mini)){ 
                            minf = 00;
                            horaf = 24 - (horai - horaf);
                            System.out.println("O JOGO DUROU " +horaf +" HORA(S) E " +minf +" MINUTO(S)");
                        }
                            else if ((horaf > horai) && (minf == mini)){ 
                            minf = 00;
                            horaf = horaf - horai;
                            System.out.println("O JOGO DUROU " +horaf +" HORA(S) E " +minf +" MINUTO(S)");
                            }
                                else {
                                    minf = mini - minf;
                                    horaf = horaf - horai;
                                    System.out.println("O JOGO DUROU " +horaf +" HORA(S) E " +minf +" MINUTO(S)");
                                }    
    }
}
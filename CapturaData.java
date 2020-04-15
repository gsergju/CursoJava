/*
ano???


*/

import java.util.Scanner;

public class CapturaData{
    public static void main (String args[]){
 int anocompleto, ano, mes, dia, resto;
 Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o Dia,Mes e Ano formato DDMMAAAA : ");
        anocompleto = teclado.nextInt();

        ano = anocompleto % 10000;

        resto = anocompleto / 10000;

        dia = resto / 100;

        mes = resto % 100;

        System.out.println("Dia " +dia);
        System.out.println("Mes " +mes);
        System.out.println("Ano " +ano);
 

    }
}
/*
O calculo do salario do novo colaborador deve ser estipulado como Salario com imposto fixo 15%
exibir Salario recebido
Imposto dedução
Salario final
*/

import java.util.Scanner;

public class Salario {

    public static void main(String arg[]){

        Scanner teclado;
        teclado = new Scanner(System.in);

        int salario_bruto;
        System.out.print("Digite o valor do seu Salário : " );
        salario_bruto = teclado.nextInt();

        int imposto = salario_bruto * 15 / 100;

        int salario_liquido = salario_bruto - imposto;

        System.out.printf("Salario Bruto R$"+ salario_bruto);
        System.out.printf("Imposto a deduzir R$"+ imposto);
        System.out.printf("Salario Liquido R$" + salario_liquido);
    }

}
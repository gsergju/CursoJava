public class Empregados{
    String nome;
    Double salario;
    

    public Empregados(String nome1, Double salario1){
        nome = nome1;
        salario = salario1;
    }

    public void imprimir(){
        System.out.println("Nome: " +nome + " Salario: " +salario);
    }

    public void aumentarSalario(double aumento){
        salario = salario + salario * aumento;
        System.out.println("Aumento Salarial : " +salario);
    }
}


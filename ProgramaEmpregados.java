public class ProgramaEmpregados{
    public static void main(String args[]){
        Empregados t1;

        t1 = new Empregados("Sergio ",22.333);
        
        
        t1.imprimir();
        t1.aumentarSalario(0.20);

    }
}
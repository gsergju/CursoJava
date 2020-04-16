public class Horas{
    int hora, minuto, segundo;

    public Horas(int hora, int minuto, int segundo){

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setTime(){
        System.out.println("HORA INFORMADO");
        System.out.println(+hora+":"+minuto+":"+segundo);
        System.out.println("-----------------------");
    }

    public void horaUniversal(){
        System.out.println("HORA UNIVERSAL");
        System.out.println(+hora+":"+minuto+":"+segundo);
        System.out.println("-----------------------");
    }

     public void horaPadrao(){
      String ampm = "PM";
      if((hora => 00) && (hora < 12) ){
          ampm = "AM";
      }  
        System.out.println("HORA PADRÃO");
        System.out.println(+hora+":"+minuto+":"+segundo +" " +ampm);
        System.out.println("-----------------------");
    }
}
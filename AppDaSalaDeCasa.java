public class AppDaSalaDeCasa{
    public static void main(String args[]){
        Televisao t1;

        t1 = new Televisao();
        t1.marca = "LG da sala de TV";
        t1.tamanho = 40;
        t1.voltagem = 110;
        t1.resolucao = " Ultra HD Smart Plus maste blaster hiper";
        t1.volume = 4;
        t1.canal = 6;


        Televisao t2;
        t2 = new Televisao();
        t2.marca = "Philco do quarto";
        t2.tamanho = 32;
        t2.voltagem = 110;
        t2.resolucao = "Porva";
        t2.volume = 5;
        t2.canal = 10;
        

        t1.ligar();
        t1.aumentarVolume();
        t1.diminuirVolume();
        t1.avancarCanal();
        t1.voltarCanal();
        t2.ligar();
        t1.desligar();
        t2.aumentarVolume();
        t2.diminuirVolume();
        t2.avancarCanal();
        t2.voltarCanal();


    }
}
public class Televisao{
    // atributos
    String  marca;
    int     tamanho;
    int     voltagem;
    String  resolucao;
    boolean ligada;
    int     canal;
    int     volume;

    // metodos
    void ligar() {
        ligada = true;
        System.out.println("Agora a TV " + marca +" esta ligada");
    }

    void desligar(){
        ligada = false;
        System.out.println("Agora a TV " + marca + " esta desligada");
    }

    void aumentarVolume(){
        volume = volume +1;
        System.out.println("Volume " +volume);

    }
    void diminuirVolume(){
        volume = volume -1;
        System.out.println("Volume " +volume);
    }
    void avancarCanal(){
        canal = canal +1;
        System.out.println("Canal " +canal);
    }
    void voltarCanal(){
        canal = canal -1;
        System.out.println("Canal " +canal);
    }


} 
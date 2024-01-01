public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("diminuindo volume para " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;

    }

    public void aumentarCanal(){
        canal++  
        System.out.println("Aumentando canal para " + canal);

    }

    public void diminuiCanal(){
        canal--  
        System.out.println("Diminuindo canal para " + canal);

    }
}

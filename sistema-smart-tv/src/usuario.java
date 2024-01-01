public class usuario {
    public static void main(String[] args) throws Exception {

        smartTv smartTv = new smartTv();

        System.out.println("tv está ligada ? " + smartTv.ligada);
        System.out.println("Canal da tv " + smartTv.canal);
        System.out.println("Volume da tv: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status ->  tv está ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("novo status ->  tv está ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println("Volume da tv: " + smartTv.volume);
        
        
        System.out.println("canal atual " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual é " + smartTv.canal);
     

    }
}

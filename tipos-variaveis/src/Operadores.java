public class Operadores {
    public static void main(String[] args) {
        /*
         * String concatenacao = "?";
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + 1 + 1 + "1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + "1" + 1 + 1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + "1" + 1 + "1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1" + 1 + 1 + 1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1" + (1 + 1 + 1);
         * System.out.println(concatenacao);
         */

       /*  int numero = -5;


        numero = numero * -1;

        System.out.println(numero);
 */

        //x repetição
    
        int numero = 5;

        do {
            boolean par = numero % 2 == 0;

            if (par) {
                System.out.println(numero + " é um número par");
            } else {
                System.out.println(numero + " é um número ímpar");
            }

            numero++;
        } while (numero <= 1000);
    }
}

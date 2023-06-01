package exercicios.Cap6;


public class ContagemComNome {
    public static int contar() {
        int i = 0;
        if (i <= 10) {
            for (int a = 0; a < 10; a++) {
                i++;
                System.out.println(i);
            }
        }
        return i;
    }

    public static int contar(int fim) {
        int i = 0;
        if (i <= fim) {
            for (int a = 0; a < fim; a++) {
                i++;
                System.out.println(i);
            }
        }
        return i;
    }

    public static int contar(int inicio, int fim) {
        if (inicio < fim) {
            for (int a = inicio; a < fim; a++) {
                inicio++;
                System.out.println(inicio);
            }
        }
        return inicio;
    }
    
    public static int contar(int inicio, int fim, long pausa) {
        /*if (inicio < fim) {
            for (int a = inicio; a < fim; a++) {
            inicio++;
            System.out.println(inicio);
            TimeUnit.SECONDS.sleep(pausa); // COMO FAZER???
            }
        }*/
        try{
            if(inicio<fim){
                for(int a=inicio;a<fim;a++){
                    inicio++;
                    System.out.println(inicio);
                    Thread.sleep(pausa* 10); // o input é feito em segundos =/= metodo é com milissegundos
                }
            }
        } catch(Exception error){
            System.out.println("Deu bomba");
        }
     return inicio;
    }  
}

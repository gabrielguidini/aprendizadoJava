package cap06;

import java.util.*;;

public class ValorDeEntradaArray {
    public static double buscaMaior(double[] numeros) {
        double maior = numeros[0];
        for(int i=0;i<numeros.length;i++){
            maior = Math.max(maior, numeros[i]);
        } return maior;
    }
    public static String[] ordenarPlavaras(String[] palavras){
        Arrays.sort(palavras);
        return palavras;
    }
}

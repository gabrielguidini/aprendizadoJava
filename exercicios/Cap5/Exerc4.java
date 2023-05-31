package exercicios.Cap5;

import java.util.Arrays;

public class Exerc4 {
    public static void main(String[] args){

        int[] par = new int[10];
        int[] impar = new int[10];

        for(int i =0; i<par.length;i++){
            int numeroGerado = (int)(1+Math.random()*20);
            if(numeroGerado % 2 == 0){
                par[i] = numeroGerado;
                System.out.println(par[i]+ "par");
            } else {
                impar[i] = numeroGerado;
                System.out.println(impar[i] + "impar");
            }
        }
        //porque dentro de um loop o System.out funciona normalmente, mas quando fora do loop e utilizando uma array ele da valores hexadecimais?
        System.out.println("array par -> "+Arrays.toString(par));
        System.out.println("array impar -> "+Arrays.toString(impar));
    }
}

package cap05;

import java.text.DecimalFormat;
//import java.util.*;
//import java.util.regex.MatchResult;

//import javax.xml.stream.events.Namespace;

public class Arrays{
    public static void main(String args[]){ //array de elementos do tipo String
        //arrays -> 1)unidimensional e 2)bidimensional(matrizes);

        /* 1) são os que possuem apenas um indicie para acessar seu conteudo.
        declaração -> Tipo-De-Dado [] nome-do-array = new Tipo-De-Dado[quantidade]
        TIPO DE DADO : qualquer tipo de variável
        NOME DO ARRAY : nome váio, as mesmasregras para nomes das variáveis.
        QUANTIDADE : a quantidade de elementos que o array pode manipular. 
        */

        int[] inteiro = new int[2];
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("000");
        for (int i=0; i<inteiro.length;i++){
            inteiro[i] = (int)(Math.random()*1000);
            System.out.println(df.format(inteiro[i]));
        }
        //outra forma de declarar. Tipo de dado[] nomedoarray={vaolres separados por virugla};
        /*
         
        String[] nomes = {"lucas","bomba","zezinho22","jeferson","rafael"};
        char[] vogais = {'a','e','i','o'};
        int[] numeros = {0,2,3,4,5,6,7};
        float[] notas = {7.2f,4.2f,0.66f};
        Arrays.sort(nomes);
        System.out.print("\nNomes: ");
        for (String nome: nomes){
            System.out.print(nome+ ", ");
        }
        Arrays.sort(vogais);
        System.out.print("\nVogais: ");
        */

        /* 2) Arrays bidimensionais -> ele possui dois indices e possibilita
         que os valores sejam armazenados na forma de matrizes.
         TipoDeDado NomeDoArray[][] -> new tipodedado[indice1][indice2]*/
         int[][] matriz = new int[3][3];
        matriz [0][0] = 120; matriz[1][0] =232; matriz[2][0]=201;
        matriz [0][1] = 129; matriz[1][1] =111; matriz[2][1]=187;
        matriz [0][2] = 128; matriz[1][2] =247; matriz[2][2]=123;

        for(int linha =0; linha<matriz[linha].length;linha++){
            for(int coluna = 0;coluna<matriz[linha].length;coluna++){
                System.out.println("["+linha+","+coluna+"]"+matriz[linha][coluna]);
            }
        }
    }
}
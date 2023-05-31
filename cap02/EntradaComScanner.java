package cap02;

import java.util.*;

public class EntradaComScanner {
    public static void main(String args[]){
        float largura,comprimento,perimetro,area;
        Scanner sc;
        try{
            System.out.println("entre com o comprimento");
            sc = new Scanner(System.in);
            comprimento = sc.nextFloat();

            System.out.println("entre com a largura ");
            sc = new Scanner(System.in);
            largura = sc.nextFloat(); // .nextFloat() -> metodo para let valor de float
            /*dentro do package java.ultil tem a leitura dos valores numericos por:
             * nextByte, nextShort,nextInt,nextLong,nextDouble, entre outros.
             */

            area =comprimento*largura;
            perimetro = comprimento*2 + largura*2;
            System.out.println("area do retangulo é de: "+area);
            System.out.println("perimetro do retangulo é de: "+perimetro);
        } catch (NumberFormatException e) {
            System.out.println("houve um erro na conversão, digite apenas caracteres numéricos");// TODO: handle exception
        }
    }
}

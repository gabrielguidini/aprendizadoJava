package cap02;

import java.io.*;
public class EntradaComBufferedReader{
    public static void main(String args[]){
        String x;
        float largura, comprimento, area, perimetro;
        BufferedReader dado;
        try{
            System.out.println("Entre com o comprimento: ");
            dado  = new BufferedReader(new InputStreamReader(System.in));
            x = dado.readLine();
            comprimento = Float.parseFloat(x);

            System.out.println("entre com a largura:");
            dado = new BufferedReader(new InputStreamReader(System.in));
            x = dado.readLine();
            largura = Float.parseFloat(x);

            area = comprimento * largura;
            perimetro = comprimento *2+ largura*2; 
            System.out.println("area do retangulo: "+ area);
            System.out.println("perimetro do retangulo: "+ perimetro);
        } catch(IOException error){
            System.out.println("erro na entrada dos dados"+error.toString());
        } catch(NumberFormatException error){
            System.out.println("erro na conversão, digite apenas caracteres numericos"+
            error.toString());
        }
    }
}
package cap02;

import java.io.*; // diretiva de compilação == utilização de uma classe externa que será
// usada no processo de compilação. O "*" indica que todas as classes desse package 
// deve ser carregada. Para utilizar somente uma classe => "import java.io.DataInuptStream", idicando que irá só usar essa classe.

public class EntradaComDataInputSteam {
    public static void main(String args[]){
        //DataInputStream, BufferedReader e Scanner
        String x;
        float largura, comprimento, area, perimetro;
        DataInputStream dado;
        try{
            System.out.println("Entre com o comprimento");
            dado = new DataInputStream(System.in);
            x = dado.readLine(); // deprecated
            comprimento = Float.parseFloat(x);

            System.out.println("Entre com a largura:");
            dado = new DataInputStream(System.in);
            x = dado.readLine(); // deprecated
            largura = Float.parseFloat(x); // caso o usuário digite um caractere diferente de numero, isso gera um erro
            
            area = comprimento * largura;
            perimetro = comprimento * 2+ largura *2; 
            System.out.println("área do retangulo: "+ area);
            System.out.println("perimetro do retangulo: "+ perimetro);
        } catch(IOException erro){ /*verificação de erro */
            System.out.println("houve um erro na entrada dos dados"+erro.toString());
        } catch (NumberFormatException erro){ /*verificação de erro */
            System.out.println("houve erro na conversão, digite apenas caracteres numericos"
             + erro.toString());
        }
    }
}

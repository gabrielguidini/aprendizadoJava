package cap04;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Locale;


public class ArredondamentoEString{
    public static void main(String args[]){
        int aux = Integer.parseInt(JOptionPane.showInputDialog(null, "1-10"));
        if(aux == 1){
            final float LOTACAO_ONIBUS = 50;
            int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de passageiros"));
            float qteOnibus = numeroPassageiros/LOTACAO_ONIBUS;
            JOptionPane.showMessageDialog(null, "Quantidade de assageiros: "+ numeroPassageiros
            + "\nQuantidade Calculada: "+qteOnibus
            + "\nQuantidade de onibus necessários: "+ (int) Math.ceil(qteOnibus));
            //ceil -> arredonda pra cima.

        }else if(aux == 2){

            float nota = Float.parseFloat(JOptionPane.showInputDialog(null,"nota da prova: "));
            JOptionPane.showMessageDialog(null,"nota original "+ nota
            +"\nArredondada pra baixo: "+ Math.floor(nota));
            //floor -> arredonda pra baixo.
            //round -> arredonda para o valor inteiro mais próxio ex: 2.59 = 3 // 2.3 = 2
            //max -> Math.max(valor1,valor2) sintaxe com dois valores numericos mostrando qual é o maior
            //min -> mesma sintaxe que max com funcionalidade inversa
            //sqrt -> Math.sqrt(valor), recebe um valor e retorna a raiz quadrada dele.
            //pow -> Math.pow(valor1,valor2), recebe dois valores o primeiro eleva o segundo
            //abs -> Math.abs(valor), recebe valor numerico e retorna o seu valor absoluto, desconsiderando o sinal.
            
        } else if(aux == 3){

            //METEODO RANDOM -> quando o método é chamado ele sorteia um valor do tipo double entre 0.0 e 1.0(o valor 1 nunca é soteado)
            // (int) (Math.random()*100) -> para converter o valor double pra int de um range de 0 a 99

            String senha = "";
            for(int i =1;i<=10;i++){
                int num = (int)(Math.random()*10);
                senha += num;
            } JOptionPane.showMessageDialog(null,"senha gerada "+senha);

            for (int cartao = 1;  cartao<=4;cartao++ ){ // numero de cartoes
                String numeroCartao = "";
                for (int numCartao = 1; numCartao <= 6; numCartao++){ // qte de numeros por cartao
                    int num = (int) (Math.random()*100);
                    numeroCartao += num + "   ";
                } JOptionPane.showMessageDialog(null, "numeros do cartão "+ cartao
                    +"\n"+ numeroCartao);
            } System.exit(0);
        } else if(aux == 4){

            //FORMATAÇÃO COM A CALSSE DecimalFormat
            //caractere = 0 -> imprime o digito normalmente, caso não exita, coloca 0 em seu lugar
            //caractere = # -> imprime o digito normalmente, desprezando os zeros à esquerda do numero
            //caractere = . -> separador decimal ou separador decimal monetario (dependo do sistema usado)
            //caractere = - -> sinal de numero negativo

            DecimalFormat df =new DecimalFormat();
            short idade = 35;
            df.applyPattern("000");
            System.out.println(df.format(idade));
            int quantidade = 9750;
            df.applyPattern("0,000");
            System.out.println(df.format(quantidade));
            long estoque = 198564;
            df.applyPattern("#,##0,000");
            System.out.println(df.format(estoque));
            float altura =1.74f;
            df.applyPattern("#0.00");
            System.out.println(df.format(altura));

        } else if(aux == 5){

            // Internacionalizando com LOCALE;
            DecimalFormat df = new DecimalFormat();
            Locale local = Locale.getDefault();
            double valor = 1370.25;
            if(local.getCountry().equals("BR")){
                df.applyPattern("R$ #,##0.00");
            } JOptionPane.showMessageDialog(null,"Configurações do sistema operacional"
            + "\nSigla "+ local.getCountry() 
            + "\nPais " + local.getDisplayCountry()
            + "\nIdioma " + local.getDisplayLanguage()
            + "\nTeclado " + local.getDisplayName()
            + "\nValor " + df.format(valor)
            );
        } else if(aux == 6){

            //nomeDaString.nomeDoMetodo(argumentos);
            /*nomeDaString.length() -> diz o tamanho da string em caracteres
                PODE SER FEITO:
                tamanho = "aprendendo java".length(); -> sintaxe funcional*/

            /*nomeDaString.charAt(indice); -> usado para retornar um caractere
            de determinada string com um indice especificado entre os parenteses
            casamento.charAt(0); -> "c"*/

            /*nomeDaString.toUpperCase() ou .toLowerCase(); -> faz com que os caracteres mudem
            para, respectivamente, maisculo e minusculo.*/

            /*nomeDaString.substring(indiceIncial, indiceFinal); -> retorna cópia de caracteres 
            de uma string a partir de indices inteiros especificados. Os espaços são contados como
            caracteres*/

            /*nomeDaString.trim(); -> remove todos os espaços em branco que aparecem no incial e no 
            final de uma determinada String
                OBS: para que os espaços sejam realmente retirados a variavel precisa ser igual a
                essa mesma variavel com o método trim();
                EX: frase = frase.trim();*/

            /*nomeDaString.replace(caracteresSeraoSubstituido, substituição); -> substituição de caracteres, ou grupo, em uma determinada
            string.
                OBS: como no trim(), esse método para ter a resolução e substituição correta
                EX: frase=frase.replace(caracteresSeraoSubstituido, substituição);*/
            
            /*nomeDaString.valueOf(nomeDaVariavelASerConvertida) -> conversão de dados em string
            aceita varios tupos de argumentos(numeros ou cadeia de caracteres) e os transforma em string.*/

            /*nomeDaString.indexOf(caractereOuSubstring, [posicaoIncial]) ->usado para localizar caracteres ou substrings em uma String.
            Ele retorna a posicao em que ela se econtra.
            */
        }
        System.exit(0);
    }
}


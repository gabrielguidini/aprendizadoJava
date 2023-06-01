package cap02;
public class TiposPrimitivos {
    public static void main(String args[]){
        char sexo = 'f';
        byte idade = 89;
        short codigo = 256;
        float nota = 9.5f;
        int alunos = 100, classes = 10; //determinando o tipo de dado em várias variáveis
        long habitantes = 90500100;
        double dolar = 2.62;
        boolean alternativa = false;
        System.out.println("sexo:"+ sexo + " idade:"+ idade + " código:"+codigo);
        System.out.println("nota:"+nota+" alunos:"+alunos+ " classes:"+classes);
        System.out.println("habitantes:"+habitantes+" dolar:"+dolar+ " alternativa:"+alternativa);
        // no java não existe constante, o que existe é uma variável "final" que deixa o valor constante
        // definidos no inicio da classe. Identifica com letra maiscula, todas as letras e quando existe
        // mais de uma palavra, se separa por (_)"underline".
        final double PI = 3.14;
        final int MILISSEGUNDOS_POR_SEGUNDO = 1000;
        final long MILISSEGUNDOS_POR_DIA = 24* 60 *1000;
        // se durante a classe o valor atribuido a variavel "final" for declarado novamente com outro valor,
        // vai ocorrer uma mensagem de erro.

        // TIPOS DE COMMENTS:
        /* */
        //
        /** */
    }
}

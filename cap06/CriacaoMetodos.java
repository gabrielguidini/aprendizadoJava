package cap06;

public class CriacaoMetodos {
    public static void main(String args[]){
        //metodo main pra todas as classes executaveis eh necessario

        //metodos sao trechos de codigos que permitem ao desenvolvedor modularizar o sistema,  ou seja, varios modulos que juntos compoem um sistema.
        /* qualificador tipoDoRetorno nomeDoMetodo ([listaDeParametros]){
            codigos do corpo
        }
        qualificador -> (modificador) define a visibilidade do metodo(access level "nivel de acesso" - ORACLE) 
            public -> metodos visivel para qualquer outra classe (qualificador mais aberto possivel)
            private -> visivel somente para a propria classe
            protected -> visivel pela propria classe e por suas subclasses e classes do mesmo package
        
        tipoDoRetorno -> refere-se ao tipo de dado que ira ser retornado pelo metodo, os que nao retornarem nada, devem possuir parametro void
        ou seja, quando public static "VOID" main, o "VOID" faz com que nao retorne nenhum tipo de valor do metodo
        os retornos podem ter valores primitivos(int,float,double,boolean etc), um array ou um objeto qualquer

        nomeDoMetodo -> qualquer palavra ou frase desde que iniciada por letra, um metodo sempre se inicia com letra MINUSCULA, se tiver outras palavras
        elas tem letra MAISCULA // nomeDoMetodo etc. importante dar nomes sugestivos.

        listaDeParametros -> listas de variaveis opcionais que podem ser recebidas pelo metodo para tratamento interno. quando chamado, o metodo pode receber
        valores de quem chamou e que esses valores podem ser manipulador internamente e devolvidos ao emissor da solicitacao.
        entra uma materia prima (valores passando ao metodo) e sai um produto acabado (retorno do metodo)

        codigosDoCorpo -> realizam o processamento interno dos dados inputados e retornam os valores desejados. Constituem o programa do metodo

        A SUBSTITUICAO do tipoDeRetorno por void acarreta em um metodo sem retorno ja que void determina nenhum retorno

        EX:*/
        imprimir();
        teste();
        soma(10,20);
        System.out.println(CriacaoMetodos.somabiruta(2, 99));
        System.out.println(CriacaoMetodos.mostrarPares(100));


    }
    public static void imprimir(){ // metodo sem retorno
        System.out.println("num acreditoo, poggers");
    }

    private static void teste() { // metodo sem retorno
        System.out.println("teste");
    }
    private static void soma(int y,int z) { // metodo sem retorno
        // argumentos dentro do método soma = valores de refencia para a conta
        int x;
        x = y+z;
        System.out.println("soma = "+x);
    }
    public static int somabiruta(int a,int b){
        return a+b;
    }
    public static String mostrarPares(int valor){
        String retorno = "";
        for (int a =0;a<=valor;a+=2){
            retorno += a+" ";
        }
        return retorno;

        /* RECURSIVIDADE -> nada mais é que o chamar de um método por ele mesmo, direta ou indiretamente.
        por meio de outro método. ALGO MUITO AVANÇADO MAS QUE FACILITA O CÓDIGO DEMAIS FAVOR PROCURAR
        
        
        */


    }
}    

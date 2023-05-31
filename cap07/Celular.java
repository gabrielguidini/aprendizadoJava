package cap07;

public class Celular {
    public String numero; //valor mutavel dentro da classe Celular
    public static String empresa; // imutavel devido ao STATIC que faz com que permanca imovel a variavel
    // o atributo empresa esta com o escopo de classe e nao de instancia

    // PERGUNTAR AO WALTER A DIFERNCA ENTRE ESCOPO DE CLASSE E DE INSTANCIA
    /*
    ESCOPO DE CLASSE
        -USA O MODIFICADOR STATIC
        -O CONTEUDO DA VARIAVEL PERTENCE A UMA CLASSSE
        -SOMENTE UM VALOR COMUM PODE SER ARMAZENADO NA VARIAVEL

    ESCOPO DE INSTANCIA
        -NAO MODIFICADOR STATIC
        -O CONTEUDO DA VARIAVEL PERTECE AOS OBJETOS 
        -CADA OBJETO PODE MANTER UM VALOR DIFERENTE PARA SUA VARIAVEL
    */
    public static void main(String args[]){
        Celular celular1 = new Celular(); // nome-da-classe nome-do-objeto = new nomeDaClasse();
        Celular celular2 = new Celular();
        Celular celular3 = new Celular();
        celular1.numero  = "+55 47 99968-8176";
        celular2.numero  = "+55 47 99679-8174";
        celular3.numero  = "+55 47 99630-3941";

        Celular.empresa = "Empresa bombastica";
    }
}

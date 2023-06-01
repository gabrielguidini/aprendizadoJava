package cap06;

import javax.swing.*;

public class EntradaDeDadosComMetodos {
    static String aux = "";
    public static int lerNumeroInt(int minimo, int maximo, String men) { //pode trocar o tipo de dado
        int n =0;
        while(true){
            try{
                aux = JOptionPane.showInputDialog(men);
                n = Integer.parseInt(aux);
                if(n<minimo || n>maximo){
                    JOptionPane.showMessageDialog(null,"Entrada fora da faia perminitda!");
                } else{
                    break;
                }
            } catch(NumberFormatException error){
                JOptionPane.showMessageDialog(null, "digite apenas valores numericos \n"+error.toString());
            }
        } return n;
    }
    public static String lerString(String men){
        aux = JOptionPane.showInputDialog(men);
        return (aux);
    }
    public static char selecionarOpcao(String men){
        Object[] op = {"sim", "nao"};
        char opcao = 'n';
        String resp = (String) JOptionPane.showInputDialog(null, 
                        men+"\n","pesquisa", JOptionPane.PLAIN_MESSAGE,null,op,"sim");
        if(resp == "sim"){
            opcao = 's';
        } return opcao;
    }
}

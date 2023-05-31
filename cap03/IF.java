package cap03;

import javax.swing.*;;

public class IF{
    public static void main(String args[]){

        /* O mecanismo de conversão (String) faz com que qualquer que seja o input feito no
        método showInputDialog da classe JOptionPane, seja transformado para string. Pois
        como padrão, a calsse JOptionPane faz com que seja um objeto referenciado. */

        Object[] op = {"Masculino", "Feminino"};
        String resp = (String) JOptionPane.showInputDialog(null, 
         "Selecione o sexo \n", "Pesquisa:",
         JOptionPane.PLAIN_MESSAGE,
         null, op, "Masculino");
        
        if(resp == null){
            JOptionPane.showMessageDialog(null, "Pressionou Cancel");
        }
        if(resp == "Masculino"){
            JOptionPane.showMessageDialog(null, "Você é Homi");
        }
        if(resp == "Feminino"){
            JOptionPane.showMessageDialog(null, "Você é Mulé");
        }
        System.exit(0);
    }
}
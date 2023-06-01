package cap03;

import javax.swing.JOptionPane;

public class IfComElseNested {
    public static void main(String args[]){
        String aux = JOptionPane.showInputDialog(null, "forneça o numero do mes");
        if(aux != null){
            try{
                int mes = Integer.parseInt(aux);
                if(mes == 1){
                    aux = "janeiro";
                } else if (mes == 2){
                    aux = "fevereiro";
                } else if (mes == 3){
                    aux = "março";
                } else if (mes == 4){
                    aux = "abril";
                } else if (mes == 5){
                    aux = "maio";
                } else if (mes == 6){
                    aux = "junho";
                } else if (mes == 7){
                    aux = "julho";
                } else if (mes == 12){
                    aux = "dezembro";
                }
                JOptionPane.showMessageDialog(null, aux);
            } catch (NumberFormatException error){
                JOptionPane.showMessageDialog(null, "forneça somente numeros" + error);
            }
        }
        System.exit(0);
    }
}

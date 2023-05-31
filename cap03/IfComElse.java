package cap03;

import javax.swing.*;

public class IfComElse {
    public static void main(String args[]){
        String aux = JOptionPane.showInputDialog(null, "Forneça o número do mês");
        if(aux != null){
            try{
                int mes = Integer.parseInt(aux);
                if(mes >=1 || mes <=12){
                    JOptionPane.showMessageDialog(null, "mes válido");
                } else{
                    JOptionPane.showMessageDialog(null, "mes invalido");
                }
            } catch (NumberFormatException error){
                JOptionPane.showMessageDialog(null, "digite numeros e não outro caracteres.");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
        System.exit(0);
    }
}

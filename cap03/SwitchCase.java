package cap03;
import javax.swing.*;
public class SwitchCase {
    public static void main(String args[]){
        String mes = (String) JOptionPane.showInputDialog(null,"numero do mes");
        if(mes != null){
            switch (mes){
                case "1":
                    mes = "janeiro";
                    break;
                case "2":
                    mes = "fevereiro";
                    break;
                case "3":
                    mes = "março";
                    break;
                default:
                    mes = "mes desconecido";
            }
            JOptionPane.showMessageDialog(null, mes);
        }
        System.exit(0);
    }
}

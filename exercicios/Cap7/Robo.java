package exercicios.Cap7;

import javax.swing.JOptionPane;

public class Robo implements InterfaceAndar{
    public void andar(){
        JOptionPane.showMessageDialog(null,"andando...");
    }
    public void falar(){
        JOptionPane.showMessageDialog(null,"pipipipopopopo bomba bomba");
    }
    public void virar(){
        JOptionPane.showMessageDialog(null,"virando...");
    }
}

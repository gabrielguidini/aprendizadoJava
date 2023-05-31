package exercicios.Cap5;

import javax.swing.*;

public class Exerc3 {
    public static void main(String[] args) {
        Integer[][] pix = new Integer[40][40];
        for (int i=0;i<40;i++){
            for(int j=0;j<40;j++){
                pix[i][j] = (int)(Math.random()*256); pix[0][0] = (int)(Math.random()*256); 

            }
        }
        JOptionPane.showMessageDialog(null, pix);
    }
}

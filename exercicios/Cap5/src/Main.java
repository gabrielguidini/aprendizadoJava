package exercicios.Cap5.src;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double[] notas = new double[5];
        double media = 0,contador = 0;
        for(int i =0;i<notas.length;i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor da nota: "+(i+1)));
            contador += notas[i];
            media = contador/notas.length;
        }
            JOptionPane.showMessageDialog(null, "notas: "+notas[0] + ", "+notas[1]+ ", "+notas[2]+", "
                    +notas[3]+", "+notas[4] + "a media é: "+media);
    }
}
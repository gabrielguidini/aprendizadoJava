package exercicios.Cap5;

import javax.swing.JOptionPane;

public class Exerc2 {
    public static void main(String[] args) {
        String[] meses = {"janeiro", "fevereiro","março",
    "abril", "maio", "junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        int numMes = (int)(Math.random()*12);

        JOptionPane.showMessageDialog(null,"Mes sorteado: "+ meses[numMes]);
    }
}

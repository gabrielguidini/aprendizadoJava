package cap03;

import javax.swing.JOptionPane;

public class IfResumo {
    public static void main(String args[]){
        //if resumido:

        int c = 10,d=11,maior;
        maior = (c>d) ? c:d; // (c<d) ? -> é o if()// c:d SE VERDADE retorna c SE FALSO retorna d
        JOptionPane.showMessageDialog(null,"if resumido"+maior);
    }
}

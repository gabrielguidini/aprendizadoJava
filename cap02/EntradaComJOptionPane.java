package cap02;

import javax.swing.JOptionPane;
//import javax.swing.*; -> funciona igualmente.

public class EntradaComJOptionPane {
    public static void main(String args[]){
        String aux;
        float largura, comprimento, area, perimetro;
        try{
            aux = JOptionPane.showInputDialog("Entre com o comprimento");
            comprimento = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Largura");
            largura = Float.parseFloat(aux);

            area = comprimento*largura;
            perimetro = comprimento*2 + largura*2;
            JOptionPane.showMessageDialog(null, "area: "+ area + ", perimetro "+ perimetro);
        } catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos" + erro.toString());
        }
        System.exit(0);
    }
}

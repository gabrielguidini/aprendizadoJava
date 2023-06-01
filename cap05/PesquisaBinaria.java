package cap05;

import javax.swing.JOptionPane;

import java.util.Arrays;

public class PesquisaBinaria {
    public static void main(String[] args) {
        int[] aux = new int[100];
        for(int i=0; i<aux.length;i++){
            aux[i] = 1+(int)(Math.random()*100);
            System.out.println(aux);
        }
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"forneça um valor: "));
        String erroString  = "não encontrado";
        for(int i=0;i<aux.length;i++){
            if(aux[i] == valor){
                erroString = "valor encontrado na posição: "+i;
                break;
            }
        }
        System.out.println(erroString);
        Arrays.sort(aux);
        int pos = Arrays.binarySearch(aux, valor);
        System.out.println("Nova posição em: "+pos);
    }
}

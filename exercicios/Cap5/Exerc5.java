package exercicios.Cap5;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exerc5 {
    public static void main(String[] args){
        boolean verificadorTotal = true;
        int[] garagem = new int[10]; 
        int[] placaGaragem = new int[10];
        while(verificadorTotal){
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione uma acao: \n1-Entrada\n2-Saida\n3-Listar situacao atual\n4-Encerrar o programa"));
            if(menu == 1){
                int vaga = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o vaga do veiculo?\n1-10"));
                int placa = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o numero da placa do veiculo?"));
                for(int i=0;i<10;i++){
                    if(garagem[i] == 1){
                        System.out.println("vaga ocupada. ");
                    }else{
                        if(garagem[i] != 1){
                            garagem[vaga-1] = 1;
                            placaGaragem[vaga-1] = placa;
                        }
                    }
                }
            } else if(menu == 2){
                int vaga = Integer.parseInt(JOptionPane.showInputDialog(null, "numero da vaga que vai ser liberada: \n1-10"));
                if(garagem[vaga-1] == 1 ){
                    garagem[vaga-1] = 0;
                }

            } else if(menu == 3){
                JOptionPane.showMessageDialog(null,"a lista é:\n "+Arrays.toString(garagem));
            } else{
                verificadorTotal = false;
            }

        }
    }
}

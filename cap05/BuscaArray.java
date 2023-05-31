package cap05;

import javax.swing.JOptionPane;

public class BuscaArray {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null,"digite uma cor: ");
        String[] cores = {"verde","amarelo","vermelho","preto"};
        String mensagem = "não encontrado";
        
        for(int i =0; i<cores.length;i++){
            for(String elemento : cores){
                if(elemento.equals(aux)){
                    mensagem = "cor encontrada "+ (i-1);
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(null,mensagem);
        System.exit(0);
    }
}

package cap07.heranca;

import javax.swing.JOptionPane;

public class PessoaPolimorfa {
    public static void main(String args[]){
        Pessoa pessoa = null;
        int tipo = Integer.parseInt(
            JOptionPane.showInputDialog("Forneça um numero de 1 a 4")
        );
        switch(tipo){
            case 1:
            pessoa = new Pessoa();break;
            case 2:
            pessoa = new PessoaFisica();break;
            case 3:
            pessoa = new PessoaJuridica();break;
            case 4:
            pessoa = new Funcionario();break;
            default:{
                System.out.println("tipo memes");
                System.exit(0); // termina a execução da classe 
            }
        }
        pessoa.mostraClasse();
    }
}

package cap06;

import javax.swing.JOptionPane;

public class TesteEntradaDados {
    public static void main(String[] args) {
        String nome = EntradaDeDadosComMetodos.lerString("seu nome men");
        int idade = EntradaDeDadosComMetodos.lerNumeroInt(0, 120, "qual a tua idade");
        char op = EntradaDeDadosComMetodos.selecionarOpcao("tu gosta de java");
        JOptionPane.showMessageDialog(null,"nome: "+nome+"\nidade: "+idade+"\nopcao selecionada: "+op);

        // --------------------------------------------------- VISUALIZAR A SINTAXE.

        double[] numeros = {12.4,3.2,9,7.4,6.6};
        double maior = ValorDeEntradaArray.buscaMaior(numeros);
        System.out.println(maior);

        String[] nomes ={"Ivone", "Rochelle","Julios","Chris","Tonia","Andrew","Nick"};
        String[] retorno = ValorDeEntradaArray.ordenarPlavaras(nomes);
        for(int i = 0;i<retorno.length;i++){
            System.out.println(retorno[i]);
        }
    }
}

package cap08;

import java.awt.event.*;
import javax.swing.*;

public class GuiComboBox extends JPanel {
    private JComboBox cbStates;
    private JLabel lbStates;
   private JButton btShow;

    public GuiComboBox(){
        inicializarComponentes();
        definirEventos();
    }

   private void inicializarComponentes(){
    setLayout(null);
    String[] cbStatesItems = {"SC","PR","RS","SP","PA"};
    cbStates = new JComboBox<>(cbStatesItems);
    lbStates = new JLabel("Estados do Brasil");
    
    btShow = new JButton("Mostrar");
    add(cbStates);
    add(lbStates);
    add(btShow);
    lbStates.setBounds(25, 15,150,25);
    cbStates.setBounds(25, 40, 150,25);
    btShow.setBounds(25,70,100,25);
   }
   private void definirEventos(){
    btShow.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"o indice selecionado é: "+ cbStates.getSelectedIndex()
            + "\nO estado selecionado é: " + cbStates.getSelectedItem());
        }
    });
   }
}

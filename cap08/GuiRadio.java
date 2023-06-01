package cap08;

import java.awt.event.*;
import javax.swing.*;

public class GuiRadio extends JPanel {
    private JLabel lbSexo ;
    private JButton btVerify;
    private JRadioButton rbMasc, rbFem;
    private ButtonGroup buttonGroup;

    public GuiRadio(){
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes(){
        setLayout(null);

        lbSexo = new JLabel("Selecionar sexo: ");
        rbMasc = new JRadioButton("Masculino");
        rbFem = new JRadioButton("Feminino");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(rbFem);
        buttonGroup.add(rbMasc); // adicionando os dois CheckBox ao ButtonGroup

        btVerify = new JButton("Verificar");
        btVerify.setBounds(25,25,100,50);
        rbMasc.setBounds(25,100,90,50);
        rbFem.setBounds(120,100,80,50);
        rbMasc.setSelected(true);

        add(btVerify);
        add(rbMasc);
        add(rbFem);
        add(lbSexo);        
    }
    private void definirEventos(){
        btVerify.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(rbMasc.isSelected()){
                    JOptionPane.showMessageDialog(null, "bombastic masculino");
                } else if(rbFem.isSelected()){
                    JOptionPane.showMessageDialog(null,"bombastic feminino");
                }
            }
        });
    }
}

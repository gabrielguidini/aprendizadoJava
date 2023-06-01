package cap08;

import javax.swing.*;
import java.awt.event.*;

public class GuiCheckBox extends JPanel{
    private JButton btVerify, btMark, btDemark;
    private JCheckBox ckLanguage, ckInformatica;
    public GuiCheckBox(){
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes(){
        btVerify = new JButton("Verificar");
        btMark = new JButton("Marcar");
        btDemark  = new JButton("Desmarcar");

        ckLanguage = new JCheckBox("Linguagem");
        ckInformatica = new JCheckBox("Informática");

        setLayout(null);
        add(btVerify);
        add(btMark);
        add(btDemark);
        add(ckInformatica);
        add(ckLanguage);

        btVerify.setBounds(20,70,100,20);
        ckLanguage.setBounds(15,15,100,20);
        ckInformatica.setBounds(15,40,100,20);        
        btMark.setBounds(20,100,100,20);
        btDemark.setBounds(20,130,100,20);

    }
    private void definirEventos(){
        btMark.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                ckInformatica.setSelected(true);
                ckLanguage.setSelected(true);
                System.out.print("agora é true");
            }
        });
        btDemark.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                ckInformatica.setSelected(false);
                ckLanguage.setSelected(false);
                System.out.println("agora é false");
            }
        });
        btVerify.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                String selected = "Selecionados";
                if(ckLanguage.isSelected()){
                    selected += "\nIngreis";
                } if(ckInformatica.isSelected()){
                    selected += "\nInformatic";
                } JOptionPane.showMessageDialog(null,"bomba: "+selected);
            }
        });
    }
}

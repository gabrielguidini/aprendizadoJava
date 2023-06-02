package cap08;

import javax.swing.*;
import java.awt.event.*;

public class GuiAreaDeTexto extends JPanel{
    private JTextArea taText;
    private JTextField tfTextCampo;
    private JScrollPane scrollPane;
    private JButton btClear;
    private final static String novaLinha = "\n";

    public GuiAreaDeTexto(){
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes(){
        taText = new JTextArea(5,20);
        tfTextCampo = new JTextField();
        taText.setEditable(false);
        scrollPane = new JScrollPane(taText);

        btClear = new JButton("bomba patch");
        scrollPane.setBounds(25,45,300,125);
        tfTextCampo.setBounds(25,15,150,40);
        btClear.setBounds(25,170,50,50);

        add(btClear);
        add(scrollPane);
        add(tfTextCampo);
    }
    private void definirEventos(){
        tfTextCampo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfTextCampo.selectAll();
                taText.append(tfTextCampo.getText()+novaLinha);
                taText.setCaretPosition(taText.getDocument().getLength());
            }
        });
        btClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfTextCampo.setText(" ");
                taText.setText(" ");
            }
        });
    }
}

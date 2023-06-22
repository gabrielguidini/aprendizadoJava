package exercicios.Cap8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exerc4 extends JFrame{
    private JPanel panelLabel;
    private JTextArea textArea; 
    private JComboBox estadoBox, sexoBox;
    private JTextField nomeField,enderecoField;
    private JLabel nomeLabel, enderecoLabel, sexoLabel,estadoLabel;
    private JButton showButton,clearButton;
    private String[] sexoArray= new String[]{"Masculino", "Feminino","Não Informar"},estadoArray = new String[]{"Casado(a)", "Solteiro(a)", "Viúvo(a)","Divorciado(a)"};

    public Exerc4(){
        initComp();
        definirEventos();
    }
    private void initComp(){
        setLayout(null);
        panelLabel = new JPanel();
        panelLabel.setSize(400,300);
        panelLabel.setLayout(null);
        nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(10,10,100,30);
        nomeField = new JTextField();
        nomeField.setBounds(200,10,150,25);
        enderecoLabel = new JLabel("Endereço:");
        enderecoLabel.setBounds(10,40,100,30);
        enderecoField = new JTextField();
        enderecoField.setBounds(200,40,150,25);
        sexoLabel = new JLabel("Sexo:");
        sexoLabel.setBounds(10,70,100,30);
        sexoBox = new JComboBox<>(sexoArray);
        sexoBox.setBounds(200,70,100,25);
        estadoLabel = new JLabel("Estado Civil:");
        estadoLabel.setBounds(10,100,100,30);
        estadoBox = new JComboBox<>(estadoArray);
        estadoBox.setBounds(200,100,100,25);

        showButton = new JButton("Mostrar");
        showButton.setBounds(0,135,200,25);
        clearButton = new JButton("Limpar");
        clearButton.setBounds(200,135,200,25);

        textArea = new JTextArea(5, 20);
        textArea.setBounds(10,170,350,200);

        panelLabel.add(nomeLabel);
        panelLabel.add(nomeField);
        panelLabel.add(enderecoLabel);
        panelLabel.add(enderecoField);
        panelLabel.add(sexoLabel);
        panelLabel.add(sexoBox);
        panelLabel.add(estadoLabel);
        panelLabel.add(estadoBox);
        panelLabel.add(showButton);
        panelLabel.add(clearButton);
        panelLabel.add(textArea);
        textArea.setEditable(false);
        getContentPane().add(panelLabel);
    }
    private void definirEventos(){
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                textArea.setText("Nome:"+nomeField.getText()+
                "\nEndereço: "+ enderecoField.getText()+
                "\nSexo: "+ sexoBox.getSelectedItem()+
                "\nEstado Civil: "+ estadoBox.getSelectedItem());
            }
        });
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                textArea.setText("");
                nomeField.setText("");
                enderecoField.setText("");
            }
        });
    }
    public static void main(String args[]){
        Exerc4 frame = new Exerc4();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setTitle("Exerc4 - Cadastro");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(400 , 350);
        frame.setLocation((tela.width - frame.getSize().width)/2, (tela.height - frame.getSize().height)/2);
        frame.setVisible(true);
    }
}

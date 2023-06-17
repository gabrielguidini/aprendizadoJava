package exercicios.Cap8;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Exerc3 extends JFrame{
    private JPanel panel;
    private JRadioButton dinheiroButton, cartaoButton, chequeButton;
    private ButtonGroup group;
    private JTextField inicioField, finalField;
    private JLabel inicioLabel, finalLabel;

    public Exerc3(){
        initComp();
        definirEventos();
    }

    private void initComp(){
        panel = new JPanel();
        panel.setSize(300,300);
        inicioLabel = new JLabel("Valor da venda:");
        inicioLabel.setBounds(20,20,90,25);
        inicioField = new JTextField();
        inicioField.setBounds(110,20,70,25);
        dinheiroButton = new JRadioButton("Dinheiro");
        dinheiroButton.setBounds(20,50,100,25);
        cartaoButton = new JRadioButton("Cartão");
        cartaoButton.setBounds(20,80,100,25);
        chequeButton = new JRadioButton("Cheque");
        chequeButton.setBounds(20,110,100,25);
        finalLabel = new JLabel("Preço final da venda:");
        finalLabel.setBounds(20,135,125,25);
        finalField = new JTextField();
        finalField.setBounds(143,135,80,25);
        finalField.setEditable(false);
        panel.setLayout(null);
        group = new ButtonGroup();
        group.add(dinheiroButton);
        group.add(cartaoButton);
        group.add(chequeButton);
        panel.add(dinheiroButton);
        panel.add(cartaoButton);
        panel.add(chequeButton);
        //panel.add(validateButton);
        panel.add(inicioField);
        panel.add(inicioLabel);
        panel.add(finalField);
        panel.add(finalLabel);
        getContentPane().add(panel);
    }
    private void definirEventos(){
        dinheiroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(dinheiroButton.isSelected()){
                    int aux =Integer.parseInt(inicioField.getText());
                    Float valorFinal = aux*(0.95f);
                    finalField.setText(valorFinal.toString());
                }
            }
        });
        cartaoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(cartaoButton.isSelected()){
                    int aux = Integer.parseInt(inicioField.getText());
                    Float valorFinal = aux*(1.1f);
                    finalField.setText(valorFinal.toString());
                }
            }
        });
        chequeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(chequeButton.isSelected()){
                    int aux = Integer.parseInt(inicioField.getText());
                    Double valorFinal = aux*(1.05);
                    finalField.setText(valorFinal.toString());
                }
            }
        });
    }

    public static void main(String args[]){
        Exerc3 frame = new Exerc3();
        frame.setTitle("bomba exerc3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(300,220);
        frame.setVisible(true);
        Dimension tela  = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width)/2 , (tela.height - frame.getSize().height)/2);
    }
}
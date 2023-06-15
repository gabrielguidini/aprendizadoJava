package exercicios.Cap8;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;

public class Exerc3 extends JFrame{
    private JLabel vendaLabel, finalLabel;
    private JCheckBox dinheiroBox,chequeBox,cartaoBox;
    private JTextField vendaField, finalField;
    private JButton validaButton;
    private ButtonGroup botaoGroup;


    public Exerc3(){
        initComponent();
        checkBox();

    }
    private void initComponent(){
        setTitle("bombadb");
        setLayout(null);
        dinheiroBox = new JCheckBox("Dinheiro");
        dinheiroBox.setBounds(100,80,80,25);
        chequeBox = new JCheckBox("Cheque");
        chequeBox.setBounds(100,110,80,25);
        cartaoBox = new JCheckBox("Cartão");
        cartaoBox.setBounds(100,140,80,25);

        vendaLabel = new JLabel("Valor de venda");
        vendaLabel.setBounds(10,40,100,25);
        vendaField = new JTextField();
        vendaField.setBounds(100,40,100,25);
        validaButton = new JButton("Verificar");
        validaButton.setBounds(205,40,85,25);

        finalField = new JTextField();
        finalField.setBounds(130,180,100,25);
        finalField.setEditable(false);
        finalLabel = new JLabel("Preço final da venda");
        finalLabel.setBounds(10,180,120,25);

        botaoGroup = new ButtonGroup();
        
        
        
        add(finalLabel);
        add(finalField);
        add(vendaLabel);
        add(vendaField);
        add(validaButton);
        botaoGroup.add(dinheiroBox);
        botaoGroup.add(chequeBox);
        botaoGroup.add(cartaoBox);
        //---- tava tentando fazer por JPanel direto, num deu*/
    }
    private void checkBox(){
        dinheiroBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
            }
        });
    }
    private void definirEventos(){
        
    }

    public static void main(String args[]){
        Exerc3 frame = new Exerc3();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(50,50,350,300);
        frame.setLocation((tela.width- frame.getSize().width)/2,
                        (tela.height - frame.getSize().height)/2);
        frame.setVisible(true);                        
    }
}

package cap08;

import java.awt.event.*;
import javax.swing.*;

public class GuiLista extends JPanel {
    private JButton btBomba;
    private JLabel lbValue;
    private JTextField tfValue,tfDiscountValue;
    private JList liDiscount;
    private JScrollPane spList;

    public GuiLista() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes(){
        setLayout(null);
        String[] liDiscountItems = {"10%","20%","30%","40%","50%"};
        
        btBomba = new JButton("Calcular"); //gatilho no calculo
        lbValue = new JLabel("Valor");
        tfValue = new JTextField(5);

        liDiscount = new JList<>(liDiscountItems);
        tfDiscountValue = new JTextField(5);
        spList = new JScrollPane(liDiscount);

        btBomba.setToolTipText("BombaPatch2014 que faz Calculo");
        btBomba.setMnemonic(KeyEvent.VK_C);
        lbValue.setBounds(10,10,100,120);
        tfValue.setBounds(10,20,100,120);
        spList.setBounds(10,30,100,120);
        tfDiscountValue.setBounds(10,40,100,120);
        btBomba.setBounds(20,65,100,35);

        add(btBomba);
        add(lbValue);
        add(tfValue);
        add(spList);
        add(tfDiscountValue);
    }
    private void definirEventos(){
        btBomba.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(tfValue.getText().equals(" ")){
                    tfValue.requestFocus();
                    return;
                } try{
                    float value = Float.parseFloat(tfValue.getText());
                    if(liDiscount.getSelectedIndex()==-1){
                        JOptionPane.showMessageDialog(null,"selecione um item da lista");
                        return;
                    } 
                    float discount = 0.9f;
                    if(liDiscount.getSelectedIndex() == 1){
                        discount = 0.8f;
                    } else if(liDiscount.getSelectedIndex() == 2){
                        discount = 0.7f;
                    } else if(liDiscount.getSelectedIndex()==3){
                        discount = 0.6f;
                    } else if(liDiscount.getSelectedIndex()==4){
                        discount = 0.5f;
                    } tfDiscountValue.setText(" "+value*discount);
                } catch(NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "forneça apenas numeros bombasticos "+ error.toString());
                    tfValue.requestFocus();
                }

            }
        });
    }
}

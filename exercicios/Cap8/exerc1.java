package exercicios.Cap8;

import javax.swing.*;
import java.awt.*;

public class exerc1 extends JFrame {
    private JButton button;
    private JPanel panel;
    public exerc1(){
        initComp();
        //definirEventos();
    }

    private void initComp(){
        setTitle("Bomba 8x8");
        setResizable(false);
        panel = new JPanel();
        panel.setLayout(new GridLayout(8,8));
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                button = new JButton();
                button.setBackground((i+j)%2==0 ? Color.white:Color.black);
                panel.add(button);
            }
        }        
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new exerc1();
    }
}



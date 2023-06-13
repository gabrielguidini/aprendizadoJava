package cap08;

import javax.swing.*;
import java.awt.event.*;

public class GuiProgressBar extends JPanel{
    private JProgressBar pbInstall;
    private JButton btHigher,btLower;
    
    public GuiProgressBar(){
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes(){
        setLayout(null);
        pbInstall = new JProgressBar();
        pbInstall.setBounds(50,10,100,20);

        btHigher = new JButton("BombaAumenta");
        btHigher.setBounds(50,50,100,25);
        btHigher.setMnemonic('A');

        btLower = new JButton("BombaBaixa");
        btLower.setBounds(50,100,100,25);
        btLower.setMnemonic('D');

        add(btHigher);
        add(btLower);
        add(pbInstall);
    }
    private void definirEventos(){
        btHigher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                pbInstall.setValue(pbInstall.getValue()+5);
            }
        });
        btLower.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                pbInstall.setValue(pbInstall.getValue()-5);
            }
        });
    }
}
    


package exercicios.Cap8;

import java.awt.*;
import javax.swing.*;

public class Exerc5 extends JFrame {
    private JMenuBar navBar;
    private JMenuItem xadrezItem;
    private JMenu xadrezJMenu;
    private Container contentPane;
    
    public Exerc5(){
        initComp();
    }
    private void initComp(){
        setLayout(null);
        contentPane = getContentPane();
        navBar = new JMenuBar();
        add(navBar);
        xadrezJMenu = new JMenu("Xadrez");
        
        xadrezItem = new JMenuItem("Xadrez");
        navBar.add(xadrezJMenu);
        xadrezJMenu.add(xadrezItem);
        add(navBar);
        add(xadrezJMenu);

    }
    public static void main(String args[]){
        Exerc5 frame = new Exerc5();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(400,300);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width)/2, (tela.height - frame.getSize().height)/2);
        frame.setVisible(true);
    }
}

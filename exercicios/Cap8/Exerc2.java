package exercicios.Cap8;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;


public class Exerc2 extends JFrame{
    private JLabel paisLabel,fotoLabel;
    private ImageIcon imageIcon;
    private JPanel panel;
    private JComboBox paisesBox;

    public Exerc2(){
        initComp();
        definirEventos();
    }

    private void initComp(){
        setTitle("bombastic 2 exercicio");
        setSize(200,400);
        setLayout(null);
        String[] paises = new String[]{"GER","BRA","CHI","ESP","POR"};
        paisesBox = new JComboBox<>(paises);
        paisesBox.setBounds(70,20,100,25);
        paisLabel = new JLabel("paises");
        //paisLabel.setBounds();
        fotoLabel = new JLabel();



        panel = new JPanel();
        add(panel);
        add(paisesBox);
        add(paisLabel);
        add(fotoLabel);
        fotoLabel.setIcon(imageIcon);
    }
    private void definirEventos(){
        paisesBox.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(paisesBox.getSelectedIndex() == 1){
                    imageIcon = new ImageIcon("C:/Users/gsgui/OneDrive - Univille/CURSOS/java/exercicios/Cap8/bombaimagem/1.png");
                }
                imageIcon = new ImageIcon(("C:/Users/gsgui/OneDrive - Univille/CURSOS/java/exercicios/Cap8/bombaimagem"+paisesBox.getSelectedItem()));
                
            }
        });
    }

    public static void main(String args[]){
        Exerc2 frame = new Exerc2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(50, 50, 300, 400);
        frame.setLocation ((tela.width - frame.getSize().width)/2,
                            (tela.height - frame.getSize().height)/2);
        frame.setVisible(true);
    }
}

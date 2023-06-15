package exercicios.Cap8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exerc2 extends JFrame{
    private JLabel paisLabel,fotoLabel;
    private ImageIcon imageIcon;
    private JPanel panel;
    private JComboBox paisesBox;
    private String [] imagens = new String[]{
        "C:/Users/gsgui/OneDrive - Univille/CURSOS/java/exercicios/Cap8/bombaimagem/1.png", // ALE
        "C:/Users/gsgui/OneDrive - Univille/CURSOS/java/exercicios/Cap8/bombaimagem/2.png", // BRA
        "C:/Users/gsgui/OneDrive - Univille/CURSOS/java/exercicios/Cap8/bombaimagem/3.png", // CHI
        "C:/Users/gsgui/OneDrive - Univille/CURSOS/java/exercicios/Cap8/bombaimagem/4.png", // ESP
        "C:/Users/gsgui/OneDrive - Univille/CURSOS/java/exercicios/Cap8/bombaimagem/5.png", // POR
    };
    
    public Exerc2(){
        initComp();
        definirEventos();
    }

    private void initComp(){
        setTitle("bombastic 2 exercicio");
        setLayout(null);
        String[] paises = new String[]{"GER","BRA","CHI","ESP","POR"};
        paisesBox = new JComboBox<>(paises);
        paisesBox.setBounds(100,100,100,30);
        paisLabel = new JLabel("paises");
        //paisLabel.setBounds();
        fotoLabel = new JLabel();
        fotoLabel.setPreferredSize(new Dimension(500,350));
        panel = new JPanel();
        panel.setSize(700,400);
        add(panel);
        panel.add(paisesBox);
        panel.add(paisLabel);
        panel.add(fotoLabel);
        fotoLabel.setIcon(imageIcon);
    }
    private void definirEventos(){
        paisesBox.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int indiceSelec = paisesBox.getSelectedIndex();
                if(indiceSelec >=0 && indiceSelec < imagens.length){
                    String bombaImagens = imagens[indiceSelec];
                    ImageIcon imagemIcon = new ImageIcon(bombaImagens);
                    fotoLabel.setIcon(imagemIcon); 
                }
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

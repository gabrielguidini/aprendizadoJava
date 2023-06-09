package cap08;

import java.awt.event.*;
import javax.swing.*;

public class GuiBotao extends JPanel{
    private JButton btMensagem, btTeimoso;
    private ImageIcon imageIcon1;

    public GuiBotao(){
        inicializarComponentes();
        definirEventos();
    }
    public void inicializarComponentes(){
        setLayout(null);
        imageIcon1 = new ImageIcon("java.jpg");
        
        btMensagem = new JButton("Mensagem", imageIcon1);
        btMensagem.setBounds(50,20,140,38);
        btMensagem.setMnemonic(KeyEvent.VK_M);
        btMensagem.setToolTipText("Clique aqui para ver a imagem");

        btTeimoso = new JButton("Teimoso");
        btTeimoso.setBounds(50,70,100,25);

        add(btMensagem);
        add(btTeimoso);
    }
    private void definirEventos(){
        btMensagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                JOptionPane.showMessageDialog(null, "botão mensagem");
                btMensagem.setVisible(true);
            }
        });
        btTeimoso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                JOptionPane.showMessageDialog(null,"botão teimoso");
                btTeimoso.setVisible(true);
            }  
        });
        /*btTeimoso.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent event){}
            public void mousePressed(MouseEvent event){}
            public void mouseEntered(MouseEvent event){
                setBounds(50,120,100,25);
            }
            public void mouseExited(MouseEvent event){
                btTeimoso.setBounds(50,70,100,25);
            }
            public void mouseReleased(MouseEvent event){}

        });*/
            
    }
}

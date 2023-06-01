package cap08;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GuiListaComFotos extends JPanel{
    private JList lsPhotos;
    private DefaultListModel dlm;
    private ImageIcon imageIcon;
    private JScrollPane sp;
    private JLabel lbImagem;

    public GuiListaComFotos(){
        inicializarComponentes();
        definirEventos();
    }   
     private void inicializarComponentes(){
        setLayout(null);
        dlm = new DefaultListModel<>();
        for(int i=0;i<=10;i++){
            dlm.addElement("Foto "+i);
        }
        lsPhotos = new JList<>(dlm);
        sp = new JScrollPane(lsPhotos);
        sp.setBounds(50,40,70,150);
        imageIcon = new ImageIcon();
        lbImagem = new JLabel(imageIcon);
        lbImagem.setBounds(150,30,180,180);
        add(sp);
        add(lbImagem);
     }

     private void definirEventos(){
        lsPhotos.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e){
                imageIcon = new ImageIcon("Imagens/"+lsPhotos.getSelectedValue()+".gif");
                lbImagem.setIcon(imageIcon);
            }
        });
     }
}

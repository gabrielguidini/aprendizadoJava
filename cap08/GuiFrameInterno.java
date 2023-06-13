package cap08;

import javax.swing.*;
import java.awt.*;

public class GuiFrameInterno extends JInternalFrame{
    public GuiFrameInterno(){
        inicializarComponentes();
    }
    private void inicializarComponentes(){
        setTitle("Frame Interno");
        setSize(50,100);
        setResizable(true);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        setBackground(Color.orange);
        setVisible(true);
    }
}
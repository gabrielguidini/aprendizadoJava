package cap08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GuiPrincipal extends JFrame{
    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos, mnMrbombatic;
    private JMenuItem miSair, miBotao, miBombastic,miCaixa, miRadio,miAio;

    public GuiPrincipal(){
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes(){
        setTitle("opa opa meu parceiro");
        setBounds(0, 0, 800, 600);
        contentPane = getContentPane();
        mnBarra = new JMenuBar();
        
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A'); //seta uma chave para dar gatilho a um evento a partir do ALT+clique da tecla
        
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');

        mnMrbombatic = new JMenu("MrsBombastic");
        mnMrbombatic.setMnemonic('F');

        miSair = new JMenuItem("Sair", new ImageIcon(""));
        miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.ALT_MASK));

        miBombastic = new JMenuItem("bomba");
        miBombastic.setMnemonic('B');

        miAio = new JMenuItem("AIOOO SILVER");
        
        
        miBotao = new JMenuItem("Botao");
        miCaixa = new JMenuItem("Caixa Opção");
        miRadio = new JMenuItem("BombaPatch 2016");
        mnExemplos.add(miBotao);
        mnMrbombatic.add(miAio);
        mnExemplos.add(miRadio);
        mnExemplos.add(miCaixa);
        mnArquivo.add(miSair);
        mnExemplos.add(miSair);
        mnArquivo.add(miBombastic);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        mnBarra.add(mnMrbombatic);
        setJMenuBar(mnBarra);
    }

    public void definirEventos(){
        miSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        miBotao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                GuiBotao guiBotao = new GuiBotao();
                contentPane.removeAll();
                contentPane.add(guiBotao); //adicionando o objeto guiBotao para o menu
                contentPane.validate();
            }
        });
        miBombastic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("bombastic");
            }
        });
        miCaixa.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                GuiCheckBox guiCheckBox = new GuiCheckBox();
                contentPane.removeAll();
                contentPane.add(guiCheckBox); //o miCaixa não entra pois referenciação 
                contentPane.validate();
            }
        });
        miRadio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                GuiRadio guiRadio = new GuiRadio();
                contentPane.removeAll();
                contentPane.add(guiRadio);
                contentPane.validate();
            }
        });
    }
    public static void abrir(){
        GuiPrincipal frame = new GuiPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.getContentPane().add(new GuiBotao());
        frame.setBounds(50, 50, 500, 300);
        frame.setLocation ((tela.width - frame.getSize().width)/2,
                            (tela.height - frame.getSize().height)/2);
        frame.setVisible(true);
    }
}

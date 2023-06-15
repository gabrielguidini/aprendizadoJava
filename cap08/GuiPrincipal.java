package cap08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GuiPrincipal extends JFrame{
    private JDesktopPane contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos, mnMrbombatic, mnPhotos;
    private JMenuItem miSair, miBotao, miBombastic,miCaixa,
    miRadio,miAio,miIxi,miOlhaPedra,miTextoArea,miProgress,miGuiFrameInterno;

    public GuiPrincipal(){
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes(){
        setTitle("opa opa meu parceiro");
        setBounds(40, 40, 500, 350);
        //contentPane = getContentPane();
        contentPane = new JDesktopPane(); // especie de uma capa para colocar frames dentro do JFrame principal
        mnBarra = new JMenuBar();
        
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A'); //seta uma chave para dar gatilho a um evento a partir do ALT+clique da tecla
        
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');

        mnMrbombatic = new JMenu("MrsBombastic");
        mnMrbombatic.setMnemonic('F');

        mnPhotos = new JMenu("Photos");

        miSair = new JMenuItem("Sair", new ImageIcon(""));
        miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.ALT_MASK));

        miBombastic = new JMenuItem("bomba");
        miBombastic.setMnemonic('B');

        miAio = new JMenuItem("AIOOO SILVER");

        miIxi = new JMenuItem("Fotinhas legais");

        miOlhaPedra = new JMenuItem("CHAMA CHAM AAA QUALÉ QUE É");

        
        miBotao = new JMenuItem("Botao");
        miCaixa = new JMenuItem("Caixa Opção");
        miRadio = new JMenuItem("BombaPatch 2016");
        miProgress = new JMenuItem("ProgressBar");
        miTextoArea = new JMenuItem("JTextArea");
        miGuiFrameInterno = new JMenuItem("Frame Interno");


        mnExemplos.add(miBotao);
        mnExemplos.add(miRadio);
        mnExemplos.add(miCaixa);
        mnExemplos.add(miSair);
        mnExemplos.add(miProgress);

        mnArquivo.add(miSair);
        mnArquivo.add(miBombastic);
        mnArquivo.add(miGuiFrameInterno);
        
        mnMrbombatic.add(miAio);
        mnMrbombatic.add(miOlhaPedra);
        
        mnPhotos.add(miTextoArea);
        mnPhotos.add(miIxi);
        
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        mnBarra.add(mnMrbombatic);
        mnBarra.add(mnPhotos);
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
        miAio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                GuiLista guiLista = new GuiLista();
                contentPane.removeAll();
                contentPane.add(guiLista);
                contentPane.validate();
            }
        });
        miIxi.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent e){
                GuiListaComFotos guiListaComFotos = new GuiListaComFotos();
                contentPane.removeAll();
                contentPane.add(guiListaComFotos);
                contentPane.validate();
            }
        });
        miOlhaPedra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                GuiComboBox guiComboBox = new GuiComboBox();
                contentPane.removeAll();
                contentPane.add(guiComboBox);
                contentPane.validate();
            }
        });
        miTextoArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                GuiAreaDeTexto guiAreaDeTexto = new GuiAreaDeTexto();
                contentPane.removeAll();
                contentPane.add(guiAreaDeTexto);
                contentPane.validate();    
            }
        });
        miProgress.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                GuiProgressBar guiProgressBar = new GuiProgressBar();
                contentPane.removeAll();
                contentPane.add(guiProgressBar);
                contentPane.validate();
            }
        });
    }
    public static void abrir(){
        GuiPrincipal frame = new GuiPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.getContentPane().add(new GuiBotao());
        frame.setBounds(50, 50, 600, 400);
        frame.setLocation ((tela.width - frame.getSize().width)/2,
                            (tela.height - frame.getSize().height)/2);
        frame.setVisible(true);
    }
}

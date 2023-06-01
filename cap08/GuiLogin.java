package cap08;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiLogin extends JFrame{
    private JTextField tfLogin;
    private JLabel lbSenha;
    private JLabel lbLogin;
    private JButton btLogar;
    private JButton btCancelar;
    private JPasswordField pfSenha;
    private static GuiLogin frame;

    public GuiLogin(){
        initializeComponents();
        definirEventos();
    }


    private void initializeComponents(){
        setTitle("Login do sistema: "); // seta o titulo do GUI
        setBounds(100, 100, 250, 200); // seta os valores de desenho -> aceita quatro parâmetros
        //-> (x,y,largura,comprimento)
        setLayout(null); // gerenciador de layout => quando nulo, se tem maior liberdade no posicionamento
       
        tfLogin = new JTextField(5);
        tfLogin.setBounds(100, 30, 120, 25);
        lbLogin = new JLabel("Login");
        lbLogin.setBounds(30, 30, 80, 25);
        btLogar = new JButton("Logar");
        btLogar.setBounds(20, 120, 100, 25);


        pfSenha = new JPasswordField(5);
        pfSenha.setBounds(100, 75, 120, 25);
        lbSenha = new JLabel("Senha");
        lbSenha.setBounds(30, 75, 80, 25);

        btCancelar = new JButton("Cancelar");
        btCancelar.setBounds(125, 120, 100, 25);

        add(tfLogin);
        add(lbSenha);
        add(lbLogin);
        add(btLogar);
        add(btCancelar);
        add(pfSenha);
    }
    public void definirEventos(){
        btLogar.addActionListener(new ActionListener() { // pode se comparar com a função addEventListener do JS
            public void actionPerformed(ActionEvent e){
                String senha = String.valueOf(pfSenha.getPassword());    
                if(tfLogin.getText().equals("teste")){
                    if(senha.equals("123")){
                        GuiPrincipal.abrir();
                        frame.setVisible(false);
                    }
                } // os dois ifs podem estar junto porém bagreei e deu bomba e to com preguiça de acertar, é o código em comment porém pfSenha == senha

                /*if(tfLogin.getText().equals("teste")&& pfSenha.toString() == "bomba"){
                    frame.setVisible(false);
                    System.out.println("passou aq");
                    System.exit(0);
                    GuiPrincipal.abrir();*/
                else{
                    JOptionPane.showMessageDialog(null, "login ou senha incorretas");
                }
            }
        });
        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                frame = new GuiLogin();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width / 2),
                                    tela.height - frame.getSize().height/2);
                frame.setVisible(true); // pelo menos consegui fazer funcionar
            }
        });
    }

}
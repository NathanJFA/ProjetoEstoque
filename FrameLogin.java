
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameLogin extends JFrame{
    
    //private Container contentPane;
    private JTextField txtId;
    private JLabel lId;
    private JLabel lSenha;
    private JPasswordField inSenha;
    private JButton btLogar; 
    private static FrameLogin frameLogin;
    private JButton btCancelar;
    
    public FrameLogin (){
        inicializarComponentes();
        definirEventos();
    }
    
    private void inicializarComponentes (){
        setTitle("Log-in System");
        setBounds(0,0,250,200);
        setLayout(null);
        txtId = new JTextField(5);
        inSenha = new JPasswordField(5);
        lId = new JLabel ("Usuário: ");
        lSenha = new JLabel ("Senha: ");
        btLogar = new JButton("Logar");
        btCancelar = new JButton("Cancelar");
        txtId.setBounds(100, 30, 120, 25);
        inSenha.setBounds(100, 75, 120, 25);
        lId.setBounds(30, 30, 80, 25);
        lSenha.setBounds(30, 75, 80, 25);
        btLogar.setBounds(125,120, 100, 25);
        btCancelar.setBounds(20, 120 ,100,25);
        add(txtId);
        add(lId);
        add(lSenha);
        add(btLogar);
        add(inSenha);
        add(btCancelar);
    }
    private void definirEventos(){
        btLogar.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                String senha = String.valueOf(inSenha.getPassword());
                if(txtId.getText().equals("admin") && senha.equals("admin")){
                    frameLogin.setVisible(false);
                    MainFrame framePrincipal = new MainFrame();
                    framePrincipal.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "Login ou Senha incorreta!!");
                }
            }
        });

        btCancelar.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }

    public static void main (String [] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                frameLogin = new FrameLogin();
                frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frameLogin.setLocation((tela.width - frameLogin.getSize().width) /2, (tela.height - frameLogin.getSize().height) / 2);
                frameLogin.setVisible(true);
            }
        });
    }


}
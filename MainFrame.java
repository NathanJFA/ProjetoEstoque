import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame{
    public AbaSuperior abas;
    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao;

    public MainFrame (){
        inicializarComponentes();
        definirEventos();
    }
    public void inicializarComponentes(){
        setContentPane( new AbaSuperior());
        setExtendedState(MAXIMIZED_BOTH);   
        setTitle("Estoque - Nathec Informática");
        //setBounds(450,250, 800, 600);
        contentPane = getContentPane();
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu ("Arquivo");
        mnArquivo.setMnemonic('A');
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');
        ImageIcon img = new ImageIcon("sair.jpg");
        miSair = new JMenuItem ("Sair", img);
        miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        miBotao = new JMenuItem("Suporte");
        mnArquivo.add(miSair);
        mnExemplos.add(miBotao);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        setJMenuBar(mnBarra);
        
    }
    public void definirEventos(){
        miSair.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        miBotao.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e){
                //vai código aqui para implementar o botão
            }
        });
    }
    public static void abrir(){
        MainFrame mainFrame = new MainFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        mainFrame.setLocation((tela.width - mainFrame.getSize().width) /2, (tela.height - mainFrame.getSize().height) /2);
        mainFrame.setVisible(true);
    }
    public static void main(String[]args){
        abrir();
    }
}
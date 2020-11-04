import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PanelConfig{
    private JButton btBack;
    private JButton btExit;
    private JButton btChange;
    private JButton btSave;
    public static JPanel plConfig = new JPanel();

    public PanelConfig(){
        inicializarComponentes();
    }
    public void inicializarComponentes(){
        btBack = new JButton("Voltar");
        btBack.setBounds(10, 10, 30, 10);
        btExit = new JButton("Exit");
        btExit.setBounds(40, 10, 30, 10);
        btChange = new JButton("Alterar");
        btChange.setBounds(20, 30 , 30, 10);
        btSave = new JButton("Salvar");
        btSave.setBounds(20, 60, 30, 10);
        plConfig.setLayout(null);
        plConfig.setBackground(Color.BLUE);
        plConfig.setBounds(1500, 0, 500, 700);
        plConfig.add(btBack);
        plConfig.add(btExit);
        plConfig.add(btChange);
        plConfig.add(btSave);
        plConfig.setVisible(true);
        

    }
}

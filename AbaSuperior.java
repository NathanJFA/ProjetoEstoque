import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;



public class AbaSuperior extends JPanel{
    private JTabbedPane tpAbaMain;
    private JPanel panelManutencao;
    private JPanel panelOpcoesM;
    private JPanel panelEstoque;
    private JPanel panelControle;

    private JButton btCadastroM;
    private JButton btEstatisticas;
    private JButton btClientes;
    private JButton btVerificarM;
    private JButton btManutencaoP;



    public AbaSuperior(){
        inicializaComponentes();
        definirEventos();
    }
    public void inicializaComponentes(){
        setLayout(null);
        panelManutencao = new JPanel( null);
        panelOpcoesM = new JPanel(new GridLayout(6,1));

        btCadastroM = new JButton("Cadastrar Manutenção");
        btManutencaoP = new JButton("Manut Pendentes");
        btEstatisticas = new JButton("Verificar Estatisticas");
        btClientes = new JButton("Verificar Clientes");
        btVerificarM = new JButton("Verificar Manutenções");
        panelOpcoesM.add(btCadastroM);
        panelOpcoesM.add(btEstatisticas);
        panelOpcoesM.add(btClientes);
        panelOpcoesM.add(btVerificarM);     
        panelOpcoesM.add(btManutencaoP);  
        panelOpcoesM.setBounds(0,0,200,120);
        //panelOpcoesM.setBackground(Color.BLUE);
        //panelOpcoesM.setForeground(Color.RED);
        panelManutencao.add(panelOpcoesM);
        
        
        panelEstoque = new JPanel (null);

        panelControle = new JPanel(null);

        tpAbaMain = new JTabbedPane();
        tpAbaMain.addTab("Manutenções", panelManutencao);
        tpAbaMain.addTab("Estoque", panelEstoque);
        tpAbaMain.addTab("Controle", panelControle);
        tpAbaMain.setBounds(0,0,1900,1000);
        

        add(tpAbaMain);
    }
    private void definirEventos(){
        btCadastroM.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e){
                panelManutencao.add(Manutencao.panelRegister);
                panelManutencao.add(PanelConfig.plConfig);
                Manutencao mClass = new Manutencao();
                mClass.registerM();
                PanelConfig plC = new PanelConfig();
                plC.inicializarComponentes();
                
            }
        });
    }    

}
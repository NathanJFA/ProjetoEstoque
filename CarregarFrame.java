import javax.swing.*;
import java.awt.*;
public class CarregarFrame extends JFrame {
    public static void main(String [] args){
        JFrame frame = new JFrame("teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new AbaSuperior());
        //frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setBounds(0,0,500,300);
        frame.setVisible(true);
    }
    
}

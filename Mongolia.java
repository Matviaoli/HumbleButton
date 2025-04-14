import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mongolia extends JFrame{
    
    private JButton amendoim, castanha;
    
    public Mongolia(){
        
        super("oleaginosas");
        setLayout(new FlowLayout());
        
        amendoim = new JButton("botão amendoim");
        add(amendoim);
        
        Icon minduim0 = new ImageIcon(getClass().getResource("mindoim0.jpg"));
        Icon minduim1 = new ImageIcon(getClass().getResource("mindoim1.jpg"));
        castanha = new JButton("Botão castanha", minduim0);
        castanha.setRolloverIcon(minduim1);
        add(castanha);
        
        HumbleButton pistache = new HumbleButton();
        castanha.addActionListener(pistache);
        amendoim.addActionListener(pistache);
        
    }
    
    private class HumbleButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(Mongolia.this, String.format("Você precionou: %s", event.getActionCommand()));
        }
        
    }
    
    
}

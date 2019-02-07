
package empresa;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class loop {
    
     void carregandos(){
        Frame f = new Frame(); 
         f.setIconImage(new ImageIcon("icone.png").getImage());
    
         ImageIcon icone = new ImageIcon("carregando2.gif");
         
        JOptionPane pane = new JOptionPane(icone);
        
        final JDialog dialog = pane.createDialog("Setor de entregas");
       
        dialog.setModal(true);
        
        
        Timer timer = new Timer(10 * 1000, new ActionListener() {  
            public void actionPerformed(ActionEvent ev) {  
                dialog.dispose();  
                
            }  

        });  
        timer.setRepeats(false);  
        timer.start();
        dialog.show();  
        timer.stop();  
 
    }  
  
    
}


package empresa;

import java.awt.Frame;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class loop {
    
    public void carregando(){
        Frame f = new Frame(); 
         f.setIconImage(new ImageIcon("icone.png").getImage());
    
         ImageIcon icone = new ImageIcon("people-gif-8.gif");
         JLabel label = new JLabel(icone);
        final JDialog dialog = new JDialog(f,"Setor de entregas",true);
         dialog.add(label);
       
         dialog.setSize(500, 300);
        dialog.setModal(true);
        dialog.setLocationRelativeTo(null); 
        dialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        
        Timer timer = new Timer(1 * 1000, new ActionListener() {  
            public void actionPerformed(ActionEvent ev) {  
                dialog.dispose();  
                
            }  

        });  
        timer.setRepeats(false);  
        timer.start();
        dialog.show();  
        timer.stop();  
 
    }  

        void atualizando(){
        Frame f = new Frame(); 
         f.setIconImage(new ImageIcon("icone.png").getImage());
    
         ImageIcon icone = new ImageIcon("atualizando.gif");
         JLabel label = new JLabel(icone);
        final JDialog dialog = new JDialog(f,"Setor de entregas",true);
         dialog.add(label);
       
         dialog.setSize(300, 180);
        dialog.setModal(true);
        dialog.setLocationRelativeTo(null); 
        dialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        
        Timer timer = new Timer(1 * 1000, new ActionListener() {  
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


package eventos;

import empresa.calendario;
import empresa.empresa;
import empresa.principal;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author atila
 */
public class NovoJogo extends principal{
    calendario data = new calendario();
    empresa entidade = new empresa();
    
    public void newgame(){
    
        JOptionPane.showMessageDialog(null, "Todo progresso será perdido", "Setor Contabil",-1);
        
        int i = JOptionPane.showConfirmDialog(null, "Deseja resetar ?", "Sistema", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if(i==0){
            
            PrintWriter arq = null;
                 try {arq = new PrintWriter("calendario.txt");
                 } catch (FileNotFoundException ex) {}
                 
		    PrintWriter gravarArq = new PrintWriter(arq);
		    gravarArq.printf("01\n1\n2018");
			arq.close();
                    
            try {principal.passagem = data.carregardata();} catch (IOException ex) {}
    super.condicao = true;
        super.capital = 0;
        super.level = 0;
        super.divida =0;
        super.empresa = "DAC Solucoes logisticas";
        
        
            try{entidade.salvardivida((int)divida);}catch(IOException ex){}
            try {entidade.salvardinheiro(capital);} catch (IOException ex) {}
            try {entidade.salvarlv(level);} catch (IOException ex) {}
            
    }     else
        JOptionPane.showMessageDialog(null, "Boa escolha chefe, sei que nao desistiria 'dagente' ", "Setor Contabil",-1);  
}
}

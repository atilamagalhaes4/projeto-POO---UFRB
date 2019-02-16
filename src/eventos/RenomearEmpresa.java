
package eventos;


import empresa.empresa;
import empresa.principal;
import static empresa.principal.capital;
import java.io.IOException;
import javax.swing.JOptionPane;

public class RenomearEmpresa extends principal{
    

    
    public void mudarnome(){
        
            empresa entidade = new empresa();
        
    int i = JOptionPane.showConfirmDialog(null, "Sera cobrado uma pequena taxa de R$ 250 reais, \nestaria de acordo ?","Setor de Contabilidade", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if(i== 0) {
		  super.empresa= JOptionPane.showInputDialog(null, "Digite o nome da empresa", "Setor de Contabilidade",-1);
                super.capital-=250;                
                JOptionPane.showMessageDialog(null, "Vinhemos avisar que foi liberado uma "
				+ "verba para o Setor Contabil de R$ 250 reais\n restando assim " +capital +" no caixa da empresa.", "Setor de RH",-1);
		
                }
                            try {
                entidade.salvardinheiro(capital);                   
                    entidade.salvarnome(empresa);
                 } catch (IOException ex) {}
		
    }
    
}

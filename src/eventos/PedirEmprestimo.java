package eventos;


import empresa.empresa;
import empresa.principal;
import java.io.IOException;
import javax.swing.JOptionPane;

public class PedirEmprestimo extends principal{
             empresa  entidade = new empresa();

    public void dinheiro(){
    if(super.divida>50000){
                JOptionPane.showMessageDialog(null, "Nao conseguimos um novo emprestimo, tente abater a divida e tentaremos denovo","Setor financeiro",-1);
                }
                    else{
                    int i = JOptionPane.showConfirmDialog(null, "Temos em mente que R$ : 5 mil reais é o suficiente, lembrando que terá"
                                + "\n um acrescimo de 10% ao mes.\n"
                                + "Deseja sacar agora ?", "Setor Contabil", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if(i==0){
                    super.capital +=5000;
 			
                    super.divida +=5000;  
                    
                try {entidade.salvardinheiro(capital);} catch (IOException ex) {}
                try {entidade.salvardivida((int)divida);} catch (IOException ex) {}
 }
                    else JOptionPane.showMessageDialog(null, "Volteremos a trabalhar", "Setor Contabil",-1);
                        }
    }
    
}
package eventos;


import empresa.empresa;
import empresa.principal;
import java.io.IOException;
import javax.swing.JOptionPane;



public class Pagar extends principal{
    
float divida = super.divida;    
float capital = super.capital;

public void info (){
    empresa  entidade = new empresa();
    
               if(divida !=0){
                        int i = JOptionPane.showConfirmDialog(null, "A nossa divida esta avaliada em R$ "+divida+", porém  podemos pagar parte da divida.\n Deseja pagar parte ?", "Setor Contabil", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		
                if(i == 0){
                String diminuir = JOptionPane.showInputDialog(null, "Digite o valor a ser transferido separado por '.' para diferenciar os centavos dos reais.\n Lance minimo R$ 1000.0 :", "Setor financeiro",-1);
                
                float teste = capital;
                float preco = 0;
                preco = Float.parseFloat(diminuir);
                
                if(preco>=1000){
                if(capital>=preco){
                    this.capital = capital - preco;
                    this.divida = divida - preco;
                    
                JOptionPane.showMessageDialog(null, "Dinheiro transferido","Setor financeiro",-1);
                super.capital = this.capital;
                super.divida = this.divida;
                
            try {entidade.salvardinheiro(capital);} catch (IOException ex) {}
            try {    entidade.salvardivida((int)divida);} catch (IOException ex) {}
            
                }
                else JOptionPane.showMessageDialog(null, "Nao temos tanto dinheiro assim.","Banco",-1);
            }
                else JOptionPane.showMessageDialog(null, "Lance minimo R$ 1000.0 reais","Banco",-1);
                }
                }
}


}

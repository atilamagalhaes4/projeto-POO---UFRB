
package eventos;

import empresa.calendario;
import empresa.empresa;
import empresa.loop;
import empresa.principal;
import empresa.terceirizadas;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author atila
 */
public class Logica extends principal{

    
    
    
    public float avancar(int linha, Object[][]dados) throws IOException{
       
        empresa entidade = new empresa();
        terceirizadas terceirizadas = new terceirizadas();
        calendario data = new calendario();  
        
                
           String nome = (String) dados [linha][0];
            int pagamento = (int) dados [linha][1];
            int lv = (int)dados [linha][2];            
            int custo = (int) dados [linha][3];         
            int taxa = (int) dados [linha][4];
 
             
              JOptionPane.showMessageDialog(null,"Empresa : "+nome+"\nPagamento R$: "+pagamento
                    +"\nCusto R$: "+custo+"\nLevel necessario : "+lv+"\nPossiveis taxas R$: "+taxa, "Dados da empresa",-1);//(null, );
         
            if(lv>level){
                
                   JOptionPane.showMessageDialog(null, "Não temos o requisito necessario para atender a (o)  "+nome
                           + ".","Setor contabil",-1);
                }
                
                else{
                
            
                    int i = JOptionPane.showConfirmDialog(null, "Podemos confirmar o acordo ?", "Setor contabil", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                   
                    if(i==0){
                
            
            Random gerador = new Random();        
            float saldo = pagamento;
            int a = gerador.nextInt();
            saldo =saldo-custo;// Já foi descontado o custo da viagem
            
            
            while(a<0)   a = gerador.nextInt();
                
                
            if(a%2==0) // vai ter acidente
            saldo=saldo-(float)taxa;

            else 
            taxa =0;

            
        loop loop = new loop();           
        
        loop.carregando();
        
        
            JOptionPane.showMessageDialog(null, "Empresa :    "+nome+"\nPagamento    "+pagamento
          +"\nCusto              "+custo+"\nTaxas             " +taxa+"\n-------------\nTotal R$ : "+saldo,"Relatório",-1);
            
          capital = capital+saldo;
          
          return capital;
            }            
        }
            return capital;
}

}

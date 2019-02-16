package eventos;


import empresa.empresa;
import empresa.principal;
import java.io.IOException;
import javax.swing.JOptionPane;

public class SubirLv extends principal{

public String up(){
                    float valor = 0;
                                empresa  entidade = new empresa();

                    
                    if(level ==0)       valor = (float) 6102.0;	
                    if(level ==1)	valor = (float) 7102.0;
                    if(level ==2)	valor = (float) 8102.0;
                    if(level ==3)	valor = (float) 9102.0;
                    if(level ==4)	valor = (float) 10102.0;
                    if(level ==5)	valor = (float) 11102.0;
                    if(level ==6)	valor = (float) 12102.0;
                    if(level ==7)	valor = (float) 13102.0;
                    if(level ==8)	valor = (float) 14102.0;
                    if(level ==9)	valor = (float) 15102.0;	
                        
                if(level <10){
 int i = JOptionPane.showConfirmDialog(null, "Nós estamos no lv "+level+", para essa operacao sera necessario "+valor
        +"\nEstaria de acordo ?" , "Setor contabil", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                  
 if(i==0){
     if(capital>valor){
                            
                        capital= capital-valor;        
                        
                        level = level+1;
                            
 }
     else JOptionPane.showMessageDialog(null, "Nao temos o dinheiro necessario","Setor Contabil",-1);
                            }
                        }
                    else        
                    JOptionPane.showMessageDialog(null, "Chegamos ao level limite","Setor COntabil",-1);
                    
                try {entidade.salvarlv(level); } catch (IOException ex) {}
                try {entidade.salvardinheiro(capital);} catch (IOException ex) {}
                
                    if(level ==0)       return "Level da empresa : "+level+" (nao formada)";	
                    if(level ==1)	return "Level da empresa : "+level+" (novato)";
                    if(level ==2)	return "Level da empresa : "+level+" (iniciante)";
                    if(level ==3)	return "Level da empresa : "+level+" (amador)";
                    if(level ==4)	return "Level da empresa : "+level+" (intermediario)";
                    if(level ==5)	return "Level da empresa : "+level+" (empreendedor)";
                    if(level ==6)	return "Level da empresa : "+level+" (empresario)";
                    if(level ==7)	return "Level da empresa : "+level+" (avancado)";
                    if(level ==8)	return "Level da empresa : "+level+" (profissional)";
                    if(level ==9)	return "Level da empresa : "+level+" (mestre)";	
                    if(level ==10)	return "Level da empresa : "+level+" (lenda)";     
         
                    return null;
}
    
}

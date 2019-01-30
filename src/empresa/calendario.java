package empresa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;



public class calendario extends inicio {
 
    empresa entidade = new empresa();
    float montante ;
    int lv = inicio.level;
    float divida;
 
    static int    dia;
    static int    mes;
    static int    ano;
    
public void funcionarios(){ // ágar salario dos funcionarios


    if(lv ==1){
montante = 102+62+82+52;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 102.0\n"
                + "Internet R$ 62.0\nEnergia : R$ 82.0\nAgua : R$ 52.0\n\nTotal : R$"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==2){
    montante = 152+92+102+72;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 152.0\n"
                + "Internet R$ 92.0\nEnergia : R$ 102.0\nAgua : R$ 72.0\n\nTotal : R$"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==3){
    montante = 192+92+121+102;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 192.0\n"
                + "Internet R$ 92.0\nEnergia : R$ 121.0\nAgua : R$ 102.0\n\nTotal : R$"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==4){
    montante = 222+132+122+122;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 222.0\n"
                + "Internet R$ 132.0\nEnergia : R$ 122.0\nAgua : R$ 122.0\n\nTotal : R$"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==5){
        montante = 272+172+152+167;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 272.0\n"
                + "Internet R$ 172.0\nEnergia : R$ 152.0\nAgua : R$ 167.0\n\nTotal : R$"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==6){
            montante = 322+212+192+207;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 322.0\n"
                + "Internet R$ 212.0\nEnergia : R$ 192.0\nAgua : R$ 207.0\n\nTotal : R$"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==7){
                montante = 372+252+222+257;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 372.0\n"
                + "Internet R$ 252.0\nEnergia : R$ 222.0\nAgua : R$ 257.0\n\nTotal : R$"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }  
    if(lv ==8){
                    montante = 402+292+272+307;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 372.0\n"
                + "Internet R$ 252.0\nEnergia : R$ 222.0\nAgua : R$ 257.0\n\nTotal : R$"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==9){
                        montante = 452+342+312+367;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 452.0\n"
                + "Internet R$ 342.0\nEnergia : R$ 312.0\nAgua : R$ 367.0\n\nTotal : R$"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }         
    if(lv ==10){
                            montante = 521+414+371+412;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 521.0\n"
                + "Internet R$ 414.0\nEnergia : R$ 371.0\nAgua : R$ 412.0\n\nTotal : R$"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }

    

}
    


    public String tempo() throws IOException{ // passagem do tempo
    
    dia = dia+7;

    if(dia>=30){
    funcionarios();
    dia= 1;
    mes++;
    // Divida do mes se houver
    this.divida = inicio.divida;
    if(divida >0){
    montante = divida*(float)0.5;
    montante = montante +  divida;
    inicio.divida = montante;
    entidade.salvardivida((int)montante);
    }
    ////
    if(mes>12){
    mes =1;
    ano++;
    }
    }
    
    return conversao();
    }

                    void salvardata() throws IOException{
		    PrintWriter arq = new PrintWriter("calendario.txt");
		    PrintWriter gravarArq = new PrintWriter(arq);
		    gravarArq.printf(dia+"\n"+mes+"\n"+ano);
			arq.close();
		}
                    
		String carregardata() throws IOException {//O slogan da empresa
		    FileReader arq = new FileReader("calendario.txt");
		    BufferedReader lerArq = new BufferedReader(arq);
		    String linha = lerArq.readLine();
                    int i=0;
		    while(linha != null) {	// se tiver nome no registro ele apenas colocara no lugar.
		    
                   
                    if(i==0){
                    dia = Integer.parseInt(linha);
                     
                    }
                    if(i==1){
                    mes =  Integer.parseInt(linha);
                   
                    }
                    if(i==2){
                    ano =  Integer.parseInt(linha);
                    
                    }    
		    	linha = lerArq.readLine();
                   i++;
                    }
                    arq.close();

                    return conversao();
		}
                
    public String conversao(){
    
      String um = " janeiro "; 
      String dois = " fevereiro ";        
      String tres = " março ";        
      String quatro =" abril ";
      String cinco = " maio ";
      String seis = " junho ";
      String sete = " julho ";
      String oito = " agosto ";
      String nove = " setembro ";
      String dez = " outubro ";
      String onze = " novembro ";
      String doze = " dezembro ";
      
      if (mes == 1) return dia+um+ano;
      if (mes == 2) return dia+dois+ano;
      if (mes == 3) return dia+tres+ano;
      if (mes == 4) return dia+quatro+ano;
      if (mes == 5) return dia+cinco+ano;
      if (mes == 6) return dia+seis+ano;
      if (mes == 7) return dia+sete+ano;
      if (mes == 8) return dia+oito+ano;
      if (mes == 9) return dia+nove+ano;
      if (mes == 10)return dia+dez+ano;
      if (mes == 11)return dia+onze+ano;
      if (mes == 12)return dia+doze+ano;
        
              return dia+"."+mes+"."+ano;
    }
}
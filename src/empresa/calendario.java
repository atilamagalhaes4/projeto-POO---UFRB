package empresa;

import static empresa.principal.capital;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class calendario extends principal {
 
    empresa entidade = new empresa();
    float montante ;
    int lv = super.level;
    float divida;
 
    static int    dia;
    static int    mes;
    static int    ano;
    
public void funcionarios(){ // ágar salario dos funcionarios



    if(lv ==1){
montante = 1102+162+182+152+501;
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 1102.0\n"
                + "Internet R$ 162.0\nEnergia : R$ 182.0\nAgua : R$ 152.0\nOutros : R$ 501.0\n-------------\nTotal : R$ -"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==2){
    montante = 1152+192+1102+172+604;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 1152.0\n"
                + "Internet R$ 192.0\nEnergia : R$ 1102.0\nAgua : R$ 172.0\nOutros : R$ 604.0\n-------------\nTotal : R$ -"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==3){
    montante = 1192+192+1121+1102+701+891;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 1192.0\n"
                + "Internet R$ 192.0\nEnergia : R$ 1121.0\nAgua : R$ 1102.0\nOutros : R$ 891.0\n-------------\nTotal : R$ -"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==4){
    montante = 1222+1132+1122+1122+1002;
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 1222.0\n"
                + "Internet R$ 1132.0\nEnergia : R$ 1122.0\nAgua : R$ 1122.0\nOutros : R$ 1002.0\n-------------\nTotal : R$ -"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==5){
        montante = 1272+1172+1152+1167+1201;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 1272.0\n"
                + "Internet R$ 1172.0\nEnergia : R$ 1152.0\nAgua : R$ 1167.0\nOutros : R$ 1201.0\n-------------\nTotal : R$ -"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==6){
            montante = 2322+1212+2192+1207+2449;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 2322.0\n"
                + "Internet R$ 1212.0\nEnergia : R$ 2192.0\nAgua : R$ 1207.0\nOutros : R$ 2449.0\n-------------\nTotal : R$ -"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==7){
                montante = 2372+2252+2222+2257+2500;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 2372.0\n"
                + "Internet R$ 2252.0\nEnergia : R$ 2222.0\nAgua : R$ 2257.0\nOutros : R$ 2500.0\n-------------\nTotal : R$ -"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }  
    if(lv ==8){
                    montante = 3402+3292+3272+3307+3500;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 3372.0\n"
                + "Internet R$ 3252.0\nEnergia : R$ 3222.0\nAgua : R$ 3257.0\nOutros : R$ 3500.0\n-------------\nTotal : R$ -"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }
    if(lv ==9){
                        montante = 4052+3442+3712+3967+4002;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 4052.0\n"
                + "Internet R$ 3442.0\nEnergia : R$ 3712.0\nAgua : R$ 3967.0\nOutros : R$ 4002.0\n-------------\nTotal : R$ -"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }         
    if(lv ==10){
                            montante = 4521+4414+4371+3412+4901;    
        JOptionPane.showMessageDialog(null, "Relatório Mensal \n\nSalario de funcionarios lv "+lv+" :  R$ 4521.0\n"
                + "Internet R$ 4414.0\nEnergia : R$ 4371.0\nAgua : R$ 3412.0\nOutros : R$ 4901.0\n-------------\nTotal : R$ -"+montante, "Setor financeiro", 1);    
    super.capital = super.capital - montante;
    }

if(super.capital<0){
 fundo.setIcon(new ImageIcon("animacao2.png"));
    super.avancar.setEnabled(false);
    super.bt1.setEnabled(false);
    super.bt2.setEnabled(false);
    super.bt3.setEnabled(false);
    super.bt4.setEnabled(false);
    super.bt5.setEnabled(false);
    super.bt7.setEnabled(false);
    System.out.println("entrou");
}

}
    


    public String tempo() throws IOException{ // passagem do tempo
    
    dia = dia+7;

    if(dia>=30){
    funcionarios();
    dia= 1;
    mes++;
    // Divida do mes se houver
    this.divida = super.divida;
    if(divida >0){
    montante = divida*(float)0.1;
    montante = montante +  divida;
    super.divida = montante;
    entidade.salvardivida((int)divida);
    }
    ////
    if(mes>12){
    mes =1;
    ano++;
    }
    }
    
    return conversao();
    }

                public void salvardata() throws IOException{
                    PrintWriter arq = new PrintWriter("calendario.txt");
		    PrintWriter gravarArq = new PrintWriter(arq);
		    gravarArq.printf(dia+"\n"+mes+"\n"+ano);
			arq.close();
                            
		}
                    
		public String carregardata() throws IOException {//
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
                
                if(mes ==0){
                mes =01;
                dia=01;
                ano = 2018;
                }    
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
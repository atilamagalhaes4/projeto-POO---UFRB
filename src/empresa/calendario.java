package empresa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;



public class calendario {
String carregar;
    String Data;
    static int    dia;
    static int    mes;
    static int    ano;
    

    
    public String tempo(){
    
    dia = dia+7;

    if(dia>=30){ 
    dia= 1;
    mes++;
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
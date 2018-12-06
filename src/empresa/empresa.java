package empresa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class empresa {

	String nome;

	String colocarnomenaempresa() throws IOException{ // colocara nome na empresa
		
	    FileReader arq = new FileReader("nome da empresa.txt");
	    BufferedReader lerArq = new BufferedReader(arq);
	    String linha = lerArq.readLine();
	    
	    while(linha != null) {	// se tiver nome no registro ele apenas colocara no lugar.
	    	nome = linha;
	    	linha = lerArq.readLine();// Olha a proxima linha
	    }

	    arq.close();
		return (String)nome;
}
	
	void armazenandonome(String nome) throws IOException {
	    FileWriter arq = new FileWriter("nome da empresa.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	     gravarArq.printf(nome);
		arq.close();
	}

		String proprietario() throws IOException{//Colocara o nome do proprietario
		    FileReader arq = new FileReader("nome do proprietario.txt");
		    BufferedReader lerArq = new BufferedReader(arq);
		    String linha = lerArq.readLine();
		    
		    while(linha != null) {	// se tiver nome no registro ele apenas colocara no lugar.
		    	nome = linha;
		    	linha = lerArq.readLine();
		    }
			
		    arq.close();
			return nome;
		}
                
    void armazenandoproprietario(String nome) throws IOException{
    PrintWriter arq = new PrintWriter("nome do proprietario.txt");
    PrintWriter gravarArq = new PrintWriter(arq);
    gravarArq.printf(nome);
	arq.close();
}
    
		String slogan() throws IOException {//O slogan da empresa
		    FileReader arq = new FileReader("slogan da empresa.txt");
		    BufferedReader lerArq = new BufferedReader(arq);
		    String linha = lerArq.readLine();
			
		    while(linha != null) {	// se tiver nome no registro ele apenas colocara no lugar.
		    	nome = linha;
		    	linha = lerArq.readLine();
		    }
		    arq.close();
		    return nome;
		}
		void armazenandoslogan(String nome) throws IOException{
		    PrintWriter arq = new PrintWriter("slogan da empresa.txt");
		    PrintWriter gravarArq = new PrintWriter(arq);
		    gravarArq.printf(nome);
			arq.close();
		}
		
}
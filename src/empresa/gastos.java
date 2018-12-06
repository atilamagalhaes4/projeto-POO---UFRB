package empresa;

import java.util.Random;
import java.util.Scanner;


public class gastos extends inicio{

Scanner l = new Scanner(System.in);
Random gerador = new Random();
int a = gerador.nextInt();
float custo;

	float acidente(float valor){ // recebera por parametros o lucro
		
		
		while(a<0||a>100) {
			a = gerador.nextInt();
		}
		
		if(a%2==0) {
		 custo = (float)0.4*valor;
			
		}
		
		if(a%2!=0) {
			custo = 0;
		}

		return custo;
	}
	
	
	// salario eh do departamento pessoal
	
	
	float viagem(float valor){// recebera por parametro o lucro
	
		custo = valor*(float)0.3;
		
		return custo;
	}

}
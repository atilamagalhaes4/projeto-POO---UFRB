package empresa;
import javax.swing.JOptionPane;

public class emprestimo extends inicio{


	float montante;
	float valor = 5000;

	float mensalidade (boolean emprestimo) {
		
		if(emprestimo == true) {
		montante = valor*(float)0.05;
		montante += valor;
		return montante;
		}
		
		else return 0;
	}
	
	
}
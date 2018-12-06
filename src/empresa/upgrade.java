package empresa;

import javax.swing.JOptionPane;

public class upgrade {

	void viajando(){
		
		JOptionPane.showMessageDialog(null, "O nosso caminhao esta no percurso", "Setor de Contabilidade", 1);
		
	}
	
	void garagem() {
		
		JOptionPane.showMessageDialog(null, "Estamos com ele pronto para outro servico chefe", "Equipe de mecanica", 1);
		
	}

	boolean lvl(int lv){
		
		
		if(lv <2) {

			int i = JOptionPane.showConfirmDialog(null, "Chefe,  o upgrade custara R$ 8,920 reais"
					+ " deseja continuar ?","Setor de Contabilidade",1);
                        if(i == JOptionPane.YES_OPTION)
                            return true;
                }
		
		if(lv >1&&lv<3) { 
			int i = JOptionPane.showConfirmDialog(null, "Chefe,  o upgrade custara R$ 8,320 reais"
					+ " deseja continuar ?","Setor de Contabilidade",1);
		        if(i == JOptionPane.YES_OPTION)
                            return true;
                        
                }
            return false;
        }
        }
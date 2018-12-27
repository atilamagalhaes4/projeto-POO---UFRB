package empresa;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;







public class inicio extends JFrame implements ActionListener{

	static int level = 1;
	static String empresa;
	static String proprietario;
	static String slogan;
	static float capital;
        static float divida;
        static boolean emprestimo = false;
	int linha;


       
	JLabel label9;//empresa
        JLabel label10;//proprietario
	JLabel label11;//slogan
        JLabel label8;//capital
	JLabel label6; //level
        JLabel label12;




	

	//declaracao dos botoes
	JButton avancar = new JButton("Avançar");
	JButton bt1 = new JButton("Clique");
	JButton bt2 = new JButton("Clique");
	JButton bt3 = new JButton("Clique");	
	JButton bt4 = new JButton("Clique");
	JButton bt5 = new JButton("Clique");
	JButton bt6 = new JButton("Clique");
	JButton bt7 = new JButton("Sair");

                

        
	public void tela() {
            terceirizadas inicio = new terceirizadas();
		setLayout(null);


    //Linhas relacionados a tabela
        Object [][] dados = (Object[][]) inicio.empresas();        	
        String [] colunas = {"Empresa", "Pagamento R$",
            "Lv necessario", "Custo", "Possiveis taxas"};
        
        JCheckBox  marcar = new JCheckBox();
        

        
        JTable tabela = new JTable(dados, colunas){
                @Override
                public boolean isCellEditable(int row, int column) {
                return false;
                }
        };
        
        tabela.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            ListSelectionModel lsm = (ListSelectionModel) e.getSource();
            
            if(!lsm.isSelectionEmpty()) 
                
                linha = tabela.getSelectedRow();//pega o indice da linha na tabela
               });
        
        
        JScrollPane rolagem = new JScrollPane(tabela);
        add(rolagem);
        rolagem.setBounds(10,300,750, 300);

        
        
        
        
    // Nomes para os botoes
		JLabel label1 = new JLabel("Renomeará a sua empresa");
		JLabel label2 = new JLabel("Alterará o Slogan");
		JLabel label3 = new JLabel("Alterará o dono da empresa");
		JLabel label4 = new JLabel("Ver opções de emprestimo");
		JLabel label5 = new JLabel("Pagar divida");	
		label6 = new JLabel("Level da empresa "+level);
		JLabel label7 = new JLabel("Subir level da empresa");
		
                 label12 = new JLabel("Divida com o banco R$ : "+divida);

                label9 = new JLabel(empresa);

                label10 = new JLabel(proprietario);
                label11 = new JLabel(slogan);
		label8 = new JLabel("Capital R$ "+capital);
		
		
		//Coloca acoes nos botoes
		avancar.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);		
		bt7.addActionListener(this);
		
		
		
            
            
		//Localizacao dos botoes
		bt1.setBounds(770, 300, 100, 30);
		bt2.setBounds(770, 330, 100, 30);
		bt3.setBounds(770, 360, 100, 30);
		bt4.setBounds(770, 390, 100, 30);
		bt5.setBounds(770, 420, 100, 30);
		bt6.setBounds(770, 450,100, 30);
		bt7.setBounds(10, 620, 100, 30);
		avancar.setBounds(1068, 620, 100, 30);
		
		//Localizacao dos textos dos botoes
		label1.setBounds(885, 298, 260, 30);
		label2.setBounds(885, 328, 260, 30);
		label3.setBounds(885, 358, 260, 30);
		label4.setBounds(885, 388, 260, 30);
		label5.setBounds(885, 418, 260, 30);
		label7.setBounds(885, 448, 260, 30);
		
		
		//3 tipos de fonte
            Font pequena = new Font("TimesRoman",Font.PLAIN, 14);
            Font media = new Font("TimesRoman",Font.PLAIN, 18);
            Font grande = new Font("TimesRoman",Font.PLAIN, 27);
	
                
		label6.setBounds(900, 20, 260, 30); // level da empresa
                label6.setFont(pequena);
		label8.setBounds(900, 40, 260, 40); // capital
                label8.setFont(pequena);
		label12.setBounds(900, 60, 260, 50); // divida
		label12.setFont(pequena);
                
		// Texto sobre empresa slogan e proprietario 
		label9.setBounds(10, 10, 800, 80);
                label9.setFont(grande);
		label11.setBounds(10, 50, 800, 80);
                label11.setFont(media);
                label10.setBounds(10, 80, 800, 80);
                label10.setFont(media);
		
		//Adiciona os botoes  a tela
		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		add(bt5);
		add(bt6);
		add(bt7);
		add(avancar);


                //Adiciona os textos na	
		add(label1);
		add(label2);
		add(label3);		
		add(label4);
		add(label5);	
		add(label6);	
		add(label7);	
		add(label8);	
		add(label9);	
		add(label10);	
		add(label11);	
		add(label12);
				
                
		//Definicoes da tela
                Panel painel = new Panel();
                add(painel);
                setTitle("Programação voltado á logistica - UFRB");
		setSize(1200, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	
        }
	
	
	public static void main(String[] args) throws IOException{

            JFrame f = new JFrame();
            background fundo = new background();
            inicio classe = new inicio();
            empresa  entidade = new empresa();
            terceirizadas servico = new terceirizadas();
                
                divida = entidade.carregardivida();
                level = entidade.carregarlv();
		capital = entidade.carregardinheiro();
		empresa = entidade.colocarnomenaempresa();
		slogan = entidade.slogan();
		proprietario = entidade.proprietario();
		 		 
		 classe.tela();
                  f.add(fundo);
				
        }
        
        
        
        @Override
	public void actionPerformed(ActionEvent e) {// funcoes do botao
		
		empresa  entidade = new empresa();


		
		
		if(e.getSource()== bt1) {//botao pra mudar o nome da empresa
	
			int i = JOptionPane.showConfirmDialog(null, "Olá chefe, sera cobrado uma pequena taxa de R$ 250 reais, \nestaria de acordo ?", "Setor de Contabilidade", 1);
			if(i== JOptionPane.YES_OPTION) {
		  empresa= JOptionPane.showInputDialog(null, "Digite o nome da empresa", "Setor de Contabilidade", 1);

		try {
			entidade.armazenandonome(empresa);
		capital-=250;
                        entidade.salvardinheiro(capital);
                label8.setText("Capital R$ "+capital);
		  label9.setText(empresa);
                JOptionPane.showMessageDialog(null, "Vinhemos avisar que foi liberado uma "
				+ "verba para o Setor Contabil de R$ 250 reais\n restando assim " +capital +" no caixa da empresa.", "Setor de RH", 1);
		} catch (IOException e1) {
		
			JOptionPane.showMessageDialog(null, "Nao foi possivel fazer a operacao\n chame o programador.", "Error de programacao", 0);
		} 
			}
			else JOptionPane.showMessageDialog(null, "O senhor Optou por nao alterar, voltando ao trabalho.","Setor de Contabilidade", 1);
		}
		
		if(e.getSource()== bt2) {//botao pra mudar de dono

                int i = JOptionPane.showConfirmDialog(null, "Olá chefe, sera cobrado uma pequena taxa de R$ 250 reais, \nestaria de acordo ?", "Setor de Contabilidade", 1);
			if(i== JOptionPane.YES_OPTION) {
			proprietario = JOptionPane.showInputDialog(null, "Digite o nome do dono da empresa", "Setor de Contabilidade", 1);
			
			try {
				entidade.armazenandoproprietario(proprietario);
                                capital =capital-250;
                                entidade.salvardinheiro(capital);
                                label8.setText("Capital R$ " +capital);
                                label10.setText(proprietario);

			} catch (IOException e1) {
			
				JOptionPane.showMessageDialog(null, "Nao foi possivel fazer a operacao\n chame o programador.", "Error de programacao", 0);
			}
                        }
                        else  JOptionPane.showMessageDialog(null, "O senhor Optou por nao alterar, voltando ao trabalho.","Setor de Contabilidade", 1);
			}

		if(e.getSource()== bt3) { // botao do slogan da empresa
                int i = JOptionPane.showConfirmDialog(null, "Olá chefe, sera cobrado uma pequena taxa de R$ 250 reais, \nestaria de acordo ?", "Setor de Contabilidade", 1);
			if(i== JOptionPane.YES_OPTION) {
						
			this.slogan = JOptionPane.showInputDialog(null, "Digite seu slogan ", "Setor de Contabilidade", 1);
			
			try {
				entidade.armazenandoslogan(slogan);
				  label11.setText(slogan);
                                  capital = capital-250;
                                  entidade.salvardinheiro(capital);
                                  label8.setText("Capital R$ " +capital);
			} catch (IOException e1) {
			
				JOptionPane.showMessageDialog(null, "Nao foi possivel fazer a operacao\n chame o programador.", "Error de programacao", 0);
			}
                        }
                        else  JOptionPane.showMessageDialog(null, "O senhor Optou por nao alterar, voltando ao trabalho.","Setor de Contabilidade", 1);
			
			}
		if(e.getSource()== bt4) { // botao do emprestimo
			
			int i = JOptionPane.showConfirmDialog(null, "Podemos lhe emprestar R$ : 5 mil reais."
                                + "\nDeseja sacar agora ?", "Nosso banco", 1);

                    if(i==0){
                    try {
                    capital +=5000;
                        entidade.salvardinheiro(capital);
                        label8.setText("Capital R$ " +capital);
                    } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro com o capital, chame o programador.");
                    
                    }
			
                        
                    try {
                    divida = divida +5000;
                    entidade.salvardivida((int)divida);
                    label12.setText("Divida com o banco R$ : "+divida);
                    
                    } catch (IOException ex) {
                        Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
                    else JOptionPane.showMessageDialog(null, "Volteremos a trabalhar", "Setor Contabil", 1);
                        }
                
		if(e.getSource()== bt5) { // Pagar divida
		
                    if(divida !=0){
                int i = JOptionPane.showConfirmDialog(null, "A nossa divida"
                        + "esta avaliada em R$ "+divida+"Podemos transferir o dinheiro ?", "Setor Contabil", 1);
		
                if(i == 0){
                capital= capital-divida;        
                divida = 0;
                
                try {
                        entidade.salvardinheiro(capital);
                    } catch (IOException ex) {
                        Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
                    }


                    try {
                        entidade.salvardivida((int)divida);
                    } catch (IOException ex) {
                        Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    label12.setText("Divida com o banco R$ : "+divida);
                    label8.setText("Capital R$ " +capital);
                }
                else JOptionPane.showMessageDialog(null, "Sempre podemos pagar depois chefe :P");
                    }
                
                else JOptionPane.showMessageDialog(null, "Não temos nenhuma divida fora do normal");
		}
                    if(e.getSource()== bt6) {// subir lv da empresa
		
			if (capital <9000) {
				JOptionPane.showMessageDialog(null, "Chefe, não temos tanto dinheiro assim para melhorar a empresa,"
                                        + "o upgrade custará em torne de 9000 reais. ", "Setor de COntabilidade", 1);				
			}
			
                        else{

                            try {
                        capital= capital-8920;        
                        entidade.salvardinheiro(capital);
                        level = level+1;
                        entidade.salvarlv(level);
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, "O progrograma se manifestou de forma inesperada, recomenda-se reiniciar.", "Erro interno", 1);
                            }
                        label6.setText("Level da empresa "+level);
                        label8.setText("Capital R$ " +capital);
                        }
			
			
		}
		if(e.getSource()== bt7) {//sair
			System.exit(0);
		}
	
                	if(e.getSource()== avancar) {//avançar
                terceirizadas terceirizadas = new terceirizadas();
                
            Object [][] dados =(Object[][]) terceirizadas.empresas();
                
           String nome = (String) dados [linha][0];
            int pagamento = (int) dados [linha][1];
            int lv = (int)dados [linha][2];            
            int custo = (int) dados [linha][3];         
            int acidente = (int) dados [linha][4];
            Random gerador = new Random();
             
             
             
         
            if(lv>level){
                
                   JOptionPane.showMessageDialog(null, "Não temos como atender a "+nome
                           + ", temos que melhorar um pouco mais a nossa estrutura.","Setor contabil",1);
                }
                
                else{
            
                    int i = JOptionPane.showConfirmDialog(null, "Empresa : "+nome+"\nPagamento R$: "+pagamento
                    +"\nCusto R$: "+custo+"\nLevel necessario : "+lv+"\nPossiveis taxas R$: "+acidente, "Setor contabil", 1);
                   
                    if(i==0){
                    
            float saldo = pagamento;
            int a = gerador.nextInt();
            saldo =saldo-custo;// Já foi descontado o custo da viagem
            
            
            while(a<0)   a = gerador.nextInt();
                
                
            if(a%2==0) // vai ter acidente
            saldo=saldo-(float)acidente;

            else 
            acidente =0;

                    try { // salvar o dinheiro no banco
             capital = capital+saldo;
             entidade.salvardinheiro(capital);
            label8.setText("Capital R$ " +capital);
                    } catch (IOException ex) {
                        Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 

               JOptionPane.showMessageDialog(null, "Empresa :    "+nome+"\n\nPagamento    "+pagamento
          +"\nCusto              "+custo+"\nTaxas             " +acidente+"\n\nTotal                "+saldo,"Setor Contabil",1);
            

                        
}
}                
}           
}	
}

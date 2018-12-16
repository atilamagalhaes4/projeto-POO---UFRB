package empresa;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class inicio extends JFrame implements ActionListener{

	static int level = 1;
	static String empresa;
	static String proprietario;
	static String slogan;
	static float capital;
    static boolean emprestimo = false;
	int linha;
	
	JLabel label9;//empresa
        JLabel label10;//proprietario
	JLabel label11;//slogan
        JLabel label8;//capital
	JLabel label6; //level
	
	
         
	Font fonte1 = new Font("Times Roman",Font.ITALIC,40 );
	Font fonte2 = new Font("Times Roman",Font.ITALIC,20 );
	Font fonte3 = new Font("Times Roman",Font.ITALIC,25 );
	Font fonte4 = new Font("Times Roman",Font.ITALIC,15 );
	

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

    //Linhas relacionados a tabela
        Object [][] dados = (Object[][]) inicio.empresas();        	
        String [] colunas = {"Empresa", "Pagamento R$",
            "Lv necessario", "Custo", "Possiveis acidentes"};
        
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
        rolagem.setBounds(10,300, 900, 350);

        
    // Nomes para os botoes
		JLabel label1 = new JLabel("Renomeará a sua empresa");
		JLabel label2 = new JLabel("Alterará o Slogan");
		JLabel label3 = new JLabel("Alterará o dono da empresa");
		JLabel label4 = new JLabel("Ver opções de emprestimo (em manutenção)");
		JLabel label5 = new JLabel("Status do caminhão (em manutenção)");	
		label6 = new JLabel("Level da empresa "+level);
		JLabel label7 = new JLabel("Subir level da empresa");
		
                JLabel label12 = new JLabel("Pressione para sair do jogo");

                label9 = new JLabel(empresa);
                label10 = new JLabel(proprietario);
                label11 = new JLabel(slogan);
		label8 = new JLabel("Capital "+capital);
		
		
		//Coloca acoes nos botoes
		avancar.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);		
		bt7.addActionListener(this);
		
		
		
		setLayout(null);
		
		//Localizacao dos botoes

		bt1.setBounds(995, 330, 100, 30);
		bt2.setBounds(995, 390, 100, 30);
		bt3.setBounds(995, 360, 100, 30);
		bt4.setBounds(995, 420, 100, 30);
		bt5.setBounds(995, 450, 100, 30);
		bt6.setBounds(995, 480,100, 30);
		bt7.setBounds(995, 510, 100, 30);
		avancar.setBounds(1100, 600, 200, 100);
		
		//Localizacao dos textos dos botoes
		label1.setBounds(1110, 330, 260, 30);
		label2.setBounds(1110, 360, 260, 30);
		label3.setBounds(1110, 390, 260, 30);
		label4.setBounds(1110, 420, 260, 30);
		label5.setBounds(1110, 450, 260, 30);
		label7.setBounds(1110, 480, 260, 30);
		label12.setBounds(1110, 510, 260, 30);
		
		
		label6.setBounds(1000, 10, 260, 30); // level da empresa
		label6.setFont(fonte4);
		label8.setBounds(1000, 40, 260, 40); // capital
		label8.setFont(fonte4);
		
		
		// Texto sobre empresa slogan e proprietario respectivamente
		
		label9.setBounds(10, 10, 800, 80);
		label9.setFont(fonte1);
		label10.setBounds(10, 80, 800, 80);
		label11.setBounds(10, 50, 800, 80);
		label11.setFont(fonte2);
		
		//Adiciona os botoes  dos mesmos
		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		add(bt5);
		add(bt6);
		add(bt7);
		add(avancar);

                //Adiciona os textos dos mesmos		
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
		setExtendedState(MAXIMIZED_BOTH);
                setTitle("Programação voltado á logistica - UFRB");
		setSize(1100, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	
        }
	
	
	public static void main(String[] args) throws IOException{


		inicio classe = new inicio();
		empresa  entidade = new empresa();
		terceirizadas servico = new terceirizadas();
                

                level = entidade.carregarlv();
		capital = entidade.dinheiro();
		empresa = entidade.colocarnomenaempresa();
		slogan = entidade.slogan();
		proprietario = entidade.proprietario();
		 		 
		 classe.tela();

		
		
	}
	
	

        @Override
	public void actionPerformed(ActionEvent e) {// funcoes do botao
		
		empresa  entidade = new empresa();
		upgrade estrutura = new upgrade();
		
		
		if(e.getSource()== bt1) {//botao pra mudar o nome da empresa
	
			int i = JOptionPane.showConfirmDialog(null, "Olá chefe, sera cobrado uma pequena taxa de R$ 250 reais, \nestaria de acordo ?", "Setor de Contabilidade", 1);
			if(i== JOptionPane.YES_OPTION) {
		  empresa= JOptionPane.showInputDialog(null, "Digite o nome da empresa", "Setor de Contabilidade", 1);

		try {
			entidade.armazenandonome(empresa);
		capital-=250;
                        entidade.salvardinheiro(capital);
                label8.setText("Capital "+capital);
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
                                label8.setText("Capital " +capital);
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
                                  label8.setText("Capital " +capital);
			} catch (IOException e1) {
			
				JOptionPane.showMessageDialog(null, "Nao foi possivel fazer a operacao\n chame o programador.", "Error de programacao", 0);
			}
                        }
                        else  JOptionPane.showMessageDialog(null, "O senhor Optou por nao alterar, voltando ao trabalho.","Setor de Contabilidade", 1);
			
			}
		if(e.getSource()== bt4) { // botao do emprestimo
			
			
			JOptionPane.showMessageDialog(null, "Contactei o banco", "Setor de Contabilidade", 1);
			JOptionPane.showMessageDialog(null, "Fique de olho, eles cobrarão 5% do \nvalor que irão lhe oferecer"
			+ " ao mês.","Setor de Contabilidade", 0);
			JOptionPane.showMessageDialog(null, "Passarei o contato deles.", "Setor de Contabilidade", 1);			

			int i = JOptionPane.showConfirmDialog(null, "Olá, estamos autorizados a lhe emprestar "
					+ "R$ : 5 mil reais.\nDeseja pegar agora ?", "Nosso banco", 1);

			if (i == 0) {

                            try {
                                entidade.salvardinheiro(capital);
			emprestimo = true;
			capital +=5000;
                        label8.setText("Capital " +capital);
                            } catch (IOException ex) {    
                          JOptionPane.showMessageDialog(null, "Ocorreu um erro interno, por favor saia do jogo e entre novamente","Programador", 1);
			}
			}
			else 
			emprestimo = false;
			
			}
		if(e.getSource()== bt5) { // Status do caminhão
		
			estrutura.garagem();
			
			estrutura.viajando();
			
		}
		if(e.getSource()== bt6) {// subir lv da empresa
		
			if (capital <9000) {
				JOptionPane.showMessageDialog(null, "Chefe, não temos tanto dinheiro assim para melhorar a empresa,"
                                        + "o upgrade custará em torne de 9000 reais. ", "Setor de COntabilidade", 1);				
			}
			
                        else{
                        boolean condicao = estrutura.lvl(level);
                        if(condicao == true)
                            try {
                        capital= capital-8920;        
                        entidade.salvardinheiro(capital);
                        level = level+1;
                        entidade.salvarlv(level);
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, "O progrograma se manifestou de forma inesperada, recomenda-se reiniciar.", "Erro interno", 1);
                            }
                        label6.setText("Level da empresa "+level);
                        label8.setText("Capital " +capital);
                        }
			
			
		}
		if(e.getSource()== bt7) {//sair
			System.exit(0);
		}
	
                	if(e.getSource()== avancar) {//sair
			JOptionPane.showMessageDialog(null, "A linha eh "+linha, "Teste",1);
		}
	
	}

}
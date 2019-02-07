package empresa;


import java.awt.Color;
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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.Timer;







public class inicio extends JFrame implements ActionListener{

	static int level;
	static String empresa;
	static float capital;
        static float divida;
        static boolean emprestimo = false;
	int linha;
        static String passagem;


        JLabel label7; 
	JLabel label9;//empresa
        JLabel label8;//capital
	JLabel label6; //level
        JLabel label2;
        JLabel label10;
        JLabel label11;
        JLabel label12;
        JScrollPane rolagem;
        JTable tabela;

JLabel fundo = new JLabel(new ImageIcon("animacao1.png"));
//           ImageIcon icone = new ImageIcon("icone.png");
    

	

	//declaracao dos botoes
	JButton avancar = new JButton("Avançar");
	JButton bt1 = new JButton("Clique");
	JButton bt2 = new JButton("Clique");
	JButton bt3 = new JButton("Clique");	
	JButton bt4 = new JButton("Clique");
	JButton bt5 = new JButton("Sair");
        JButton bt6 = new JButton("Clique");//terminar jogo
        JButton bt7 = new JButton("Clique");//sobre o desenvolvedor        
        Object [][] dados;
 
        
	public void tela() throws IOException {
        
            terceirizadas terceiros = new terceirizadas();


    //Linhas relacionados a tabela
        dados = (Object[][]) terceiros.lista;
        
        String [] colunas = {"Empresa", "Pagamento R$",
            "Lv necessario", "Custo", "Possiveis taxas"};
        
        JCheckBox  marcar = new JCheckBox();
        

        
        tabela = new JTable(dados, colunas){
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
        
        
        rolagem = new JScrollPane(tabela);
        add(rolagem);
        rolagem.setBounds(10,300,750, 300);
        

        
        
        
        
    // Nomes para os botoes
		JLabel label1 = new JLabel("Renomeará a sua empresa");
		JLabel label3 = new JLabel("Pedir emprestimo");
		JLabel label4 = new JLabel("Pagar divida");
		JLabel label5 = new JLabel("Subir level da empresa");	
		
                
                label6 = new JLabel("Level da empresa "+level);
		label2 = new JLabel("Divida com o banco R$ : "+divida);
                label9 = new JLabel(empresa);
                label8 = new JLabel("Capital R$ "+capital);
		label7 = new JLabel("Tudo pronto :");
		label10 = new JLabel(passagem);
                label11 = new JLabel("Terminar o jogo");
                label12 = new JLabel("Sobre o desenvolvedor");
        
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
		bt2.setBounds(770, 350, 100, 30);
		bt3.setBounds(770, 400, 100, 30);
		bt4.setBounds(770, 450, 100, 30);
                bt6.setBounds(770, 500,100,30);
                bt7.setBounds(770, 550, 100, 30);
                bt5.setBounds(10,  620, 100, 30);
	   avancar.setBounds(1068, 620, 100, 30);
		
           
            
		//Localizacao dos textos dos botoes
		label1.setBounds(885, 300, 260, 30);
		label3.setBounds(885, 350, 260, 30);
		label4.setBounds(885, 400, 260, 30);
		label5.setBounds(885, 450, 260, 30);
		label7.setBounds(985, 620, 150, 30);
                label11.setBounds(885,500,100,30);
                label12.setBounds(885, 550, 260, 30);

		//3 tipos de fonte
            Font pequena = new Font("TimesRoman",Font.PLAIN, 14);
            Font grande = new Font("TimesRoman",Font.PLAIN, 37);
            Font media = new Font("TimesRoman",Font.PLAIN, 20);	
                
		label6.setBounds(900, 20, 260, 30); // level da empresa
                label6.setFont(pequena);
		label8.setBounds(900, 40, 260, 40); // capital
                label8.setFont(pequena);
		label2.setBounds(900, 60, 260, 50); // divida
		label2.setFont(pequena);
		label10.setBounds(20, 80, 200, 50);
                label10.setFont(media);
		label10.setForeground(Color.WHITE);
                
		// Texto sobre empresa 
		label9.setBounds(10, 10, 800, 80);
                label9.setFont(grande);
		label9.setForeground(Color.WHITE);
		

                //Adiciona os botoes  a tela
		add(bt1);//empresa
		add(bt2);//emprestimo
		add(bt3);//pagar emprestimo
		add(bt4);//lv da empresa
                add(bt6); //terminar o jogo
		add(bt5);//sair
                add(bt7);//sobre o desenvolvedor
		add(avancar);
                add(label7);

                //Adiciona os textos na	
		add(label1);
		add(label3);		
		add(label4);
		add(label5);	
		add(label6);
		add(label8);	
		add(label9);	
		add(label2);
                add(label10);
                add(label11);
		add(label12);
                
		//Definicoes da tela

            setIconImage(new ImageIcon("icone.png").getImage());
            setTitle("Programação voltado á logistica - UFRB");
            add(fundo);    
            fundo.setBounds(0, 0,1200, 700);
            setSize(1200, 700);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);
	
        }
	

        
	
	public static void main(String[] args) throws IOException{
            
            inicio classe = new inicio();
            empresa  entidade = new empresa();
            terceirizadas servicos = new terceirizadas();
            calendario data = new calendario();
            
                servicos.listarempresas();
                passagem = data.carregardata();
                divida = entidade.carregardivida();
                level = entidade.carregarlv();
		capital = entidade.carregardinheiro();
		empresa = entidade.carregarempresa();
		
		
		 classe.tela();
				
        }
        
        
        
        
       @Override

       public void actionPerformed(ActionEvent e) {// funcoes do botao
		
             calendario data = new calendario();
            empresa  entidade = new empresa();
            terceirizadas terceirizadas = new terceirizadas();
            inicio inicio = new inicio();

		
		
		if(e.getSource()== bt1) {//botao pra mudar o nome da empresa
	
			int i = JOptionPane.showConfirmDialog(null, "Sera cobrado uma pequena taxa de R$ 250 reais, \nestaria de acordo ?","Setor de Contabilidade", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if(i== 0) {
		  empresa= JOptionPane.showInputDialog(null, "Digite o nome da empresa", "Setor de Contabilidade",-1);

		try {entidade.salvarnome(empresa);
		capital-=250;
                        entidade.salvardinheiro(capital);
                label8.setText("Capital R$ "+capital);
		  label9.setText(empresa);
                JOptionPane.showMessageDialog(null, "Vinhemos avisar que foi liberado uma "
				+ "verba para o Setor Contabil de R$ 250 reais\n restando assim " +capital +" no caixa da empresa.", "Setor de RH",-1);
		} catch (IOException e1) {} 
			}
			else JOptionPane.showMessageDialog(null, "Voce Optou por nao alterar.","Setor de Contabilidade",-1);
		}
		
			
		if(e.getSource()== bt2) { // botao do emprestimo
			
			int i = JOptionPane.showConfirmDialog(null, "Temos em mente que R$ : 5 mil reais, é o suficiente, lembrando que terá"
                                + "\n um acrescimo de 5% ao mes e de 10% no dia do pagamento.\n"
                                + "Deseja sacar agora ?", "Setor Contabil", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if(i==0){
                    try {
                    capital +=5000;
                        entidade.salvardinheiro(capital);
                        label8.setText("Capital R$ " +capital);
                    } catch (IOException ex) {}
			
                        
                    try {
                    divida = divida +5000;
                    entidade.salvardivida((int)divida);
                    label2.setText("Divida com o banco R$ : "+divida);
                    
                    } catch (IOException ex) {}
                    }
                    else JOptionPane.showMessageDialog(null, "Volteremos a trabalhar", "Setor Contabil",-1);
                        }
                
		if(e.getSource()== bt3) { // Pagar divida
		int percentual = (int) (divida*0.1);
                    if(divida !=0){
                        int i = JOptionPane.showConfirmDialog(null, "A nossa divida esta avaliada em R$ "+divida+",\n porém com juros de 10% "
                                + "teremos um acressimo de "+percentual+".0"
                        +"\n Podemos tentar transferir o dinheiro ?", "Setor Contabil", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		
                if(i == 0){
                if(capital<divida) JOptionPane.showMessageDialog(null, "Voce nao tem o dinheiro suficiente para essa operação","Setor Contabil",-1);
                
                else{
                
                float montante = divida +percentual;
                capital= (int)capital-montante;        
                divida = 0;
                
                try {entidade.salvardinheiro(capital);} catch (IOException ex) {}


                try {entidade.salvardivida((int)divida);} catch (IOException ex) {}

                    label2.setText("Divida com o banco R$ : "+divida);
                    label8.setText("Capital R$ " +capital);
                }
                }
                else JOptionPane.showMessageDialog(null, "Sempre temos a opcao de pagar depois", "Setor de Contabilidade",-1);
                    }
                
                else JOptionPane.showMessageDialog(null, "Não temos nenhuma divida fora do normal", "Setorf de Contabilidade",-1);
		}
                
                
                    if(e.getSource()== bt4) {// subir lv da empresa
		
			if (capital <9000) {
				JOptionPane.showMessageDialog(null, "Cada upgrade custa em torno de "
                                        + "aproximadamente 9 mil reais", "Setor de Contabilidade",-1);				
			}
			
                        
                        
                        else{
                        
                            if(level <10){
                            try {
                        capital= capital-8920;        
                        entidade.salvardinheiro(capital);
                        level = level+1;
                        entidade.salvarlv(level);
                            } catch (IOException ex) {}
                        label6.setText("Level da empresa "+level);
                        label8.setText("Capital R$ " +capital);
                        }
                    else        
                    JOptionPane.showMessageDialog(null, "Voce chegou ao level limite","Setor COntabil",-1);
                        
                        }
			}
			
		
                    
                    
                    
		if(e.getSource()== bt5) {//sair
			System.exit(0);
		}
	
                	if(e.getSource()== avancar) {//avançar
                
            Object [][] dados =(Object[][]) terceirizadas.lista;
                
           String nome = (String) dados [linha][0];
            int pagamento = (int) dados [linha][1];
            int lv = (int)dados [linha][2];            
            int custo = (int) dados [linha][3];         
            int taxa = (int) dados [linha][4];
 
             
              JOptionPane.showMessageDialog(null,"Empresa : "+nome+"\nPagamento R$: "+pagamento
                    +"\nCusto R$: "+custo+"\nLevel necessario : "+lv+"\nPossiveis taxas R$: "+taxa, "Dados da empresa",-1);//(null, );
         
            if(lv>level){
                
                   JOptionPane.showMessageDialog(null, "Não temos o requisito necessario para atender a (o)  "+nome
                           + ".","Setor contabil",-1);
                }
                
                else{
                
               
            
                    int i = JOptionPane.showConfirmDialog(null, "Podemos confirmar o acordo ?", "Setor contabil", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                   
                    if(i==0){
                
            
            Random gerador = new Random();        
            float saldo = pagamento;
            int a = gerador.nextInt();
            saldo =saldo-custo;// Já foi descontado o custo da viagem
            
            
            while(a<0)   a = gerador.nextInt();
                
                
            if(a%2==0) // vai ter acidente
            saldo=saldo-(float)taxa;

            else 
            taxa =0;

            label7.setText("Preparando");    
            
        loop loop = new loop();           

                avancar.setEnabled(false);
        
        loop.carregandos();
        
        label7.setText("Tudo pronto :");
        avancar.setEnabled(true);

            try {
            JOptionPane.showMessageDialog(null, "Empresa :    "+nome+"\nPagamento    "+pagamento
          +"\nCusto              "+custo+"\nTaxas             " +taxa+"\n-------------\nTotal R$ : "+saldo,"Relatório",-1);
            
 capital = capital+saldo;

            label8.setText("Capital R$ " +capital);            

             label10.setText(data.tempo());
           

            } catch (IOException ex) {}
;
            
                 label2.setText("Divida com o banco R$ : "+divida);
            label8.setText("Capital R$ "+capital);
            
            try {entidade.salvardinheiro(capital);} catch (IOException ex) {}
            try {data.salvardata();} catch (IOException ex) {}
                    
            
            int linha;      
            terceirizadas.listarempresas();
            this.dados = terceirizadas.lista;
            for(linha=0;linha<80;linha++){
                                        
            tabela.setValueAt(this.dados [linha][0], linha, 0);
                
            tabela.setValueAt(this.dados [linha][1], linha, 1);
            
            tabela.setValueAt(this.dados [linha][2], linha, 2);
                
            tabela.setValueAt(this.dados [linha][3], linha, 3);
                
            tabela.setValueAt(this.dados [linha][4], linha, 4);
            }
            
            }
          
                    


     
            
}
}  
	if(e.getSource()== bt6) { // terminar o jogo
        
            
            if(capital >= 15000&&level ==10&&divida ==0){
            
        JOptionPane.showMessageDialog(null, "Felizmente(ou infelizmente) voce chegou ao fim :'/", "Setor Contabil",-1);
        
        int i = JOptionPane.showConfirmDialog(null, "Deseja resetar ?", "Sistema", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if(i==0){
        capital = 0;
        level = 0;
 
        label8.setText("Capital R$ "+capital);
        label6.setText("Level da empresa "+level);
        
            try {entidade.salvardinheiro(capital);} catch (IOException ex) {}
            try {entidade.salvarlv(level);} catch (IOException ex) {}
            
        }
        
            }
            
            else
        JOptionPane.showMessageDialog(null, "Pre-requisitos \n\nLv 10\nDivida R$ 0.0\nCapital R$ 15000.0", "Setor Contabil",-1);
       
        
        }
        	if(e.getSource()== bt7) {
                
            JOptionPane.showMessageDialog(null, "Programador : Atila Magalhaes\n"
                    +"Alvo : Conclusão da materia De POO (Principios a Orientacão a objetos)\n"
                    + "Professor : Guilherme Araújo \n3º Semestre (2018.2)\n"
                    + "Objetivo :  Desenvolver um  algoritmo que simule o \nfuncionamento de uma empresa voltado a logística","UFRB",-1);
                    
                }
}           
}	
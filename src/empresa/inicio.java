package empresa;


import static empresa.calendario.dia;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.Timer;







public class inicio extends JFrame implements ActionListener{

	static int level;
	static String empresa;
	static float capital;
        static float divida;
        static boolean condicao;
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
        JButton bt6 = new JButton("Clique");//novo jogo
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
                label11 = new JLabel("Novo Jogo");
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
                add(bt6); //novo jogo
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
	
public void falir(){
if(capital<0){
            fundo.setIcon(new ImageIcon("animacao2.png"));
            bt1.setEnabled(false);
            bt2.setEnabled(false);
            bt3.setEnabled(false);
            bt4.setEnabled(false);
            bt5.setEnabled(false);
            bt7.setEnabled(false);
//JOptionPane.showMessageDialog(null, "A empresa nao teve dinheiro para pagar os funcionarios, sendo assim a empresa faliu.\n Inicie um novo jogo");            
}
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
		classe.falir();
		
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
		}
		
			
		if(e.getSource()== bt2) { // botao do emprestimo
			
		if(divida>50000){
                JOptionPane.showMessageDialog(null, "Nao conseguimos um novo emprestimo, tente abater a divida e tentaremos denovo","Setor financeiro",-1);
                }
                    else{
                    int i = JOptionPane.showConfirmDialog(null, "Temos em mente que R$ : 5 mil reais é o suficiente, lembrando que terá"
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
       }
		if(e.getSource()== bt3) { // Pagar divida

                    if(divida !=0){
                        int i = JOptionPane.showConfirmDialog(null, "A nossa divida esta avaliada em R$ "+divida+", porém  podemos pagar parte da divida.\n Deseja pagar parte ?", "Setor Contabil", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		
                if(i == 0){
                String diminuir = JOptionPane.showInputDialog(null, "Digite o valor a ser transferido separado por '.' para diferenciar os centavos dos reais.\n Lance minimo R$ 1000.0 :", "Setor financeiro",-1);
                
                float teste = capital;
                float preco = 0;
                preco = Float.parseFloat(diminuir);
                
                if(preco>=1000){
                if(capital>=preco){
                    capital = capital - preco;
                    divida = divida - preco;
                    try {
                    entidade.salvardinheiro(capital);
                    entidade.salvardivida((int)divida);
                    label8.setText("Capital R$ " +capital);
                    label2.setText("Divida com o banco R$ : "+divida);
                    } catch (IOException ex) {}
                JOptionPane.showMessageDialog(null, "Dinheiro transferido","Setor financeiro",-1);
                }else JOptionPane.showMessageDialog(null, "Nao temos tanto dinheiro assim.","Banco",-1);
            }else JOptionPane.showMessageDialog(null, "Lance minimo R$ 1000.0 reais","Banco",-1);
                }
                }
                }
                    if(e.getSource()== bt4) {// subir lv da empresa
		
                    float valor = 0;
                    
                    if(level ==0)       valor = (float) 6102.0;	
                    if(level ==1)	valor = (float) 7102.0;
                    if(level ==2)	valor = (float) 8102.0;
                    if(level ==3)	valor = (float) 9102.0;
                    if(level ==4)	valor = (float) 10102.0;
                    if(level ==5)	valor = (float) 11102.0;
                    if(level ==6)	valor = (float) 12102.0;
                    if(level ==7)	valor = (float) 13102.0;
                    if(level ==8)	valor = (float) 14102.0;
                    if(level ==9)	valor = (float) 15102.0;	
                        
                            if(level <10){
 int i = JOptionPane.showConfirmDialog(null, "Nós estamos no lv "+level+", para essa operacao sera necessario "+valor
        +"\nEstaria de acordo ?" , "Setor contabil", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                  
 if(i==0){
     if(capital>valor){
                            try {
                        capital= capital-valor;        
                        entidade.salvardinheiro(capital);
                        level = level+1;
                        entidade.salvarlv(level);
                            } catch (IOException ex) {}
                        label6.setText("Level da empresa "+level);
                        label8.setText("Capital R$ " +capital);
 }
     else JOptionPane.showConfirmDialog(null, "Nao temos o dinheiro necessario","Setor COntabil",-1);
                            }
                        }
                    else        
                    JOptionPane.showMessageDialog(null, "Chegamos ao level limite","Setor COntabil",-1);
                        
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
        
            try {
            JOptionPane.showMessageDialog(null, "Empresa :    "+nome+"\nPagamento    "+pagamento
          +"\nCusto              "+custo+"\nTaxas             " +taxa+"\n-------------\nTotal R$ : "+saldo,"Relatório",-1);
            
 capital = capital+saldo;

            label8.setText("Capital R$ " +capital);            
             label10.setText(data.tempo());
            } catch (IOException ex) {}

            if(condicao == true){
            fundo.setIcon(new ImageIcon("animacao2.png"));
            JOptionPane.showMessageDialog(null, "A empresa nao teve dinheiro para pagar os funcionarios, sendo assim a empresa faliu.\n Inicie um novo jogo");
            bt1.setEnabled(false);
            bt2.setEnabled(false);
            bt3.setEnabled(false);
            bt4.setEnabled(false);
            bt5.setEnabled(false);
            bt7.setEnabled(false);
            }
            
            label2.setText("Divida com o banco R$ : "+divida);
            label8.setText("Capital R$ "+capital);
            
            try {entidade.salvardinheiro(capital);} catch (IOException ex) {}
            try {data.salvardata();} catch (IOException ex) {}
                    
            
            if(capital>0){
            int linha;
            loop.atualizando();
            terceirizadas.listarempresas();
            avancar.setEnabled(true);
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
}  
	if(e.getSource()== bt6) { // novo jogo
        
        JOptionPane.showMessageDialog(null, "Todo progresso será perdido", "Setor Contabil",-1);
        
        int i = JOptionPane.showConfirmDialog(null, "Deseja resetar ?", "Sistema", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if(i==0){
            
            PrintWriter arq = null;
                 try {arq = new PrintWriter("calendario.txt");
                 } catch (FileNotFoundException ex) {}
                 
		    PrintWriter gravarArq = new PrintWriter(arq);
		    gravarArq.printf("01\n1\n2018");
			arq.close();
                    
            try {passagem = data.carregardata();
            } catch (IOException ex) {}
    
        capital = 0;
        level = 0;
        divida =0;
        
                    label10.setText(passagem);
                    label6.setText("Level da empresa "+level);
                    label8.setText("Capital R$ " +capital);
                    label2.setText("Divida com o banco R$ : "+divida);
        
            try{entidade.salvardivida((int)divida);}catch(IOException ex){}
            try {entidade.salvardinheiro(capital);} catch (IOException ex) {}
            try {entidade.salvarlv(level);} catch (IOException ex) {}
            condicao = false;
            bt1.setEnabled(true);
            bt2.setEnabled(true);
            bt3.setEnabled(true);
            bt4.setEnabled(true);
            bt5.setEnabled(true);
            bt7.setEnabled(true);
            avancar.setEnabled(true);
            fundo.setIcon(new ImageIcon("animacao1.png"));
            
        }
        
            else
        JOptionPane.showMessageDialog(null, "Boa escolha chefe, sei que nao desistiria 'dagente' ", "Setor Contabil",-1);
       
            }
            
        
        	if(e.getSource()== bt7) {
                
            JOptionPane.showMessageDialog(null, "Programador : Atila Magalhaes\n"
                    +"Alvo : Conclusão da materia De POO (Principios a Orientacão a objetos)\n"
                    + "Professor : Guilherme Araújo \n3º Semestre (2018.2)\n"
                    + "Objetivo :  Desenvolver um  algoritmo que simule o \nfuncionamento de uma empresa voltado a logística","UFRB",-1);
                    
                }
}           
}	
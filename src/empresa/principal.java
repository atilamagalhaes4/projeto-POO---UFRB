package empresa;


import eventos.Logica;
import eventos.NovoJogo;
import eventos.Pagar;
import eventos.PedirEmprestimo;
import eventos.RenomearEmpresa;
import eventos.SubirLv;
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

/**
 *
 * @author atila
 */

public class principal extends JFrame implements ActionListener{

	public static int level;
	public static String empresa;
	public static float capital;
        public static float divida;
        public static boolean condicao;
	public int linha;
        public static String passagem;


        JLabel label7; 
	JLabel label9;//empresa
        JLabel label8;//capital
	JLabel label6; //level
        JLabel label2;
        public JLabel label10;
        JLabel label11;
        JLabel label12;
        JScrollPane rolagem;
        JTable tabela;

JLabel fundo = new JLabel(new ImageIcon("animacao1.png"));
//           ImageIcon icone = new ImageIcon("icone.png");
    

	

	//declaracao dos botoes
	public JButton avancar = new JButton("Avançar");
	public JButton bt1 = new JButton("Clique");
	public JButton bt2 = new JButton("Clique");
	public JButton bt3 = new JButton("Clique");	
	public JButton bt4 = new JButton("Clique");
	public JButton bt5 = new JButton("Sair");
        public JButton bt6 = new JButton("Clique");//novo jogo
        public JButton bt7 = new JButton("Clique");//sobre o desenvolvedor        
        public Object [][] dados;
 
        
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
		
                    if(level ==0)       label6 = new JLabel("Level da empresa : "+level+" (nao formada)");	
                    if(level ==1)	label6 = new JLabel("Level da empresa : "+level+" (novato)");
                    if(level ==2)	label6 = new JLabel("Level da empresa : "+level+" (iniciante)");
                    if(level ==3)	label6 = new JLabel("Level da empresa : "+level+" (amador)");
                    if(level ==4)	label6 = new JLabel("Level da empresa : "+level+" (intermediario)");
                    if(level ==5)	label6 = new JLabel("Level da empresa : "+level+" (empreendedor)");
                    if(level ==6)	label6 = new JLabel("Level da empresa : "+level+" (empresario)");
                    if(level ==7)	label6 = new JLabel("Level da empresa : "+level+" (avancado)");
                    if(level ==8)	label6 = new JLabel("Level da empresa : "+level+" (profissional)");
                    if(level ==9)	label6 = new JLabel("Level da empresa : "+level+" (mestre)");	
                    if(level ==10)	label6 = new JLabel("Level da empresa : "+level+" (lenda)");     
                
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
                
		label6.setBounds(894, 20, 260, 30); // level da empresa
                label6.setFont(pequena);
		label8.setBounds(894, 40, 260, 40); // capital
                label8.setFont(pequena);
		label2.setBounds(894, 60, 260, 50); // divida
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
    avancar.setEnabled(false);
    bt1.setEnabled(false);
    bt2.setEnabled(false);
    bt3.setEnabled(false);
    bt4.setEnabled(false);
    bt5.setEnabled(false);
    bt7.setEnabled(false);
}         
}
        
	
	public static void main(String[] args) throws IOException{
            
            principal classe = new principal();
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
            principal inicio = new principal();

		
		
		if(e.getSource()== bt1) {//botao pra mudar o nome da empresa
                    RenomearEmpresa nome = new RenomearEmpresa();
                    nome.mudarnome();
                    label8.setText("Capital R$ "+capital);
		  label9.setText(empresa);
                
		}
		
			
		if(e.getSource()== bt2) { // botao do emprestimo
		
                PedirEmprestimo pedir = new PedirEmprestimo();
                pedir.dinheiro();
		    label8.setText("Capital R$ " +capital);
                    label2.setText("Divida com o banco R$ : "+divida);
                }
		if(e.getSource()== bt3) { // Pagar divida
                Pagar pagar = new Pagar();
                 pagar.info();   
                    label8.setText("Capital R$ " +capital);
                    label2.setText("Divida com o banco R$ : "+divida);
                
                }
                    if(e.getSource()== bt4) {// subir lv da empresa
		SubirLv lvup = new SubirLv();
                String qualLv = lvup.up();
                label6.setText(qualLv);
            label8.setText("Capital R$ " +capital);
            label2.setText("Divida com o banco R$ : "+divida);    
                        }
		
		if(e.getSource()== bt5) {//sair
    try {           entidade.salvardinheiro(capital);   
                    entidade.salvarlv(level);
                    entidade.salvarnome(empresa);
                    entidade.salvardivida((int)divida);
} catch (IOException ex) {}
            
			System.exit(0);
		}
	
                	if(e.getSource()== avancar) {
            Logica avancar = new Logica();
            
            float teste =capital;
                 try {this.capital = avancar.avancar(linha, dados);} catch (IOException ex) {}
            
            
            
                 if(teste!=capital){
                 try {label10.setText(data.tempo());} catch (IOException ex) {}
          
            try {entidade.salvardinheiro(capital);} catch (IOException ex) {}
            try {data.salvardata();} catch (IOException ex) {}
            
            label2.setText("Divida com o banco R$ : "+divida);  
            
            loop loop = new loop();
                   loop.atualizando();
            terceirizadas.listarempresas();
            
            dados = terceirizadas.lista;

            for(int l=0;l<80;l++){
                                        
            tabela.setValueAt(this.dados [l][0], l, 0);
                
            tabela.setValueAt(this.dados [l][1], l, 1);
            
            tabela.setValueAt(this.dados [l][2], l, 2);
                
            tabela.setValueAt(this.dados [l][3], l, 3);
                
            tabela.setValueAt(this.dados [l][4], l, 4);
            }
                 }
                 
  if(capital<0){
    this.avancar.setEnabled(false);
    bt1.setEnabled(false);
    bt2.setEnabled(false);
    bt3.setEnabled(false);
    bt4.setEnabled(false);
    bt5.setEnabled(false);
    bt7.setEnabled(false);
fundo.setIcon(new ImageIcon("animacao2.png"));
} 
                     
            label2.setText("Divida com o banco R$ : "+divida);
            label8.setText("Capital R$ "+capital);
            
            }
            
            
          
	if(e.getSource()== bt6) { // novo jogo
        
        NovoJogo novo = new NovoJogo();
        novo.newgame();
                    label10.setText(passagem);
                    label6.setText("Level da empresa : "+level+" (novato)");
                    label8.setText("Capital R$ " +capital);
                    label2.setText("Divida com o banco R$ : "+divida);
        
            if(condicao ==true){
                
            bt1.setEnabled(true);
            bt2.setEnabled(true);
            bt3.setEnabled(true);
            bt4.setEnabled(true);
            bt5.setEnabled(true);
            bt7.setEnabled(true);
            avancar.setEnabled(true);
            fundo.setIcon(new ImageIcon("animacao1.png"));
            }
       
            }
            
        
        	if(e.getSource()== bt7) {
                
            JOptionPane.showMessageDialog(null, "Programador : Atila Magalhaes\n"
                    +"Alvo : Conclusão da materia De POO (Principios a Orientacão a objetos)\n"
                    + "Professor : Guilherme Araújo \n3º Semestre (2018.2)\n"
                    + "Objetivo :  Desenvolver um  algoritmo que simule o \nfuncionamento de uma empresa voltado a logística","UFRB",-1);
                    
                }
}           
}	
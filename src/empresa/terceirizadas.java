package empresa;

import java.util.Random;



public class terceirizadas {

    static Object [] [] selecionada;

    
        Object listarempresas() {
            
        Random aleatorio = new Random();
        
            int numero = aleatorio.nextInt(4);
            
            while (numero ==0)   numero = aleatorio.nextInt(4);
           
               if(numero ==1){
            
            Object [] []dados1={
//            'Empresa' 'Pagamento'  'Lv'  'Custo' 'taxa'
		{"Carnes FriVaca",1932,7,774,475},
		{"Vendas de peças automotivas",1682,6,876,370},
		{"Licor d'Santo",2432,8,572,780},
		{"Gamer Pacotes",1832,6,434,669},
		{"Estofados champ's",4199,10,876,940},
		{"Andaimes peças de construcao",1332,6,693,746},
		{"Pet Shop Canino's",1832,8,422,760},
		{"Peças de rolimã",1432,5,794,447},
		{"Bolsas masculinas",2100,9,341,720},
		{"Cursos online de Libras",3042,10,738,462},
		{"Produtos de limpeza todo dia",1199,3,476,236},
		{"Acquario Mania SA",732,2,293,149},
		{"Roupas Cosplay SI",832,2,322,161},
		{"Peças de celulares Ind",832,2,294,142},
		{"Guarda-chuvas import",600,1,241,121},
		{"AutoCarr Industria",842,2,338,119},
		{"La casa do papel",992,2,412,206},
		{"Remedios a la brasil",1232,3,493,247},
		{"Groove's Streeth LA",932,2,376,189},
		{"Mangarantibatibaia Sa",532,1,213,106},
                };
            this.selecionada = dados1;
             return dados1;
               }
               
               if(numero ==2){
                   
             Object [] [] dados2 ={
            
                {"Industria Limitada Dosket's",1042,4,476,283},
		{"SA Hidropônica",1392,5,399,359},
		{"Auto peças Industrial",1500,6,508,339},
		{"Futs'ball Equipamentos",1238,6,323,564},
		{"Parmaleite Indus",1232,5,468,284},
		{"Coca Coll",1732,6,692,496},
		{"Polmito Trans",2032,8,704,432},
		{"Agua Oxigenada LTDA",1532,8,413,606},
		{"Fabricacao de Joias",1242,6,778,338},
		{"Cubo magicos e compania",1393,5,619,260},
		{"Joanete e implementações",1500,8,678,439},
		{"Bjuteria Online",1298,6,393,850},
		{"Serviços Nuddle Autentics",3232,10,568,480},
		{"Industria TECBA SA",1232,3,493,247},
		{"Industria Alimenticia SDA",932,2,376,185},
		{"FretePao dois irmaos CC",532,1,213,106},
		{"AgroNegocios Limitada",942,2,376,183},
		{"LocoMovel SA",792,2,319,159},
		{"Sapataria Luis Industrial",1300,3,478,239},
		{"Futebol Mania Industria",938,2,293,464},
        };
             this.selecionada = dados2;
              return dados2;
        }
               if(numero ==3){ 
              Object [] [] dados3 ={
            {"Mel mecanicas LDA",942,2,378,138},
		{"Pericolígenos d'pressao",793,2,319,160},
		{"Encomendexpress Logos",1300,3,478,239},
		{"Banannas de Pijama Indus",938,2,293,150},
		{"Maos mecanicas LTDA",632,2,368,180},
		{"Mowsquito eletronicos",1232,3,493,245},
		{"Arduinos e Arduvinos",932,2,374,175},
		{"Relogios e c&a",482,1,376,170},
		{"Uniformes Masculinos KKK",932,2,372,180},
		{"auto peças secular SA",832,2,334,169},
		{"Flechas e arcos dbquedos",1199,3,476,240},
		{"Sexx shop Anonimo e C&a",732,2,293,146},
		{"Maos mecanicas LTDA",832,2,322,160},
		{"Papelaria Papel da casa",832,2,294,147},
		{"Karaokê do Karatê SA",600,1,241,120},
		{"Doces da Vovo e C&a",842,2,338,162},
                {"Circuitos mecanicos LTDA",1200,4,472,256},
		{"Industria Basekall SA",1432,5,523,347},
		{"Alimentos & Cia LTDA",1132,4,396,245},
		{"Bicoitos dois Reis ",1432,5,293,196},
        };
              this.selecionada = dados3;
              return dados3;
               }
               
               if(numero ==4){ 
             Object [] [] dados4 ={
            {"Maos mecanicas LTDA",992,2,412,206},
		{"Elasticos e Compania",1282,1,492,258},
		{"Papelaria Industrial",1332,8,472,281},
		{"Materiais escolares LTDA",1832,7,534,369},
		{"Plantação Locável",3199,9,776,436},
		{"Lanternas & Luminarias",3232,10,793,1049},
		{"Carregadores Universais",2032,9,422,361},
		{"Organizacao de Eventos",2132,7,494,642},
		{"Armarinho Ball'zar",1200,6,641,321},
		{"Livraria Evangelica",1042,5,338,219},               
		{"Som e equips automotivo",482,1,192,92},
		{"Pardal Express Industrial",932,2,372,181},
		{"Tintas automotivas",832,2,334,169},
		{"Locadora de filmes brasileiros",1292,6,492,256},
		{"FarmBrasil Drogaria",2232,5,793,347},
		{"Queijos & Cia",1432,7,676,489},
		{"PacoLacto AgroDustrial",632,2,368,184},
		{"Koka-kool Bee Lack",1232,3,492,246},
		{"Roupas e modas femininas",932,2,374,132},
                {"Prototipos de aranhas ETC",2232,8,493,445},
        };
            this.selecionada = dados4;
              return dados4;
               }
             
            return null;
        }
        
}
 



	

package empresa;

import java.util.Random;


public class terceirizadas {

    static Object [] [] lista;
    
        void listarempresas() {
        
            Random aleatorio = new Random();
            
            float x, y;
            
            x = aleatorio.nextFloat();
            y = aleatorio.nextFloat();
            
            Object [] []dados={
//            'Empresa' 'Pagamento'  'Lv'  'Custo' 'taxa'
		{"Carnes FriVaca",1932+(int)(1932*x),7,774+(int)(774*x),475+(int)(475*y)},
		{"Vendas de peças automotivas",1682+(int)(1682*y),6,876+(int)(876*y),370+(int)(370*x)},
		{"Licor d'Santo",2432+(int)(2432*x),8,572+(int)(572*y),780+(int)(780*x)},
		{"Gamer Pacotes",1832+(int)(1832*y),6,434+(int)(434*x),669+(int)(669*y)},
		{"Estofados champ's",4199+(int)(4199*x),10,876+(int)(876*y),940+(int)(940)},
		{"Andaimes peças de construcao",1332+(int)(1332*x),6,693+(int)(693*y),746+(int)(746*x)},
		{"Pet Shop Canino's",1832+(int)(1832*y),8,422+(int)(422*y),760+(int)(760*x)},
		{"Peças de rolimã",1432+(int)(1432*x),5,594+(int)(794*y),447+(int)(447*x)},
		{"Bolsas masculinas",2100+(int)(2100*y),9,341+(int)(341*x),720+(int)(720*x)},
		{"Cursos online de Libras",3042+(int)(3042*y),10,798+(int)(798*x),462+(int)(462*y)},
		{"Produtos de limpeza todo dia",1199+(int)(1199*x),8,476+(int)(476*x),236+(int)(236*y)},
		{"Acquario Mania SA",732+(int)(732*y),4,293+(int)(293*y),149+(int)(149*y)},
		{"Roupas Cosplay SI",832+(int)(832*x),4,322+(int)(322*x),161+(int)(161*y)},
		{"Peças de celulares Ind",832+(int)(832*y),6,294+(int)(294*x),142+(int)(142*y)},
		{"Guarda-chuvas import",600+(int)(600*x),3,241+(int)(241*y),121+(int)(121*x)},
		{"AutoCarr Industria",842+(int)(842*y),4,338+(int)(338*x),119+(int)(199*y)},
		{"La casa do papel",992+(int)(992*y),7,412+(int)(412*x),206+(int)(206*y)},
		{"Remedios a la brasil",1232+(int)(1232*x),6,493+(int)(493*y),247+(int)(247*x)},
		{"Groove's Streeth LA",932+(int)(932*y),4,376+(int)(376*x),189+(int)(189*y)},
		{"Mangarantibatibaia Sa",532+(int)(532*x),1,213+(int)(213*y),106+(int)(106*y)},         
                {"Industria Limitada Dosket's",1042+(int)(1042*y),4,476+(int)(476*x),283+(int)(283*y)},
		{"SA Hidropônica",1392+(int)(1392*y),5,399+(int)(399*x),359+(int)(359*y)},
		{"Auto peças Industrial",1500+(int)(1500*x),6,508+(int)(508*x),339+(int)(339*y)},
		{"Futs'ball Equipamentos",1238+(int)(1238*y),6,323+(int)(323*x),564+(int)(564*y)},
		{"Parmaleite Indus",1232+(int)(1232*x),6,468+(int)(468*x),284+(int)(284*y)},
		{"Coca Coll",1732+(int)(1732*y),6,692+(int)(692*x),496+(int)(496*y)},
		{"Polmito Trans",2032+(int)(2032*y),8,704+(int)(704*x),432+(int)(432*y)},
		{"Agua Oxigenada LTDA",1532+(int)(1532*y),8,413+(int)(413*x),606+(int)(606*y)},
		{"Fabricacao de Joias",1242+(int)(1242*y),6,778+(int)(778*x),338+(int)(338*y)},
		{"Cubo magicos e compania",1392+(int)(1393*y),5,619+(int)(619*x),260+(int)(260*y)},
		{"Joanete e implementações",1500+(int)(1500*y),7,678+(int)(678*x),439+(int)(439*y)},
		{"Bjuteria Online",1258+(int)(1298*y),6,393+(int)(393*x),850+(int)(850*y)},
		{"Serviços Nuddle Autentics",3100+(int)(3212*y),10,568+(int)(568*x),480+(int)(480*y)},
		{"Industria TECBA SA",1232+(int)(1232*y),3,493+(int)(493*x),247+(int)(247*y)},
		{"Industria Alimenticia SDA",932+(int)(932*y),2,376+(int)(376*x),185+(int)(185*y)},
		{"FretePao dois irmaos CC",532+(int)(532*y),1,213+(int)(213*x),106+(int)(106*y)},
		{"AgroNegocios Limitada",942+(int)(942*y),2,376+(int)(376*x),183+(int)(183*y)},
		{"LocoMovel SA",792+(int)(792*y),2,319+(int)(319*x),159+(int)(159*y)},
		{"Sapataria Luis Industrial",1300+(int)(1300*y),3,478+(int)(478*x),239+(int)(239*y)},
		{"Futebol Mania Industria",938+(int)(938*y),2,293+(int)(293*x),464+(int)(464*y)},       
                {"Mel mecanicas LDA",952+(int)(942*y),2,378+(int)(378*x),138+(int)(138*y)},
		{"Pericolígenos d'pressao",793+(int)(793*y),1,319+(int)(319*x),160+(int)(160*y)},
		{"Encomendexpress Logos",1300+(int)(1300*y),3,478+(int)(478*x),239+(int)(239*y)},
		{"Banannas de Pijama Indus",939+(int)(938*y),2,293+(int)(293*x),150+(int)(150*y)},
		{"Maos mecanicas LTDA",710+(int)(612*y),1,368+(int)(368*x),180+(int)(180*y)},
		{"Mowsquito eletronicos",1232+(int)(1232*y),3,493+(int)(493*x),245+(int)(245*y)},
		{"Arduinos e Arduvinos",893+(int)(932*y),2,374+(int)(374*x),175+(int)(175*y)},
		{"Relogios e c&a",1000+(int)(319*y),2,576+(int)(376*x),170+(int)(170*y)},
		{"Uniformes Masculinos KKK",932+(int)(932*y),2,372+(int)(372*x),180+(int)(180*y)},
		{"auto peças secular SA",789+(int)(832*y),1,334+(int)(334*x),169+(int)(169*y)},
		{"Flechas e arcos dbquedos",1289+(int)(1000*y),3,476+(int)(476*x),240+(int)(240*y)},
		{"Sexx shop Anonimo e C&a",732+(int)(732*y),2,293+(int)(293*x),146+(int)(146*y)},
		{"Maos mecanicas LTDA",832+(int)(832*y),2,322+(int)(322*x),160+(int)(160*y)},
		{"Papelaria Papel da casa",832+(int)(832*y),2,294+(int)(294*x),147+(int)(147*y)},
		{"Karaokê do Karatê SA",600+(int)(600*y),1,200+(int)(241*x),120+(int)(120*y)},
		{"Doces da Vovo e C&a",842+(int)(842*y),2,338+(int)(338*x),162+(int)(162*y)},
                {"Circuitos mecanicos LTDA",1200+(int)(1200*y),4,472+(int)(472*x),256+(int)(256*y)},
		{"Industria Basekall SA",1432+(int)(1432*y),5,523+(int)(523*x),347+(int)(347*y)},
		{"Alimentos & Cia LTDA",1132+(int)(1132*y),4,396+(int)(396*x),245+(int)(245*y)},
		{"Bicoitos dois Reis ",1432+(int)(1432*y),5,293+(int)(293*x),196+(int)(196*y)},
                {"Maos mecanicas LTDA",92+(int)(992*y),2,412+(int)(412*x),206+(int)(206*y)},
		{"Elasticos e Compania",1090+(int)(1211*y),1,492+(int)(492*x),258+(int)(258*y)},
		{"Papelaria Industrial",1332+(int)(1332*y),8,472+(int)(472*x),281+(int)(281*y)},
		{"Materiais escolares LTDA",1832+(int)(1832*y),7,534+(int)(534*x),369+(int)(369*y)},
		{"Plantação Locável",3199+(int)(3199*y),9,776+(int)(776*x),436+(int)(436*y)},
		{"Lanternas & Luminarias",3232+(int)(3232*y),10,793+(int)(793*x),1049+(int)(1049*y)},
		{"Carregadores Universais",2032+(int)(2032*y),9,422+(int)(422*x),361+(int)(361*y)},
		{"Organizacao de Eventos",2132+(int)(2132*y),7,494+(int)(494*x),642+(int)(642*y)},
		{"Armarinho Ball'zar",1200+(int)(1200*y),6,641+(int)(641*x),321+(int)(321*y)},
		{"Livraria Evangelica",1042+(int)(1042*y),5,338+(int)(338*x),219+(int)(219*y)},          
		{"Som e equips automotivo",501+(int)(491*y),1,192+(int)(192*x),92+(int)(92*y)},
		{"Pardal Express Industrial",932+(int)(932*y),2,372+(int)(723*x),181+(int)(181*y)},
		{"Tintas automotivas",832+(int)(832*y),2,334+(int)(334*x),169+(int)(169*y)},
		{"Locadora de filmes brasileiros",1292+(int)(1292*y),6,492+(int)(492*x),256+(int)(256*y)},
		{"FarmBrasil Drogaria",2232+(int)(2232*y),5,793+(int)(793*x),347+(int)(347*y)},
		{"Queijos & Cia",1432+(int)(1432*y),7,676+(int)(676*x),489+(int)(489*y)},
		{"PacoLacto AgroDustrial",632+(int)(632*y),2,368+(int)(368*x),184+(int)(184*y)},
		{"Koka-kool Bee Lack",1232+(int)(1232*y),3,492+(int)(492*x),246+(int)(246*y)},
		{"Roupas e modas femininas",932+(int)(932*y),2,374+(int)(374*x),132+(int)(132*y)},
                {"Prototipos de aranhas ETC",2232+(int)(2232*y),8,493+(int)(493*x),445+(int)(445*y)},
        };
             
            terceirizadas.lista = dados;
            
        }
        
}
 



	

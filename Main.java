

  /*
  Projeto de sistema para administração de uma concessionária a fim de 
  aprovação na matéria de Programação orientada a objetos e  
  Técnicas de desenvolvimento de algoritmos, projeto interdisciplinar
  do curso de Análise e Desenvolvimento de sistemas pela UNICSUL.
  Autores: Fábio Luiz Teixeira e Lucas Morgani
  */



import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
   

	public static void main(String[] args) {
        
		
		
        Carro cadv;//variavel que adiciona na lista do carro
        Caminhao cadv2; //variavel que adiciona na lista do caminhao
        Moto cadv3; //variavel que adiciona na lista da moto
        Cliente c1; //variavel que adiciona cliente na lista
        Vendedor v1;//variavel que adiciona Vendedor na lista
        
        //ArrayLists
        ArrayList<Veiculo>listavendidos = new ArrayList<Veiculo>();
        ArrayList<Veiculo>listageral = new ArrayList<Veiculo>();
        ArrayList <Carro>listacarro = new ArrayList<Carro>(); //criando uma lista array para a classe carro
        ArrayList <Moto>listamoto = new ArrayList<Moto>(); //criando uma lista array para a classe moto
        ArrayList <Caminhao>listacaminhao = new ArrayList<Caminhao>(); //criando uma lista array para a classe caminhao
        ArrayList <Cliente>listacliente = new ArrayList<Cliente>();
        ArrayList <Vendedor>listavendedores = new ArrayList<Vendedor>();
        
        //Vetor de opção para o Option dialog
        Object[] options = { "Sim", "Não" };
        
        //Instanciando Objetos base e adicionando nas listas
      	//Carros
      	Carro car = new Carro("Chevrolet","Prisma 1.4 MPFI LT 8V", 2019, "Vermelho", "Gasolina e álcool","Manual", 15094, "QRU-5555", 67900f, "Sedã", 4);
      	Carro car2 = new Carro("Hyundai","HB20 1.6 COMFORT PLUS 16V", 2018, "Branco", "Gasolina e álcool","Automático", 37226, "QQQ-6226", 68900f, "Hatch", 4);
      	Carro car3 = new Carro("Toyota","Corolla 2.0 XEI", 2020, "Preto", "Gasolina e álcool","Automático", 2980, "QQE-65E5", 175900f, "Sedã", 4);
      	listacarro.add(car);
      	listageral.add(car);
      	listacarro.add(car2);
      	listageral.add(car2);
      	listacarro.add(car3);
      	listageral.add(car3);
      	
      	//Caminhões
      	Caminhao cam = new Caminhao("Volvo", "330", 2015, "Branco", "Diesel", "Manual", 432000, "XUX-6669", 420000f, "Prancha", 4);
      	Caminhao cam2 = new Caminhao("Hyundai", "HR", 2016, "Branco", "Diesel", "Manual", 127000, "XRR-5569", 95000f, "VUC 3/4", 1);
      	Caminhao cam3 = new Caminhao("Mercedes-benz", "2546 6x2 Baú Refrigerado Termoking", 2020, "Vermelho", "Diesel", "Automático", 189000, "XUR-4329", 690000f, "Carreta", 3);
      	listacaminhao.add(cam);
      	listageral.add(cam);
      	listacaminhao.add(cam2);
      	listageral.add(cam2);
      	listacaminhao.add(cam3);
      	listageral.add(cam3);
      	
      	//Motos
      	Moto m = new Moto("Triumph", "Tiger 800 Abs", 2014, "Preto", "Gasolina","Manual", 19800, "TIG-6969", 45889f,"Bigtrail", "800cc");	
      	Moto m2 = new Moto("Yamaha", "Factor 150 Ed", 2020, "Roxo", "Gasolina","Manual", 34382, "XTZ-3456", 12900f,"Street", "150cc");	
      	Moto m3 = new Moto("Kawasaki", "Z900 SE", 2021, "Azul", "Gasolina","Manual", 6250, "XRS-4530", 52990f,"Sport", "900cc");	
      	listamoto.add(m);
      	listageral.add(m);
      	listamoto.add(m2);
      	listageral.add(m2);
      	listamoto.add(m3);
      	listageral.add(m3);
      		
      	//Vendedores
      	Vendedor vend = new Vendedor("Fabio Luiz Teixeira", 31,"13/11/1990", "255.232.456-54", "Rua Cel. João de Oliveira Melo, 1127", "1195849-9261", 1, 0f, 80350f, 40175f, 2);
      	Vendedor vend1 = new Vendedor("Lucas Gomes Morgani", 19,"14/05/2002", "367.432.226-33", "Rua herwis, 23", "119324-4564", 2, 0f, 48000f, 24000f, 2);
      	Vendedor vend2 = new Vendedor("Samuel Vinicius Basilio",22,"01/01/1999", "456.888.978-01", "Rua Rogério Hermita, 370", "1195846-5648", 3, 0f, 62000f, 20666f, 3);
      	listavendedores.add(vend);	
      	listavendedores.add(vend1);	
      	listavendedores.add(vend2);	
      		
      		
        
        int respop;//váriavel para controle da estrutura de repitição usando JoptionPane.optionDialog
        
        //variaveis auxliares
        //geral
        int tabela;
        int tabela1;
        int contestoque; //variavel para saber o tipo do objeto que sera mostrado na aba estoque
        int tabela3 = 3;

        

        //2
        String consultaplaca;
        int tabelaConsulta;
        int tabelaConsulta1;
        String consultacliente;
        int gerenciarpessoas;
        int id;





        do{//Menu Principal
            tabela = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opções: " + 
                                                                    "\n1-Cadastrar veículo"+
                                                                    "\n2-Consultar estoque"+
                                                                    "\n3-Gerenciar Loja"+
                                                                    "\n4-Efetuar venda"+
                                                                    "\n5-Gerenciar Pessoas"+
                                                                    "\n6-Sair"));
            switch(tabela){
                case 1:
                    do{
                    	//Menu de cadastro
                        tabela1 = Integer.parseInt(JOptionPane.showInputDialog("digite uma das opções: " + "\n1-Cadastrar carro" +
                                                                                "\n2-Cadastrar caminhão"+
                                                                                "\n3-Cadastrar moto"+
                                                                                "\n4-Voltar ao menu inicial"));
                                switch(tabela1){
                                    case 1:
                                        do{
                                        	//cadastrar carro
                                        	cadv = new Carro("", "" ,0  ,"" , "", "", 0, "", 0f, "", 0);
                                        	cadv.cadastrarVeiculo();
                                        	listacarro.add(cadv);
                                        	listageral.add(cadv);
                                            JOptionPane.showMessageDialog(null, "VEÍCULO CADASTRADO COM SUCESSO" + cadv.imprimir());
                                            respop = JOptionPane.showOptionDialog(null, "Deseja adicionar um novo carro? ", "Projetos Car", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE , null, options, options);
                                        	}while(respop == 0 || respop == 0);
                                    		break;
                                    case 2:
                                        do{
                                        	//cadastrar caminhão
                                            cadv2 = new Caminhao("", "" ,0  ,"" , "", "", 0, "", 0f, "", 0);
                                            cadv2.cadastrarVeiculo();
                                            listacaminhao.add(cadv2);
                                            listageral.add(cadv2);
                                            JOptionPane.showMessageDialog(null,"VEÍCULO CADASTRADO COM SUCESSO" + cadv2.imprimir());
                                            respop = JOptionPane.showOptionDialog(null, "Deseja adicionar um novo caminhão? ", "Projetos Car", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE , null, options, options);
                                        	}while(respop == 0 || respop == 0);
                                    		break;
                                    case 3: 
                                        do{
                                        	//cadastrar moto
                                        	cadv3 = new Moto("", "" ,0  ,"" , "", "", 0, "", 0f, "", "");
                                        	//cadv3 = new Moto(marc, model ,an  ,cor , combust, trans, quilo, plac, valo, tipo, cilin);
                                            cadv3.cadastrarVeiculo();
                                            listamoto.add(cadv3);
                                            listageral.add(cadv3);
                                            JOptionPane.showMessageDialog(null,"VEÍCULO CADASTRADO COM SUCESSO" + cadv3.imprimir());
                                            respop = JOptionPane.showOptionDialog(null, "Deseja adicionar uma nova moto? ", "Projetos Car", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE , null, options, options);
	                                        }while(respop == 0 || respop == 0);
	                                    	break;
                                    
                                        }
                                        }while(tabela1 != 4);
                break;                        
                //menu consultar estoque
                case 2:
                contestoque = Integer.parseInt(JOptionPane.showInputDialog("Digite qual tipo de veiculo deseja consultar o estoque: " + 
                                                                            "\n1-Carro" + 
                                                                            "\n2-Caminhão" + 
                                                                            "\n3-Moto" + 
                                                                            "\n4-Todos os veículos"));
                switch(contestoque){
	                    case 1://consultar carro
	                            for(int i = 0; i < listacarro.size(); i++){
	                            	JOptionPane.showMessageDialog(null, "Carro " + (i+1) + " de " + listacarro.size() + " " + "\n" + listacarro.get(i).imprimir());
	                                }
	                            if( listacarro.isEmpty())
	                                JOptionPane.showMessageDialog(null,"NÃO HÁ VEÍCULOS CADASTRADOS");
	                            break;
	                            
	                    case 2://consultar caminhão
	                           	for(int i = 0; i < listacaminhao.size(); i++){
	                                JOptionPane.showMessageDialog(null, "Caminh�o " + (i+1) + " de " + listacaminhao.size() + " " + "\n" + listacaminhao.get(i).imprimir());
	                            }
	                            if( listacaminhao.isEmpty())
	                                JOptionPane.showMessageDialog(null,"NÃO HÁ VEÍCULOS CADASTRADOS");
	                            break;
	                            
	                    case 3://consultar moto
	                    		for(int i = 0; i < listamoto.size(); i++){
	                    			JOptionPane.showMessageDialog(null, "Moto " + (i+1) + " de " + listamoto.size() + " " + "\n" + listamoto.get(i).imprimir());
	                    		}
	                    		if( listacaminhao.isEmpty())
	                                JOptionPane.showMessageDialog(null,"NÃO HÁ VEÍCULOS CADASTRADOS");
	                    		break;
	                    case 4://consultar todos os veiculos
	                    		for(int i = 0; i < listageral.size(); i++) {
	                    			JOptionPane.showMessageDialog(null, "Veículos " + (i+1) + " de " + listageral.size() + " " + "\n" + listageral.get(i).imprimir());
	                    		}	
	                    		if( listageral.isEmpty())
	                    			JOptionPane.showMessageDialog(null,"NÃO HÁ VEÍCULOS CADASTRADOS");
	                    		break;
	                    				
                    				
                    default:
                    	JOptionPane.showMessageDialog(null, "Tipo inválido");
                        break;			
                    			
                    		
                    
                    }break;
                    
                    //Gerenciar loja
            case 3://menu remoção de veículo, consulta, dados de veiculos vendidos e dados de vendas da loja
                tabelaConsulta = Integer.parseInt(JOptionPane.showInputDialog("1-remover um veiculo" + "\n2-Consultar um veiculo  \n3-Lista de veículos vendidos  \n4-Dados sobre vendas da loja"));
                switch(tabelaConsulta){
                    case 1://menu remover
                    tabelaConsulta1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para remover um carro " + 
                                                                "\nDigite 2 para remover um caminhão"+
                                                                "\nDigite 3 para remover uma moto"));
                        switch(tabelaConsulta1){
                            case 1://remover carro
                            consultaplaca = JOptionPane.showInputDialog("Digite a placa do veiculo (AAA-####)");
                            
                            for(int i = 0; i < listacarro.size(); i++){
                        	    Carro obj = listacarro.get(i);
                        	    	if(obj.getPlaca().equalsIgnoreCase(consultaplaca)){
                        	    		listacarro.remove(i);
                                        JOptionPane.showMessageDialog(null,"VEICULO REMOVIDO COM SUCESSO" + obj.imprimir());
                        	    }

                            }     
                            
                            break;

                            case 2://remover caminhão
                            consultaplaca = JOptionPane.showInputDialog("Digite a placa do veiculo (AAA-####)");                  
                            for(int i = 0; i < listacaminhao.size(); i++){
                        	    Caminhao obj = listacaminhao.get(i);
                        	    	if(obj.getPlaca().equalsIgnoreCase(consultaplaca)){
                        	    		listacaminhao.remove(i);
                                        JOptionPane.showMessageDialog(null,"VEICULO REMOVIDO COM SUCESSO"+ obj.imprimir());
                        	    }
                            }  
                            
                            break;

                            case 3://remover moto
                            consultaplaca = JOptionPane.showInputDialog("Digite a placa do veiculo (AAA-####)");
                            
                            for(int i = 0; i < listamoto.size(); i++){
                        	    Moto obj = listamoto.get(i);
                        	    	if(obj.getPlaca().equalsIgnoreCase(consultaplaca)){
                        	    		listamoto.remove(i);
                                        JOptionPane.showMessageDialog(null,"VEICULO REMOVIDO COM SUCESSO"+ obj.imprimir());
                        	    }
                            }  
                            break;
                        }
                    break;

                    case 2://menu consulta
                    tabelaConsulta1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para consultar um carro " + 
                                                                    "\nDigite 2 para consultar um caminhão"+
                                                                    "\nDigite 3 para consultar uma moto"));
                        switch(tabelaConsulta1){
                            case 1://consultar carro
                            consultaplaca = JOptionPane.showInputDialog("Digite a placa do veiculo (AAA-####):");
                            for(int i = 0; i < listacarro.size(); i++){
                        	    Carro obj = listacarro.get(i);
                        	    	if(obj.getPlaca().equalsIgnoreCase(consultaplaca)){
                        	    		JOptionPane.showInputDialog(null, obj.imprimir());
                        	    }
                            }
                        	  
                            break;

                            case 2://consultar caminhão
                            consultaplaca = JOptionPane.showInputDialog("Digite a placa do veiculo (AAA-####):");
                            for(int i = 0; i < listacaminhao.size(); i++){
                        	    Caminhao obj = listacaminhao.get(i);
                        	    	if(obj.getPlaca().equalsIgnoreCase(consultaplaca)){
                        	    		JOptionPane.showInputDialog(null, obj.imprimir());
                        	    }
                            }
                            break;

                            case 3://consultar moto
                            consultaplaca = JOptionPane.showInputDialog("Digite a placa do veiculo (AAA-####):");
                            for(int i = 0; i < listamoto.size(); i++){
                            	Moto obj = listamoto.get(i);
                            	if(obj.getPlaca().equalsIgnoreCase(consultaplaca)){
                            		JOptionPane.showInputDialog(null, obj.imprimir());	
                            		}
                            	}
                            break;
                            }
                        	break;
              case 4://Exibindo lista de veículos vendidos
                  for(int i = 0; i < listavendidos.size(); i++){
                      JOptionPane.showMessageDialog(null, "Veículos vendidos " + (i+1) + " de " + listavendidos.size() + " " + "\n" + listavendidos.get(i).imprimir());
	                  }
                   break;
                            
              case 5://Exibindo Dados da loja              
            	 float soma=0;
         		 float qtde=0;
         		 float media=0;
            	  	for(int i = 0; i < listavendedores.size(); i++){
            	  	 
            		 soma = soma + listavendedores.get(i).getTotalvendido();
            		 qtde = qtde + listavendedores.get(i).getQuantvendas();
            	  }
            	  	media = soma/qtde;
            	  	JOptionPane.showMessageDialog(null, "Dados da Loja: "
            	  										+"\nProjetos Car"
            	  										+"\nTotal vendido no mês: R$" + soma
            	  										+"\nVeículos vendidos: " + qtde + "veículos."
            	  										+"\nMédia por vendas: R$" + media);
            	  break;
                }

            break;
            case 4:
                do{
                	//Efetuar venda + cadastro do cliente
                	//Procurando e selecionando vendedor por id
                	id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do vendedor: "));    
                	for (int i = 0; i < listavendedores.size(); i++) {
                			Vendedor objv = listavendedores.get(i);
            	    	if(objv.getId() == id){
            	    		JOptionPane.showMessageDialog(null, "Vendedor selecionado: \nId: " + objv.getId() + "\nVendedor: " + objv.getNome());									
		            	    		//Cadastro do cliente
            	    				c1 = new Cliente ("", 0, "", "", "", "", "", 0f);
		                        	c1.cadastrarPessoa();
		                        	//No final do método de cadastro o programa pede para
		                        	//digitar a placa do veículo, uma estrutura for percorre
		                        	//a array veículo em busca do objeto que foi vendido
		                        	//adiciona ele a uma variável 
	                        		for (int n = 0; n < listageral.size(); n++) {
	                        		Veiculo obj = listageral.get(n);
	                    	    	if(obj.getPlaca().equalsIgnoreCase(c1.getCompra())){
	                    	    		//É feita a impressão em uma caixa de opção pedindo a confirmação da venda
	                    	    	respop = JOptionPane.showOptionDialog(null, obj.imprimir() + "\n\nPorfavor verifique os dados do veículo \nConfimar venda? ", "Projetos Car", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE , null, options, options);	
	                    	    	if(respop == 0 || respop == 0){
                    	    		
                    	    		//após a confirmação o veículo selecionado é adicionado ao campo valor do cliente
                    	    		c1.setValorcompra(obj.getValor());
                    	    		
                    	    		//Veiculo selecionado é usado para editar os atributos de vendas do Vendedor
                    	    		//Pegamos o objeto da array pra poder trabalha-lo e editamos os atributos
                    	    		listavendedores.get(i).setValorvenda(obj.getValor());
                    	    		listavendedores.get(i).setQuantvendas(objv.getQuantvendas() + 1);
                    	    		listavendedores.get(i).setTotalvendido(objv.getTotalvendido() + obj.getValor());
                    	    		listavendedores.get(i).setMediaporvenda(objv.getTotalvendido() / objv.getQuantvendas());
                    	    		
                    	    		//adicionando objeto na lista de vendidos
                    	    		listavendidos.add(obj);
                    	    		listageral.remove(n);//veiculo removido da lista geral
                    	    		listacliente.add(c1);
                    	    		
                    	    		//percorrendo as arrays pra remover o veículo vendido das outras listas
                    	    		for (int x = 0; x < listacarro.size(); x++ ) {
                    	    			for (int y = 0; y < listacaminhao.size(); y++) {
                    	    				for (int z = 0; z < listamoto.size(); z++) {
                    	    					Carro obj1 = listacarro.get(x);
                    	    					Caminhao obj2 = listacaminhao.get(y);
                    	    					Moto obj3 = listamoto.get(z);
                    	    					if(obj1.getPlaca().equalsIgnoreCase(c1.getCompra())){
                                    	    		listacarro.remove(x);
                                    	    	}else if (obj2.getPlaca().equalsIgnoreCase(c1.getCompra())) {
                                    	    		listacaminhao.remove(y); 	    
                                    	    	}else if (obj3.getPlaca().equalsIgnoreCase(c1.getCompra())) {
                                    	    		listamoto.remove(z);
                                    	    		
                                    	    		}
                    	    					}
                    	    				}
                    	    			}
                    	    					JOptionPane.showMessageDialog(null,"VENDA EFETUADA COM SUCESSO" + listavendedores.get(i).imprimirVenda() +"\n"+ c1.imprimir() +"\n"+ obj.imprimir());		
                    	    	}
                    	    	}else{
	            	    		JOptionPane.showMessageDialog(null, "Digite um Id Válido!");
	            	    		break;
	            	    		}
                    	    		
                        			}		         	    		                      		
            	    			}
                			} 
                respop = JOptionPane.showOptionDialog(null, "Deseja efetuar uma nova venda? ", "Projetos Car", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE , null, options, options);
                }while(respop == 0 || respop == 0);
            	break;
                
            case 5://menu gerenciar pessoas
                 gerenciarpessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção: " + "\n1-Lista de clientes"+
                                                                                                    "\n2-Consultar cliente"+
                                                                                                    "\n3-Remover cliente" +
                                                                                                    "\n4-Cadastrar Vendedor" +
                                                                                                    "\n5-Lista de vendedores"+
                                                                                                    "\n6-Consultar Vendedor" +
                                                                                                    "\n7-Remover Vendedor" +
                                                                                                    "\n8-Reset vendas" +
                                                                                                    "\n9-Voltar ao menu principal"));
                                                                                                       
                switch (gerenciarpessoas) {
                    case 1://exibir lista de cliente 
                        for(int i = 0; i < listacliente.size(); i++){
                            JOptionPane.showMessageDialog(null, "Cliente " + (i+1) + " de " + listacliente.size() + 
                            		" " + "\n"  + listacliente.get(i).imprimir());
                        }
                        if( listacliente.isEmpty())
                                JOptionPane.showMessageDialog(null,"NÃO HÁ CLIENTES CADASTRADOS");
                    break;
                    case 2:  //consultar cliente  
                        consultacliente = JOptionPane.showInputDialog("Digite o cpf do cliente para a consulta");
                        for(int i = 0; i < listacliente.size(); i++){
                            Cliente obj = listacliente.get(i);
                            if(obj.getCpf().equals(consultacliente)){
                                JOptionPane.showInputDialog(null, obj.imprimir());   
                            }}
                    break;
                    case 3: //remover cliente
                            consultacliente = JOptionPane.showInputDialog("Digite o cpf do cliente para a remoção");
                            for(int i = 0; i < listacliente.size(); i++){
                                Cliente obj = listacliente.get(i);
                                    if(obj.getCpf().equals(consultacliente)){
                                        listacliente.remove(i);
                                        JOptionPane.showMessageDialog(null,"CLIENTE REMOVIDO COM SUCESSO" + obj.imprimir());
                            }}
                              
                    break; 
                    
                    case 4: //Cadastrar Vendedor
                    	do {
                    	v1 = new Vendedor ("", 0, "", "", "", "", 0, 0f, 0f, 0f, 0);
                    	v1.cadastrarPessoa();
                    	v1.setId(listavendedores.size() + 1);//gera um id automático de acordo com tamanho da lista
                    	listavendedores.add(v1);
                    	JOptionPane.showMessageDialog(null,"VENDEDOR CADASTRADO COM SUCESSO!" + v1.imprimir(v1));
                    	
                   
                    	respop = JOptionPane.showOptionDialog(null, "Deseja adicionar um novo vendedor? ", "Projetos Car", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE , null, options, options);
                        }while(respop == 0 || respop == 0);
                    	break;
                    	
                    case 5: //Lista de Vendedores
                    	for(int i = 0; i < listavendedores.size(); i++){
                            JOptionPane.showMessageDialog(null, "Vendedor " + (i+1) + " de " + listavendedores.size() + 
                            		" " + "\n"  + listavendedores.get(i).imprimir());
                        }
                        if( listavendedores.isEmpty())
                                JOptionPane.showMessageDialog(null,"NÃO HÁ CLIENTES CADASTRADOS!");
                    	break;
                    	
                    case 6: //consultar Vendedor
                    	id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do vendedor para a consulta"));
                        for(int i = 0; i < listavendedores.size(); i++){
                            Vendedor obj = listavendedores.get(i);
                            if(obj.getId() == id){
                                JOptionPane.showInputDialog(null, obj.imprimir());   
                            }}
                    	break;
                    	
                    case 7: //Remover Vendedor
                    	id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do vendedor que deseja remover"));
                    	for(int i = 0; i < listavendedores.size(); i++){
                                Vendedor obj = listavendedores.get(i);
                                    listavendedores.remove(i);
                                    listavendedores.get(i).setId(listavendedores.get(i).getId() - 1);//ajusta os IDs de acordo com a lista
                                    JOptionPane.showMessageDialog(null,"VENDEDOR REMOVIDO COM SUCESSO" + obj.imprimir());
                        }
                    			
                    	break;
                    	
                    case 8: //Reset de vendas 	
                    	respop = JOptionPane.showOptionDialog(null, "Essa opção irá zerar os valores, "
                    			+ "quantidades \ne média por venda de todos os vendedores \ne só é recomendada no fechamento do mês."
                    			+ " \nDeseja continuar?", "ATENÇÃO!!! ",
                    			JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                    	if (respop == 0 |respop == 0) {
                    	for (int i = 0; i < listavendedores.size(); i++) {
                    	listavendedores.get(i).setValorvenda(0);
        	    		listavendedores.get(i).setQuantvendas(0);
        	    		listavendedores.get(i).setTotalvendido(0);
        	    		listavendedores.get(i).setMediaporvenda(0);	
        	    		
        	    		}
                    	JOptionPane.showMessageDialog(null, "Os valores foram resetados \nUm ótimo mês e boas vendas! ");
                    	break;
                    	
                    	}else {      	
                    		break;
                    	}
                    	
                    	
                    default:
                        break;
                }
            break;
            case 6:
            	JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso programa!");
                tabela3 = 4;
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "TIPO INVÁLIDO!");
                tabela3 = 4; 
                    
                                        
                                }
    }while(tabela3 == 3);
}}

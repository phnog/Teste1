import java.util.Scanner; 
public class Trabalho1 {

	public static void main(String[] args) {
		/* Escolha no menu. */
		int x = 0; 
		int i;
		int i2 = 4;
		int cont = 0;
		int stop = 0;
		int i3 = 4;
		int v = 0;
		int v2 = 0;
		int sn; 
		String y;
		String z; 
		Scanner ler = new Scanner(System.in);
		
		String[][] cadastro = new String[100][3];
		cadastro[1][0] = "Marcos Souza"; cadastro[1][1] = "Copacabana"; cadastro[1][2] = "984516235";
		cadastro[2][0] = "Carol Costa"; cadastro[2][1] = "Lago Norte"; cadastro[2][2] = "984456135";
		cadastro[3][0] = "Michael Douglas"; cadastro[3][1] = "Augusta"; cadastro[3][2] = "995426235";
		cadastro[4][0] = "Neimar Junior"; cadastro[4][1] = "Barbacena"; cadastro[4][2] = "998945235";
		
		String[][] produtos = new String[100][5];
		produtos[1][0] = "Pastel de Carne"; produtos[1][1] = "Pastel recheado com carne"; produtos[1][2] = "4.90"; produtos[1][3] = "50"; 
		produtos[2][0] = "Pastel de Frango"; produtos[2][1] = "Pastel recheado com frango"; produtos[2][2] = "4.90"; produtos[2][3] = "50";
		produtos[3][0] = "Pastel de Palmito"; produtos[3][1] = "Pastel recheado com palmito"; produtos[3][2] = "4.90"; produtos[3][3] = "50"; 
		produtos[4][0] = "Pastel de Vento"; produtos[4][1] = "Pastel sem recheio, somente a massa frita"; produtos[4][2] = "2.50"; produtos[4][3] ="70"; 
		
		int[][] produtosqnt = new int[100][2];
		produtosqnt[1][1] = 10;
	    produtosqnt[2][1] = 10;
		produtosqnt[3][1] = 10;
		produtosqnt[4][1] = 5;	
		/*y = ler.nextLine();*/ 
		
		while(x != 7) {
		
			System.out.println("Bem-Vindo ao controle de cliente, escolha uma das seguintes opcoes para continuar:\n");
			System.out.println("1 - Cadastro de novo cliente.\n"); 
			System.out.println("2 - Busca por cliente.\n");
			System.out.println("3 - Cadastro de novo produto.\n");
			System.out.println("4 - Busca por produto.\n");
			System.out.println("5 - Cadastro de venda.\n");
			System.out.println("6 - Mostrar produtos em estoque.\n");
			System.out.println("7 - Sair.\n");
			x = ler.nextInt();
			switch (x) {
			
			case 1: 
				
				System.out.println("Voce escolheu a opcao \"1 - Cadastro de novo cliente.\"");
				System.out.println("Informe o numero de clientes que voce quer cadastrar.\n");
				int nclientes = ler.nextInt(); 
					i3 = i2;
				    for(i = i3 + 1; i <= nclientes + i3 ; i++) {
					if (i == i3 + 1) {y = ler.nextLine();}
					System.out.println("Digite o nome do(a) cliente \n" ); 
					
					y = ler.nextLine();
					cadastro[i][0] = y;
					System.out.println("Digite o endereco do(a) cliente \n" ); 
					y = ler.nextLine();

					cadastro[i][1] = y;
					System.out.println("Digite o numero do(a) cliente \n" ); 
					y = ler.nextLine();

					cadastro[i][2] = y;
					System.out.println("Cadastrado com sucesso! \n");
					if(nclientes != 1 && i != nclientes + i3 ) {System.out.println("Proximo cliente!");}
					i2 += 1;
					}
					
				break;
			case 2: 
				System.out.println("Voce escolheu a opcao \"2 - Busca por cliente.\"\n");
				System.out.println("Digite o nome do cliente que voce quer encontrar.\n");
				z = ler.nextLine();
				z = ler.nextLine();

				for(i = 1; i <= 99 ; i++) {
					if(z.equals(cadastro[i][0])) {
						v = 1; 
						System.out.println("O nome do(a) cliente e : " + cadastro[i][0] + "\n");
						System.out.println("O endereco do(a) cliente e: " + cadastro[i][1] + "\n");
						System.out.println("O numero do(a) cliente e: " + cadastro[i][2] + "\n");
						break; 
					}
				}
				if(v == 0 ) {
					System.out.println("Cliente não encontrado! \n");
					break; 
				}
				System.out.println("Voce gostaria de alterar os dados do cliente ?\n" + "1 - Sim.\n" + "2 - Nao. \n");
				sn = ler.nextInt(); 
				if(sn == 1) {
					System.out.println("O que voce gostaria de alterar : \n" + "1 - Nome. \n" + "2 - Endereco. \n" + "3 - Numero. \n");
					int escolhaalterar = ler.nextInt(); 
				
					switch(escolhaalterar) {
					
					case 1 : 
						System.out.println("Digite o novo nome para o(a) cliente : \n");

						y = ler.nextLine(); 
						y = ler.nextLine();
						cadastro[i][0] = y;

						System.out.println("Alteracao feita com sucesso!\n");
						break; 
					case 2 : 
						System.out.println("Digite o novo endereco para o(a) cliente : \n");

						y = ler.nextLine();
						y = ler.nextLine();
						cadastro[i][1] = y;

						System.out.println("Alteracao feita com sucesso!\n");
						break; 
					case 3 : 
						System.out.println("Digite o novo numero para o(a) cliente : \n");

						y = ler.nextLine();
						y = ler.nextLine();
						cadastro[i][2] = y;

						System.out.println("Alteracao feita com sucesso!\n");
						break; 

					
					} 
					
				}
				if(sn == 2) {System.out.println("Nenhuma alteracao foi realizada! \n");}
				break;
			case 3: 
				
				System.out.println("Voce escolheu a opcao \"3 - Cadastro de novo produto.\"\n");
				System.out.println("Informe o numero de produtos que voce quer cadastrar.\n");
				int nprodutos = ler.nextInt(); 
					i3 = i2 ;
					int caquita = 0;
				    for(i = i3 + 1; i <= nprodutos + i3 ; i++) {
				    caquita = i;
				    if (i == caquita ) {y = ler.nextLine();}
 
					System.out.println("Digite o nome do produto. \n" ); 
					y = ler.nextLine();
					produtos[i][0] = y;
					
					System.out.println("Digite a descriacao do produto. \n" ); 
					y = ler.nextLine();
					produtos[i][1] = y;
					
					System.out.println("Digite o valor do produto. \n" ); 
					y = ler.nextLine();
					produtos[i][2] = y;
					
					System.out.println("Digite a porcentagem de lucro do produto. \n" ); 
					y = ler.nextLine();
					produtos[i][3] = y;
					
					System.out.println("Digite a quantidade do produto no estoque. \n" ); 
					int num = ler.nextInt();
					produtosqnt[i][1] = num;
					
					System.out.println("Cadastrado com sucesso! \n");
					i2 += 1;
					
					
				}
				break;
			case 4: 
				System.out.println("Voce escolheu a opcao \"4 - Busca por produto.\"\n");
				System.out.println("Digite o nome do produto que voce quer encontrar.\n");
				z = ler.nextLine();
				z = ler.nextLine();

				for(i = 1; i <= 99 ; i++) {
					if(z.equals(produtos[i][0])) {
						v2 = 1; 
						System.out.println("O nome do produto e : " + produtos[i][0] + "\n");
						System.out.println("A descriacao do produto e: " + produtos[i][1] + "\n");
						System.out.println("O valor do produto e: " + produtos[i][2] + "R$"+ "\n");
						System.out.println("A porcentagem de lucro do produto e: " + produtos[i][3] + "%" + "\n");
						System.out.println("A quantidade de produtos no estoque e de: " + produtosqnt[i][1] + "\n");
						break; 
					}
				}
				if(v2 == 0 ) {
					System.out.println("Produto não encontrado! \n");
					break; }
				System.out.println("Voce gostaria de alterar os dados do produto ?\n" + "1 - Sim.\n" + "2 - Nao. \n");
				sn = ler.nextInt(); 
				if(sn == 1) {
					System.out.println("O que voce gostaria de alterar : \n" + "1 - Nome. \n" + "2 - Descricao. \n" + "3 - Valor. \n" + "4 - Porcentagem de lucro. \n" + "5 - Quantidade no estoque. \n");
					int escolhaalterar = ler.nextInt(); 
				
					switch(escolhaalterar) {
					
					case 1 : 
						
						System.out.println("Digite o novo nome para o produto : \n");
						y = ler.nextLine(); 
						y = ler.nextLine();
						produtos[i][0] = y;
						System.out.println("Alteracao feita com sucesso!\n");
						
						break; 
					
					case 2 : 
						
						System.out.println("Digite a nova descricao para o produto : \n");
						y = ler.nextLine();
						y = ler.nextLine();
						produtos[i][1] = y;
						System.out.println("Alteracao feita com sucesso!\n");
						
						break; 
					
					case 3 : 
						
						System.out.println("Digite o novo valor para o produto : \n");
						y = ler.nextLine();
						y = ler.nextLine();
						produtos[i][2] = y;
						System.out.println("Alteracao feita com sucesso!\n");
						
						break; 
						
					case 4: 
						
						System.out.println("Digite o novo valor da porcentagem de lucro do produto : \n");	
						y = ler.nextLine();
						y = ler.nextLine();
						produtos[i][3] = y;
						System.out.println("Alteracao feita com sucesso!\n");
						
						break;
					
					case 5:
						
						System.out.println("Digite a nova quantidade do produto no estoque  : \n");
						int kl = ler.nextInt();
						produtosqnt[i][1] = kl; 				
						System.out.println("Alteracao feita com sucesso!\n");
						
						break; 

					
					} 
					
				}
				if(sn == 2) {System.out.println("Nenhuma alteracao foi realizada! \n");}
				
				break;
			case 5: 
				System.out.println("Voce escolheu a opcao \"5 - Cadastro de venda.\\n");
				
				System.out.println("Lista de Clientes: \n"); 
				for(i = 0; i < 99; i++) {
					if(cadastro[i][0] != null) {
					System.out.println(i + " - " + cadastro[i][0] + " \n");
					}		
				}
				
				System.out.println("Escolha o numero de um cliente. \n");
				int k1 = ler.nextInt();
				
				while(stop == 0) {
				int xxt = 1 ;
				cont = 0;
				for(i = 0; i < 99; i++) {
					if(produtos[i][0] != null) {
					
					System.out.println(xxt + " - " + produtos[i][0] + " \n");
					cont += 1;
					xxt += 1;
					}		
				}
				
				System.out.println("Escolha o numero do produto. \n");
				int k2 = ler.nextInt();
				
				if (k2 > cont){ System.out.println("Numero invalido, por favor escolha novamente. ");
				k2 = ler.nextInt();
				}
				

				
				System.out.println("Digite a quantidade do produto que foi vendido. \n");
				int qnt = ler.nextInt(); 
				if(qnt <= produtosqnt[k2][1]) {
					produtosqnt[k2][1] = produtosqnt[k2][1] - qnt ;
					System.out.println("O cliente " + cadastro[k1][0] + " comprou mais alguma coisa? \n 1 - Sim. \n 2 - Nao. \n");
					int compra = ler.nextInt();
					if(compra == 2) {
						stop = 1;
						break;			
					} else if (compra == 1) {
						stop = 0;

					}
				
				}   else if(qnt > produtosqnt[k2][1]) {
					System.out.println("A quantidade desejada esta em falta. \n" + "Existem : " + produtosqnt[k2][1] + " no estoque. \n");
					stop = 0;
				}}
				
				
				break;
			case 6:
				System.out.println("Voce escolheu a opcao \"6 - Mostrar produtos em estoque.\\n");
				for(i = 0; i < 99; i++) {
					if(produtos[i][0] != null) {
					System.out.println(produtos[i][0] + " existem " + produtosqnt[i][1] + " no estoque. \n");
					}}
				
				break;
			case 7: 
				
				break;
}

		}
		System.out.println("Voce saiu do sistema! \n");
		
		}
	}


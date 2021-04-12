package Fiado;
import java.util.Scanner;

public class Projeto {
	public static void main(String[] args) {

		// array conjunto finito e ordenado.
		// i normalmente utilizado para uma variável de contagem.
		int[] fiados = new int[10];
//		fiados[0] = 12;
//		fiados[3] = 87;
		
		
		int i = 0;
			i++;
		
		// Para interagir com o console(usuário), se utiliza o Scanner.
		//Para converter caracter para int se utiliza o Integer.valueOf.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente:");
		String nome = scanner.nextLine();
		System.out.print("Informe o valor da compra:");
		fiados[i] = Integer.valueOf(scanner.nextLine());
		
		int vTotal = somaWhile(fiados);
		
		if (vTotal > 100) {
			System.out.println("Cliente " + nome + " deve: " + vTotal + " .ganhou brinde");
			
		} 
		else {
			System.out.println("Cliente " + nome + " deve: " + vTotal);
		}
		
		
	} 

	public static int somaWhile(int[] fiados) {
		int i = 0;
		int vTotal = 0;
		while (i < fiados.length) {
			// mesma coisa que; vTotal = total + fiados[i]
			vTotal += fiados[i];
			i++;

		}
		return vTotal;
	}
	// Aqui no for podes fazer tudo junto o que foi feito acima.
	public static int somaFor(int[] fiados) {
		int vTotal = 0;
		for (int i = 0; i < fiados.length; i++) {
			vTotal += fiados[i];
		}
		return vTotal;
	}
	
	//É uma variável que pode ser utilizadas em coisas que são 
	//enumeradas que consigo dizer qual o próximo elemento que 
	//estou analizando. Ele dispensa o incremento e variável de controle.
	
	//Nesse caso para cada fiado nesse array eu vou carregar uma variável fiado.
	
	public static int somaForEach(int[] fiados) {
		int vTotal = 0;
		for (int fiado : fiados) {
			vTotal += fiado;
		}
		return vTotal;
	}
}


		

	
		
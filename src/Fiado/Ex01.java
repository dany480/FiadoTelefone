package Fiado;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		// array conjunto finito e ordenado.
		// i normalmente utilizado para uma variável de contagem.
		int[] fiados = new int[10];
//		fiados[0] = 12;
//		fiados[3] = 87;

		// Para interagir com o console(usuário), se utiliza o Scanner.
		//Para converter caracter para int se utiliza o Integer.valueOf.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente:");
		String nome = scanner.nextLine();
		System.out.print("Informe o valor da compra:");
		fiados[0] = Integer.valueOf(scanner.nextLine());
		
		
		
		int y = 0;
		while (fiados[0] <=0 ) {
			System.out.println("Esse valor não é válido!");
			System.out.print("Informe o valor da compra: ");
			fiados[0] = Integer.valueOf(scanner.nextLine());
			
		}

		int vTotal = somaWhile(fiados);
		System.out.println(nome + " deve " + vTotal);
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
}




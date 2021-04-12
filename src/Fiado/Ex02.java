package Fiado;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		// array conjunto finito e ordenado.
		// i normalmente utilizado para uma variável de contagem.
		int[] fiados = new int[9];
//		fiados[0] = 12;
//		fiados[3] = 87;
		
		int i = 0;
		
		// Para interagir com o console(usuário), se utiliza o Scanner.
		//Para converter caracter para int se utiliza o Integer.valueOf.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente:");
		String nome = scanner.nextLine();
		System.out.print("Informe o valor da compra:");
		fiados[0] = Integer.valueOf(scanner.nextLine());
				
		
		int j = 0;
		while (j < fiados.length) {
			if ( fiados[0] > 0) {
				fiados[j] = fiados[0];
				System.out.print("Informe um novo valor da compra: ");
				fiados[0] = Integer.valueOf(scanner.nextLine());
				j++;
				
				
			} else {
				System.out.println("Esse valor não é válido!");
				System.out.print("Informe o valor da compra: ");
				fiados[0] = Integer.valueOf(scanner.nextLine());
				}
			}
		System.out.println(fiados[j]);
		}

	public static int somaWhile(int[] fiados) {
		int i = 0;
		int vTotal = 0;
		while (i > fiados.length) {
			// mesma coisa que; vTotal = total + fiados[i]
			vTotal += fiados[i];
			i++;

		}
		return vTotal;
	}
}
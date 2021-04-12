package Fiado;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente:");
		
		String nome = scanner.nextLine();
		Consumidor c1 = new Consumidor(nome);
		
		System.out.print("Informe o telefone do cliente:");
		int telefone = Integer.valueOf(scanner.nextLine());
		c1.registrarTelefone(telefone);
		
		System.out.print("Informe o valor da compra:");
		int fiados = Integer.valueOf(scanner.nextLine());
		c1.registrarFiado(fiados);
		
		int vTotal = c1.getFiado();
		
		if (vTotal > 100) {
			System.out.println("Cliente " + c1.getNome() + " deve: " + vTotal + " .ganhou brinde");
			
		} 
		else {
			System.out.println("Cliente " + c1.getNome() + " com telefone " + c1.getTelefone() + " deve: " + vTotal);
			
		}
		
	}
	public static int somaFor(int[] fiados) {
		int vTotal = 0;
		for (int i = 0; i < fiados.length; i++) {
			vTotal += fiados[i];
		}
		return vTotal;
	}
}


		



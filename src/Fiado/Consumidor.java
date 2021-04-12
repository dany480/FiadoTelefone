package Fiado;

import java.util.Scanner;

public class Consumidor {
	// Atributos
	//Modificadores - Package 
	private String nome;
	private int[] fiados;
	private int posicao = 0;
	private int telefone = 0 ;
	
	
	//construtor
	public Consumidor(String nome) {
		this.nome = nome;
		this.fiados = new int[10];
		
	}
	
	public Consumidor (int telefone) {
		this.telefone = telefone;
	}
	
	//getter e setter
	//permitem ou restringin algum tipo de operação.
	// Get = acesso(pega uma informação)
	// Set = modificador(modificam o que esta dentro do objeto)
	// normalmente lidam com abstrações.
	
	public String getNome() {
		return this.nome;		
	}
	public int getTelefone() {
		return this.telefone;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public void registrarTelefone(int tel) {
		this.telefone = tel;
	}
	
	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
	}
	
	public int getFiado() {
		int vTotal = 0;
		for (int fiado : fiados) {
			vTotal += fiado;
			posicao++;
		}
		return vTotal; 
	}
}
	
	

		


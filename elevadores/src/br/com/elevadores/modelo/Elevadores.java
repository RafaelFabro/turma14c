package br.com.elevadores.modelo;

public class Elevadores {

	
	private byte andarMaximo = 15;
	private byte andarMinimo = 0;
	private byte capacidadePessoas = 7;
	private byte qtdPessoas;
	private byte andarAtual;
	private String nome;
	
	
		
	
	public void entrar() {
		if (qtdPessoas<7) 
		qtdPessoas+=1;
	}
	public byte retornarPessoas() {
		return qtdPessoas;
	}
	
	public void sair() {
		if (qtdPessoas>=1) 
		qtdPessoas-=1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
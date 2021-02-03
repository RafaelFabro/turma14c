package br.com.ecommerce.modelo;

public class Cliente {

	private String nome;
	private String telefone;
	private Endereco endereco;
	
	
	public String identificarCliente() {
		if (this instanceof ClientePF) {
			return "Pessoa f�sica";
		}else if (this instanceof ClientePJ) {
			return "Pessoa jur�dica";
		}else {
			return "Pessoa";
		}
	}
	
	
	
	public String getBasico() {
		return null;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}



	public void setAll(String nome, String telefone, Endereco endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
		
	
		
	public Cliente() {
		super();
	}


	public Cliente(String nome, String telefone, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

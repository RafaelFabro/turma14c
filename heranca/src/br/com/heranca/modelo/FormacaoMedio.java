package br.com.heranca.modelo;

import br.com.heranca.util.PadraoFormacao;

public class FormacaoMedio extends Formacao implements PadraoFormacao {

	private String tipo;

public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 500);
	}
	
	@Override
	public String toString() {
		return "FormacaoMedio [tipo=" + tipo + "," + super.toString() + "]";
	}

	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super.setAll(descricao, periodo, mensalidade, duracao);setAll(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	public FormacaoMedio() {
		super();
	}

	public FormacaoMedio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String calcularDesconto(float porc) {
		// TODO Auto-generated method stub
		return "desconto médio";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

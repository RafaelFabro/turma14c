package br.com.ecommerce.modelo;

public class Pagamento {

	private String forma;
	private String valor;
	
	public Pagamento() {
		super();
	}


	@Override
	public String toString() {
		return "Pagamento [forma=" + forma + ", valor=" + valor + "]";
	}


	public void setAll(String forma, String valor) {
		this.forma = forma;
		this.valor = valor;
	}
	
	
	public Pagamento(String forma, String valor) {
		super();
		this.forma = forma;
		this.valor = valor;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package br.com.ecommerce.modelo;

public class Produto {

	
	
	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;
	
	public void setAll(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		this.id=id;
		this.descricao=descricao;
		this.valorVenda=valorVenda;
		this.valorCompra=valorCompra;
		this.qtde=qtde;
	}
		
	public void atualizarValores(float porc) {
		valorVenda = valorVenda + valorVenda * (porc/100);
		valorCompra = valorCompra + valorCompra * (porc/100);
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + "descri��o" + descricao + "Valor de venda" + valorVenda + "Valor de compra" + valorCompra + "Quantidade" + qtde + "]";
	}
	
	/*
	 * public String getAll() {
	 * return "ID do produto: " + getId() + "\nDescri��o: " + descricao + "\nValor de venda: " + valorVenda + "\nValor de compra: " + valorCompra + "\nQuantidade em estoque: " + qtde;
	}
	*/
	public float getTotalCompra() {
		return valorCompra*qtde;
	}
	
	public float getTotalVenda() {
		return valorVenda*qtde;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

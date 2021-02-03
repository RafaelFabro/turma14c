package br.com.ecommerce.modelo;

public class Venda {

	private int notafiscal;
	private String data;
	private float total;
	private Produto produto;
	private Cliente cliente;
	private Pagamento pagamento;
	
	
			
	@Override
	public String toString() {
		return "Venda [notafiscal=" + notafiscal + ", data=" + data + ", total=" + total + ", produto=" + produto
				+ ", cliente=" + cliente + ", pagamento=" + pagamento + "]";
	}

	public Venda() {
		super();
	}

	public void setAll(int notafiscal, String data, float total, Produto produto, Cliente cliente,
			Pagamento pagamento) {
		this.notafiscal = notafiscal;
		this.data = data;
		this.total = total;
		this.produto = produto;
		this.cliente = cliente;
		this.pagamento = pagamento;
	}
	
	public Venda(int notafiscal, String data, float total, Produto produto, Cliente cliente,
			Pagamento pagamento) {
		super();
		this.notafiscal = notafiscal;
		this.data = data;
		this.total = total;
		this.produto = produto;
		this.cliente = cliente;
		this.pagamento = pagamento;
	}
	
	public int getNotafiscal() {
		return notafiscal;
	}
	public void setNotafiscal(int notafiscal) {
		this.notafiscal = notafiscal;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

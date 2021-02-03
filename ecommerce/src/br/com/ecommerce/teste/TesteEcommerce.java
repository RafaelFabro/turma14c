package br.com.ecommerce.teste;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Pagamento;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.util.Magica;

public class TesteEcommerce {

	
	
	
	public static void main(String[] args) {
		
		Venda venda = new Venda(
				Magica.i("Id"),
				new Cliente(
						Magica.s("Nome"),
						new Endereco(
								s("Logradouro"),
								s("numero da classe"),
								"ALLIANCE PARK",
								"AGUA BRANCA",
								"SÃO PAULO",
								"SP",
								"12345-111"
								),
						"1234-4321"
						),
				new Produto(
						1,
						"CHURRO",
						15,
						100
						),
				"10/10/2020",
				1500,
				new Pagamento(
						"VISTA",
						"1500"
						)				
				);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

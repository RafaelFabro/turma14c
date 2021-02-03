package br.com.ecommerce.teste;

import br.com.ecommerce.modelo.ClientePF;
import br.com.ecommerce.modelo.ClientePJ;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.util.Magica;

public class ImplementarCliente {

	public static void main(String[] args) {
		
		char resp = Magica.s("Digite <F> para Fisica ou <J> para Juridica").charAt(0);
		
		if (resp=='F') {
			ClientePF pf = new ClientePF();
			pf.setCpf(Magica.s("CPF"));
			pf.setEndereco(new Endereco());
			pf.setNome(Magica.s("Nome"));
			pf.setRg(Magica.s("RG"));
			pf.setTelefone(Magica.s("Telefone"));
			System.out.println(pf.toString());
		}else if (resp=='J') {
			ClientePJ pj = new ClientePJ();
			pj.setAll(
					Magica.s("Nome"),
					Magica.s("Fone"),
					new Endereco(),
					Magica.s("CNPJ"),
					Magica.s("Contato")					
					);
			System.out.println(pj.toString());
			
		}else {
			System.out.println("Opção inválida");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

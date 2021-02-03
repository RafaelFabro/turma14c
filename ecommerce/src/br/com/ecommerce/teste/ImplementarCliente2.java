package br.com.ecommerce.teste;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.ClientePF;
import br.com.ecommerce.modelo.ClientePJ;
import br.com.ecommerce.util.Magica;

public class ImplementarCliente2 {

	public static void main(String[] args) {
		
		
char resp = Magica.s("Digite <F> para Fisica ou <J> para Juridica").charAt(0);
Cliente objeto = new Cliente();
		if (resp=='F') {
			objeto = new ClientePF();
			
		}else if (resp=='J') {
			objeto = new ClientePJ();
						
		}else {
			System.out.println("Opção inválida");
		}
		
		System.out.println(objeto.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

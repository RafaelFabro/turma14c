package br.com.concessionaria.teste;

import javax.swing.JOptionPane;

import br.com.concessionaria.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Veiculo objeto = new Veiculo();
		objeto.preencherModelo(JOptionPane.showInputDialog("Digite o modelo"));
		System.out.println(objeto.retornarModelo());
		
		objeto.preencherPlaca(JOptionPane.showInputDialog("Digite a placa"));
		System.out.println(objeto.retornarPlaca());
		
		objeto.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor")));
		System.out.println(objeto.retornarValor());
				
		objeto.preencherStatus(true);
		System.out.println(objeto.retornarStatus());
		objeto.preencherVelocidadeAtual(40);
		System.out.println(objeto.retornarVelocidadeAtual());
		
		System.out.println("Desconto: " + objeto.retornarDesconto());
		System.out.println(objeto.aplicarReajuste(10));
		System.out.println("Valor Atualizado: " + objeto.retornarValor());
		System.out.println("==========Teste de velocidade=======");
		objeto.preencherAcelerar(20);
		System.out.println(objeto.retornarResumo());
		
		
		
		
	}

}

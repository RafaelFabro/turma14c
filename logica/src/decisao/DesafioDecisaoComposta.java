package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog("Digite o produto");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em estoque"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de venda"));
		float valortotal = valor * quantidade; 
		
		System.out.println("Produto: " + produto);
		
		if (quantidade<5) {
			System.out.println("Estoque emergencial");
		}else if (quantidade>20) {
			System.out.println("Estoque alto");
		}else if (quantidade>=10 && quantidade<=20) {
			System.out.println("Estoque m�dio");
		}else {
			System.out.println("Estoque baixo");
		}
	
		System.out.println("Valor total do estoque: " + valortotal);
		System.out.println("Valor com desconto de 10%: " + valor * 0.9);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

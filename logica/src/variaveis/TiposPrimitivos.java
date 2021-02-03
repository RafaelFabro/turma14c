package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {


public static void main(String[] args) {
	
	String marca = JOptionPane.showInputDialog("Digite a marca da televisao");
	int polegadas = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da tela"));
	double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
	int voltagem = Integer.parseInt(JOptionPane.showInputDialog("Digite a voltagem"));
	int estoque = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade em estoque"));
	
	System.out.println("Marca: " + marca);
	System.out.println("Polegadas.: " + polegadas);
	System.out.println("Valor: " + valor + " reais");
	System.out.println("Voltagem:" + voltagem);
	System.out.println("Estoque:" + estoque + " unidades");
	
	
	
	
	
	
	
	
	
	
	
	
	
}
























}

package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		for (int contador=1;contador<11;contador+=1) {
			System.out.println(tabuada + " X " + contador + " = " + (contador*tabuada));
		}
		
		
		
		
		
		
		
		
		
		
	}

}
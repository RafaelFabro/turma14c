package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));
		System.out.println(nome);
		
		
		if (idade<16) {
			System.out.println("Voc� ainda n�o pode votar.");
		}
		
		if (idade>=18 && idade<70) {
			System.out.println("Seu voto � obrigat�rio.");
		}
		
		if (idade==16 || idade==17 || idade>=70) {
			System.out.println("Seu voto � facultativo.");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}

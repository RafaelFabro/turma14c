package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina");
		float PR1 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota 1"));
		float PR2 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota 2"));
		float media = (PR1+PR2)/2;		
		if (media>=6) {
			System.out.println("Parab�ns, voc� est� aprovado!!!");
		}
		
		if (media<=4) {
			System.out.println("Voc� est� reprovado.");
		}
		
		if (media<6 && media>=4) {
			System.out.println("Voc� est� em Prova Final.");
		}
		
		System.out.println("Disciplina: " + disciplina);		
		System.out.println("Media: " + (PR1 + PR2)/2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Digite a disciplina");
		byte faltas = Byte.parseByte(JOptionPane.showInputDialog("Quantidade de Faltas"));
		if (faltas>=20) {
			System.out.println("Voc� est� reprovado por quantidade de faltas");
		}else {		
			float PR1 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota 1"));
			float PR2 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota 2"));
			float media = (PR1+PR2)/2;

			if (media>=6) {
				System.out.println("Parab�ns, voc� est� aprovado!!!");
			}else if (media<=4) {
				System.out.println("Voc� est� reprovado.");
			}else {
				System.out.println("Voc� est� em Prova Final.");
			}

			System.out.println("Disciplina: " + disciplina);		
			System.out.println("Media: " + (PR1 + PR2)/2);
		}
















































		}

	}

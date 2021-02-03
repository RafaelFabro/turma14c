package repeticao;

import javax.swing.JOptionPane;

public class DesafiosRepeticao {

	public static void main(String[] args) {

		/*
		String estacao = JOptionPane.showInputDialog("Digite sua estação do ano favorita, sem acentuação. Para encerrar, digite fim.").toLowerCase();
		int verao=0;
		int outono=0;
		int inverno=0;
		int primavera=0;
		int total=verao+outono+inverno+primavera;
		
		do {
			estacao = (JOptionPane.showInputDialog("Digite sua estação do ano favorita, sem acentuação. Para encerrar, digite fim."));
			
			if (estacao.equals("verao")) {
				verao=verao+1;
			}else if(estacao.equals("outono")) {
				outono=outono+1;
			}else if (estacao.equals("inverno")) {
				inverno=inverno+1;
			}else if (estacao.equals("primavera")) {
				primavera=primavera+1;
			}
			
		}while (estacao.equals("verao") || estacao.equals("inverno") || estacao.equals("outono") || estacao.equals("primavera")) ;
		
		
		System.out.println("Verao: " + verao + " pessoas.");
		System.out.println("Outono: " + outono + " pessoas.");
		System.out.println("Inverno: " + inverno + " pessoas.");
		System.out.println("Primavera: " + primavera + " pessoas.");
*/


		String nome = "";
		short idade = 0;
		short qtdeMaioresIdade=0;
		int totalIdades=0;
		short qtdePessoas=0;
		String nomeMaisExperiente="";
		short idadeMaisExperiente=0;
		String nomeMaisJovem="";
		short idadeMaisJovem=0;
		
		do {
			nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
			idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
			
			qtdePessoas++;
			totalIdades=totalIdades+idade; // totalIdade+=idade;
			
			if (idade>17) {
				qtdeMaioresIdade++;
			}
			
			if (idade>idadeMaisExperiente) {
				idadeMaisExperiente= idade;
				nomeMaisExperiente=nome;
			}
			
			if (idade<idadeMaisJovem || qtdePessoas==1) {
				idadeMaisJovem=idade;
				nomeMaisJovem=nome;
			}
			
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Título", JOptionPane.YES_NO_OPTION)==0);
		
		JOptionPane.showMessageDialog(null, qtdeMaioresIdade + " pessoas são maiores de idade");
		JOptionPane.showMessageDialog(null, "Média de Idade: " + (totalIdades/qtdePessoas));
		JOptionPane.showMessageDialog(null, "Mais Experiente: " + nomeMaisExperiente + "\nIdade: " + idadeMaisExperiente);
		JOptionPane.showMessageDialog(null, "Mais Jovem: " + nomeMaisJovem + "\nIdade: " + idadeMaisJovem);



		}

	}

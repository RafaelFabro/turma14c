package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoEncadeada2 {

	public static void main(String[] args) {
		
		//hotel cobra 80 a diaria + taxa de servi�os conforme tabela abaixo:
		//5,50 por diaria se o per�odo � maior do que 15 di�rias
		//6,00 por di�ria em caso de 15 di�rias
		//8,00 por di�ria para per�odos inferiores a 15 diarias
		
		String nome = JOptionPane.showInputDialog("Cliente");
		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Total de di�rias"));
		double fixo = 80.0;
		double estadialonga = 5.5;
		double estadiacurta = 8.0;
		double estadiamedia = 6.0;
		
		System.out.println("Conta do cliente: " + nome);
		if (diarias==15) {
			System.out.println((diarias * estadiamedia)+(diarias*fixo));
		}else if (diarias>15) {
			System.out.println((diarias * estadialonga)+(diarias*fixo));
		}else if (diarias<15) {
			System.out.println((diarias * estadiacurta)+(diarias*fixo));
		}
		
		
		
		
		
		
		

	}

}

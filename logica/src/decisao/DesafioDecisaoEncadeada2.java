package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoEncadeada2 {

	public static void main(String[] args) {
		
		//hotel cobra 80 a diaria + taxa de serviços conforme tabela abaixo:
		//5,50 por diaria se o período é maior do que 15 diárias
		//6,00 por diária em caso de 15 diárias
		//8,00 por diária para períodos inferiores a 15 diarias
		
		String nome = JOptionPane.showInputDialog("Cliente");
		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Total de diárias"));
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

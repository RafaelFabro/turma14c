package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoEncadeada {

	public static void main(String[] args) {
		
		
		String cidade = JOptionPane.showInputDialog("Cidade");
		float IDH = Float.parseFloat(JOptionPane.showInputDialog("IDH da Cidade"));
		int populacao = Integer.parseInt(JOptionPane.showInputDialog("População"));
		
		System.out.println(cidade);
			
		if (populacao>200000) {
			if (IDH>0.9) {
				System.out.println("Cidade perfeita");
			}else if (IDH<0.75) {
				System.out.println("Cidade precisa de cuidados");
			}else {
				System.out.println("Boa Cidade");
			}
		}else {
			if (IDH<0.85) {
				System.out.println("Cidade precisa de cuidados");
			}else {
				System.out.println("Boa cidade");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

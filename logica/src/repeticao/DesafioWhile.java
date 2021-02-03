package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		
				
		String usuario = JOptionPane.showInputDialog("Digite o usuário").toUpperCase();
		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia"));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mes"));
		short ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano"));
		
		while(usuario.length()<=5 || usuario.length()>=20) {
			usuario = JOptionPane.showInputDialog("Digite o usuário novamente").toUpperCase();
		}
		
		while (ano>=2003) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano novamente"));
		}
		
		while (mes<1 || mes>12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mes novamente"));
		}
		
		if (mes==2) {
			while(dia<1 || dia>29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}else if (mes==4 || mes==6 || mes==9 || mes==11) {
			while (dia<1 || dia>30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}else {
			while (dia<1 || dia>31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}
		
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
		System.out.println("Usuário: " + usuario);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

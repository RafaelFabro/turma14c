package variaveis;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String email = "DfRet2@YahoO.coM.Br";
				System.out.println("Original" + email);
				System.out.println("Minusculas: " + email.toLowerCase());
				System.out.println("Maiusculas: " + email.toUpperCase());
				System.out.println("Tamanho: " + email.length());
				System.out.println("Terceiro Caracter:" + email.charAt (2));
				System.out.println("Tem arroba?" + email.contains("@"));
				System.out.println("Posi��o do @: " + email.indexOf("@"));
				System.out.println("Do 3� at� o 5�: " + email.substring(2,4));
				System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
				System.out.println("Segunda metade: " + email.substring(email.length()/2,email.length()));
				System.out.println("Usu�rio: " + email.substring(0,email.indexOf("@")));
				System.out.println("Servidor: " + email.substring(email.indexOf("@")+1,email.length()));
				System.out.println("� igual a dfret2@yahoo.com.br? " + email.contentEquals("dfret2@yahoo.com.br"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
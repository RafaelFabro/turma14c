package br.com.heranca.teste;

import br.com.heranca.modelo.Formacao;
import br.com.heranca.modelo.FormacaoBacharelado;
import br.com.heranca.modelo.FormacaoMedio;
import br.com.heranca.modelo.FormacaoTecnologo;
import br.com.heranca.util.Magica;

public class TesteFormacao {

	public static void main(String[] args) {
		
		
char resp = Magica.s("Digite <T> para Tecnologo, <B> para Bacharelado ou <M> para Médio").charAt(0);
		Formacao formacao = new Formacao();
		
		if (resp=='T') {
			formacao = new FormacaoTecnologo();
			formacao.setPlanoEstendido(Magica.b(Magica.s("Plano Estendido?")));
			formacao.setDescricao(Magica.s("Descrição"));
			formacao.setPeriodo(Magica.i("Período"));
			formacao.setMensalidade(Magica.d("Mensalidade"));
			formacao.setDuracao(Magica.i("Duração"));
			System.out.println(formacao.toString());
		
		}else if (resp=='B') {
			formacao = new FormacaoBacharelado();
			formacao.setProjetoConclusao(Magica.s("Descrição"));
			formacao.setCargaHorariaEstagio(Magica.i("Carga horária do estágio"));
			formacao.setDescricao(Magica.s("Descrição"));
			formacao.setPeriodo(Magica.i("Período"));
			formacao.setMensalidade(Magica.d("Mensalidade"));
			formacao.setDuracao(Magica.i("Duração"));
			System.out.println(formacao.toString());
			
		}else if (resp=='M') {
			formacao = new FormacaoMedio();
			formacao.setTipo(Magica.s("Tipo"));
			formacao.setDescricao(Magica.s("Descrição"));
			formacao.setPeriodo(Magica.i("Período"));
			formacao.setMensalidade(Magica.d("Mensalidade"));
			formacao.setDuracao(Magica.i("Duração"));
			System.out.println(formacao.toString());
			
		}else {
			System.out.println("Opção inválida");
		}
	
		formacao.definirDuracao();
		formacao.calcularMensalidade(0.015);
		System.out.println(formacao.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

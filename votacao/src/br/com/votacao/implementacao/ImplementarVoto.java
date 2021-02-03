package br.com.votacao.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.votacao.beans.Candidato;
import br.com.votacao.beans.Eleitor;
import br.com.votacao.beans.Pessoa;
import br.com.votacao.beans.Urna;
import br.com.votacao.beans.Voto;
import br.com.votacao.util.Magica;

public class ImplementarVoto {

	public static void main(String[] args) {
		
		Pessoa candidato1 = new Candidato(
				"XPTO",
				5121,
				"VEREADOR",
				"PXDB"
				);
		
		Pessoa candidato2 = new Candidato(
				"ABC",
				4320,
				"VEREADOR",
				"PCX"
				);
		List<Voto> votos = new ArrayList<Voto>();	
		
		do {
			Pessoa escolha = new Candidato();
			if(JOptionPane.showConfirmDialog
					(null, "Sim para Candidato 1?", "Votação", JOptionPane.YES_NO_OPTION)==0) {
				
			}else {			
			
			Voto voto = new Voto(
			new Eleitor(Magica.s("Nome"),Magica.i("Título"),true),escolha,true);
			votos.add(voto);
		}while(JOptionPane.showConfirmDialog(null,"Continuar?", "Votação", JOptionPane.YES_NO_OPTION)==0);
				
		Urna urna = new Urna(
				Magica.i("Zona"),
				Magica.i("Seção"),
				Magica.s("Cidade"),
				votos
				);
		
		System.out.println(urna);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		

	}

}

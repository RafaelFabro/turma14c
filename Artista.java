package br.com.projetofinal.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_ARTISTA")
public class Artista {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nomeartistico", length=30)
	private String nomeartistico;
	
	@Column(name="nacionalidade", length=30)
	private String nacionalidade;

	@JsonIgnoreProperties("artista")
	@OneToMany(mappedBy="artista", cascade=CascadeType.ALL)
	private List<Musica> musicas;
	
	@Override
	public String toString() {
		return "Artista [id=" + id + ", nomeartistico=" + nomeartistico + ", nacionalidade=" + nacionalidade + "]";
	}

	
	
	public Artista() {
		super();
	}

	public Artista(int id, String nomeartistico, String nacionalidade, List<Musica> musicas) {
		super();
		this.id = id;
		this.nomeartistico = nomeartistico;
		this.nacionalidade = nacionalidade;
		this.musicas = musicas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeartistico() {
		return nomeartistico;
	}

	public void setNomeartistico(String nomeartistico) {
		this.nomeartistico = nomeartistico;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	
	
	
	
	
	
	
}

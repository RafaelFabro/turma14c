package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.ArtistaDAO;

@RestController
@CrossOrigin("*")
public class ArtistaController {

	@Autowired
	private ArtistaDAO dao;
	
	
	
	@GetMapping("/artista/{cod}")
	public ResponseEntity<Artista>  getUser(@PathVariable int cod) {
		Artista objeto = dao.findById(cod).orElse(null);
		if (objeto==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(objeto);
	}
	
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> getAll(){		
		List<Artista> lista = (List<Artista>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
		
	}
	
	@GetMapping("/nacionalidade/{cod}")
	public ResponseEntity<Artista>  getUser(@PathVariable String cod) {
		Artista objeto = dao.findByNacionalidade(cod);
		if (objeto==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(objeto);
	}
	
		
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> gravar(@RequestBody Artista objeto){
		
		try {
		if(objeto.getNomeartistico().length()>30) {
			return ResponseEntity.status(403).build();
		}
		dao.save(objeto);
		return ResponseEntity.ok(objeto);
	}catch(Exception e){
		return ResponseEntity.status(403).build();
	}
}
	
	@GetMapping("/deletarartista/{cod}")
	public ResponseEntity deletarartista(@PathVariable int cod) {
		dao.deleteById(cod);
		
		return ResponseEntity.ok(cod);
	}
	
	
	
	
	
}

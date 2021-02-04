package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {

	public Usuario findByEmailAndSenha(String email, String senha);
	
	/*
	 * Métodos que o Spring cria são:
	 * save() => gravar ou atualizar um dado
	 * findById() => consultar pela chave primária
	 * findAll() => consulta todas as linhas
	 * deleteById() => apagar através da chave primária
	 * deleteAll() => apagar tudo
	 * count() => retonar a qtde de linhas
	 * existsById() => retorna um boolean se existe ou não
	 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
	 */

	
	
	
	
	
	
	
	
	
	
}

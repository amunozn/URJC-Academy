package com.dad.urjcacademy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dad.urjcacademy.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	/** Select **/
	Usuario findByLogin(String login);
	Usuario findByLoginAndPass(String login, String pass);
	Usuario findByMaiLogin(String maiLogin);
	List<Usuario> findByRol(String rol);
	
	/** Delete **/
	Usuario deleteByMaiLogin(String maiLogin);
	
	
}

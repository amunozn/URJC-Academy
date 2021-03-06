package com.dad.urjcacademy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String login;
	private String maiLogin;
	private String pass;
	private String rol;
	
	/** Constuctores de Entidad **/
	
	public Usuario() {
		
	}
	
	public Usuario(String login,String maiLogin, String pass, String rol) {
		this.login = login;
		this.maiLogin = maiLogin;
		this.pass = pass;
		this.rol = rol;
	}
	
	/** Métodos de acceso a atributos de Usuario**/
	
	public long getId() {
		return id;
	}
	
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getMaiLogin() {
		return maiLogin;
	}
	
	public void setMaiLogin(String maiLogin) {
		this.maiLogin = maiLogin;
	}
	
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	public String getRol() {
		return rol;
	}
	
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	@Override
	public String toString() {
		return "Usuario: " + id +" [login: " + login + ", correo: " + maiLogin +", roll: " + rol + ", pass: " + pass +"]";
	}
	
	/** Operaciones de Usuario **/
	
	/** Públicas **/
	
	/** Protegídas || Privadas **/
	
	
 	
	
	

	
	
	
	
}

package br.com.springbootuninter.model;

import java.time.LocalDate;

public class Cliente {
	private Long id;
	private String nome;
	private LocalDate dataDeNacimento;
	private Sexo sexo;
	private String telefone;
	private String celulcar;
	private String email;
	private boolean ativo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataDeNacimento() {
		return dataDeNacimento;
	}
	public void setDataDeNacimento(LocalDate dataDeNacimento) {
		this.dataDeNacimento = dataDeNacimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelulcar() {
		return celulcar;
	}
	public void setCelulcar(String celulcar) {
		this.celulcar = celulcar;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}

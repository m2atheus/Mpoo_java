package model;

import java.util.ArrayList;

public class Proprietario {
	
	private String cpf;
	private String nome;
	private String email;
	private int brinde;
	private Telefone telefone;
	public ArrayList<Animal> animais = new ArrayList<Animal>();
	
//	public Proprietario(String cpf, String nome, String email, int brinde, Telefone telefone,
//			ArrayList<Animal> animais) {
//		this.cpf = cpf;
//		this.nome = nome;
//		this.email = email;
//		this.brinde = brinde;
//		this.telefone = telefone;
//		this.animais = animais;
//	}
	public Proprietario(String cpf, String nome, String email, int brinde, Telefone telefone, Animal animal) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.brinde = brinde;
		this.telefone = telefone;
		adicionarAnimal(animal);
	}
	public void adicionarAnimal(Animal animal) {
		this.animais.add(animal);
	}

	public int getBrinde() {
		return brinde;
	}
	public void setBrinde(int brinde) {
		this.brinde = brinde;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	

}

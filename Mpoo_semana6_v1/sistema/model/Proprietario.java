package model;

import java.util.ArrayList;

public class Proprietario extends Pessoa{
	
	private int brinde;
	private ArrayList<Animal> animais;
	public Proprietario(String nome, String cpf, String email, Telefone telefone, int brinde,
			Animal animal) {
		super(nome, cpf, email, telefone);
		this.brinde = brinde;
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

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	
	

}

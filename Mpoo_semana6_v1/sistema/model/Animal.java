package model;

public class Animal {
	
	private String id;
	private String tipo;
	private String nome;
	private String raca;
	private int idade;
	private double peso;
	
	public Animal(String id, String tipo, String nome, String raca, int idade, double peso) {
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Animal [id=" + id + ", tipo=" + tipo + ", nome=" + nome + ", raca=" + raca + ", idade=" + idade
				+ ", peso=" + peso + "]";
	}
	
	

}

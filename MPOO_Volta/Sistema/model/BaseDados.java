package model;

import java.util.ArrayList;

public class BaseDados {
	
	private static ArrayList<Proprietario> proprietarios;
	private static ArrayList<Animal> animaisDisponiveis;
	
	
	public static void createBase() {
		
		proprietarios = new ArrayList<Proprietario>();
		animaisDisponiveis = new ArrayList<Animal>();
		
		inicializarBase();
	}
	
	
	private static void inicializarBase() {
		proprietarios.add(new Proprietario("111.111.111-11", "José Santos", "jose@gmail.com", 0,
				new Telefone(55, 81, "99999-0009"), new Animal("gt001", "gato", "pixano", null, 0, 0)));
		animaisDisponiveis.add(new Animal("gt002", "gato", "miau", "vira-lata", 1, 0.4));
		animaisDisponiveis.add(new Animal("ca001", "cachorro", "tot", "poodle", 2, 3.8));
		
	}
	

}

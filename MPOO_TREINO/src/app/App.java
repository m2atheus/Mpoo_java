package app;

import controller.AberturaController;
import controller.CadastrarController;
import controller.CadastrarUsuarioController;
import controller.LoginController;
import view.AberturaView;
import view.CadastrarView;
import view.LoginView;

public class App {

	public static void main(String[] args) {

		
		AberturaView aberturaView = new AberturaView();
		LoginView loginView = new LoginView();
		CadastrarView cadatroView = new CadastrarView();
		
		AberturaController aberturaController = new AberturaController(aberturaView, loginView);
		LoginController loginController = new LoginController(aberturaView, loginView, cadatroView);
		CadastrarController cadastrarController = new CadastrarController(aberturaView, loginView, cadatroView);
		CadastrarUsuarioController cadastrarUsuarioController = new CadastrarUsuarioController(cadatroView);

	}

}

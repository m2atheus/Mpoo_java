package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import view.AberturaView;
import view.CadastrarView;
import view.LoginView;

public class LoginController {

	AberturaView aberturaView;
	LoginView loginView;
	CadastrarView cadastrarView;
	ButtonHandler buttonHandler;
	WindowHandler windowHandler;
	
	public LoginController(AberturaView aberturaView,LoginView loginView,CadastrarView cadastrarView) {
		
		this.aberturaView = aberturaView;
		this.loginView = loginView;
		this.cadastrarView = cadastrarView;
		buttonHandler = new ButtonHandler();
		windowHandler = new WindowHandler();
		
		control();
	}
	
	private void control() {
		
		loginView.addWindowListener(windowHandler);
		loginView.getEntraButton().addActionListener(buttonHandler);
		loginView.getSairButton().addActionListener(buttonHandler);
		
	}
	
	private void updateView(){
		loginView.setVisible(false);
		aberturaView.setVisible(true);
	}
	
	private class WindowHandler extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			updateView();
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == loginView.getEntraButton()) {
				loginView.setVisible(false);
				cadastrarView.setVisible(true);
			}
			if(e.getSource() == loginView.getSairButton()) {
				updateView();
			}
			
			
		}
		
	}
}

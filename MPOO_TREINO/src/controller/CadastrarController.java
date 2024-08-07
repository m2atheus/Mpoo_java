package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import util.SpringUtilities;
import view.AberturaView;
import view.CadastrarView;
import view.LoginView;
import view.MensagemView;

public class CadastrarController {
	
	CadastrarView cadastrarView;
	LoginView loginView;
	AberturaView aberturaView;
	MenuHendler menuHendler;
	WindowHandler windowHandler;
	RadioHandler radioHandler;
	
	public CadastrarController(AberturaView aberturaView,LoginView loginView,CadastrarView cadastrarView) {
		
		this.aberturaView = aberturaView;
		this.loginView = loginView;
		this.cadastrarView = cadastrarView;

		menuHendler = new MenuHendler();
		windowHandler = new WindowHandler();
		radioHandler = new RadioHandler();
		control();
	}
	private void control() {
		cadastrarView.getLogooffItem().addActionListener(menuHendler);
		cadastrarView.getExitItem().addActionListener(menuHendler);
		cadastrarView.getUsuarioItem().addActionListener(menuHendler);
		cadastrarView.addWindowListener(windowHandler);
		cadastrarView.getCadastrarPanelView().getClienteRadioButton().addActionListener(radioHandler);
		cadastrarView.getCadastrarPanelView().getFuncioRadioButton().addActionListener(radioHandler);
		
		
	}
	
	
	private class RadioHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(cadastrarView.getCadastrarPanelView().getClienteRadioButton().isSelected()) {
				cadastrarView.getCadastrarPanelView().getSalarioLabel().setVisible(false);
				cadastrarView.getCadastrarPanelView().getSalarioField().setVisible(false);
				cadastrarView.getCadastrarPanelView().getMatriculaLabel().setVisible(false);
				cadastrarView.getCadastrarPanelView().getMatriculaField().setVisible(false);
				cadastrarView.getCadastrarPanelView().getPropagandaBox().setVisible(true);
			}
			else if(cadastrarView.getCadastrarPanelView().getFuncioRadioButton().isSelected()) {
			
				cadastrarView.getCadastrarPanelView().getSalarioLabel().setVisible(true);
				cadastrarView.getCadastrarPanelView().getSalarioField().setVisible(true);
				cadastrarView.getCadastrarPanelView().getMatriculaLabel().setVisible(true);
				cadastrarView.getCadastrarPanelView().getMatriculaField().setVisible(true);
				cadastrarView.getCadastrarPanelView().getPropagandaBox().setVisible(false);
			}
			
		}
		
	}

	
	
	private class MenuHendler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == cadastrarView.getLogooffItem()){
				cadastrarView.setVisible(false);
				loginView.setVisible(true);
			}
			else if(e.getSource() == cadastrarView.getExitItem()) {
				int resp = MensagemView.mostrarMensagem(MensagemView.MENSAGEM_SAIR);
				if(resp == 0)
					System.exit(0);
			}
			if(e.getSource() == cadastrarView.getUsuarioItem()) {
				cadastrarView.getCadastrarPanelView().setVisible(true);
			}
			
		}
		
	}
	
	private class WindowHandler extends WindowAdapter{

		

		@Override
		public void windowClosing(WindowEvent e) {
			cadastrarView.setVisible(false);
			loginView.setVisible(true);
			
		}

	}

}

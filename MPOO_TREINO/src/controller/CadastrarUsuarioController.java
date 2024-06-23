package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import view.CadastrarView;

public class CadastrarUsuarioController {
	
	CadastrarView cadastrarView;
	ButtonHandler buttonHandler;
	Fieldhandler fieldhandler;
	
	
	
	public CadastrarUsuarioController(CadastrarView cadastrarView) {
		this.cadastrarView = cadastrarView;
		
		buttonHandler = new ButtonHandler();
		fieldhandler = new Fieldhandler();
		
		control();
	}
	
	private void control(){
		cadastrarView.getCadastrarPanelView().getAdicionarButton().addActionListener(buttonHandler);
		cadastrarView.getCadastrarPanelView().getNomeField().addCaretListener(fieldhandler);
		cadastrarView.getCadastrarPanelView().getCpfField().addCaretListener(fieldhandler);
		cadastrarView.getCadastrarPanelView().getFoneField().addCaretListener(fieldhandler);
		cadastrarView.getCadastrarPanelView().getEmailField().addCaretListener(fieldhandler);
		cadastrarView.getCadastrarPanelView().getNomeField().addFocusListener(fieldhandler);
		cadastrarView.getCadastrarPanelView().getCpfField().addFocusListener(fieldhandler);
		cadastrarView.getCadastrarPanelView().getFoneField().addFocusListener(fieldhandler);
		cadastrarView.getCadastrarPanelView().getEmailField().addFocusListener(fieldhandler);
		
		
	}


	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}

	
	private class Fieldhandler implements CaretListener,FocusListener{

		@Override
		public void caretUpdate(CaretEvent e) {
			
			
			if(cadastrarView.getCadastrarPanelView().getNomeField().getText().length() > 0 &&
	        	!cadastrarView.getCadastrarPanelView().getNomeField().getText().equalsIgnoreCase("Nome Completo") &&
	        	!cadastrarView.getCadastrarPanelView().getCpfField().getText().equalsIgnoreCase("   .   .   -  ") &&
	        	!cadastrarView.getCadastrarPanelView().getFoneField().getText().equalsIgnoreCase("(  )     -    ") &&
	        	cadastrarView.getCadastrarPanelView().getEmailField().getText().length() > 0
					) {
				cadastrarView.getCadastrarPanelView().getAdicionarButton().setEnabled(true);
			}else {
				cadastrarView.getCadastrarPanelView().getAdicionarButton().setEnabled(false);
			}
				
			
		}
		
		@Override
		public void focusGained(FocusEvent e) {
			if(e.getSource() == cadastrarView.getCadastrarPanelView().getNomeField()){
				if(cadastrarView.getCadastrarPanelView().getNomeField().getText().equalsIgnoreCase("Nome Completo"))
				cadastrarView.getCadastrarPanelView().getNomeField().setText("");
				cadastrarView.getCadastrarPanelView().getNomeField().setForeground(Color.BLACK);
			}
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			if(e.getSource() == cadastrarView.getCadastrarPanelView().getNomeField()){
				if(cadastrarView.getCadastrarPanelView().getNomeField().getText().length() == 0) {
				cadastrarView.getCadastrarPanelView().getNomeField().setText("Nome Completo");
				cadastrarView.getCadastrarPanelView().getNomeField().setForeground(Color.LIGHT_GRAY);
				}
			}
			
		}

		
	}
	
	
}

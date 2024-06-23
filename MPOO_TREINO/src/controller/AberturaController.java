package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import view.AberturaView;
import view.LoginView;
import view.MensagemView;

public class AberturaController {
	
	AberturaView aberturaView;
	LoginView loginView;
	KeyHandler keyHandler;
	MouseHandler mouseHandler;
	
	public AberturaController(AberturaView aberturaView, LoginView loginView) {
		
		this.aberturaView = aberturaView;
		this.loginView = loginView;
		keyHandler = new KeyHandler();
		mouseHandler = new MouseHandler();
		
		control();
	}
	
	private void control() {
		
		aberturaView.addKeyListener(keyHandler);
		aberturaView.addMouseListener(mouseHandler);
		
	}
	
	private void updateView() {
		aberturaView.setVisible(false);
		loginView.setVisible(true);
	}
	
	private class MouseHandler extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
			updateView();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		
	}
	
	
	
	
	private class KeyHandler extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_ENTER){
				updateView();
			}
			else if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				int valor = MensagemView.mostrarMensagem(MensagemView.MENSAGEM_SAIR);
				if (valor == 0) {
					System.exit(0);
				}
				
			}
			
		}

		
	}

}

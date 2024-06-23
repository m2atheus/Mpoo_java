package view;

import javax.swing.JOptionPane;

public class MensagemView extends JOptionPane{
	
	public static final String MENSAGEM_SAIR = "Deseja Sair do Sistema ?";
	
	
	public static int mostrarMensagem(String mensagem) {
	
		int resp = showConfirmDialog(null, mensagem);
		
		return resp;
	}

}

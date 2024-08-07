package view;


import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import util.SpringUtilities;

public class LoginView extends JFrame{
	
	JLabel loginLabel,senhaLabel;
	JTextField loginField;
	JPasswordField senhaField;
	JButton entraButton,sairButton;
	JPanel loginPanel,buttonPanel;
	
	ImageIcon iconeIcon;
	
	
	public LoginView() {
		super("login");
		setSize(215, 130);
		setLocationRelativeTo(null);
		
		iconeIcon = new ImageIcon("image/icone.png");
		setIconImage(iconeIcon.getImage());
		
		setLayout(new BorderLayout());
		loginLabel = new JLabel("Login:",JLabel.RIGHT);
		senhaLabel = new JLabel("Senha:",JLabel.RIGHT);
		
		loginField = new JTextField(10);
		senhaField = new JPasswordField(10);
		
		entraButton = new JButton("Entrar");
		sairButton = new JButton("Sair");
		
		loginPanel = new JPanel();
		loginPanel.setLayout(new SpringLayout());
		loginPanel.add(loginLabel);
		loginPanel.add(loginField);
		loginPanel.add(senhaLabel);
		loginPanel.add(senhaField);

		
		SpringUtilities.makeCompactGrid(loginPanel,
										2, 2,
										6, 6, 
										6, 6);
		
		buttonPanel = new JPanel();
		buttonPanel.add(entraButton);
		buttonPanel.add(sairButton);
	
		
		add(loginPanel,BorderLayout.CENTER);
		add(buttonPanel,BorderLayout.PAGE_END);
		setVisible(false);
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JButton getEntraButton() {
		return entraButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	
	
	
}

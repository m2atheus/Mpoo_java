package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import util.SpringUtilities;

public class CadastroPanelView extends JPanel{
	
	JLabel cadastrarLabel,tipoLabel,nomeLabel,cpfLabel,foneLabel,emailLabel,salarioLabel,matriculaLabel;
	JTextField nomeField,emailField,matriculaField;
	JFormattedTextField cpfField,foneField,salarioField;
	JCheckBox propagandaBox;
	JButton adicionarButton;
	JRadioButton clienteRadioButton,funcioRadioButton;
	ButtonGroup selecaoGroup;
	JPanel camposPanel,radioPanel;
	
	public CadastroPanelView() {
		setLayout(new BorderLayout());
		
		cadastrarLabel = new JLabel("Cadastar",JLabel.LEFT);
		cadastrarLabel.setFont(new Font("Arial", Font.BOLD, 20));
		
		clienteRadioButton = new JRadioButton("Cliente",true);
		funcioRadioButton = new JRadioButton("Funcionário");
		
		selecaoGroup = new ButtonGroup();
		selecaoGroup.add(clienteRadioButton);
		selecaoGroup.add(funcioRadioButton);
		
		tipoLabel = new JLabel("Tipo:",JLabel.RIGHT);
		nomeLabel = new JLabel("Nome:",JLabel.RIGHT);
		cpfLabel = new JLabel("CPF:",JLabel.RIGHT);
		foneLabel = new JLabel("Fone:",JLabel.RIGHT);
		emailLabel = new JLabel("E-mail:",JLabel.RIGHT);
		salarioLabel = new JLabel("Salário:",JLabel.RIGHT);
		matriculaLabel = new JLabel("Matrícula:",JLabel.RIGHT);
		
		nomeField = new JTextField("Nome Completo", 10);
		nomeField.setForeground(Color.LIGHT_GRAY);
		
		
		try {
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			foneField = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
			salarioField = new JFormattedTextField(new MaskFormatter("R$ ####,##"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		emailField = new JTextField(10);
		matriculaField = new JTextField(10);
		
		propagandaBox = new JCheckBox("Aceita receber Propaganda",true);
		adicionarButton = new JButton("Adicionar");
		
		radioPanel = new JPanel();
		radioPanel.add(clienteRadioButton);
		radioPanel.add(funcioRadioButton);
		
		camposPanel = new JPanel();
		camposPanel.setLayout(new SpringLayout());
		
		
		camposPanel.add(tipoLabel);
		camposPanel.add(radioPanel);
		camposPanel.add(nomeLabel);
		camposPanel.add(nomeField);
		camposPanel.add(cpfLabel);
		camposPanel.add(cpfField);
		camposPanel.add(foneLabel);
		camposPanel.add(foneField);
		camposPanel.add(emailLabel);
		camposPanel.add(emailField);
		camposPanel.add(salarioLabel);
		camposPanel.add(salarioField);
		camposPanel.add(matriculaLabel);
		camposPanel.add(matriculaField);
		
		SpringUtilities.makeCompactGrid(camposPanel,
										7, 2,
										6, 6,
										6, 6);
		add(cadastrarLabel,BorderLayout.NORTH);
		add(camposPanel,BorderLayout.CENTER);
		add(propagandaBox,BorderLayout.PAGE_END);
		add(adicionarButton,BorderLayout.EAST);
		
		salarioLabel.setVisible(false);
		salarioField.setVisible(false);
		matriculaLabel.setVisible(false);
		matriculaField.setVisible(false);
		adicionarButton.setEnabled(false);
		setVisible(true);
	}

	public void setNomeField(JTextField nomeField) {
		this.nomeField = nomeField;
	}

	public void setEmailField(JTextField emailField) {
		this.emailField = emailField;
	}

	public void setMatriculaField(JTextField matriculaField) {
		this.matriculaField = matriculaField;
	}

	public void setCpfField(JFormattedTextField cpfField) {
		this.cpfField = cpfField;
	}

	public void setFoneField(JFormattedTextField foneField) {
		this.foneField = foneField;
	}

	public void setSalarioField(JFormattedTextField salarioField) {
		this.salarioField = salarioField;
	}

	public JRadioButton getClienteRadioButton() {
		return clienteRadioButton;
	}

	public JRadioButton getFuncioRadioButton() {
		return funcioRadioButton;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public JFormattedTextField getCpfField() {
		return cpfField;
	}

	public JFormattedTextField getFoneField() {
		return foneField;
	}

	public JCheckBox getPropagandaBox() {
		return propagandaBox;
	}

	public JButton getAdicionarButton() {
		return adicionarButton;
	}

	public ButtonGroup getSelecaoGroup() {
		return selecaoGroup;
	}

	public JPanel getCamposPanel() {
		return camposPanel;
	}

	public JPanel getRadioPanel() {
		return radioPanel;
	}

	public JLabel getCadastrarLabel() {
		return cadastrarLabel;
	}

	public JLabel getTipoLabel() {
		return tipoLabel;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JLabel getFoneLabel() {
		return foneLabel;
	}

	public JLabel getEmailLabel() {
		return emailLabel;
	}

	public JLabel getSalarioLabel() {
		return salarioLabel;
	}

	public JLabel getMatriculaLabel() {
		return matriculaLabel;
	}

	public JTextField getMatriculaField() {
		return matriculaField;
	}

	public JFormattedTextField getSalarioField() {
		return salarioField;
	}
	
	
	

}

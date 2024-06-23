package view;



import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AberturaView extends JFrame{
	
	JLabel imageLabel;
	ImageIcon aberturaIcon,iconeIcon;

	public AberturaView(){
		super();
		setSize(190, 190);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setUndecorated(true);
		
		iconeIcon = new ImageIcon("image/icone.png");
		setIconImage(iconeIcon.getImage());
		aberturaIcon = new ImageIcon("image/abertura.png");
		imageLabel = new JLabel(aberturaIcon);
		
		add(imageLabel);
		setVisible(true);
	}
	
	
	
	

}

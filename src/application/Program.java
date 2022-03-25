package application;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Program {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("Conversor");
		
		JLabel label = new JLabel("Nome");
		
		
		
		label.setSize(100, 30);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		
		
		
		
		
		
		jf.add(label);
		
		jf.setSize(250, 250);
		jf.setLayout(null);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

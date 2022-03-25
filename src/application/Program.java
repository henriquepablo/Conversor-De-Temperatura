package application;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Program {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("Conversor");
		
		JLabel label = new JLabel("Temperaura em Fahrenheit");

		label.setBounds(50, 10, 170, 20);
		
		JTextField tf = new JTextField();
		
		tf.setBounds(80, 50, 90, 20);
		
		
		jf.add(label); jf.add(tf);
		
		jf.setSize(275, 275);
		
		jf.setLayout(null);
		
		jf.setLocationRelativeTo(null); // centralizar a janela na tela.
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
	}

}

package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Program {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("Conversor");
		
		JLabel label = new JLabel("Temperaura em Fahrenheit");

		label.setBounds(50, 10, 170, 20);
		
		JTextField tf = new JTextField();
		
		tf.setBounds(80, 50, 90, 20);
		
		JButton button = new JButton("Clique");
		button.setBounds(90, 180, 70, 20);
		
		JLabel mensagem = new JLabel();
		mensagem.setBounds(70, 112, 170, 20);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (tf.getText().isEmpty() == false) {
						double fahrenheit = Double.parseDouble(tf.getText());
						double celsius = (fahrenheit - 32) * 5 / 9;
					
						mensagem.setText(fahrenheit + "°F para celsius:  " + String.format("%.0f", celsius) + " °C");	
					}
				
					else {
						mensagem.setText("O campo está vazio");
					}
				}
				catch (NumberFormatException a) {
						mensagem.setText("Digite um número");
				}
			}
		});
		
		
		
		
		jf.add(label); jf.add(tf); jf.add(button); jf.add(mensagem, SwingConstants.CENTER);
		
		jf.setSize(275, 275);
		
		jf.setResizable(false);
		
		jf.setLayout(null);
		
		jf.setLocationRelativeTo(null); // centralizar a janela na tela.
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
	}

}

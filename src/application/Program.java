package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Program {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("Conversor");
		
		String[] opcoes = new String[]{"°C", "°F"};
		
		JComboBox<String> op = new JComboBox<>(opcoes);
		
		JLabel mensagem = new JLabel("Temperatura em Celsius");
	
		JTextArea ta = new JTextArea();
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9"); 
		JButton button = new JButton("0");
		JButton virgula = new JButton(".");
		JButton converter = new JButton("cli");
		
		button1.setBounds(15, 270 , 50, 50);
		button2.setBounds(75, 270, 50, 50);
		button3.setBounds(135, 270, 50, 50);
		button4.setBounds(15, 210, 50, 50);
		button5.setBounds(75, 210, 50, 50);
		button6.setBounds(135, 210, 50, 50);
		button7.setBounds(15, 150, 50, 50);
		button8.setBounds(75, 150, 50, 50);
		button9.setBounds(135, 150, 50, 50);
		button.setBounds(75, 330, 50, 50);
		virgula.setBounds(15, 330, 50, 50);
		converter.setBounds(135, 330, 50, 50);
		op.setBounds(10, 90, 40, 20);
		mensagem.setBounds(10, 60, 200, 30);
		ta.setBounds(70, 90, 100, 20);
		
		
		jf.add(button);
		jf.add(button1);
		jf.add(button2);
		jf.add(button3);
		jf.add(button4);
		jf.add(button5);
		jf.add(button6);
		jf.add(button7);
		jf.add(button8);
		jf.add(button9);
		jf.add(virgula);
		jf.add(converter);
		jf.add(op);
		jf.add(mensagem);
		jf.add(ta);
		
		
		op.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String escolha = op.getItemAt(op.getSelectedIndex());
				
				if (escolha.equals("°F")) {
					mensagem.setText("Temperatura em Fahrenheit");
					
				}
				
				else {
					mensagem.setText("Temperatura em Celsius");
				}
				
			}
		});
		
		
		
		
		
		converter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (ta.getText().isEmpty() == false) {
						double fahrenheit = Double.parseDouble(ta.getText());
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
		
		
		
		
		
		//jf.add(label); jf.add(tf); jf.add(button); jf.add(mensagem, SwingConstants.CENTER);
		
		jf.setSize(205, 420);
		
		jf.setResizable(false);
		
		jf.setLayout(null);
		
		jf.setLocationRelativeTo(null); // centralizar a janela na tela.
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
	}

}

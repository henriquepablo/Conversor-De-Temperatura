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
		
		JLabel mensagem = new JLabel("Celsius");
		
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
					mensagem.setText("Fahrenheit");
					
				}
				
				else {
					mensagem.setText("Celsius");
				}
				
			}
		});
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("0");
				
			}
		});
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("1");
				
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("2");
				
			}
		});
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("3");
				
			}
		});
		
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("4");
				
			}
		});
		
		button5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("5");
				
			}
		});
		
		button6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("6");
				
			}
		});
		
		button7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("7");
				
			}
		});
		
		button8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("8");
				
			}
		});
		
		button9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("9");
				
			}
		});
		
		virgula.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append(".");
				
			}
		});
		
		
		// lógica de conversão das temperaturas
		converter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String escolha = op.getItemAt(op.getSelectedIndex());
				
				try {
					if (ta.getText().isEmpty() == false && escolha.equals("°F")) {
						double fahrenheit = Double.parseDouble(ta.getText());
						double celsius = (fahrenheit - 32) * 5 / 9;
					
						ta.setText(String.format("%.0f", celsius) + "°C");
					}
					
					else if (ta.getText().isEmpty() == false && escolha.equals("°C")) {
						double celsius = Double.parseDouble(ta.getText());
						double fahrenheit = celsius * 9 / 5 + 32;
						
						ta.setText(String.format("%.0f", fahrenheit) + "°F");
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
		
			
		
		
		jf.setSize(205, 420);
		
		jf.setResizable(false);
		
		jf.setLayout(null);
		
		jf.setLocationRelativeTo(null); // centralizar a janela na tela.
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
	}

}

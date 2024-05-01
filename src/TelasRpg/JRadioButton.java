package TelasRpg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JRadioButton {

	private JFrame frame;
	private JTextField txtNumber1;
	private JTextField txtNumber2;
	private JTextField txtResult;
	private JTextField txtIten;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButton window = new JRadioButton();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JRadioButton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 692, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		javax.swing.JRadioButton rbSubtraction = new javax.swing.JRadioButton("Subtraction");
		rbSubtraction.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rbSubtraction.setBounds(247, 94, 158, 37);
		frame.getContentPane().add(rbSubtraction);
		
		javax.swing.JRadioButton rbDivision = new javax.swing.JRadioButton("Division");
		rbDivision.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rbDivision.setBounds(247, 134, 124, 37);
		frame.getContentPane().add(rbDivision);
		
		javax.swing.JRadioButton rbMultiplication = new javax.swing.JRadioButton("Multiplication");
		rbMultiplication.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rbMultiplication.setBounds(247, 174, 176, 37);
		frame.getContentPane().add(rbMultiplication);
		
		JLabel lblNumber1 = new JLabel("Number 1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumber1.setBounds(36, 34, 166, 28);
		frame.getContentPane().add(lblNumber1);
		
		txtNumber1 = new JTextField();
		txtNumber1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNumber1.setBounds(35, 61, 166, 37);
		frame.getContentPane().add(txtNumber1);
		txtNumber1.setColumns(10);
		
		txtNumber2 = new JTextField();
		txtNumber2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNumber2.setColumns(10);
		txtNumber2.setBounds(36, 127, 166, 37);
		frame.getContentPane().add(txtNumber2);
		
		JLabel lblNumber2 = new JLabel("Number 2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumber2.setBounds(37, 100, 166, 28);
		frame.getContentPane().add(lblNumber2);
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtResult.setColumns(10);
		txtResult.setBounds(36, 189, 166, 37);
		frame.getContentPane().add(txtResult);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResult.setBounds(37, 162, 166, 28);
		frame.getContentPane().add(lblResult);
		
		JLabel lblIten = new JLabel("Item Selecionado");
		lblIten.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIten.setBounds(37, 252, 166, 28);
		frame.getContentPane().add(lblIten);
		
		txtIten = new JTextField();
		txtIten.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtIten.setColumns(10);
		txtIten.setBounds(36, 279, 166, 37);
		frame.getContentPane().add(txtIten);
		
		javax.swing.JRadioButton rbAddition = new javax.swing.JRadioButton("Addition");
		        rbAddition.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
				
				
				rbAddition.setSelected(true);
				rbSubtraction.setSelected(false);
				rbDivision.setSelected(false);
				rbMultiplication.setSelected(false);
				
				double number1 = Double.parseDouble(txtNumber1.getText());
				double number2 = Double.parseDouble(txtNumber2.getText());
				
				txtResult.setText(String.valueOf(number1 + number2));
				txtIten.setText("Addiction");
				
		//----------------------------------------------------------------------------------
				    rbSubtraction.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
				    rbAddition.setSelected(false);
					rbSubtraction.setSelected(true);
					rbDivision.setSelected(false);
					rbMultiplication.setSelected(false);
						
					double number1 = Double.parseDouble(txtNumber1.getText());
					double number2 = Double.parseDouble(txtNumber2.getText());
					
					txtResult.setText(String.valueOf(number1 - number2));
					txtIten.setText("Subtraction");
		
					}
				});	
		//----------------------------------------------------------------------------------
				    rbDivision.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					rbAddition.setSelected(false);
					rbSubtraction.setSelected(false);
					rbDivision.setSelected(true);
					rbMultiplication.setSelected(false);
						
					double number1 = Double.parseDouble(txtNumber1.getText());
					double number2 = Double.parseDouble(txtNumber2.getText());
					
					txtResult.setText(String.valueOf(number1 / number2));
					txtIten.setText("Division");
		
					}
				});		    
	  //----------------------------------------------------------------------------------
				    rbMultiplication.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					rbAddition.setSelected(false);
					rbSubtraction.setSelected(false);
					rbDivision.setSelected(false);
					rbMultiplication.setSelected(true);
						
					double number1 = Double.parseDouble(txtNumber1.getText());
					double number2 = Double.parseDouble(txtNumber2.getText());
					
					txtResult.setText(String.valueOf(number1 * number2));
					txtIten.setText("Multiplication");
		
					}
				});
	 //----------------------------------------------------------------------------------
				
			}
		});
		rbAddition.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rbAddition.setBounds(247, 59, 124, 37);
		frame.getContentPane().add(rbAddition);
		
		
	}
}

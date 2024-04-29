package TelasRpg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Jtable_Inserindo_Dados {

	private JFrame frmRpg;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtIdade;
	private JTable tabelaNomes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jtable_Inserindo_Dados window = new Jtable_Inserindo_Dados();
					window.frmRpg.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Jtable_Inserindo_Dados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRpg = new JFrame();
		frmRpg.getContentPane().setBackground(new Color(255, 255, 255));
		frmRpg.setBackground(new Color(255, 255, 255));
		frmRpg.setTitle("RPG");
		frmRpg.setBounds(100, 100, 651, 491);
		frmRpg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRpg.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(52, 54, 169, 25);
		frmRpg.getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtNome.setBounds(52, 81, 169, 25);
		frmRpg.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(235, 81, 169, 25);
		frmRpg.getContentPane().add(txtSobrenome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSobrenome.setBounds(235, 54, 169, 25);
		frmRpg.getContentPane().add(lblSobrenome);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtIdade.setColumns(10);
		txtIdade.setBounds(419, 81, 169, 25);
		frmRpg.getContentPane().add(txtIdade);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIdade.setBounds(419, 54, 169, 25);
		frmRpg.getContentPane().add(lblIdade);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 117, 536, 244);
		frmRpg.getContentPane().add(scrollPane);
		
		tabelaNomes = new JTable();
		tabelaNomes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(tabelaNomes);
		tabelaNomes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Sobrenome", "Idade"
			}
		));
		
		JButton btnSalvar = new JButton("Inserir Linha");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//BIBLIOTECA PARA TRABALHAR COM A TABELA
				DefaultTableModel linha = (DefaultTableModel)tabelaNomes.getModel();
				
				//ADD UMA NOVA LINHA PARA A TABELA
				linha.addRow(new Object[] {txtNome.getText(),
						                   txtSobrenome.getText(),
						                   txtIdade.getText()});
				
				//LIMPANDO O CAMPO DE TEXTO DEPOIS DE ADD NA TABELA
				txtNome.setText("");
				txtSobrenome.setText("");
                txtIdade.setText("");
			}
		});
		
		//AUMENTA A LARGURA DAS LINHAS
		tabelaNomes.setRowHeight(30);
		
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBounds(407, 372, 181, 33);
		frmRpg.getContentPane().add(btnSalvar);
		
	}
}

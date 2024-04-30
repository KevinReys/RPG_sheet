package TelasRpg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Jtable_Alterar_Dados {

	private JFrame frmRpg;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtIdade;
	private JTable tabelaNomes;
	private JButton btnAlterar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jtable_Alterar_Dados window = new Jtable_Alterar_Dados();
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
	public Jtable_Alterar_Dados() {
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
		
		//CENTRALIZAR TELA
				frmRpg.setLocationRelativeTo(null);
		
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
		
		
		
		//COMANDO QUE AO CLICAR NA LINHA, ALTERAMOS OS DADOS
		tabelaNomes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//BIBLIOTECA PARA TRABALHAR COM A TABELA
				DefaultTableModel configuracoesTabela = (DefaultTableModel)tabelaNomes.getModel();
				
				//PEGA O NÚMERO DA LINHA SELECIONADA
				int selecionaNumeroLinha = tabelaNomes.getSelectedRow();
				
				// 0 - NUMERO DA COLUNA
				// TOSTRING - CONVERTE O OBJETO PARA TEXTO
				//GETVALUEAT - PEGA O VALOR DA LINHA
				txtNome.setText(configuracoesTabela.getValueAt(selecionaNumeroLinha, 0).toString());
				txtSobrenome.setText(configuracoesTabela.getValueAt(selecionaNumeroLinha, 1).toString());
				txtIdade.setText(configuracoesTabela.getValueAt(selecionaNumeroLinha, 2).toString());
				
			}
		});
		
		
		
		tabelaNomes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(tabelaNomes);
		tabelaNomes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Sobrenome", "Idade"
			}
		));
		
		JButton btnSalvar = new JButton("Salvar");
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
		btnSalvar.setBounds(51, 372, 181, 33);
		frmRpg.getContentPane().add(btnSalvar);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//BIBLIOTECA PARA TRABALHAR COM A TABELA
				DefaultTableModel modelo = (DefaultTableModel)tabelaNomes.getModel();
				
				//PEGA O NÚMERO DA LINHA QUE ESTÁ SELECIONADA
				int linha = tabelaNomes.getSelectedRow();
				
				if(linha >=0) {
					
					//modelo - DEFAULTTABLEMODEL
					//setValueAt - COLOCA UMA INFORMAÇÃO
					//txtNome.getText() - PEGANDO O TEXTO QUE ESTÁ NO CAMPO DO TXT
					//linha - ONÚMERO DA LINHA QUE EU SELECIONEI
					//0 - O NÚMERO DA COLUNA QUE VOU ALTERAR A INFORMAÇÃO
					modelo.setValueAt(txtNome.getText(), linha, 0);
					modelo.setValueAt(txtSobrenome.getText(), linha, 1);
					modelo.setValueAt(txtIdade.getText(), linha, 2);
					
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para alterar a informação");
					
				}
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAlterar.setBounds(242, 372, 181, 33);
		frmRpg.getContentPane().add(btnAlterar);
		
	}
}

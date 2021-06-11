package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class MenuPedido extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPedido frame = new MenuPedido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPedido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 462);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.info);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 10, 577, 67);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Simulador de pedidos");
		lblNewLabel_5.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		lblNewLabel_5.setBounds(183, 20, 196, 26);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.info);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 87, 577, 242);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre Medicamento");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel.setBounds(33, 31, 162, 24);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo Medicamento");
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel_1.setBounds(61, 65, 134, 24);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel_2.setBounds(128, 99, 67, 24);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Distribuidor");
		lblNewLabel_3.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel_3.setBounds(106, 133, 89, 21);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sucursal");
		lblNewLabel_4.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel_4.setBounds(128, 164, 67, 21);
		panel_1.add(lblNewLabel_4);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(227, 31, 226, 19);
		panel_1.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(227, 99, 96, 19);
		panel_1.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JComboBox txtTipo = new JComboBox();
		txtTipo.setBounds(227, 64, 162, 21);
		panel_1.add(txtTipo);
		
		JRadioButton btnCofarma = new JRadioButton("Cofarma");
		btnCofarma.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCofarma.setBounds(227, 130, 78, 21);
		panel_1.add(btnCofarma);
		
		JRadioButton btnEmpsephar = new JRadioButton("Empsephar");
		btnEmpsephar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEmpsephar.setBounds(311, 130, 99, 21);
		panel_1.add(btnEmpsephar);
		
		JRadioButton btnCemefar = new JRadioButton("Cemefar");
		btnCemefar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCemefar.setBounds(419, 128, 78, 21);
		panel_1.add(btnCemefar);
		
		JCheckBox chkPrincipal = new JCheckBox("Principal");
		chkPrincipal.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		chkPrincipal.setBounds(227, 164, 93, 21);
		panel_1.add(chkPrincipal);
		
		JCheckBox chkSecundaria = new JCheckBox("Secundaria");
		chkSecundaria.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		chkSecundaria.setBounds(343, 164, 110, 21);
		panel_1.add(chkSecundaria);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.info);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(10, 339, 577, 52);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBounds(362, 10, 85, 21);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.setBounds(144, 10, 85, 21);
		panel_2.add(btnNewButton_1);
	}
}

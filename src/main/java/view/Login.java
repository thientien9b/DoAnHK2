package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTable table;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_13;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JDateChooser dateChooser;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table_1;
	private JLabel lblThngTin;
	private JSeparator separator;
	private JLabel lblQunL;
	private JTable table_2;
	private JLabel lblNewLabel_7;
	private JTextField textField_4;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_14;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table_3;
	private JLabel lblBngThng;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JLabel lblNewLabel_18;
	private JComboBox comboBox;
	private JLabel lblNewLabel_19;
	private JComboBox comboBox_1;
	private JButton btnNewButton_10;
	private JTextField textField_12;
	private JLabel lblNewLabel_20;
	private JTable table_4;
	private JLabel lblqunLCa;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel lblNewLabel_23;
	private JComboBox comboBox_2;
	private JLabel lblNewLabel_24;
	private JTextField textField_15;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setUndecorated(true);
		setTitle("Qu\u1EA3n L\u00FD Nh\u00E2n Vi\u00EAn B\u1EC7nh Vi\u1EC7n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1115, 785);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(3)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 1099, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 759, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		
		panel = new JPanel();
		panel.setBackground(Color.PINK);
		tabbedPane.addTab("Nh\u00E2n Vi\u00EAn", null, panel, null);
		
		table = new JTable();
		
		lblNewLabel = new JLabel("<html>&#127973; C\u1EACP NH\u1EACP TH\u00D4NG TIN CHI TI\u1EBET NH\u00C2N VI\u00CAN </html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		lblNewLabel_1 = new JLabel("M\u00E3 NV:");
		
		lblNewLabel_2 = new JLabel("H\u1ECD T\u00EAn NV:");
		
		lblNewLabel_3 = new JLabel("Ng\u00E0y Sinh :");
		
		lblNewLabel_4 = new JLabel("Gi\u1EDBi T\u00EDnh :");
		
		lblNewLabel_5 = new JLabel("\u0110\u1ECBa Ch\u1EC9 :");
		
		lblNewLabel_6 = new JLabel("SDT:");
		
		lblNewLabel_8 = new JLabel("M\u00E3 Chuy\u00EAn Ng\u00E0nh :");
		
		lblNewLabel_9 = new JLabel("M\u00E3 Ch\u1EE9c V\u1EE5 :");
		
		lblNewLabel_10 = new JLabel("M\u00E3 L\u01B0\u01A1ng :");
		
		lblNewLabel_11 = new JLabel("M\u00E3 NV:");
		
		lblNewLabel_13 = new JLabel("M\u00E3 NV:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		dateChooser = new JDateChooser();
		
		rdbtnNewRadioButton = new JRadioButton("N\u1EEF");
		
		rdbtnNewRadioButton_1 = new JRadioButton("Nam");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		btnNewButton = new JButton("New button");
		
		btnNewButton_1 = new JButton("New button");
		
		btnNewButton_2 = new JButton("New button");
		
		btnNewButton_3 = new JButton("New button");
		
		btnNewButton_12 = new JButton("New button");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 1062, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(279, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE)
					.addGap(192))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(50)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_3))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_4))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
									.addComponent(dateChooser, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField_2, Alignment.TRAILING)
									.addComponent(textField_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
							.addGap(378))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton_1)
							.addGap(9)
							.addComponent(rdbtnNewRadioButton)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addGap(84)
							.addComponent(btnNewButton_12)))
					.addGap(301))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(120)
					.addComponent(btnNewButton)
					.addGap(133)
					.addComponent(btnNewButton_1)
					.addGap(133)
					.addComponent(btnNewButton_2)
					.addGap(138)
					.addComponent(btnNewButton_3)
					.addContainerGap(214, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(11)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
											.addComponent(lblNewLabel_1)
											.addComponent(lblNewLabel_8)
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panel.createSequentialGroup()
												.addGap(18)
												.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
													.addComponent(lblNewLabel_2)
													.addComponent(lblNewLabel_9)))
											.addGroup(gl_panel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
											.addGroup(gl_panel.createSequentialGroup()
												.addGap(12)
												.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
													.addComponent(lblNewLabel_3)
													.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
												.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
													.addGroup(gl_panel.createSequentialGroup()
														.addComponent(lblNewLabel_4)
														.addGap(27))
													.addGroup(gl_panel.createSequentialGroup()
														.addComponent(rdbtnNewRadioButton_1)
														.addGap(17))
													.addGroup(gl_panel.createSequentialGroup()
														.addComponent(rdbtnNewRadioButton)
														.addGap(17)))
												.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
													.addComponent(lblNewLabel_5)
													.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
											.addGroup(gl_panel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
													.addComponent(lblNewLabel_11)
													.addComponent(btnNewButton_12))
												.addGap(14)))
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panel.createSequentialGroup()
												.addGap(18)
												.addComponent(lblNewLabel_6))
											.addGroup(gl_panel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_panel.createSequentialGroup()
												.addGap(3)
												.addComponent(lblNewLabel_13))))
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(9)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(16)
										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(14)
										.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(btnNewButton, Alignment.TRAILING)
									.addComponent(btnNewButton_2, Alignment.TRAILING))
								.addGap(10))
							.addGroup(gl_panel.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_1)
								.addGap(11)))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_3)
							.addGap(11)))
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE)
					.addGap(13))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(141)
					.addComponent(lblNewLabel_10)
					.addContainerGap(576, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		tabbedPane.addTab("Qu\u1EA3n L\u00FD", null, panel_1, null);
		
		table_1 = new JTable();
		
		lblThngTin = new JLabel("<html>&#128176; TH\u00D4NG TIN H\u1EC6 S\u1ED0 L\u01AF\u01A0NG </html>");
		lblThngTin.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		separator = new JSeparator();
		
		lblQunL = new JLabel("<html>&#128188; QU\u1EA2N L\u00DD PH\u00D2NG BAN </html>");
		lblQunL.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		table_2 = new JTable();
		
		lblNewLabel_7 = new JLabel("ID Room");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		lblNewLabel_12 = new JLabel("Name Room");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		lblNewLabel_15 = new JLabel("Name Manager");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNewLabel_16 = new JLabel("ID ");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNewLabel_17 = new JLabel("H\u1EC7 S\u1ED1 L\u01B0\u01A1ng");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		btnNewButton_4 = new JButton("New button");
		
		btnNewButton_5 = new JButton("New button");
		
		btnNewButton_6 = new JButton("New button");
		
		btnNewButton_7 = new JButton("New button");
		
		btnNewButton_8 = new JButton("New button");
		
		btnNewButton_9 = new JButton("New button");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(29)
									.addComponent(lblThngTin, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(49)
									.addComponent(lblNewLabel_16, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addGap(47)
									.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(51)
									.addComponent(lblNewLabel_17, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(51)
									.addComponent(btnNewButton_4)
									.addGap(81)
									.addComponent(btnNewButton_5)
									.addGap(80)
									.addComponent(btnNewButton_6)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(table_1, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(8)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1094, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(38)
									.addComponent(lblQunL, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(165)
									.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(43)
									.addComponent(lblNewLabel_7)
									.addGap(76)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(42)
									.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addGap(47)
									.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(41)
									.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
									.addGap(24)
									.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(70)
									.addComponent(btnNewButton_7)
									.addGap(70)
									.addComponent(btnNewButton_8)
									.addGap(83)
									.addComponent(btnNewButton_9)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(table_2, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(14)
							.addComponent(lblThngTin, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(33)
											.addComponent(lblNewLabel_16, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(30)
											.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(34)
											.addComponent(lblNewLabel_17, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(30)
											.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(65)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton_4)
										.addComponent(btnNewButton_5)))
								.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
									.addComponent(btnNewButton_6)
									.addGap(24))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(13)
							.addComponent(table_1, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)))
					.addGap(83)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 7, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 0, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(13)
							.addComponent(lblQunL, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(20)
											.addComponent(lblNewLabel_7))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(22)
											.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(22)
											.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(19)
											.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(27)
											.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(25)
											.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
											.addComponent(btnNewButton_7)
											.addGap(20)
											.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
										.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
											.addComponent(btnNewButton_8)
											.addGap(41))))
								.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_9)
									.addGap(41))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(42)
							.addComponent(table_2, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)))
					.addGap(70))
		);
		panel_1.setLayout(gl_panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		table_3 = new JTable();
		
		lblBngThng = new JLabel("<html>&#128178; B\u1EA2NG TH\u1ED0NG K\u00CA L\u01AF\u01A0NG </html>");
		lblBngThng.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		lblNewLabel_18 = new JLabel("Ch\u1ECDn Th\u00E1ng :");
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		
		lblNewLabel_19 = new JLabel("L\u01B0\u01A1ng Theo Khoa:");
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Khoa Ngo\u1EA1i", "Khoa N\u1ED9i", "Khoa S\u1EA3n"}));
		
		btnNewButton_10 = new JButton("B\u1EA3ng L\u01B0\u01A1ng To\u00E0n C\u00F4ng Ty");
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		lblNewLabel_20 = new JLabel("<html>&#128269;</html>");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(19, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(table_3, GroupLayout.PREFERRED_SIZE, 1059, GroupLayout.PREFERRED_SIZE)
							.addGap(16))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblBngThng, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE)
							.addGap(85))))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel_19)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel_18)
							.addGap(18)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(869, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(29)
					.addComponent(btnNewButton_10, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 505, Short.MAX_VALUE)
					.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(lblNewLabel_20)
					.addGap(38))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(8)
							.addComponent(lblBngThng, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_18)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_19)
										.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(34)
									.addComponent(btnNewButton_10)
									.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(13))))
						.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_20)
							.addGap(15)))
					.addComponent(table_3, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
					.addGap(9))
		);
		panel_2.setLayout(gl_panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.PINK);
		tabbedPane.addTab("New tab", null, panel_3, null);
		
		table_4 = new JTable();
		
		lblqunLCa = new JLabel("<html>&#128338;  QU\u1EA2N L\u00DD CA TR\u1EF0C C\u1EE6A NH\u00C2N VI\u00CAN</html>");
		lblqunLCa.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		lblNewLabel_21 = new JLabel("ID NV :");
		
		lblNewLabel_22 = new JLabel("T\u00EAn NV :");
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		lblNewLabel_23 = new JLabel("Ph\u00F2ng Tr\u1EF1c :");
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Khoa N\u1ED9i", "Khoa Ngo\u1EA1i", "Khoa S\u1EA3n"}));
		
		lblNewLabel_24 = new JLabel("Th\u1EDDi Gian Tr\u1EF1c :");
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		btnNewButton_11 = new JButton("To\u00E0n B\u1ED9 Ca Tr\u1EF1c Nh\u00E2n Vi\u00EAn");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
							.addComponent(lblqunLCa, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE)
							.addGap(136))
						.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_11)
								.addComponent(table_4, GroupLayout.PREFERRED_SIZE, 1046, GroupLayout.PREFERRED_SIZE))
							.addGap(23))))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(75)
							.addComponent(lblNewLabel_21))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(77)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_23)
								.addComponent(lblNewLabel_22))))
					.addGap(22)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_13)
						.addComponent(textField_14)
						.addComponent(comboBox_2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(847, Short.MAX_VALUE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(82)
					.addComponent(lblNewLabel_24)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(846, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(21)
							.addComponent(lblqunLCa, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(lblNewLabel_21)
							.addGap(28)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_22)
								.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(75)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(35)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_23)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_24)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
					.addComponent(btnNewButton_11)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table_4, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
					.addGap(25))
		);
		panel_3.setLayout(gl_panel_3);
		contentPane.setLayout(gl_contentPane);
	}
}

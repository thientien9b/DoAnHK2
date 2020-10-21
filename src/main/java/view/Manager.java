package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Manager extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel_1;
	private JPanel panel;
	private JTable table;
	private JLabel lblimDanh;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textField;
	private JTextField textField_1;
	private JDateChooser dateChooser;
	private JTextField textField_2;
	private JTextField textField_3;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblNewLabel_7;
	private JTextField textField_4;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JSeparator separator;
	private JDateChooser dateChooser_1;
	private JTabbedPane tabbedPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager frame = new Manager();
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
	public Manager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1115, 785);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
		);
		
		panel = new JPanel();
		panel.setBackground(Color.PINK);
		tabbedPane.addTab("\u0110i\u1EC3m Danh", null, panel, null);
		
		table = new JTable();
		
		lblimDanh = new JLabel("\u0110I\u1EC2M DANH");
		lblimDanh.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		lblNewLabel_1 = new JLabel("M\u00E3 NV:");
		
		lblNewLabel_2 = new JLabel("SDT:");
		
		lblNewLabel_3 = new JLabel("H\u1ECD T\u00EAn NV:");
		
		lblNewLabel_4 = new JLabel("Ng\u00E0y Sinh :");
		
		lblNewLabel_5 = new JLabel("Gi\u1EDBi T\u00EDnh :");
		
		lblNewLabel_6 = new JLabel("\u0110\u1ECBa Ch\u1EC9 :");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		dateChooser = new JDateChooser();
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		rdbtnNewRadioButton = new JRadioButton("Nam");
		buttonGroup_1.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("N\u1EEF");
		buttonGroup_1.add(rdbtnNewRadioButton_1);
		
		lblNewLabel_7 = new JLabel("T\u00EAn Ph\u00F2ng Khoa");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Ng\u00E0y L\u00E0m :");
		
		lblNewLabel_9 = new JLabel("\u0110i\u1EC3m Danh");
		
		btnNewButton = new JButton("New button");
		
		btnNewButton_1 = new JButton("New button");
		
		btnNewButton_2 = new JButton("New button");
		
		btnNewButton_3 = new JButton("New button");
		
		rdbtnNewRadioButton_2 = new JRadioButton("C\u00F3");
		buttonGroup.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Kh\u00F4ng");
		buttonGroup.add(rdbtnNewRadioButton_3);
		
		separator = new JSeparator();
		
		dateChooser_1 = new JDateChooser();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(50)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_4))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
							.addGap(2))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_5)
							.addGap(16)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
									.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
									.addComponent(textField_2, Alignment.TRAILING)
									.addComponent(textField_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
									.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))))
							.addGap(378))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(1)
							.addComponent(rdbtnNewRadioButton)
							.addGap(9)
							.addComponent(rdbtnNewRadioButton_1)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(22)
							.addComponent(rdbtnNewRadioButton_2)
							.addGap(8)
							.addComponent(rdbtnNewRadioButton_3)))
					.addGap(237))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(120)
					.addComponent(btnNewButton)
					.addGap(139)
					.addComponent(btnNewButton_1)
					.addGap(127)
					.addComponent(btnNewButton_2)
					.addGap(138)
					.addComponent(btnNewButton_3)
					.addContainerGap(214, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(431, Short.MAX_VALUE)
					.addComponent(lblimDanh, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE)
					.addGap(40))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(15)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 1062, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1062, GroupLayout.PREFERRED_SIZE)
					.addGap(12))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(12)
					.addComponent(lblimDanh, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(11)
											.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_1)
												.addComponent(lblNewLabel_7)
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(18)
													.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblNewLabel_3)
														.addComponent(lblNewLabel_8)))
												.addGroup(gl_panel.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
											.addGap(12)
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblNewLabel_4)
												.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(15)
													.addComponent(lblNewLabel_5)
													.addPreferredGap(ComponentPlacement.RELATED))
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(11)
													.addComponent(rdbtnNewRadioButton)
													.addPreferredGap(ComponentPlacement.RELATED))
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(11)
													.addComponent(rdbtnNewRadioButton_1)))
											.addGap(10)
											.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_6)
												.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(18)
													.addComponent(lblNewLabel_2))
												.addGroup(gl_panel.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(9)
											.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(21)
											.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(14)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(rdbtnNewRadioButton_2)
												.addComponent(rdbtnNewRadioButton_3))))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton, Alignment.TRAILING)
										.addComponent(btnNewButton_2, Alignment.TRAILING))
									.addGap(8))
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_3)
									.addGap(9))
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addComponent(btnNewButton_1)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
							.addGap(12))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(88)
							.addComponent(lblNewLabel_9)
							.addPreferredGap(ComponentPlacement.RELATED, 144, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE)
					.addGap(2))
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Assigment", null, panel_1, null);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(17)
					.addComponent(tabbedPane_1, GroupLayout.PREFERRED_SIZE, 1054, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(88)
					.addComponent(tabbedPane_1, GroupLayout.PREFERRED_SIZE, 601, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}

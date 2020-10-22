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
import javax.swing.JOptionPane;
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
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JLabel lbl_IdEmp;
	private JLabel lbl_Fullname;
	private JLabel lbl_Dob;
	private JLabel lbl_Gender;
	private JLabel lbl_Address;
	private JLabel lblNewLabel_6;
	private JLabel lblSpecialized;
	private JLabel lblPosition;
	private JLabel lblSalary;
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
	private JLabel lblThngTin;
	private JSeparator separator;
	private JLabel lblManage_Department;
	private JLabel lblNewLabel_14;
	private JLabel lbl_ID_Emp;
	private JLabel lblNewLabel_17;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel lblBngThng;
	private JButton btnShow;
	private JButton btnInsert;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JLabel lblNewLabel_18;
	private JComboBox comboBox;
	private JLabel lblNewLabel_19;
	private JComboBox comboBox_1;
	private JButton btnNewButton_10;
	private JTextField textField_12;
	private JLabel lblNewLabel_20;
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
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblClose;
	private JScrollPane scrollPane;
	private JTable table_1;
	private JScrollPane scrollPane_1;
	private JTable tblManageDepartment;
	private JScrollPane scrollPane_2;
	private JTable table;
	private JLabel lblPassword;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane_3;
	private JTable table_2;
	private JScrollPane scrollPane_4;
	private JTable table_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setTitle("Qu\u1EA3n L\u00FD Nh\u00E2n Vi\u00EAn B\u1EC7nh Vi\u1EC7n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1115, 785);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		lblClose = new JLabel("X");
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this form?", "Confirmation",
						JOptionPane.YES_NO_OPTION) == 0) {
					Admin.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblClose.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblClose.setForeground(Color.WHITE);
			}
		});
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblClose.setBounds(750, 0, 37, 27);
		contentPane.add(lblClose);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 1089, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(1043, Short.MAX_VALUE)
							.addComponent(lblClose, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblClose, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 710, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		
		panel = new JPanel();
		panel.setBackground(Color.PINK);
		tabbedPane.addTab("Employee", null, panel, null);
		
		lblNewLabel = new JLabel("<html>&#127973; UPDATE EMPLOYEE DETAILS </html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		lbl_IdEmp = new JLabel("ID Employee:");
		lbl_IdEmp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_IdEmp.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lbl_Fullname = new JLabel("Fullname:");
		lbl_Fullname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lbl_Dob = new JLabel("Date of birth:");
		lbl_Dob.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_Dob.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lbl_Gender = new JLabel("Gender:");
		lbl_Gender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_Gender.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lbl_Address = new JLabel("Address:");
		lbl_Address.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_Address.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblNewLabel_6 = new JLabel("Phone:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblSpecialized = new JLabel("ID Specialized:");
		lblSpecialized.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSpecialized.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblPosition = new JLabel("ID Position:");
		lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPosition.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblSalary = new JLabel("ID Salary:");
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		
		dateChooser = new JDateChooser();
		
		rdbtnNewRadioButton = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setColumns(10);
		
		btnShow = new JButton("Show Data Employee");
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnInsert = new JButton("Insert Data");
		btnInsert.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnUpdate = new JButton("Update Data");
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		scrollPane_2 = new JScrollPane();
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(246)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
					.addGap(232))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
							.addGap(98))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(24)
											.addComponent(lbl_Address, GroupLayout.PREFERRED_SIZE, 66, Short.MAX_VALUE))
										.addComponent(lblNewLabel_6)
										.addComponent(lbl_IdEmp, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(38)
											.addComponent(lbl_Gender, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(lbl_Fullname)
										.addComponent(lbl_Dob))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(rdbtnNewRadioButton_1, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
											.addGap(12)
											.addComponent(rdbtnNewRadioButton, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED))
										.addComponent(textField_2, 129, 129, Short.MAX_VALUE)
										.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(58)
									.addComponent(btnShow, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addGap(89)
									.addComponent(btnInsert, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(103)
									.addComponent(btnUpdate, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblPosition, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
										.addComponent(lblSalary, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(20)
											.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblSpecialized)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
										.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
										.addComponent(textField_6, 108, 108, Short.MAX_VALUE)
										.addComponent(textField_5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
									.addGap(253))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
									.addGap(232))))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_IdEmp)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSpecialized))
					.addGap(16)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_Fullname)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPosition))
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lbl_Dob)
							.addComponent(lblSalary)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbl_Gender)
								.addComponent(rdbtnNewRadioButton_1)
								.addComponent(rdbtnNewRadioButton))
							.addGap(17)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl_Address))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6)))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPassword)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnShow)
						.addComponent(btnInsert)
						.addComponent(btnUpdate)
						.addComponent(btnDelete))
					.addGap(24)
					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
					.addGap(36))
		);
		
		table = new JTable();
		scrollPane_2.setViewportView(table);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		tabbedPane.addTab("Manage", null, panel_1, null);
		
		lblThngTin = new JLabel("<html>&#128176; SALARY COEFFICIENT INFORMATION </html>");
		lblThngTin.setBounds(37, 14, 1031, 41);
		lblThngTin.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		separator = new JSeparator();
		separator.setBounds(10, 350, 1094, 7);
		
		lblManage_Department = new JLabel("<html>&#128188; DEPARTMENT MANAGE</html>");
		lblManage_Department.setBounds(44, 393, 304, 41);
		lblManage_Department.setHorizontalAlignment(SwingConstants.LEFT);
		lblManage_Department.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(173, 677, 59, 19);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lbl_ID_Emp = new JLabel("ID Employee:");
		lbl_ID_Emp.setBounds(123, 110, 89, 19);
		lbl_ID_Emp.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_ID_Emp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNewLabel_17 = new JLabel("Coefficients Salary:");
		lblNewLabel_17.setBounds(89, 149, 123, 19);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_10 = new JTextField();
		textField_10.setBounds(222, 111, 126, 20);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(222, 150, 126, 20);
		textField_11.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(616, 73, 452, 259);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(616, 412, 452, 259);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(72, 247, 106, 23);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(242, 247, 106, 23);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(419, 247, 106, 23);
		
		tblManageDepartment = new JTable();
		scrollPane_1.setViewportView(tblManageDepartment);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		panel_1.setLayout(null);
		panel_1.add(lblThngTin);
		panel_1.add(lblNewLabel_14);
		panel_1.add(lblManage_Department);
		panel_1.add(scrollPane_1);
		panel_1.add(lbl_ID_Emp);
		panel_1.add(btnNewButton);
		panel_1.add(lblNewLabel_17);
		panel_1.add(textField_10);
		panel_1.add(textField_11);
		panel_1.add(btnNewButton_1);
		panel_1.add(btnNewButton_2);
		panel_1.add(scrollPane);
		panel_1.add(separator);
		
		lblNewLabel_1 = new JLabel("ID Department:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(89, 497, 123, 19);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New Label:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(106, 538, 106, 19);
		panel_1.add(lblNewLabel_2);
		
		textField_8 = new JTextField();
		textField_8.setBounds(222, 498, 126, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(222, 539, 126, 20);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		tabbedPane.addTab("Salary", null, panel_2, null);
		
		lblBngThng = new JLabel("<html>&#128178; WAGES STATISTICS PAGE </html>");
		lblBngThng.setHorizontalAlignment(SwingConstants.CENTER);
		lblBngThng.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		lblNewLabel_18 = new JLabel("Select Month:");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		
		lblNewLabel_19 = new JLabel("Salary By Majors:");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Surgery", "Cardiolory", "Dermatology", "Endocrinology", "Obstetric"}));
		
		btnNewButton_10 = new JButton("Salary of all employees:");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_12.setColumns(10);
		
		lblNewLabel_20 = new JLabel("<html>&#128269;</html>");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		scrollPane_4 = new JScrollPane();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_19)
						.addComponent(lblNewLabel_18))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(808, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(btnNewButton_10, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 528, Short.MAX_VALUE)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_20)))
					.addGap(38))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(339, Short.MAX_VALUE)
					.addComponent(lblBngThng, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
					.addGap(331))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_18))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_19)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_10)
								.addComponent(lblNewLabel_20)
								.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(lblBngThng, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
		);
		
		table_3 = new JTable();
		scrollPane_4.setViewportView(table_3);
		panel_2.setLayout(gl_panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.PINK);
		tabbedPane.addTab("Shift", null, panel_3, null);
		
		lblqunLCa = new JLabel("<html>&#128338; MANAGE SHIFT WORK OF EMPLOYEES </html>");
		lblqunLCa.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		lblNewLabel_21 = new JLabel("ID Employee:");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNewLabel_22 = new JLabel("Fullname Employee:");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_14.setColumns(10);
		
		lblNewLabel_23 = new JLabel("Major Work:");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.RIGHT);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Surgery", "Cardiolory", "Dermatology", "Endocrinology", "Obstetric"}));
		
		lblNewLabel_24 = new JLabel("Work Time:");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		btnNewButton_11 = new JButton("Employee's duty shift during the month");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		scrollPane_3 = new JScrollPane();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_3.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblqunLCa, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
											.addGroup(gl_panel_3.createSequentialGroup()
												.addGap(49)
												.addComponent(lblNewLabel_23, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addComponent(lblNewLabel_21, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
											.addComponent(lblNewLabel_22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(gl_panel_3.createSequentialGroup()
											.addGap(53)
											.addComponent(lblNewLabel_24, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
									.addGap(18)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBox_2, 0, 150, Short.MAX_VALUE)
										.addComponent(textField_14, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
										.addComponent(textField_13, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
										.addComponent(textField_15, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
									.addGap(325)))
							.addGap(446))
						.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(26)
									.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(750)
									.addComponent(btnNewButton_11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGap(30)))
					.addGap(5))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(21)
							.addComponent(lblqunLCa, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(75)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_21))))
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_22))
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_23))
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_24))
					.addGap(18)
					.addComponent(btnNewButton_11)
					.addGap(18)
					.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
					.addGap(29))
		);
		
		table_2 = new JTable();
		scrollPane_3.setViewportView(table_2);
		panel_3.setLayout(gl_panel_3);
		
		panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		
		contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.PINK);
		panel_4.add(contentPane_1);
		
		lblNewLabel_11 = new JLabel("Th\u00E1ng ch\u1EA5m c\u00F4ng :");
		lblNewLabel_11.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		comboBox_3 = new JComboBox();
		
		lblMCng = new JLabel("M\u00E3 C\u00F4ng :");
		lblMCng.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		lblMNhnVin = new JLabel("M\u00E3 Nh\u00E2n Vi\u00EAn :");
		lblMNhnVin.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		
		lblSGiLm = new JLabel("S\u1ED1 Gi\u1EDD L\u00E0m Th\u00EAm :");
		lblSGiLm.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		lblSNgyLm = new JLabel("S\u1ED1 Ng\u00E0y l\u00E0m Vi\u1EC7c :");
		lblSNgyLm.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		
		btnNewButton_12 = new JButton("Delete");
		
		lblNewLabel_25 = new JLabel("Th\u00E1ng ch\u1EA5m c\u00F4ng :");
		lblNewLabel_25.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		lblNewLabel_26 = new JLabel("Th\u00E1ng ch\u1EA5m c\u00F4ng :");
		lblNewLabel_26.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		lblHSLng = new JLabel("H\u1EC7 S\u1ED1 L\u01B0\u01A1ng :");
		lblHSLng.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		btnNewButton_13 = new JButton("Update");
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		
		separator_1 = new JSeparator();
		
		table_5 = new JTable();
		
		btnNewButton_14 = new JButton("Insert ");
		
		btnNewButton_15 = new JButton("Quit");
		
		lblChmCng = new JLabel("<html>&#128338; CH\u1EA4M C\u00D4NG NH\u00C2N VI\u00CAN</html>");
		lblChmCng.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GroupLayout gl_contentPane_1 = new GroupLayout(contentPane_1);
		gl_contentPane_1.setHorizontalGroup(
			gl_contentPane_1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 1099, Short.MAX_VALUE)
				.addGroup(gl_contentPane_1.createSequentialGroup()
					.addGap(49)
					.addGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane_1.createSequentialGroup()
							.addComponent(lblNewLabel_11)
							.addGap(18)
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane_1.createSequentialGroup()
							.addGroup(gl_contentPane_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane_1.createSequentialGroup()
									.addGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane_1.createSequentialGroup()
											.addGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblMCng, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMNhnVin, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING, false)
												.addComponent(textField_16)
												.addComponent(textField_17, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
										.addGroup(gl_contentPane_1.createSequentialGroup()
											.addGroup(gl_contentPane_1.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(lblSGiLm, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblSNgyLm, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))))
									.addGap(170))
								.addGroup(gl_contentPane_1.createSequentialGroup()
									.addComponent(btnNewButton_12)
									.addGap(63)))
							.addGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_25, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_26, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane_1.createSequentialGroup()
									.addComponent(lblHSLng, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton_13)
										.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(315, Short.MAX_VALUE))
				.addGroup(gl_contentPane_1.createSequentialGroup()
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 1091, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane_1.createSequentialGroup()
					.addComponent(table_5, GroupLayout.PREFERRED_SIZE, 1086, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane_1.createSequentialGroup()
					.addGap(77)
					.addComponent(btnNewButton_14)
					.addPreferredGap(ComponentPlacement.RELATED, 837, Short.MAX_VALUE)
					.addComponent(btnNewButton_15)
					.addGap(69))
				.addGroup(gl_contentPane_1.createSequentialGroup()
					.addContainerGap(379, Short.MAX_VALUE)
					.addComponent(lblChmCng, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE)
					.addGap(99))
		);
		gl_contentPane_1.setVerticalGroup(
			gl_contentPane_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 746, Short.MAX_VALUE)
				.addGroup(gl_contentPane_1.createSequentialGroup()
					.addGap(7)
					.addComponent(lblChmCng, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(gl_contentPane_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_11)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMCng, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHSLng, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMNhnVin, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_26, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSNgyLm, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_25, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSGiLm, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_contentPane_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_14)
						.addComponent(btnNewButton_15)
						.addComponent(btnNewButton_13)
						.addComponent(btnNewButton_12))
					.addGap(18)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(table_5, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE))
		);
		contentPane_1.setLayout(gl_contentPane_1);
		contentPane.setLayout(gl_contentPane);
	}
}

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
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

import dao.Account_dao;

import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel_1;
	private JPanel panel;
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
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JSeparator separator;
	private JDateChooser dateChooser_1;
	private JTabbedPane tabbedPane_1;
	private JScrollPane scrollPane;
	private static JTable table;

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
		setUndecorated(true);
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
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelMouseClicked(e);
			}
		});
		panel.setBackground(Color.PINK);
		tabbedPane.addTab("\u0110i\u1EC3m Danh", null, panel, null);
		
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1ActionPerformed(e);
			}
		});
		
		btnNewButton_2 = new JButton("New button");

		
		btnNewButton_3 = new JButton("New button");
		
		rdbtnNewRadioButton_2 = new JRadioButton("C\u00F3");
		buttonGroup.add(rdbtnNewRadioButton_2);
		
		separator = new JSeparator();
		
		dateChooser_1 = new JDateChooser();
		
		scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(421)
							.addComponent(lblimDanh, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(48)
							.addComponent(lblNewLabel_1)
							.addGap(30)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addGap(378)
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(48)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addGap(378)
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(48)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(1)
									.addComponent(lblNewLabel_5)))
							.addGap(9)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(1)
									.addComponent(rdbtnNewRadioButton)
									.addGap(9)
									.addComponent(rdbtnNewRadioButton_1)))
							.addGap(378)
							.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(22)
							.addComponent(rdbtnNewRadioButton_2))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(48)
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(48)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(126)
							.addComponent(btnNewButton)
							.addGap(133)
							.addComponent(btnNewButton_1)
							.addGap(140)
							.addComponent(btnNewButton_2)
							.addGap(124)
							.addComponent(btnNewButton_3))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1062, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(12)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1063, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(12)
					.addComponent(lblimDanh, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNewLabel_7))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNewLabel_3))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNewLabel_8))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(8)
							.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_4)
							.addGap(15)
							.addComponent(lblNewLabel_5))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton)
								.addComponent(rdbtnNewRadioButton_1)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_9))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(9)
							.addComponent(rdbtnNewRadioButton_2)))
					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_6))
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(7)
									.addComponent(lblNewLabel_2))
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(14)
									.addComponent(btnNewButton_1))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(btnNewButton)))
							.addGap(6))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnNewButton_3)
							.addGap(7))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnNewButton_2)
							.addGap(7)))
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
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
	protected void panelMouseClicked(MouseEvent e) {
		Account_dao dao = new Account_dao();
		LoadAccount(dao);
	}
	static void LoadAccount(Account_dao dao) {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Fullname");
		model.addColumn("Birthday");
		model.addColumn("Gender");
		model.addColumn("Address");
		model.addColumn("Phone");
		model.addColumn("Major");
		
		dao.getListManager().forEach(
				acc -> model.addRow(new Object[] {acc.getID_em(),acc.getFullname(),acc.getDate_em(),acc.getGender_em()?"male":"female",acc.getAddress_em(),"0"+acc.getPhone_em(),acc.getName_majors()})	
			);
		table.setModel(model);
	}

	protected void btnNewButton_1ActionPerformed(ActionEvent e) {
		if (dateChooser_1.getDate()==null) {
			System.out.println("aaaaaaaa");
		}else {
			System.out.println("sdgbgnhmhm");
		}
	}
}


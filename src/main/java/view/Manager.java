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
import javax.swing.JOptionPane;

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

import entity.Assignment;


import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

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
	private JTextField txtFullName;
	private JTextField txtID;
	private JDateChooser dateChooser;
	private JTextField txtSDT;
	private JTextField txtAddress;
	private JRadioButton rblNam;
	private JRadioButton rblNu;
	private JLabel lblNewLabel_7;
	private JTextField txtMajor;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JSeparator separator;
	private JDateChooser dateChooser_1;
	private JTabbedPane tabbedPane_1;
	private JScrollPane scrollPane;
	private static JTable table;
	private JCheckBox chckbxNewCheckBox;

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
		
		lblNewLabel_1 = new JLabel("ID :");
		
		lblNewLabel_2 = new JLabel("Phone :");
		
		lblNewLabel_3 = new JLabel("FullName :");
		
		lblNewLabel_4 = new JLabel("Date of Birth:");
		
		lblNewLabel_5 = new JLabel("Gender :");
		
		lblNewLabel_6 = new JLabel("Address :");
		
		txtFullName = new JTextField();
		txtFullName.setColumns(10);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		
		dateChooser = new JDateChooser();
		
		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		
		rblNam = new JRadioButton("Nam");
		buttonGroup_1.add(rblNam);
		
		rblNu = new JRadioButton("N\u1EEF");
		buttonGroup_1.add(rblNu);
		
		lblNewLabel_7 = new JLabel("Name Major :");
		
		txtMajor = new JTextField();
		txtMajor.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Working day :");
		
		lblNewLabel_9 = new JLabel("Attendance :");
		
		btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtonActionPerformed(e);
			}
		});


		
		btnNewButton_1 = new JButton("New button");
	
		
		btnNewButton_2 = new JButton("New button");

		
		btnNewButton_3 = new JButton("New button");
		
		separator = new JSeparator();
		
		dateChooser_1 = new JDateChooser();
		
		scrollPane = new JScrollPane();
		
		chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(Color.PINK);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(421)
							.addComponent(lblimDanh, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE))
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
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1063, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(48)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
							.addGap(21)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtAddress)
								.addComponent(txtSDT, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(48)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblNewLabel_1)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtID, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(txtFullName, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_4)
										.addComponent(lblNewLabel_5))
									.addGap(10)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(rblNam)
											.addGap(18)
											.addComponent(rblNu))
										.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))))
							.addGap(367)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(txtMajor, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
											.addGap(11))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
											.addGap(25)))
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
										.addComponent(chckbxNewCheckBox))))))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblimDanh, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(5)
									.addComponent(lblNewLabel_1))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(5)
									.addComponent(lblNewLabel_7))
								.addComponent(txtMajor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNewLabel_3)
									.addComponent(txtFullName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_8)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(19)
							.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_4)
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(19)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(rblNam)
								.addComponent(rblNu)
								.addComponent(lblNewLabel_5)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(9)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_9)
								.addComponent(chckbxNewCheckBox))))
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_6)
								.addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(17)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(14)
											.addComponent(btnNewButton_1))
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(10)
											.addComponent(btnNewButton))))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(7)
									.addComponent(lblNewLabel_2)))
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
					.addContainerGap(32, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tableMouseClicked(e);
			}
		});
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
	
		
		
		dao.getListAcc().forEach(
				acc -> model.addRow(new Object[] {acc.getID_em(),acc.getFullname(),acc.getDate_em(),acc.getGender_em()?"male":"female",acc.getAddress_em(),"0"+acc.getPhone_em(),acc.getName_majors()})	
			);
		table.setModel(model);
	}

	
	
	protected void tableMouseClicked(MouseEvent e) {
		int rowindex = table.getSelectedRow();
		txtID.setText(table.getValueAt(rowindex,0).toString());
		txtFullName.setText(table.getValueAt(rowindex,1).toString());
		try {
			dateChooser.setDate(
					new SimpleDateFormat("yyyy-MM-dd").parse(table.getValueAt(rowindex,2).toString()));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(table.getValueAt(rowindex,3).toString().equals("true")) {
			rblNam.setSelected(true);
			
		}else 
			rblNu.setSelected(true);
	
		txtAddress.setText(table.getValueAt(rowindex,4).toString());
		txtSDT.setText(table.getValueAt(rowindex,5).toString());
		txtMajor.setText(table.getValueAt(rowindex,6).toString());
} 
		

	

			
	protected void btnNewButtonActionPerformed(ActionEvent e) {
		int rowindex = table.getSelectedRow();
		Account_dao dao = new Account_dao();
		Assignment ass = new Assignment();
		ass.setID_em(table.getValueAt(rowindex,0).toString());
		ass.setTime_ass(dateChooser_1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		if(chckbxNewCheckBox.isSelected()){
		    ass.setStatus_ass(true);
		}else{
		    ass.setStatus_ass(false);
		    
		}
		if(dao.getday(ass)) {
			JOptionPane.showMessageDialog(null,"da diem danh");
		}else {
			if(JOptionPane.showConfirmDialog(null,"Insert ?" , "Confirmation",JOptionPane.YES_NO_OPTION) == 0) {
				dao.insertInformation(ass);
				}
		}
	
	}
}


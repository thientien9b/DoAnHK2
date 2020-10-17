package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.mindrot.jbcrypt.BCrypt;

import dao.Account_dao;
import entity.Account;
import javax.swing.JRadioButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField jtfUserName;
	private JPasswordField jtfPin;
	int xx,xy;
	private JLabel jlbMsg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setUndecorated(true);
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
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 374);
		contentPane = new JPanel() {
			ImageIcon icon = new ImageIcon("src/main/resources/1.jpg");
				public void paintComponent(Graphics g){
		        Dimension d = getSize();
		        g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
		        setOpaque(false);
		        super.paintComponent(g);
		    }
				
		};
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 xx = e.getX();
			     xy = e.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
	            int y = arg0.getYOnScreen();
	            Login.this.setLocation(x - xx, y - xy);  
			}
		});
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Button btnSubmit = new Button("Login to your account");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSubmitActionPerformed(e);
			}
		});
		btnSubmit.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSubmit.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnSubmit.setForeground(new Color(0, 102, 153));
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubmit.setForeground(new Color(0, 102, 153));
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setBounds(417, 258, 256, 54);
		contentPane.add(btnSubmit);
		jtfUserName = new JTextField() {
			
		};
		jtfUserName.setForeground(Color.BLACK);
		jtfUserName.setBounds(417, 118, 256, 36);
		contentPane.add(jtfUserName);
		jtfUserName.setColumns(10);
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(417, 101, 114, 14);
		contentPane.add(lblUsername);
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(417, 165, 96, 14);
		contentPane.add(lblPassword);
		jtfPin = new JPasswordField() {
			
		};
		jtfPin.setEchoChar('*');
		jtfPin.setBounds(417, 183, 256, 36);
		contentPane.add(jtfPin);
		
		JLabel lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this form?", "Confirmation",
						JOptionPane.YES_NO_OPTION) == 0) {

					Login.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_close.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_close.setForeground(Color.WHITE);
			}
		});
		lbl_close.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_close.setForeground(Color.WHITE);
		lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_close.setBounds(691, 0, 37, 27);
		contentPane.add(lbl_close);
		
		JLabel lblNewLabel_1 = new JLabel("Log in");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(417, 54, 96, 36);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel(){
			ImageIcon icon = new ImageIcon("src/main/resources/logo.png");
			public void paintComponent(Graphics g){
	        Dimension d = getSize();
	        g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
	        setOpaque(false);
	        super.paintComponent(g);
	    }
	};
		panel.setBounds(62, 32, 282, 317);
		contentPane.add(panel);
		
		jlbMsg = new JLabel("");
		jlbMsg.setForeground(Color.RED);
		jlbMsg.setBounds(417, 238, 256, 14);
		contentPane.add(jlbMsg);
		
		JRadioButton rdbtnAnHIen = new JRadioButton("show");
		rdbtnAnHIen.setForeground(new Color(255, 255, 255));
		rdbtnAnHIen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAnHIen.isSelected()) {
				rdbtnNewRadioButtonActionPerformed(e);
				}else {
					jtfPin.setEchoChar('*');
				}
			}
		});
		rdbtnAnHIen.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnAnHIen.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnAnHIen.setForeground(Color.WHITE);
			}
		});
		rdbtnAnHIen.setBounds(620, 165, 53, 14);
		rdbtnAnHIen.setBorder(null);
		rdbtnAnHIen.setBackground(new Color(112, 128, 144));
		contentPane.add(rdbtnAnHIen);
		
	}

	protected void btnSubmitActionPerformed(ActionEvent e) {
		String password = jtfPin.getText();
		String user = jtfUserName.getText();
		if(user.length() == 0 || password.length() == 0) {
			jlbMsg.setText("Please enter your complete information");	
		}else{
			if(Account_dao.getListClient(user)) {
				boolean match = BCrypt.checkpw(password, Account_dao.getListPass(user));
				if (match) {
					if(Account_dao.getListAdmin(user) == "Admin") {
						Account acc = new Account();
//						acc.setId(Account_dao.getListID(user));
						Admin ad = new Admin();
//						ad.lblID.setText(Integer.toString(acc.getID_Acc()));
						ad.setVisible(true);
						setVisible(false);
					}else if(Account_dao.getListAdmin(user) == "Manager") {	
						Account acc = new Account();
//						acc.setID_Acc(Account_dao.getListID(user));
//						Client client = new Client(acc, this);
//						client.setVisible(true);
						setVisible(false);
					}else if(Account_dao.getListAdmin(user) == "Reception") {	
						Account acc = new Account();
//						acc.setID_Acc(Account_dao.getListID(user));
//						Client client = new Client(acc, this);
//						client.setVisible(true);
						setVisible(false);
					}else {	
						Account acc = new Account();
//						acc.setID_Acc(Account_dao.getListID(user));
//						Client client = new Client(acc, this);
//						client.setVisible(true);
						setVisible(false);
					}
				} else {
					jlbMsg.setText("Password code incorrect");
				}
			}else {
				jlbMsg.setText("User incorrect");
			}
		}
	}
	protected void rdbtnNewRadioButtonActionPerformed(ActionEvent e) {
		jtfPin.setEchoChar((char)0);
	}
}

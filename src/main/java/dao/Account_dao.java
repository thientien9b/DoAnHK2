package dao;

import java.security.SecureRandom;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import common.ConnectDB;
import common.ConnectDBProperties;
import entity.Account;
import entity.Employee;
import entity.Hospital;
import entity.Position;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public  class Account_dao {
	
//------------------------------------------------------------------------------------
	public static Position getListID_em(String user) {
		Position acc = new Position();
		try(
				var connect = DriverManager.getConnection(ConnectDBProperties.getConnectionUrlFromClassPath());
				var cs = connect.prepareStatement("select Position.Name_position, Position.Ranks_position from Employee join Account on Employee.ID_em = Account.ID_em join Position on Employee.ID_position = Position.ID_position where Account.ID_em like ?");
			)		
		{
			cs.setString(1,user);
			var rs = cs.executeQuery();
				while(rs.next()) {
				acc.setName_position(rs.getString("Name_position"));
				acc.setRanks_position(rs.getString("Ranks_position"));			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return acc;
	}	
//------------------------------------------------------------------------------------
	public static String getListPass(String user) {
		String pass = null;
		try {
			var connect = DriverManager.getConnection(ConnectDBProperties.getConnectionUrlFromClassPath());
			var cs = connect.prepareStatement("SELECT password_acc FROM Account WHERE Account.ID_em like ?");
			
			cs.setString(1, user);
			var rs = cs.executeQuery();
			if (rs.next()) {
				pass = rs.getString("password_acc");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pass;
	}
//------------------------------------------------------------------------------------
	public static boolean getListClient(String user) {
		boolean client = false;
		try {
			var connect = DriverManager.getConnection(ConnectDBProperties.getConnectionUrlFromClassPath());
			var cs = connect.prepareStatement("SELECT ID_em FROM Account WHERE Account.ID_em like ?");
			
			cs.setString(1, user);
			var rs = cs.executeQuery();
			if (rs.next()) {
				client = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return client;
	}
//------------------------------------------------------------------------------------
	public List<Hospital> getListAcc() {
		var list_Acc = new ArrayList<Hospital>();
		
		try(
				var connect = DriverManager.getConnection(ConnectDBProperties.getConnectionUrlFromClassPath());
				var cs = connect.prepareStatement("select * from Employee join Majors on Employee.ID_majors = Majors.ID_majors join Position on Employee.ID_position = Position.ID_position join Salary on Employee.ID_salary = Salary.ID_salary");
				ResultSet rs = cs.executeQuery();
		)		
		{
			while(rs.next()) {
			Hospital acc = new Hospital();
			acc.setID_em(rs.getString("ID_em"));
			acc.setFullname(rs.getString("Fullname"));
			acc.setGender_em(rs.getBoolean("Gender_em"));
			acc.setPhone_em(rs.getInt("Phone_em"));
			acc.setDate_em(rs.getDate("Date_em").toLocalDate());
			acc.setEmail_em(rs.getString("Email_em"));
			acc.setAddress_em(rs.getString("Address_em"));
			acc.setName_position(rs.getString("Name_position"));
			acc.setRanks_position(rs.getString("Ranks_position"));
			acc.setName_majors(rs.getString("Name_majors"));
			acc.setAddress_majors(rs.getString("Address_majors"));
			acc.setBasic_salary(rs.getDouble("Basic_salary"));
			acc.setCoefficients_salary(rs.getDouble("Coefficients_salary"));
			acc.setAllowance_salary(rs.getDouble("Allowance_salary"));
			acc.setID_majors(rs.getString("ID_majors"));
			acc.setID_position(rs.getString("ID_position"));
			acc.setID_salary(rs.getString("ID_salary"));
			list_Acc.add(acc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list_Acc;
	}
//------------------------------------------------------------------------------------
	public static Hospital getListID_acc(String user) {
		Hospital acc = new Hospital();
		try(
				var connect = DriverManager.getConnection(ConnectDBProperties.getConnectionUrlFromClassPath());
				var cs = connect.prepareStatement("select * from Employee join Majors on Employee.ID_majors = Majors.ID_majors join Position on Employee.ID_position = Position.ID_position join Salary on Employee.ID_salary = Salary.ID_salary WHERE Employee.ID_em like ?");
		)		
		{
			cs.setString(1,user);
			var rs = cs.executeQuery();
			while(rs.next()) {
				acc.setID_em(rs.getString("ID_em"));
				acc.setFullname(rs.getString("Fullname"));
				acc.setGender_em(rs.getBoolean("Gender_em"));
				acc.setPhone_em(rs.getInt("Phone_em"));
				acc.setDate_em(rs.getDate("Date_em").toLocalDate());
				acc.setEmail_em(rs.getString("Email_em"));
				acc.setAddress_em(rs.getString("Address_em"));
				acc.setName_position(rs.getString("Name_position"));
				acc.setRanks_position(rs.getString("Ranks_position"));
				acc.setName_majors(rs.getString("Name_majors"));
				acc.setAddress_majors(rs.getString("Address_majors"));
				acc.setBasic_salary(rs.getDouble("Basic_salary"));
				acc.setCoefficients_salary(rs.getDouble("Coefficients_salary"));
				acc.setAllowance_salary(rs.getDouble("Allowance_salary"));
				acc.setID_majors(rs.getString("ID_majors"));
				acc.setID_position(rs.getString("ID_position"));
				acc.setID_salary(rs.getString("ID_salary"));
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return acc;
	}	
//------------------------------------------------------------------------------------
public String SendEmail(String email) {

    	final String chars = "0123456789";
    	SecureRandom random = new SecureRandom();
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < 4; i++) {
    		int randomIndex = random.nextInt(chars.length());
    		sb.append(chars.charAt(randomIndex));
    	}
    	String RandomPass = sb.toString();
    	String to = email;

        String from = "Aptech.hospital@gmail.com";
        
        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();

        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("Aptech.hospital@gmail.com", "Aptech0211");

            }

        });

        session.setDebug(true);

        try {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            message.setSubject("This is the Subject Line!");

            message.setText("Your confirmation code is: "+RandomPass + "please do not show it to anyone!");

            System.out.println("sending...");
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
		return RandomPass;
	}
//------------------------------------------------------------------------------------

}

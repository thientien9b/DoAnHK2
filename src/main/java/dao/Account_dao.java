package dao;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.ConnectDB;
import common.ConnectDBProperties;
import entity.Account;



public  class Account_dao {
	
	public static String getListAdmin(String user) {
		String a = null;
		try {
			var connect = DriverManager.getConnection(ConnectDBProperties.getConnectionUrlFromClassPath());
			var cs = connect.prepareStatement("select Position.Name_position from Employee join Account on Employee.ID_em = Account.ID_em join Position on Employee.ID_position = Position.ID_position where Account.ID_em like ?");
			cs.setString(1, user);
			var rs = cs.executeQuery();
			if (rs.next()) {
				if(rs.getString("Name_position")== "Admin") {
					a = "admin";
				}else if(rs.getString("Name_position")== "Manager"){
					a = "Manager";
				}else if(rs.getString("Name_position")== "Reception"){
					a = "Reception";
				}else {
					a = "em";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return a;
	}
//------------------
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
//-----------------
	public static boolean getListClient(String user) {
		boolean client = false;
		try {
			var connect = DriverManager.getConnection(ConnectDBProperties.getConnectionUrlFromClassPath());
			var cs = connect.prepareStatement("SELECT ID_em FROM account WHERE Account.ID_em like ?");
			
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
	
}

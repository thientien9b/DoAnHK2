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
import entity.Position;



public  class Account_dao {
	
//------------------
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
}

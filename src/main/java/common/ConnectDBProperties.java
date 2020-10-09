package common;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class ConnectDBProperties {
	
	public static String getConnectionUrlFromClassPath() {
		String strCon = null;
		
		try(
				InputStream file = ConnectDBProperties.class.getClassLoader()
								.getResourceAsStream("db.properties");
		   )
		{
			Properties prop = new Properties();
			prop.load(file);
			strCon = prop.getProperty("url") + prop.getProperty("serverName") + ":" + prop.getProperty("portNumber")
					+ "; databaseName=" + prop.getProperty("databaseName") + "; user=" + prop.getProperty("username")
					+ "; password=" + prop.getProperty("password");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			strCon=null;
		}
		
		return strCon;
	}
	
	public static Connection getConnectionFromClassPath() {
		Connection connect = null;
		
		try			   
		{
			connect = DriverManager.getConnection(getConnectionUrlFromClassPath());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			connect=null;
		}
		
		return connect;
	}
	
	
	public static String getConnectionUrlFromOutside() {
		String strCon = null;
		
		try(
				FileInputStream file = new FileInputStream("ketnoi.properties");
		   )
		{
			Properties prop = new Properties();
			prop.load(file);
			strCon = prop.getProperty("url") + prop.getProperty("serverName") + ":" + prop.getProperty("portNumber")
					+ "; databaseName=" + prop.getProperty("databaseName") + "; user=" + prop.getProperty("username")
					+ "; password=" + prop.getProperty("password");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			strCon=null;
		}
		
		return strCon;
	}

}
package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test2 {
	public static void main(String[] args) throws Exception {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			Connection con = DriverManager.
			getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","197366");
			
			
			Statement em  = con.createStatement();
			
			
			ResultSet rs = em.executeQuery("select * from employe");
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1) + "" +rs.getString(2));
			}
			
			
			con.close();
		}
	}

			
		
			
	



package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class test1 {
	public static void main(String[] args) {
		try {
		
		
	    Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver class loaded");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "197366");
		
		System.out.println("i got the connection");
		
		Statement em = con.createStatement();
		
	    int x = em.executeUpdate("insert into employe values(5885,'sai')");
	    int x1 = em.executeUpdate("insert into employe values(4486,'ram')");
	    int x2 = em.executeUpdate("insert into employe values(2564,'naveen')");
	    int x3= em.executeUpdate("insert into employe values(3264,'hakeem')");
		System.out.println(x + "row(s) inserted");
		con.close();
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

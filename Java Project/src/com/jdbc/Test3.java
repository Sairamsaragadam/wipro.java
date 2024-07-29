package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Test3 {

	  public static void main(String[] args) throws Exception{
		  
		     Class.forName("oracle.jdbc.driver.OracleDriver");
		     
		     Connection con = DriverManager. getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "System","197366");
		  
		      PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
	  
	                 Scanner scan= new Scanner(System.in);
	                 System.out.println("enter employe number");
	                 int emid = scan.nextInt();
	                 System.out.println("enter employe name");
	  
	                  String emname = scan.next();
	                  
	                  ps.setInt(1, emid);
	                  ps.setString(2, emname);
	                  
	                  int x= ps.executeUpdate();
	                  
	                  System.out.println(x + "row(s) inserted");
	                  
	                  
	                  con.close();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  }
	
}

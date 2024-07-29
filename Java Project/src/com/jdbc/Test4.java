package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class Test4 {

	    public static void main(String[] args) throws Exception{
	    	
	    	Class.forName("oracle.jdbc.driver.OracleDriver");
	    	Connection con=DriverManager.getConnection("jdbc:thin:@localhost:1521:xe","System","197366");
	    	
	    	          Statement st = con.createStatement();
	    	          ResultSet rs = st.executeQuery("select * ffrom student");
	    	          ResultSetMetaData rsmd = rs.getMetaData();
	    	          System.out.println("no.of coloumns: " + rsmd.getColumnCount ());
                      
	    	          for(int i=1;i<=rsmd.getColumnCount();i++)
	    	  		{
	    	  			System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i) +  " "  + rsmd.getPrecision(i));
	    	  		}
	    	
	    	
	    	
	    	
	    	
	    }
}

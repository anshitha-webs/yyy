
package first;
import java.sql.Statement;

import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class sample1 {

	public static void main(String[] args) {
		try{
		 String url="jdbc:mysql://localhost:3306/sql_program1";
		 String username="root";
		 String password="mysql@123";
		 Connection connection= DriverManager.getConnection(url,username,password);
		 Statement st= connection.createStatement();
		 System.out.println("Connection Established");
		String query=" create table table2(studentid int,studentname varchar(30),studentage int);";
	st.execute(query);
	System.out.println("table is created");
		String query1="select * from table1";
		ResultSet rs= st.executeQuery(query1);
		while(rs.next());
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			
		}
		
		
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}


package jdbc;

import java.sql.*;

//Insert Table Values
public class SecondQuery {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		System.out.println(1);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println(2);

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finzly","root","root");

        System.out.println("Check");

    	String query = "Insert into login(id, username, password) values (2,'sahid','asdbh')";

        Statement st = con.createStatement();
        int rs = st.executeUpdate(query);

        System.out.println("Done");
		
	}
}

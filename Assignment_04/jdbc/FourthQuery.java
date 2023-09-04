package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Getting the Values from sql
public class FourthQuery {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		System.out.println(1);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println(2);

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finzly","root","root");

        System.out.println("Check");

    	String query = "Select * from login";

    	PreparedStatement st = con.prepareStatement(query);
		
        ResultSet rs = st.executeQuery();

        System.out.println("Done");
        System.out.println("Id\tUsername" + " Password" );
		while(rs.next()) {
			String id = rs.getString(1);			
			String username = rs.getString(2);
			String password = rs.getString(3);
			
			System.out.println(id + "\t" + username + "\t " + password);

		
	}
}
}
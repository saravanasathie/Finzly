package jdbc;

import java.sql.*;

//Insert Table Values using PreparedStatement
public class ThirdQuery {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		System.out.println(1);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println(2);

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finzly","root","root");

        System.out.println("Check");

    	String query = "Insert into login(id, username, password) values (?,?,?)";

    	PreparedStatement st = con.prepareStatement(query);
		st.setString(1, "3");
		st.setString(2, "sasi");
		st.setString(3, "jdsfk");
        int rs = st.executeUpdate();

        System.out.println("Done");
		
	}
}

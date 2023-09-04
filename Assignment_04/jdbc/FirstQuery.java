package jdbc;

import java.sql.*;

public class FirstQuery {

        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            System.out.println(1);

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(2);

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finzly","root","root");

            System.out.println("Check");

        	String query = "Select * from login";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println("Done");
        }
    }



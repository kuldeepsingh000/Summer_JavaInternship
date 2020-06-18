package jdbcPractical;

import java.sql.*;

public class DemoClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver"); // this one helps to register the driver class.
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "1234");
		Statement st = con.createStatement();
		
		String query = "select * from emp11";
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			String userData = rs.getInt("EID") + " : " + rs.getString("ENAME") + " : " + rs.getInt("ESAL");
			System.out.println(userData);
		}
		
		st.close();
		con.close();
	}

}
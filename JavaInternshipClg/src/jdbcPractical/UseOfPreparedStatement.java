package jdbcPractical;

import java.sql.*;

public class UseOfPreparedStatement {

	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "1234");
		
		String query = "insert into emp values(?, ?)";
		PreparedStatement st = con.prepareStatement(query);
		
//		st.setInt(1, 101);
//		st.setString(2, "Kul");
		
		st.setInt(1, 102);
		st.setString(2,"deep");
//		
//		st.setInt(1, 103);
//		st.setString(2, "singh");
		
		int c = st.executeUpdate();
		System.out.println(c + " records inserted");
		
		st.close();
		con.close();
	}

}

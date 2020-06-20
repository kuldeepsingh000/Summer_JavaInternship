package jdbcPractical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetDataFromPreparedStmnt{

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "1234");
		
		PreparedStatement st = con.prepareStatement("select * from emp");
		ResultSet rs = st.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " : " + rs.getString(2));
		}
	}

}
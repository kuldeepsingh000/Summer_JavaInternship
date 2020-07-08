package jdbcPractical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Practise {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "1234");
		
//		How to use statement interface
//		Statement st = con.createStatement();
//		String query = "insert into kul11 values(2, 'kul2', 123)"; //for insert
//		String query = "delete from kul11 where name = 'kul2'";    //for delete
//		String query = "update kul11 set eid = 3 where name = 'kul2' "; // for update
//		st.executeQuery(query);
		
		
//		How to use preparedStatement
		String query = "insert into kul11 values(?,?,?)";
		PreparedStatement st = con.prepareStatement(query);
		
		st.setInt(1, 4);
		st.setString(2,"kul3");
		st.setInt(3, 124);
		
		st.setInt(1, 5);
		st.setString(2,"kul4");
		st.setInt(3, 125);
		
		st.executeQuery();
		
//		print the data from kul11 database -> PractiseGetData.java
		
		con.close();
		st.close();
	}

}

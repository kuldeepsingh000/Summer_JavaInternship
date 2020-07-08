package jdbcPractical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoData {

	public static void main(String[] args) throws Exception {
		
//		Demo database.
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "1234");
		Statement st = con.createStatement();
		
		st.addBatch("insert into demo values(1, 'A', 65)");
		st.addBatch("insert into demo values(2, 'B', 65)");
		st.addBatch("insert into demo values(3, 'C', 66)");
		st.addBatch("insert into demo values(4, 'D', 67)");
		st.addBatch("insert into demo values(5, 'E', 68)");
		
		int[] i = st.executeBatch();
		
		for(int ii : i)
		{
			System.out.println(ii);
		}
		
		con.close();
		st.close();
	}

}

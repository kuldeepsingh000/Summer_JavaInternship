package jdbcPractical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "1234");
//		Statement st = con.createStatement();
//		String query = "insert into emp11 values(444, 'singh', 50000)";
//		int count = st.executeUpdate(query);
//		System.out.println(count + "rows/s affectd");
		
//		Use the preparedStatement
		
//		int eid = 555;
//		String ename = "Kuldeep";
//		int esal = 60000;
//		String query = "insert into emp11 values(?, ? , ?)";
//		PreparedStatement st = con.prepareStatement(query);
//		
//		st.setInt(1, eid);
//		st.setString(2, ename);
//		st.setInt(3, esal);
//		int count = st.executeUpdate();
		
//		Again using statement 
		Statement st = con.createStatement();
//		st.executeUpdate("insert into emp11 values(666, 'singh', 60000)");
		
//		update the value.
//		st.executeUpdate("update emp11 set esal =  70000 where eid = 666");
		
			
//		Again insert some wrong information so that we can delete that easily
//		st.executeUpdate("insert into emp11 values(1 , 'Wrong', 15)");
		
//		i want to delete this complete rows.
		
		st.executeUpdate("delete from emp11 where eid = 1");
		
		System.out.println("rows/s affectd");
		
		st.close();
		con.close();

	}

}

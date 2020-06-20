package jdbcPractical;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Img {

	public static void main(String[] args) throws Exception, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "1234");
		PreparedStatement ps = con.prepareStatement("insert into img11 values(?,?)");
		ps.setString(1, "Kuldeep");
		FileInputStream fin = new FileInputStream("C:\\Users\\KULDEEP SINGH\\OneDrive\\Desktop\\analysisOfEveryState.png");
		ps.setBinaryStream(2, fin, fin.available());

		int i = ps.executeUpdate();
		System.out.println(i + " Record affected");
		con.close();
		fin.close();

	}

}

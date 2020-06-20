package jdbcPractical;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetImage {

	public static void main(String[] args) throws Exception, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "1234");

		PreparedStatement st = con.prepareStatement("select * from img11");

		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			Blob b = rs.getBlob(2);
			byte barr[] = b.getBytes(1, (int) b.length());// 1 means first image

			FileOutputStream fout = new FileOutputStream("C:\\Users\\KULDEEP SINGH\\OneDrive\\Desktop\\analysisOfEveryState11.png");
			fout.write(barr);

			fout.close();
		}

	}

}

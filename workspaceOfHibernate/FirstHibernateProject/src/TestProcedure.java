import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestProcedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		CallableStatement cstmt = con.prepareCall("");
		cstmt.execute();
		cstmt.getString("");
		cstmt.close();
		con.close();
	}
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Festival_DAO {
	
	Connection conn = null;
	PreparedStatement psmt =null;
	ResultSet rs = null;
	
	public void getConnect() {
	//1.동적로딩
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.DB 연결
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user_id = "hr";
		String user_pw = "hr";
		
		 conn = DriverManager.getConnection(url, user_id, user_pw);
		
		if(conn != null) {
			System.out.println("연결성공");
			} else {
			System.out.println("연결실패");
			}
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(psmt != null) {
			psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	
	
	
	
}

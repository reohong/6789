package Model;
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
	//1.�����ε�
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.DB ����
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user_id = "hr";
		String user_pw = "hr";
		
		 conn = DriverManager.getConnection(url, user_id, user_pw);
		
		if(conn != null) {
			System.out.println("���Ἲ��");
			} else {
			System.out.println("�������");
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
	
	public int joinFest(String festName,String festDate,String festPlace,String festTheme,String festMinmember,String festWho) {
		int cnt =0;
		getConnect();
		String sql = "insert into JoinFest values(?,?,?,?,?,?)";
		try {
			psmt= conn.prepareStatement(sql);
			psmt.setString(1, festName);
			psmt.setString(2, festDate);
			psmt.setString(3, festPlace);
			psmt.setString(4, festTheme);
			psmt.setString(5, festMinmember);
			psmt.setString(6, festWho);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	
	
	
	
}

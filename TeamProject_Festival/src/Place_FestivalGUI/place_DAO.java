package Place_FestivalGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class place_DAO {
	

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
	
	public ArrayList<place_DTO> selectPlace(String where) {
		getConnect();
		String sql = "select num,gegu,name,address from place where gegu=?";
		ArrayList<place_DTO> memberList = new ArrayList<place_DTO>();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, where);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int num= rs.getInt(1);
				String gegu = rs.getString(2);
				String name = rs.getString(3);
				String address = rs.getString(4);
				memberList.add(new place_DTO(num,gegu,name,address));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		} return memberList;
	
	
		
		
		
	} 
	
	
	
}

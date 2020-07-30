package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class festivalDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);

			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<festivalDTO> festivalSelect() {
		ArrayList<festivalDTO> memberList = new ArrayList<festivalDTO>();
		getConnect();
		String sql = "select * from pfestival";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				String ftitle = rs.getString(1);
				String fdate = rs.getString(2);
				String flocation = rs.getString(3);
				String ftheme = rs.getString(4);
				memberList.add(new festivalDTO(ftitle, fdate, flocation, ftheme));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return memberList;
	}

}

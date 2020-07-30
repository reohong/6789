package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ListDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void getConnect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DB연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);

			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void close() {

		try {
			if (rs != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();

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

	public ArrayList<ListDTO> Festivalinfo() {
		ArrayList<ListDTO> FestivalList = new ArrayList<ListDTO>();
		getConnect();
		String sql = "select * from List_F";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString(1);
				String day = rs.getString(2);
				String loc = rs.getString(3);
				String theme = rs.getString(4);
				int num = rs.getInt(5);
				int n_num = rs.getInt(6);

				// DTO애 담아 ㅁArrayList에 다시담기
				FestivalList.add(new ListDTO(name, day, loc, theme, num, n_num));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return FestivalList;
	}

	public int Update_num(int n, String name) {

		getConnect();
		String sql = "update List_F set n_num =? where name =?";
		int cnt = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, n);
			psmt.setString(2, name);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		System.out.println(n);
		return n;

	}

}

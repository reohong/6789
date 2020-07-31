package Model;

import java.beans.Statement;
import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class MembershipDAO {
	 
	// DAO : ������ ���� ��ü , DBó�� Ŭ���� ( DB����, Select, update, insert, delete )
	// �����ͺ��̽��� �����ϴ� ��ü

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null; // ���߿� ����Ʈ�� ���ð��� ����ؼ� ��������

		// * DB���� getConnect �޼ҵ� ==> �״�� �����ؿ��� ��
		public void getConnect() {

			    // 1.�����ε��ϱ�
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");

				// 2.DB����
				String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
				String user_id = "hr";
				String user_pw = "hr";

				conn = DriverManager.getConnection(url, user_id, user_pw);

				if (conn != null) {
					System.out.println("���Լ���");
				} else {
					System.out.println("���Խ���");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// * ��δݱ� close �޼ҵ� ==> �״�� �����ؿ��� ��
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
				e.printStackTrace();
			}
		}
		
		// ** �α���  Ȯ�� **
		public MembershipDTO loginSelect(String id, String pw) {
			
			getConnect();
			MembershipDTO dto =null;
			String sql = "select * from membership where id=? and pw=?";
			try {
				psmt = conn.prepareStatement(sql);
	
				psmt.setString(1, id);  
				psmt.setString(2, pw);
				rs = psmt.executeQuery();  
				while(rs.next()) {
					String loginid = rs.getString(1);
					String loginpw = rs.getString(2);
					String pwCheck = rs.getString(3);
					String sex = rs.getString(3);
					String email = rs.getString(4);
					String agegroup = rs.getString(5);
					dto = new MembershipDTO(loginid, loginpw, pwCheck,sex, email, agegroup);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			
			}finally {
				close();
			}
			return dto;
		}
		
		// ** ȸ������ **
		public int insertMember(MembershipDTO dto) {
		
			int cnt = 0;
			getConnect();
			String sql = " insert into membership values(?,?,?,?,?)";
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, dto.getId());
				psmt.setString(2, dto.getPw());
				// psmt.setString(3, dto.getPwcheck());
				psmt.setString(3, dto.getSex());
				psmt.setString(4, dto.getEmail());
				psmt.setString(5, dto.getAgegroup());

				cnt = psmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close();
			}
			return cnt;
		}
		
		// ** �ߺ�üũ  **  gui���� ���� ����??
		
		public boolean idoverlap(String id) {
			boolean result = false;
			getConnect();
			String sql = " select * from membership where id = ?";
			try{
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, id);
				rs = psmt.executeQuery();
				if(rs.next()) {
					result = true;
				}
			}catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {rs.close();}catch(SQLException s) {}
					try {psmt.close();}catch(SQLException s) {}
					try {conn.close();}catch(SQLException s) {}
				}
			return result;
		}

//		public void idoverlap(String id) {
//			
//			getConnect();
//			int cnt = 0;
//			psmt = null;
//			rs = null;
//		     String sql = " select * from membership where id = ?";
//		     
//		     try {
//					psmt = conn.prepareStatement(sql.toString());
//					psmt.setString(1, id); // ù��° ?�� id ������ ����
//				    rs = psmt.executeQuery(); // SQL ����
//					
//				    if ( rs.next() == true ) { // ���� ù��° ���ڵ�� �̵�
//						cnt = psmt.executeUpdate();
//				    }  else {
//						JOptionPane.showMessageDialog(null,  "��� ������ ID�Դϴ�.");
//				    }        
//		        }catch(Exception e){
//		            System.out.println(e.toString());
//		        }finally{
//		            close();
//		        }
//		       
//		     
//		    }
				    
//			try {
//				psmt = conn.prepareStatement(sql);
//				psmt.setString(1, id);
//				rs = psmt.executeQuery();
//				
//				if(rs.next()) {
//					JOptionPane.showMessageDialog(null, "�̹� ������� ID�Դϴ�.");
//					conn.close();
//				}else {
//					JOptionPane.showMessageDialog(null,  "��� ������ ID�Դϴ�.");
//					conn.close();
//				}	
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//			}finally {
//				close();
	
		public MembershipDTO name(String id) {
			
			getConnect();
			MembershipDTO dto =null;
			String sql = "select id from membership where id=?";
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, id);  
				rs = psmt.executeQuery();  
				while(rs.next()) {
					String loginid = rs.getString(1);
					String loginpw = rs.getString(2);
					String pwCheck = rs.getString(3);
					String sex = rs.getString(3);
					String email = rs.getString(4);
					String agegroup = rs.getString(5);
					dto = new MembershipDTO(loginid, loginpw, pwCheck,sex, email, agegroup);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			
			}finally {
				close();
			}
			return dto;
		}
}
	
		
		


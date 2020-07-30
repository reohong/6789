package View;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;	
import javax.swing.JTextField;

import Model.MembershipDAO;
import Model.MembershipDTO;



public class MembershipGUI {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null; // 나중에 셀렉트문 들어올것을 대비해서 전역변수
	
	
	private JFrame frame;
	private JTextField tf_id;
	private JPasswordField pf_pw;
	private JPasswordField pf_pwcheck;
	private JTextField tf_email;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JButton btn_join;
	JButton btn_id_overlap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MembershipGUI window = new MembershipGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MembershipGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 345, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(14, 48, 62, 18);
		frame.getContentPane().add(lblNewLabel);
		
		tf_id = new JTextField();
		tf_id.setBounds(117, 42, 192, 24);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);
		
		JLabel label = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label.setBounds(14, 114, 62, 18);
		frame.getContentPane().add(label);
		
		pf_pw = new JPasswordField();
		pf_pw.setBounds(117, 108, 192, 24);
		frame.getContentPane().add(pf_pw);
		
		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		label_1.setBounds(14, 150, 89, 18);
		frame.getContentPane().add(label_1);
		
		pf_pwcheck = new JPasswordField();
		pf_pwcheck.setBounds(117, 147, 192, 24);
		frame.getContentPane().add(pf_pwcheck);
		
		JLabel lbl_sex = new JLabel("\uC131   \uBCC4");
		lbl_sex.setBounds(14, 192, 62, 18);
		frame.getContentPane().add(lbl_sex);
		
		JRadioButton rb_woman = new JRadioButton("\uC5EC");
		buttonGroup.add(rb_woman);
		rb_woman.setSelected(true);
		rb_woman.setBounds(118, 188, 62, 27);
		frame.getContentPane().add(rb_woman);
		
		JRadioButton rb_man = new JRadioButton("\uB0A8");
		buttonGroup.add(rb_man);
		rb_man.setBounds(210, 188, 62, 27);
		frame.getContentPane().add(rb_man);
		
		JLabel label_2 = new JLabel("\uC774\uBA54\uC77C");
		label_2.setBounds(14, 225, 89, 18);
		frame.getContentPane().add(label_2);
		
		JLabel lbl_agegroup = new JLabel("\uC5F0\uB839\uB300");
		lbl_agegroup.setBounds(14, 258, 89, 18);
		frame.getContentPane().add(lbl_agegroup);
		
		JCheckBox cb_age10s = new JCheckBox("10\uB300");
		cb_age10s.setBounds(77, 254, 74, 27);
		frame.getContentPane().add(cb_age10s);
		
		JCheckBox cb_age20s = new JCheckBox("20\uB300");
		cb_age20s.setBounds(157, 254, 74, 27);
		frame.getContentPane().add(cb_age20s);
		
		JCheckBox cb_age30s = new JCheckBox("30\uB300");
		cb_age30s.setBounds(235, 254, 74, 27);
		frame.getContentPane().add(cb_age30s);
		
		JCheckBox cb_age40s = new JCheckBox("40\uB300");
		cb_age40s.setBounds(77, 284, 74, 27);
		frame.getContentPane().add(cb_age40s);
		
		JCheckBox cb_age50s = new JCheckBox("50\uB300");
		cb_age50s.setBounds(157, 284, 74, 27);
		frame.getContentPane().add(cb_age50s);
		
		JCheckBox cb_age60s = new JCheckBox("60\uB300~");
		cb_age60s.setBounds(235, 284, 74, 27);
		frame.getContentPane().add(cb_age60s);
		
		JLabel lblNewLabel_2 = new JLabel("\uC911\uBCF5\uCCB4\uD06C(2\uAC1C\uAE4C\uC9C0)");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(204, 319, 105, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		// 중복확인 버튼
		btn_id_overlap = new JButton("\uC911\uBCF5\uD655\uC778");
		btn_id_overlap.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		btn_id_overlap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = tf_id.getText();
				MembershipDAO dao = new MembershipDAO();
				boolean result = dao.idoverlap(id);	
				
				System.out.println(result);
				
				if(result) {                       
					JOptionPane.showMessageDialog(null, "이미 사용중인 ID입니다.", "중복확인", JOptionPane.ERROR_MESSAGE);
					tf_id.setText(""); //중복시 id 지우기
				}else {
					JOptionPane.showMessageDialog(null, "사용가능한 ID입니다.", "중복확인", JOptionPane.PLAIN_MESSAGE);
		          
			System.out.println(1234);
				}
			}
		});
		btn_id_overlap.setBounds(220, 69, 89, 24);
		frame.getContentPane().add(btn_id_overlap);
		
		
		// 회원가입 버튼
		btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MembershipDAO dao = new MembershipDAO();
				
				String id = tf_id.getText(); 
				String pw = pf_pw.getText();
				String pwcheck = pf_pwcheck.getText();
			    String email = tf_email.getText();
			   
			    String sex =null;
			    if(rb_woman.isSelected()) {
			    	 sex = rb_woman.getText();
			    } else 
			    	sex = rb_man.getText();
			    
			    String agegroup = null;
			    if(cb_age10s.isSelected()) {
			    	agegroup = cb_age10s.getText();
			    }else if(cb_age20s.isSelected()) {
			    	agegroup = cb_age20s.getText();
			    }else if(cb_age30s.isSelected()) {
			    	agegroup = cb_age30s.getText();
			    }else if(cb_age40s.isSelected()) {
			    	agegroup = cb_age40s.getText();
			    }else if(cb_age50s.isSelected()) {
			    	agegroup = cb_age50s.getText();
			    }else {
			    	agegroup = cb_age60s.getText();
			    }
			   
			    
			    
			    MembershipDTO dto = new MembershipDTO(id, pw, pwcheck, sex, email, agegroup);
				int cnt = dao.insertMember(dto);
				
			
				if(cnt == 0) {
					// 다이얼로그띄우기
					// 에러메세기 -> 4개 매개변수                                 메세지 , 타이틀 , 메세지 종류(에러타입으로 넣을꺼야)
					JOptionPane.showMessageDialog(null, "회원가입 실패!", "회원가입", JOptionPane.ERROR_MESSAGE);
				
				}else {
					JOptionPane.showMessageDialog(null, "회원가입 성공!", "회원가입", JOptionPane.PLAIN_MESSAGE);
		               frame.dispose();//로그인 성공시 메인창으로 다시돌아가기
		          
			
				}
			}
				
	
		});
		btn_join.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btn_join.setBackground(Color.WHITE);
		btn_join.setForeground(Color.BLACK);
		btn_join.setBounds(204, 363, 105, 27);
		frame.getContentPane().add(btn_join);
		
		tf_email = new JTextField();
		tf_email.setColumns(10);
		tf_email.setBounds(117, 223, 192, 24);
		frame.getContentPane().add(tf_email);
	}
}
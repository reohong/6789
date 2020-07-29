package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Membership.MembershipDAO;
import Membership.MembershipDTO;
import javax.swing.JPanel;

public class LoginGUI {

	private JFrame frame;
	private JTextField tf_login_id;
	private JPasswordField pf_login_pw;
	JButton btn_join;
	
	private Image img; // �̹���
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
					// window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		}

	/**
	 * Create the application.
	 */
	public LoginGUI() {
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
		lblNewLabel.setFont(new Font("���� ���", Font.BOLD, 15));
		lblNewLabel.setBounds(39, 116, 62, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label.setFont(new Font("���� ���", Font.BOLD, 15));
		label.setBounds(39, 179, 62, 18);
		frame.getContentPane().add(label);
		
		tf_login_id = new JTextField();
		tf_login_id.setBounds(119, 113, 157, 24);
		frame.getContentPane().add(tf_login_id);
		tf_login_id.setColumns(10);
		
		pf_login_pw = new JPasswordField();
		pf_login_pw.setBounds(119, 176, 157, 24);
		frame.getContentPane().add(pf_login_pw);
		
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MembershipDAO dao = new MembershipDAO();
				String id = tf_login_id.getText(); // ���̵� �Է� �g �´��� ��
				String pw = pf_login_pw.getText(); // ��й�ȣ �Է� �� �´��� ��
				MembershipDTO dto = dao.loginSelect(id, pw);
				
				System.out.println(dto);
				
				if(dto == null) {
					// ���̾�α׶���
					// �����޼��� -> 4�� �Ű�����                                 �޼��� , Ÿ��Ʋ , �޼��� ����(����Ÿ������ ��������)
					JOptionPane.showMessageDialog(null, "�α��� ����", "�α���", JOptionPane.ERROR_MESSAGE);
					pf_login_pw.setText(""); //�α��� ���н� ��й�ȣ �����
				}else { // �α��� ������
					JOptionPane.showMessageDialog(null, "ȯ���մϴ�^^", "�α���", JOptionPane.PLAIN_MESSAGE);
					frame.dispose();
					
				}
				
			}
		});
		btn_login.setFont(new Font("���� ���", Font.BOLD, 15));
		btn_login.setBackground(Color.WHITE);
		btn_login.setBounds(39, 255, 105, 27);
		frame.getContentPane().add(btn_login);
		
		// ȸ������ ��ư ������ ��â����
		btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // ����â ����
				MembershipGUI join = new MembershipGUI(); 
				
			}
		});
		btn_join.setFont(new Font("���� ���", Font.BOLD, 15));
		btn_join.setBounds(171, 255, 105,27);
		frame.getContentPane().add(btn_join);
		
		JLabel lblNewLabel_1 = new JLabel("\uB85C\uADF8\uC778");
		lblNewLabel_1.setFont(new Font("HY������M", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(144, 44, 62, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel Image_panel = new JPanel();
		Image_panel.setBounds(0, 0, 327, 415);
		frame.getContentPane().add(Image_panel);
	}
}

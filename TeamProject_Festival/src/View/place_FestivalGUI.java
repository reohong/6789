package View;

import java.awt.CardLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class place_FestivalGUI {

	private JFrame frame;
	JTabbedPane tabbedPane;
	JButton button_W;
	JButton button_E;
	JButton button_S;
	JButton button_N;
	JButton button_G;
	JButton btn;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					place_FestivalGUI window = new place_FestivalGUI();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}  
	
	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */

	public place_FestivalGUI() {
		initialize();
		frame.setVisible(true);
		
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 473, 621);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, "name_976476695485800");
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		tabbedPane.addTab("\uC9C0\uC5ED\uAD6C \uC120\uD0DD", null, panel, null);
		panel.setLayout(null);
		
		button_E = new JButton("\uB3D9\uAD6C");
		button_E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place_FestivalGUI2 place = new place_FestivalGUI2("동구");
				/*try {
					Desktop.getDesktop().browse(new URI("https://www.spacecloud.kr/search?q=%EA%B4%91%EC%A3%BC%20%EB%8F%99%EA%B5%AC"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} */  //url불러오는 문장 1.문장 작성후 2.Desktop&URl import 먼저 하고 3.try~catch 문에 넣기
				frame.dispose();
			}
		});
		button_E.setBounds(12, 38, 428, 65);
		panel.add(button_E);
		
		button_W = new JButton("\uC11C\uAD6C");
		button_W.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place_FestivalGUI2 place = new place_FestivalGUI2("서구");
				frame.dispose();
			}
		});
		button_W.setBounds(12, 141, 428, 65);
		panel.add(button_W);
		
		button_S = new JButton("\uB0A8\uAD6C");
		button_S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place_FestivalGUI2 place = new place_FestivalGUI2("남구");
				frame.dispose();
			}
		});
		button_S.setBounds(12, 244, 428, 65);
		panel.add(button_S);
		
		button_N = new JButton("\uBD81\uAD6C");
		button_N.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place_FestivalGUI2 place = new place_FestivalGUI2("북구");
				frame.dispose();
			}
		});
		button_N.setBounds(12, 347, 428, 65);
		panel.add(button_N);
		
		button_G = new JButton("\uAD11\uC0B0\uAD6C");
		button_G.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place_FestivalGUI2 place = new place_FestivalGUI2("광산구");
				frame.dispose();
			}
		});
		button_G.setBounds(12, 450, 428, 65);
		panel.add(button_G);
	}


}

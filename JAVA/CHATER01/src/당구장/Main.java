package 당구장;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txt;
	private JTextField txt2;
	private JTextField time;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnstart = new JButton("\uC2DC\uC791/\uC885\uB8CC");
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//누르면 시간 올라감
				//다시 누르면 멈춤
				//또 다시 누르면 초기화
					Timer m_timer = new Timer();
					TimerTask m_task = new TimerTask() {
					int count = 0;
					public void run() {
						count++;
						time.setText(count+"");
					}
				};
				m_timer.scheduleAtFixedRate(m_task, 1000, 1000);
			}
		});
		
		JButton upper = new JButton("\uC810\uC218 \uC62C\uB9AC\uAE30");
		
		JButton upper2 = new JButton("\uC810\uC218 \uC62C\uB9AC\uAE30");
		
		txt = new JTextField();
		txt.setText("0");
		txt.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setText("0");
		txt2.setColumns(10);
		
		JButton clear = new JButton("\uCD08\uAE30\uD654");
		
		JButton clear2 = new JButton("\uCD08\uAE30\uD654");
		
		time = new JTextField();
		time.setText("0");
		time.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(55, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(upper2)
							.addGap(18)
							.addComponent(txt2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(clear2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(upper)
							.addGap(18)
							.addComponent(txt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(clear)))
					.addGap(51))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(145)
					.addComponent(btnstart)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(time, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(120, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnstart)
						.addComponent(time, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(upper)
						.addComponent(txt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(clear))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(upper2)
						.addComponent(txt2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(clear2))
					.addContainerGap(100, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

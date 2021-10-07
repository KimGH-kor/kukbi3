import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	panFirst pan1st;
	panSecond pan2nd;
	panThird pan3rd;
	panFourth pan4th;
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("main\uD504\uB808\uC784\uC785\uB2C8\uB2E4");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		pan1st = new panFirst(this);
		pan2nd = new panSecond(this);
		pan3rd = new panThird(this);
		pan4th = new panFourth(this);
		SetFirst(null);
	}
	
	//이동시켜주는 메서드들
	public void SetFirst(JPanel panCurr)
	{
		if(panCurr != null) contentPane.remove(panCurr);
		contentPane.add(pan1st, BorderLayout.CENTER);
		//갱신부분
		contentPane.revalidate();
		contentPane.repaint();

	}
	public void SetSecond(JPanel panCurr)
	{
		if(panCurr != null) contentPane.remove(panCurr);
		contentPane.add(pan2nd, BorderLayout.CENTER);
		contentPane.revalidate();
		contentPane.repaint();

	}
	public void SetThird(JPanel panCurr)
	{
		if(panCurr != null) contentPane.remove(panCurr);
		contentPane.add(pan3rd, BorderLayout.CENTER);
		contentPane.revalidate();
		contentPane.repaint();

	}
	public void SetFourth(JPanel panCurr) {
		if(panCurr != null) {
			contentPane.remove(panCurr);
		}
		contentPane.add(pan4th, BorderLayout.CENTER);
		contentPane.revalidate();
		contentPane.repaint();
	}

}

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panThird extends JPanel {

	/**
	 * Create the panel.
	 */
	MainFrame frmMain;
	JPanel thispan = this;
	public panThird(MainFrame frmMain) {
		this.frmMain = frmMain;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC138\uBC88\uC9F8 \uD654\uBA74");
		lblNewLabel.setBounds(82, 31, 93, 15);
		add(lblNewLabel);
		
		JButton btnFirst = new JButton("\uCC98\uC74C\uC73C\uB85C");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMain.SetFirst(thispan);
			}
		});
		btnFirst.setBounds(100, 246, 97, 23);
		add(btnFirst);
		
		JButton btnPrevious = new JButton("\uB2E4\uC74C\uD654\uBA74");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMain.SetFourth(thispan);
			}
		});
		btnPrevious.setBounds(246, 246, 97, 23);
		add(btnPrevious);

	}

}

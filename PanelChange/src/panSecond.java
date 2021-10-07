import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panSecond extends JPanel {

	/**
	 * Create the panel.
	 */
	MainFrame frmMain;
	JPanel thispan = this;
	public panSecond(MainFrame frmMain) {
		this.frmMain = frmMain;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB450\uBC88\uC9F8 \uD654\uBA74");
		lblNewLabel.setBounds(48, 32, 84, 15);
		add(lblNewLabel);
		
		JButton btnFirst = new JButton("\uCC98\uC74C\uC73C\uB85C");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMain.SetFirst(thispan);
			}
		});
		btnFirst.setBounds(83, 239, 97, 23);
		add(btnFirst);
		
		JButton btnNewButton_1 = new JButton("\uB2E4\uC74C\uD654\uBA74");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMain.SetThird(thispan);
			}
		});
		btnNewButton_1.setBounds(232, 239, 97, 23);
		add(btnNewButton_1);

	}

}

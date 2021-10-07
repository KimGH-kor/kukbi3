import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panFourth extends JPanel {

	/**
	 * Create the panel.
	 */
	MainFrame frmMain;
	JPanel thispan = this;
	public panFourth(MainFrame frmMain) {
		this.frmMain = frmMain;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB124\uBC88\uC9F8 \uD654\uBA74");
		lblNewLabel.setBounds(103, 25, 93, 15);
		add(lblNewLabel);
		
		JButton btnFirst = new JButton("\uCC98\uC74C\uC73C\uB85C");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMain.SetFirst(thispan);
			}
		});
		btnFirst.setBounds(99, 240, 97, 23);
		add(btnFirst);
		
		JButton btnPrevious = new JButton("\uC774\uC804\uD654\uBA74");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMain.SetThird(thispan);
			}
		});
		btnPrevious.setBounds(245, 240, 97, 23);
		add(btnPrevious);

	}
}

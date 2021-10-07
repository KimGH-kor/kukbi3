import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panFirst extends JPanel {

	/**
	 * Create the panel.
	 */
	MainFrame frmMain;
	JPanel thispan = this;
	public panFirst(MainFrame frmMain) {
		this.frmMain = frmMain;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCCAB\uBC88\uC9F8\uD654\uBA74");
		lblNewLabel.setBounds(28, 25, 103, 15);
		add(lblNewLabel);
		
		JButton btnNext = new JButton("\uB2E4\uC74C\uD654\uBA74");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMain.SetSecond(thispan);
			}
		});
		btnNext.setBounds(154, 226, 97, 23);
		add(btnNext);

	}
}

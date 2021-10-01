package ch10.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class WindowExample1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Java");
		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(200,80));
		JLabel label = new JLabel("Hello", SwingConstants.CENTER);
		Container contentPane = frame.getContentPane();
		JTextField text = new JTextField();
		JButton button = new JButton("»Æ¿Œ");
		contentPane.add(label, BorderLayout.SOUTH);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(text, BorderLayout.CENTER);
		ActionListener listener = new ConfirmButtonActionListener(text, label);
		button.addActionListener(listener);
		frame.pack();
		frame.setVisible(true);
		
	}
}

class ConfirmButtonActionListener implements ActionListener{
	JTextField text;
	JLabel label;
	ConfirmButtonActionListener(JTextField text, JLabel label){
		this.text = text;
		this.label = label;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = text.getText();
		label.setText("Hello, "+name);
		
	}
	
}
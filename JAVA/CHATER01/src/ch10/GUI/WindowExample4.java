package ch10.GUI;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Zoo Program");
		frame.setLocation(500,400);
		Container contentPane = frame.getContentPane();
		BoxLayout layout = new BoxLayout(contentPane, BoxLayout.X_AXIS);
		contentPane.setLayout(layout);
		contentPane.add(new JButton("¾ó·è¸»"));
		contentPane.add(new JButton("»çÀÚ"));
		contentPane.add(new JButton("ÄÚ³¢¸®"));
		contentPane.add(new JButton("ÄÚ»Ô¼Ò"));
		contentPane.add(new JButton("Æë±Ï"));
		contentPane.add(new JButton("ÇÏÀÌ¿¡³ª"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
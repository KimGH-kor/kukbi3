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
		contentPane.add(new JButton("��踻"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("�ڳ���"));
		contentPane.add(new JButton("�ڻԼ�"));
		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("���̿���"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
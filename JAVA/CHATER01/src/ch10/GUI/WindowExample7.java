package ch10.GUI;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowExample7 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("자동차 프로그램");
		frame.setLocation(500,200);
		frame.setPreferredSize(new Dimension(400,300));
		Container contentPane = frame.getContentPane();
		CarDrawingPanel drawingPanel = new CarDrawingPanel();
		contentPane.add(drawingPanel);
		contentPane.add(drawingPanel);
		frame.pack();
		frame.setVisible(true);
	}
}
class CarDrawingPanel extends JPanel{
	public void paint(Graphics g) {
		g.drawRect(100, 110, 200, 40);
		g.drawRect(150, 70, 100, 40);
		g.drawOval(125, 150, 30, 30);
		g.drawOval(245, 150, 30, 30);
		g.drawLine(50, 180, 350, 180);
	}
}
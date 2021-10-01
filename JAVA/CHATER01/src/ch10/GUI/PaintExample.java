package ch10.GUI;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;   

//마우스 모션 이벤트에서 마우스 드래그 메서드를 구현한다.(드래그 위치를 인식)
class myMouseEvent implements MouseMotionListener, MouseListener
{
	DrawingPanel pan;
	myMouseEvent(DrawingPanel pan)
	{
		this.pan = pan;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getX() + ", " + e.getY());//처음에 잘 인식하는지 확인
		int x = e.getX();
		int y = e.getY();
		pan.list.add(new Point(x, y, false));
		pan.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		pan.list.add(new Point(x, y, true));
		pan.repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
class Point
{
	int x, y;//좌표
	boolean skip;
	Point(int x, int y, boolean skip)
	{
		this.x = x; this.y = y;this.skip = skip;
	}
}
class DrawingPanel extends JPanel {//드로잉 패널안에 패널을 넣어서 인식시킨다.
	ArrayList<Point> list;//무한대로 들어가는 리스트를 활용하여 위치값을 계속 저장시킨다.
	DrawingPanel()
	{
		list = new ArrayList<Point>();
	}
	
    public void paint(Graphics g)  {
       for (int i=0; i<list.size()-1; i++)
       {
    	   Point start = list.get(i); //
    	   if(start.skip) 
    	   {
    		   continue;
    	   }
    	   Point end = list.get(i+1); //
    	   g.drawLine(start.x, start.y, end.x, end.y);//위치를 직선으로 연결 시켜준다.
       }
    }
}

public class PaintExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("그림판 프로그램");
        frame.setLocation(500, 200);
        frame.setPreferredSize(new Dimension(400, 300));
        Container contentPane = frame.getContentPane();
        DrawingPanel drawingPanel = new DrawingPanel();
        contentPane.add(drawingPanel);
        
        myMouseEvent e = new myMouseEvent(drawingPanel);
        drawingPanel.addMouseMotionListener(e);
        drawingPanel.addMouseListener(e);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

	}

}

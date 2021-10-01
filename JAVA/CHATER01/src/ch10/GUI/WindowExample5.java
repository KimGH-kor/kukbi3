package ch10.GUI;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class WindowExample5 {
	public static void main(String[] args) {
	      JFrame frame = new JFrame("Add Cal");
	      frame.setPreferredSize(new Dimension(300,100));
	      frame.setLocation(500,500);
	      
	      Container ct = frame.getContentPane();
	      Panel p1 = new Panel(new GridLayout(1,5));
	      Panel p2 = new Panel(new GridLayout(1,2));
	      JTextField txt1 = new JTextField();
	      JTextField txt2 = new JTextField();
	      JTextField txt3 = new JTextField();
	      JLabel l1 = new JLabel("+", SwingConstants.CENTER);
	      JLabel l2 = new JLabel("=", SwingConstants.CENTER);
	      txt1.setSize(50, 40);
	      p1.add(txt1);
	      p1.add(l1).setPreferredSize(new Dimension(10,40));;
	      p1.add(txt2);
	      p1.add(l2);
	      p1.add(txt3);
	      
	      //setEditable(true/false); true일 경우 (쓰기/읽기) 가능 / false일 경우 읽기만 가능
	      txt3.setEditable(false);
	      
	      JButton submit = new JButton("확인");
	      JButton remove = new JButton("취소");
	      p2.add(submit);
	      p2.add(remove);
	      
	      
	      Panel p3 = new Panel(new GridLayout(2,1));
	      p3.add(p1);
	      p3.add(p2);
	      ct.add(p3);
	      
	      
	      ActionListener ac1 = new addEventListener(txt1, txt2, txt3);
	      submit.addActionListener(ac1);
	      ActionListener ac2 = new removeEventListener(txt1, txt2, txt3);
	      remove.addActionListener(ac2);
	      
	      
	      frame.pack();
	      frame.setVisible(true);

	   }

	}

	//계산 해주는 클래스
	class addEventListener implements ActionListener{
	   JTextField txt1;
	   JTextField txt2;
	   JTextField txt3;

	   public addEventListener(JTextField txt1, JTextField txt2, JTextField txt3) {
	      this.txt1 = txt1;
	      this.txt2 = txt2;
	      this.txt3 = txt3;
	   }
	   
	   @Override
	   public void actionPerformed(ActionEvent e) {
	      int a = Integer.parseInt(txt1.getText());
	      int b = Integer.parseInt(txt2.getText());
	      int sum = a+b;
	      txt3.setText(String.valueOf(sum));
	   }   
	}

	//초기화 클래스
	class removeEventListener implements ActionListener{
	   JTextField txt1;
	   JTextField txt2;
	   JTextField txt3;

	   public removeEventListener(JTextField txt1, JTextField txt2, JTextField txt3) {
	      this.txt1 = txt1;
	      this.txt2 = txt2;
	      this.txt3 = txt3;
	   }
	   
	   @Override
	   public void actionPerformed(ActionEvent e) {
	      txt1.setText("");
	      txt2.setText("");
	      txt3.setText("");
	   }   
	}


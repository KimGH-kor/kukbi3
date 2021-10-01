package ch10.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class WindowExample8 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("참가자 명단 프로그램");
		frame.setPreferredSize(new Dimension(300,150));
		frame.setLocation(500,400);
		Container contentPane = frame.getContentPane();
		String colNames[] = {"이름", "나이", "성별"};
		Object data[][] = { {"김철수", 24, '남'},
							{"이순희", 21, '여'},
		                    {"박지영", 26, '여'} };
		JTable table = new JTable(data, colNames);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		JButton button = new JButton("출력");
		button.addActionListener(new PrintActionListener(table));
		contentPane.add(button, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		
	}
}
class PrintActionListener implements ActionListener{
	JTable table;
	PrintActionListener(JTable table){
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TableModel model = table.getModel();
		int rowNum = model.getRowCount();
		int colNum = model.getColumnCount();
		for(int col = 0; col < colNum; col++) {
			String colName = model.getColumnName(col);
			System.out.println(colName +"\t");
		}
		System.out.println();
		for(int row = 0; row < rowNum; row++) {
			for(int col = 0; col < colNum; col++) {
				Object obj = model.getValueAt(row, col);
				System.out.println(obj+"\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
	}
	
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class POSPanel extends JPanel {
	JButton[] MBtn = new JButton[16];
	String[] menu = {
			"아메리카노","ICE아메리카노","카페라떼","ICE카페라떼",
			"카페모카","카푸치노","바닐라라떼","ICE바닐라라떼",
			"녹차라떼","아이스티","자몽에이드","청포도에이드",
			"딸기스무디","블루배리스무디","레몬티","유자차"};
	int[] price = {
			1500,1800,2500,2500,
			3000,3000,3500,3500,
			3500,2500,3500,3500,
			4000,4000,3000,3000};
	JTextField tf = new JTextField(30);
	JButton[] SBtn = new JButton[4];
	String[] Str = {"쿠폰","선택취소","전체취소","결제"};
	String [] ColName = {"메뉴","수량","가격"};
	String [][] Data ;
	int count =1;
	DefaultTableModel model = new DefaultTableModel(Data,ColName);
	JTable table = new JTable(model);
	
	class Screen extends JPanel{
		Screen(){
			setBackground(Color.BLUE);
			DefaultTableModel m = (DefaultTableModel)table.getModel();
			table.setRowHeight(50);
			table.getTableHeader().setFont(new Font("궁서", Font.BOLD, 15));
			add(new JScrollPane(table));
		}
	}
	
	class MenuBtn extends JPanel{
		MenuBtn(){
			setLayout(new GridLayout(6,3,3,3));
			setBackground(Color.GREEN);
			for(int i=0;i<MBtn.length;i++) {
				MBtn[i]= new JButton(menu[i]);
				add(MBtn[i]);
			}
		}
	}
	
	class StrBtn extends JPanel{
		StrBtn(){
			setBackground(Color.BLACK);
			setLayout(new GridLayout(1,4,3,3));
			
			for(int i=0;i<Str.length;i++) {
				SBtn[i]= new JButton(Str[i]);
				add(SBtn[i]);
			}
		}
	}
	
	public POSPanel() {
		setLayout(null);
		setBackground(Color.YELLOW);
		MenuBtn mbtn = new MenuBtn();
		StrBtn sbtn = new StrBtn();
		Screen sc = new Screen();
		
		//湲덉븸��
		tf.setSize(450, 70);
		tf.setLocation(50, 480);
		add(tf);
		
		sc.setSize(500, 500);
		sc.setLocation(25, 20);
		add(sc);
		
		mbtn.setSize(400, 430);
		mbtn.setLocation(530, 23);
		add(mbtn);
		
		sbtn.setSize(400, 70);
		sbtn.setLocation(530, 480);
		add(sbtn);
		
		//硫붾돱異붽�
		for(int i=0;i<MBtn.length;i++) {
			final int index =i;
			MBtn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton MBtn = (JButton)e.getSource();
					DefaultTableModel m = (DefaultTableModel)table.getModel();
					m.addRow(new Object[]{menu[index],count,price[index]});
				}
			});
		}
		//荑좏룿
		SBtn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				table.setValueAt(0, table.getSelectedRow(), 2);
			}
		});
		
			//�꽑�깮痍⑥냼
		SBtn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				
				m.removeRow(table.getSelectedRow());
			}
		});
		
		
		//�쟾泥댁랬�냼
		SBtn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				
				m.setRowCount(0);
				tf.setText(String.valueOf(""));
			}
		});
		
		//寃곗젣踰꾪듉
		SBtn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				int rowCont = table.getRowCount();
				int sum =0;
				for(int i=0;i<rowCont;i++) {
					sum += (int)table.getValueAt(i, 2);
				}
				tf.setText(String.valueOf(" 총금액 : "+sum));
				tf.setFont(new Font("궁서", Font.BOLD, 40));
			}
		});
	}
}


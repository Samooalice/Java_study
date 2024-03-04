package day14;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/*	버튼을 가진 창을 만들기
 * 	한개의 버튼을 클릭하면 창이 닫히고
 * 	다른 한개를 클릭하면 배경색이 랜덤하게 변경되는
 * 	프로그램을 제작하시오.
 * 
 * 	프로그램의 목적 :
 * 			자바에서 이벤트 처리는
 * 				1. 운영체제에서 이벤트 인지 
 * 				2. 인지된 정보를 JVM에게 전달
 * 				3. JVM은 전달받은 정보로 해당 이벤트 처리
 * 					처리과정에서 자동 호출되는 함수
 */
public class MyFrame {
	public JFrame frame;
	public JPanel panel, panel_1, panel_2;
	public JButton button_1, button_2;
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 450));
		panel.setBackground(Color.white);
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(300, 50));
		panel_1.setLayout(new GridLayout(1, 2));
		
		button_1 = new JButton("Change!");
		button_1.addActionListener(new ChangeColor(this));
		
		button_2 = new JButton("Close");
		button_2.addActionListener(new CloseEvt(this));
		
		panel_1.add(button_1);
		panel_1.add(button_2);
		
		frame.add(panel, "Center");
		frame.add(panel_1, "South");
		
		frame.setSize(300, 500);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}

class CloseEvt implements ActionListener{
	/*
	 * 위의 클래스가 객체가 되서
	 * 창이 띄워졌을 때
	 * 버튼클릭이 되면 실행되는 기능
	 * 띄워진 창을 다는 역할
	 * 위 클래스가 객체가 된 주소를 이 클래스가 객체가 될 때 기억하고 있어야 함
	 */
	
	public MyFrame f;
	public CloseEvt() {
		// TODO Auto-generated constructor stub
	}
	public CloseEvt(MyFrame f) {
		this.f = f;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 해당 함수는 위의 클래스의 버튼 중 close버튼이 클릭이 되면
		// 실행되는 부분
		
//		System.out.println("닫기버튼 클릭");
		System.exit(0);
	}
	
}

class ChangeColor implements ActionListener{
	public MyFrame f;
	public ChangeColor() {}
	
	public ChangeColor(MyFrame f) {
		this.f = f;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		
		
		Color c = new Color(r, g, b);
		
		f.panel.setBackground(c);
	}
}

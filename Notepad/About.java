package Notepad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
	
	JButton b1;
	About(){
		setBounds(500,150,600,500);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Adarsh_Notepad/icons/Windows.png"));
		Image i2 = i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(100, 40, 400, 80);
		add(l1);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Adarsh_Notepad/icons/Notebook.png"));
		Image i5 = i4.getImage().getScaledInstance(70, 80, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel l2 = new JLabel(i6);
		l2.setBounds(40, 150, 70, 70);
		add(l2);
		
		JLabel l3 = new JLabel("<html><br>Notepad is word prosessing program<br><br>which allows change of text in computer files<br><br>Notepad is simple text editor for basic text editing program<br><br>which enables user to create documents</html>");
		l3.setBounds(150, 130, 500, 180);
		l3.setFont(new Font("SAN SERIF", Font.PLAIN,16));
		add(l3);
		
		b1 = new JButton("OK");
		b1.setBounds(250,400, 80, 25);
		add(b1);
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		this.setVisible(false);
		
	}
	
	public static void main (String args[]) {
		
		new About().setVisible(true);
	}
}
package quiz.application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Login extends JFrame implements ActionListener  {
	
	JButton rulebt,back;
	JTextField nf;
	
	Login(){
		
		getContentPane().setBackground(Color.WHITE);//changing panel color
		setLayout(null);
		
		//adding image to the pages using JLabel
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/quiznew.png"));
		JLabel image=new JLabel(i1);
		image.setBounds(0, 0, 600, 500);// x,y,length,breadth
		add(image);
		
		//adding heading
		JLabel heading=new JLabel("JAVA QUIZ");
		heading.setBounds(700, 60, 300, 45);
		heading.setFont(new Font("Arial",Font.BOLD,40));
		heading.setForeground(Color.ORANGE);//or can we put rgb color i.e new COLOR()
		add(heading);
		
		// adding name
		JLabel name=new JLabel("Enter Your Name");
		name.setBounds(700, 150, 200, 45);
		name.setFont(new Font("Arial",Font.BOLD,20));
		name.setForeground(Color.black);
		add(name);
		
		//adding textfield
	    nf=new JTextField();
		nf.setBounds(700, 200, 300, 45);
		nf.setFont(new Font("Arial",Font.BOLD,20));
		add(nf);
		
		//adding rule buttons
	    rulebt=new JButton("Rules");
		rulebt.setBounds(700, 250, 100, 40);
		rulebt.setBackground(Color.blue);
		rulebt.setForeground(Color.white);
		rulebt.addActionListener(this);
		add(rulebt);
		
		//adding back button
	    back=new JButton("Back");
		back.setBounds(900, 250, 100, 40);
		back.setBackground(Color.blue);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		setSize(1200,600);//length,breadth 
		setLocation(200,120);//left-margin,top-margin
		setVisible(true);
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==rulebt) {
			String name=nf.getText();
			setVisible(false);
			new Rule(name);
			
		}else if(e.getSource()==back) {
			setVisible(false);
		}
		
	}
	
	public static void main (String[] args) {
		new Login();
	}
	
	

}

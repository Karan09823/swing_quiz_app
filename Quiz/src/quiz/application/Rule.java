package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;


import javax.swing.*;

public class Rule extends JFrame implements ActionListener {
	JButton back,start;
	
	String name;
	Rule(String name){
		this.name=name;
		
		JLabel heading=new JLabel("Welcom "+name+" to Java Quiz");
		heading.setBounds(50, 20, 700, 30);
		heading.setFont(new Font("Arial",Font.BOLD,28));
		heading.setForeground(Color.blue);//or can we put rgb color i.e new COLOR()
		add(heading);
		
		JLabel rules=new JLabel();
		rules.setBounds(20, 90, 700, 350);
		rules.setFont(new Font("Arial",Font.PLAIN,16));
		rules.setText(
				"<html>"+ 
		
		                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
		                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
		                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
		                "4. Crying is allowed but please do so quietly." + "<br><br>" +
		                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
		                "6. Do not get nervous if your friend is answering more questions"+"<br><br>"+
		                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
		         
		            "<html>"
				
				
				
				
				);
		add(rules);
		
		
		//adding rule buttons
	    back=new JButton("Back");
		back.setBounds(50, 500, 100, 40);
		back.setBackground(Color.blue);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		//adding back button
	    start=new JButton("Start");
		start.setBounds(400, 500, 100, 40);
		start.setBackground(Color.blue);
		start.setForeground(Color.white);
		start.addActionListener(this);
		add(start);
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setSize(800,650);
		setLocation(350,100);
		setVisible(true);
		
	
			
		}
		

	
	public static void main(String []args) {
		new Rule("User ");
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back) {
			setVisible(false);
			new Login();
		}else if(e.getSource()==start) {
			setVisible(false);
			new Quiz(name);
		}
		
	}

}

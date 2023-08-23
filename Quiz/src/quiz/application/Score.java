package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Score extends JFrame implements ActionListener{
	Score(String name,int score){
		setLayout(null);
		
		getContentPane().setBackground(Color.white);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/scorenew.jpg"));
	    Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
	    ImageIcon i3=new ImageIcon(i2);
		JLabel i=new JLabel(i3);
		i.setBounds(0, 100, 300, 250);
		add(i);
		
		
		JLabel heading=new JLabel("Thank You "+name+" for attempting Java Quiz");
		heading.setBounds(200, 0, 700, 30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,26));
		heading.setBackground(Color.magenta);
		add(heading);
		
		JLabel lblscore=new JLabel("Your Score is :"+score);
		lblscore.setBounds(500,100,400,40);
		lblscore.setFont(new Font("Tahoma",Font.BOLD,26));
		add(lblscore);
		
		JButton playagain=new JButton("Play Again");
		playagain.setBounds(500,400,200,40);
		playagain.setBackground(Color.cyan);
		playagain.addActionListener(this);
		add(playagain);
		
		setBounds(400,150,1000,550);
		setVisible(true);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new Login();
		
	}
	
	public static void main(String []args) {
		new Score("User",0);
		
	}

}

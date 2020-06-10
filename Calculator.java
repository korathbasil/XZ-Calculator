import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Calculator implements ActionListener {
	
	JFrame jf;
	JLabel DisplayLabel;
	
	JButton bt7;
	JButton bt8;
	JButton bt9;
	JButton bt4;
	JButton bt5;
	JButton bt6;
	JButton bt1;
	JButton bt2;
	JButton bt3;
	JButton btClr;
	JButton bt0;
	JButton btDot;
	JButton btMul;
	JButton btDiv;
	JButton btAdd;
	JButton btSub;
	JButton btAnseq;
	
	String value;
	float value1,value2;
	int check=0;
	float answer;
	int anscheck=0;
	int ansstd;
	
	public Calculator() {
		
		jf=new JFrame("XZ Calculator");
		jf.setLayout(null);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setSize(315, 368);
		jf.getContentPane().setBackground(Color.darkGray);
		jf.setLocation(500,150);
		jf.setVisible(true);
		
		JLabel title=new JLabel("XZ-001");
		
		Font f=new Font("Arial",Font.BOLD, 24);
		Font f2=new Font("DialogInput",Font.BOLD, 32);
		Font f3=new Font("Arial",Font.BOLD, 16);
		
		title.setBounds(238, 5, 100, 20);
		title.setForeground(Color.RED);
		title.setFont(f3);
		jf.add(title);
		
		DisplayLabel=new JLabel();
		DisplayLabel.setBounds(10, 30, 280, 50);
		jf.add(DisplayLabel);
		DisplayLabel.setBackground(Color.WHITE);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setFont(f2);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setForeground(Color.BLACK);
		
		bt7=new JButton("7");
		bt7.setBounds(10, 95, 52, 52);
		bt7.setFont(f);
		jf.add(bt7);
		bt7.addActionListener(this);
		
		bt8=new JButton("8");
		bt8.setBounds(67, 95, 52, 52);
		bt8.setFont(f);
		jf.add(bt8);
		bt8.addActionListener(this);
		
		bt9=new JButton("9");
		bt9.setBounds(124, 95, 52, 52);
		bt9.setFont(f);
		jf.add(bt9);
		bt9.addActionListener(this);
		
		bt4=new JButton("4");
		bt4.setBounds(10, 152, 52, 52);
		bt4.setFont(f);
		jf.add(bt4);
		bt4.addActionListener(this);
		
		bt5=new JButton("5");
		bt5.setBounds(67, 152, 52, 52);
		bt5.setFont(f);
		jf.add(bt5);
		bt5.addActionListener(this);
		
		bt6=new JButton("6");
		bt6.setBounds(124, 152, 52, 52);
		bt6.setFont(f);
		jf.add(bt6);
		bt6.addActionListener(this);
		
		
		bt1=new JButton("1");
		bt1.setBounds(10, 209, 52, 52);
		bt1.setFont(f);
		jf.add(bt1);
		bt1.addActionListener(this);
		
		bt2=new JButton("2");
		bt2.setBounds(67, 209, 52, 52);
		bt2.setFont(f);
		jf.add(bt2);
		bt2.addActionListener(this);
		
		bt3=new JButton("3");
		bt3.setBounds(124, 209, 52, 52);
		bt3.setFont(f);
		jf.add(bt3);
		bt3.addActionListener(this);
		
		btClr=new JButton("C");
		btClr.setBounds(10, 266, 52, 52);
		btClr.setFont(f);
		btClr.setBackground(Color.RED);
		btClr.setForeground(Color.WHITE);
		jf.add(btClr);
		btClr.addActionListener(this);
		
		bt0=new JButton("0");
		bt0.setBounds(67, 266, 52, 52);
		bt0.setFont(f);
		jf.add(bt0);
		bt0.addActionListener(this);
		
		btDot=new JButton(".");
		btDot.setBounds(124, 266, 52, 52);
		btDot.setFont(f);
		jf.add(btDot);
		btDot.addActionListener(this);
		
		btMul=new JButton("*");
		btMul.setBounds(181, 95, 52, 80);
		btMul.setFont(f);
		jf.add(btMul);
		btMul.addActionListener(this);
		
		btDiv=new JButton("/");
		btDiv.setBounds(238, 95, 52, 80);
		btDiv.setFont(f);
		jf.add(btDiv);
		btDiv.addActionListener(this);
		
		btAdd=new JButton("+");
		btAdd.setBounds(181, 182, 52, 80);
		btAdd.setFont(f);
		jf.add(btAdd);
		btAdd.addActionListener(this);
		
		btSub=new JButton("-");
		btSub.setBounds(238, 182, 52, 80);
		btSub.setFont(f);
		jf.add(btSub);
		btSub.addActionListener(this);
		
		btAnseq=new JButton("=");
		btAnseq.setBounds(181, 267, 109, 52);
		btAnseq.setFont(f);
		jf.add(btAnseq);
		btAnseq.addActionListener(this);
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt7) {
			if(anscheck==1) {
				DisplayLabel.setText("");
				anscheck=0;
			}	
			DisplayLabel.setText(DisplayLabel.getText()+"7");
		}	
		else if(e.getSource()==bt8) {
			if(anscheck==1) {
				DisplayLabel.setText("");
				anscheck=0;
			}	
			DisplayLabel.setText(DisplayLabel.getText()+"8");
		}	
		else if(e.getSource()==bt9) {
			if(anscheck==1) {
				DisplayLabel.setText("");
				anscheck=0;
			}	
			DisplayLabel.setText(DisplayLabel.getText()+"9");
		}	
		else if(e.getSource()==bt4) {
			if(anscheck==1) {
				DisplayLabel.setText("");
				anscheck=0;
			}	
			DisplayLabel.setText(DisplayLabel.getText()+"4");
		}	
		else if(e.getSource()==bt5) {
			if(anscheck==1) {
				DisplayLabel.setText("");
				anscheck=0;
			}	
			DisplayLabel.setText(DisplayLabel.getText()+"5");
		}	
		else if(e.getSource()==bt6) {
			if(anscheck==1) {
				DisplayLabel.setText("");
				anscheck=0;
			}	
			DisplayLabel.setText(DisplayLabel.getText()+"6");
		}	
		else if(e.getSource()==bt1) {
			if(anscheck==1) {
				DisplayLabel.setText("");
				anscheck=0;
			}	
			DisplayLabel.setText(DisplayLabel.getText()+"1");
		}	
		else if(e.getSource()==bt2) {
			if(anscheck==1) {
				DisplayLabel.setText("");
				anscheck=0;
			}	
			DisplayLabel.setText(DisplayLabel.getText()+"2");
		}	
		else if(e.getSource()==bt3) {
			if(anscheck==1) {
				DisplayLabel.setText("");
				anscheck=0;
			}	
			DisplayLabel.setText(DisplayLabel.getText()+"3");
		}	
		else if(e.getSource()==btClr)
			DisplayLabel.setText("");
		else if(e.getSource()==bt0) {
			if(anscheck==1) {
				DisplayLabel.setText("");
				anscheck=0;
			}	
			DisplayLabel.setText(DisplayLabel.getText()+"0");
		}	
		else if(e.getSource()==btDot) {
			if(anscheck==1) {
				DisplayLabel.setText("");
				anscheck=0;
			}	
			DisplayLabel.setText(DisplayLabel.getText()+".");
		}
		else if(e.getSource()==btMul) {
			if(check==1||check==2||check==3||check==4) {
				btAnseq.doClick();
			}else {
				value=DisplayLabel.getText();
				DisplayLabel.setText("");
			}
			check=1;
		}
		else if(e.getSource()==btDiv) {
			if(check==1||check==2||check==3||check==4) {
				btAnseq.doClick();
			}else {
				value=DisplayLabel.getText();
				DisplayLabel.setText("");
			}
			check=2;
		}
		else if(e.getSource()==btAdd) {
			if(check==1||check==2||check==3||check==4) {
				btAnseq.doClick();
			}else {
				value=DisplayLabel.getText();
				DisplayLabel.setText("");
			}
			check=3;
		}
		else if(e.getSource()==btSub) {
			if(check==1||check==2||check==3||check==4) {
				btAnseq.doClick();
			}else {
				value=DisplayLabel.getText();
				DisplayLabel.setText("");
			}
			check=4;
		}
		else if(e.getSource()==btAnseq) {
			if(check==1) {
				value1=Float.parseFloat(value);
				value=DisplayLabel.getText();
				value2=Float.parseFloat(value);
				answer=value1*value2;
				value=answer+"";
				if(value.charAt(value.length()-1)=='0') {
					ansstd=(int)answer;
					DisplayLabel.setText(ansstd+"");
				}else
				DisplayLabel.setText(answer+"");
				check=0;
				anscheck=1;
			}else if(check==2) {
				value1=Float.parseFloat(value);
				value=DisplayLabel.getText();
				value2=Float.parseFloat(value);
				answer=value1/value2;
				value=answer+"";
				if(value.charAt(value.length()-1)=='0') {
					ansstd=(int)answer;
					DisplayLabel.setText(ansstd+"");
				}else
				DisplayLabel.setText(answer+"");
				check=0;
				anscheck=1;
			}else if(check==3) {
				value1=Float.parseFloat(value);
				value=DisplayLabel.getText();
				value2=Float.parseFloat(value);
				answer=value1+value2;
				value=answer+"";
				if(value.charAt(value.length()-1)=='0') {
					ansstd=(int)answer;
					DisplayLabel.setText(ansstd+"");
				}else
				DisplayLabel.setText(answer+"");
				check=0;
				anscheck=1;
			}else if(check==4) {
				value1=Float.parseFloat(value);
				value=DisplayLabel.getText();
				value2=Float.parseFloat(value);
				answer=value1-value2;
				value=answer+"";
				if(value.charAt(value.length()-1)=='0') {
					ansstd=(int)answer;
					DisplayLabel.setText(ansstd+"");
				}else
				DisplayLabel.setText(value);
				check=0;
				anscheck=1;
			}
			
		}		
		
	}
}

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Calculator implements ActionListener {
	boolean isOperatorClicked=false;
	JFrame jf;
	JLabel displayLabel,Standerd;
	JButton sevenButton;
	String oldValue;
	JButton eightButton;
	JButton nineButton;
	JButton sixButton,clearButton,deleteButton;
	JButton fiveButton,mulButton,minusButton,plusButton;
	JButton fourButton,threeButton,twoButton,oneButton,zeroButton,dotButton,equalButton,divButton;
	
	static double a=0,b=0,result=0;
	static int operator=0;
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(358, 540);
//		jf.setBackground(Color.black);
//		jf.getContentPane().setBackground(Color.white);
		Color cool = new Color(235, 35, 123);
		jf.setBackground(cool);
		jf.setLocation(300,150);
		
		Standerd=new JLabel("Standard");
		Standerd.setBounds(-10, 6, 90, 20);
		Color cool1 = new Color(243, 243, 240);
		Standerd.setBackground(cool1);
		Standerd.setFont(new Font("tahoma",Font.PLAIN, 18));
		Standerd.setOpaque(true);
		Standerd.setHorizontalAlignment(SwingConstants.RIGHT);
		Standerd.setForeground(Color.black);
		jf.add(Standerd);
		
		displayLabel=new JLabel("");
		displayLabel.setBounds(10, 30, 328, 90);
		Standerd.setBackground(cool1);
		displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.black);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(4, 130, 80, 50);
		sevenButton.addActionListener(this);
		sevenButton.setFocusPainted(false);
		sevenButton.setFont(new Font("Arial",Font.PLAIN, 20));
		sevenButton.setBackground(Color.white);
		sevenButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		sevenButton.setForeground(Color.black);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(89, 130, 80, 50);
		eightButton.addActionListener(this);
		eightButton.setFocusPainted(false);
		eightButton.setFont(new Font("Arial",Font.PLAIN, 20));
		eightButton.setBackground(Color.white);
		eightButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		eightButton.setForeground(Color.black);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(175, 130, 80, 50);
		nineButton.addActionListener(this);
		nineButton.setFocusPainted(false);
		nineButton.setBackground(Color.white);
		nineButton.setFont(new Font("Arial",Font.PLAIN, 20));
		nineButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		nineButton.setForeground(Color.black);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(4, 185, 80, 50);
		fourButton.addActionListener(this);
		fourButton.setFocusPainted(false);
		fourButton.setFont(new Font("Arial",Font.PLAIN, 20));
		fourButton.setBackground(Color.white);
		fourButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		fourButton.setForeground(Color.black);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(89, 185, 80, 50);
		fiveButton.addActionListener(this);
		fiveButton.setFocusPainted(false);
		fiveButton.setFont(new Font("Arial",Font.PLAIN, 20));
		fiveButton.setBackground(Color.white);
		fiveButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		fiveButton.setForeground(Color.black);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(175, 185, 80, 50);
		sixButton.addActionListener(this);
		sixButton.setFocusPainted(false);
		sixButton.setFont(new Font("Arial",Font.PLAIN, 20));
		sixButton.setBackground(Color.white);
		sixButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		sixButton.setForeground(Color.black);
		jf.add(sixButton);

		oneButton=new JButton("1");
		oneButton.setBounds(4, 240,80, 50);
		oneButton.addActionListener(this);
		oneButton.setFocusPainted(false);
		oneButton.setFont(new Font("Arial",Font.PLAIN, 20));
		oneButton.setBackground(Color.white);
		oneButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		oneButton.setForeground(Color.black);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(89, 240, 80, 50);
		twoButton.addActionListener(this);
		twoButton.setFocusPainted(false);
		twoButton.setFont(new Font("Arial",Font.PLAIN, 20));
		twoButton.setBackground(Color.white);
		twoButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		twoButton.setForeground(Color.black);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(175, 240,80, 50);
		threeButton.addActionListener(this);
		threeButton.setFocusPainted(false);
		threeButton.setFont(new Font("Arial",Font.PLAIN, 20));
		threeButton.setBackground(Color.white);
		threeButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		threeButton.setForeground(Color.black);
		jf.add(threeButton);
		
		
		dotButton=new JButton(".");
		dotButton.setBounds(4, 295,80, 50);
		dotButton.addActionListener(this);
		dotButton.setFocusPainted(false);
		dotButton.setFont(new Font("Arial",Font.PLAIN, 20));
		dotButton.setBackground(Color.white);
		dotButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		dotButton.setForeground(Color.black);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(89, 295, 80, 50);
		zeroButton.addActionListener(this);
		zeroButton.setFocusPainted(false);
		zeroButton.setFont(new Font("Arial",Font.PLAIN, 20));
		zeroButton.setBackground(Color.white);
		zeroButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		zeroButton.setForeground(Color.black);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(175, 295,80, 50);
		equalButton.addActionListener(this);
		equalButton.setFocusPainted(false);
		equalButton.setFont(new Font("Arial",Font.PLAIN, 20));
		equalButton.setBackground(Color.white);
		equalButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		equalButton.setForeground(Color.black);
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(260, 130,80, 50);
		divButton.addActionListener(this);
		divButton.setFocusPainted(false);
		divButton.setFont(new Font("Arial",Font.PLAIN, 20));
		divButton.setBackground(Color.white);
		divButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		divButton.setForeground(Color.black);
		jf.add(divButton);
		
		mulButton=new JButton("x");
		mulButton.setBounds(260, 185, 80, 50);
		mulButton.addActionListener(this);
		mulButton.setFocusPainted(false);
		mulButton.setFont(new Font("Arial",Font.PLAIN, 20));
		mulButton.setBackground(Color.white);
		mulButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		mulButton.setForeground(Color.black);
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(260, 240, 80, 50);
		minusButton.addActionListener(this);
		minusButton.setFocusPainted(false);
		minusButton.setFont(new Font("Arial",Font.PLAIN, 20));
		minusButton.setBackground(Color.white);
		minusButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		minusButton.setForeground(Color.black);
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(260, 295, 80, 50);
		plusButton.addActionListener(this);
		plusButton.setFocusPainted(false);
		plusButton.setFont(new Font("Arial",Font.PLAIN, 20));
		plusButton.setBackground(Color.white);
		plusButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		plusButton.setForeground(Color.black);
		jf.add(plusButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(260, 350, 80, 50);
		clearButton.addActionListener(this);
		clearButton.setFocusPainted(false);
		clearButton.setFont(new Font("Arial",Font.PLAIN, 20));
		Color cool2 = new Color(0, 85, 176);
		clearButton.setBackground(cool2);
		clearButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		clearButton.setForeground(Color.white);
		jf.add(clearButton);
		
		deleteButton=new JButton("D");
		deleteButton.setBounds(175, 350,80, 50);
		deleteButton.addActionListener(this);
		deleteButton.setFocusPainted(false);
		deleteButton.setFont(new Font("Arial",Font.PLAIN, 20));
		deleteButton.setBackground(Color.white);
		deleteButton.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240),0));
		deleteButton.setForeground(Color.black);
		jf.add(deleteButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
	new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== sevenButton) {
			displayLabel.setText(displayLabel.getText().concat("7"));
			
		}else if(e.getSource()==eightButton) {
			displayLabel.setText(displayLabel.getText().concat("8"));
		}else if(e.getSource()==nineButton) {
			displayLabel.setText(displayLabel.getText().concat("9"));
		}else if(e.getSource()==fourButton) {
			displayLabel.setText(displayLabel.getText().concat("4"));
		}else if(e.getSource()==fiveButton) {
			displayLabel.setText(displayLabel.getText().concat("5"));
		}else if(e.getSource()==sixButton) {
			displayLabel.setText(displayLabel.getText().concat("6"));
		}else if(e.getSource()==oneButton) {
			displayLabel.setText(displayLabel.getText().concat("1"));
		}else if(e.getSource()==twoButton) {
			displayLabel.setText(displayLabel.getText().concat("2"));
		}else if(e.getSource()==threeButton) {
			displayLabel.setText(displayLabel.getText().concat("3"));
		}else if(e.getSource()==zeroButton) {
			displayLabel.setText(displayLabel.getText().concat("0"));
		}else if(e.getSource()==dotButton) {
			displayLabel.setText(displayLabel.getText().concat("."));
		}else if(e.getSource()==plusButton) {

			a=Double.parseDouble(displayLabel.getText());
			operator=1;
			displayLabel.setText("");
		}else if(e.getSource()==minusButton) {
			a=Double.parseDouble(displayLabel.getText());
			operator=2;
			displayLabel.setText("");
		}else if(e.getSource()==mulButton) {
			a=Double.parseDouble(displayLabel.getText());
			operator=3;
			displayLabel.setText("");
		}else if(e.getSource()==divButton) {
			a=Double.parseDouble(displayLabel.getText());
			operator=4;
			displayLabel.setText("");
		}else if(e.getSource()==equalButton) {
			
			b=Double.parseDouble(displayLabel.getText());
			switch(operator)
			{
			case 1: result=a+b;
			break;
			case 2: result=a-b;
			break;
			case 3: result=a*b;
			break;
			case 4: result=a/b;
			break;
			default: result=0;
			}
			displayLabel.setText(""+result);
			}else if(e.getSource()==clearButton) {
			displayLabel.setText("");
		}else if(e.getSource()==deleteButton) {
			String s=displayLabel.getText();
			displayLabel.setText("");
			for(int i=0;i<s.length()-1;i++)
			displayLabel.setText(displayLabel.getText()+s.charAt(i));
	}
	}
}

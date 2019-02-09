package Java_Calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel{
	
	// show calculated results
	JTextField HUD = new JTextField();
	// outputs to HUD
	String numberString = "";
	
	double currentTotal = 0;
	
	int prev_sign = 0; 			// tells equals button what action to take when pressed, depending on previous sign button press

	// calculation signs
	private JButton add_bt = new JButton("+");
	private JButton sub_bt = new JButton("-");
	private JButton multi_bt = new JButton("*");
	private JButton div_bt = new JButton("/");
	private JButton mod_bt = new JButton("%");
	private JButton exp_bt = new JButton("a^b");
	private JButton exp2_bt = new JButton("a^2");
	private JButton equal_bt = new JButton("=");
	private JButton clear_bt = new JButton("CLEAR");
	// number buttons
	private JButton bt0 = new JButton("0");
	private JButton bt1 = new JButton("1");
	private JButton bt2 = new JButton("2");
	private JButton bt3 = new JButton("3");
	private JButton bt4 = new JButton("4");
	private JButton bt5 = new JButton("5");
	private JButton bt6 = new JButton("6");
	private JButton bt7 = new JButton("7");
	private JButton bt8 = new JButton("8");
	private JButton bt9 = new JButton("9");

	
	public GUI() {
		
		// panel for signs and numbers
		JPanel panel = new JPanel(new GridLayout(0,3));			// 3 columns, as many rows as necessary

		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(bt4);
		panel.add(bt5);
		panel.add(bt6);
		panel.add(bt7);
		panel.add(bt8);
		panel.add(bt9);
		panel.add(add_bt);
		panel.add(bt0);
		panel.add(sub_bt);
		panel.add(multi_bt);
		panel.add(div_bt);
		panel.add(mod_bt);
		panel.add(exp_bt);
		panel.add(exp2_bt);
		panel.add(equal_bt);
		panel.add(clear_bt);
		
		BtListener btlisten = new BtListener();
		
		bt0.addActionListener(btlisten);
		bt1.addActionListener(btlisten);
		bt2.addActionListener(btlisten);
		bt3.addActionListener(btlisten);
		bt4.addActionListener(btlisten);
		bt5.addActionListener(btlisten);
		bt6.addActionListener(btlisten);
		bt7.addActionListener(btlisten);
		bt8.addActionListener(btlisten);
		bt9.addActionListener(btlisten);
		
		add_bt.addActionListener(btlisten);
		sub_bt.addActionListener(btlisten);
		multi_bt.addActionListener(btlisten);
		div_bt.addActionListener(btlisten);
		mod_bt.addActionListener(btlisten);
		exp_bt.addActionListener(btlisten);
		exp2_bt.addActionListener(btlisten);
		equal_bt.addActionListener(btlisten);
		clear_bt.addActionListener(btlisten);
		
		// layout of components
		setLayout(new BorderLayout());
		add(panel, BorderLayout.CENTER);
		add(HUD, BorderLayout.NORTH);
		add(equal_bt, BorderLayout.SOUTH);
		
		HUD.setHorizontalAlignment(SwingConstants.RIGHT);
		HUD.setPreferredSize(new Dimension(300,30));
	}
	
	class BtListener implements ActionListener {
		
		@Override			// overriding method
		public void actionPerformed(ActionEvent e) {			// += is for concatenation of string... they just happen to be numbers
			if (e.getSource() == bt0) {			
				numberString += "0";
				HUD.setText(numberString);
			} else if (e.getSource() == bt1) {
				numberString += "1";
				HUD.setText(numberString);
			} else if (e.getSource() == bt2) {
				numberString += "2";
				HUD.setText(numberString);
			} else if (e.getSource() == bt3) {
				numberString += "3";
				HUD.setText(numberString);
			} else if (e.getSource() == bt4) {
				numberString += "4";
				HUD.setText(numberString);
			} else if (e.getSource() == bt5) {
				numberString += "5";
				HUD.setText(numberString);
			} else if (e.getSource() == bt6) {
				numberString += "6";
				HUD.setText(numberString);
			} else if (e.getSource() == bt7) {
				numberString += "7";
				HUD.setText(numberString);
			} else if (e.getSource() == bt8) {
				numberString += "8";
				HUD.setText(numberString);
			} else if (e.getSource() == bt9) {
				numberString += "9";
				HUD.setText(numberString);
			}
			/**
			 * sign buttons do calculations, back & forth double String parsing required
			 * 
			 * will need to use nested if statements to achieve desired effect
			 * 
			 * steps in calculation
			 * 		first number
			 * 		choose calculation
			 * 		second number
			 * 		commit/enter calculation
			 * So I will need an equals to button
			 * 
			 * I might need 2 numberStrings or 2 variables for 1st and 2nd numbers in calculation
			 * 
			 * Steps:
			 * * 1. trigger + sign button
			 * 2. parse numberString into double, sto currentTotal variable
			 * 3. clear HUD
			 * 4. other numbers are entered 
			 * 5.
			 * 		a. if = is pressed, output to HUD currentTotal + numString, then clear currentTotal
			 * 		b. if + is pressed, add numString to currentTotal, clear HUD
			 * 
			 */ 
			
			/**
			 * double is primitive data type, Double is object; preferred to use parseDouble() for double, and valueOf() for Double
			 * 
			 * parseDouble cannot parse empty string "". So if numberString is "", then use 0 instead
			 */
			  else if (e.getSource() == add_bt) {
				  if (numberString != "")
					 currentTotal = Calc.add(currentTotal,Double.parseDouble(numberString));
				  numberString = "";
				  HUD.setText(numberString);
				  prev_sign = 1;
			} else if (e.getSource() == sub_bt) {
				if (numberString != "")
					if (currentTotal == 0) {
						currentTotal = Double.parseDouble(numberString);
					} else {
						currentTotal = Calc.subtract(currentTotal,Double.parseDouble(numberString));
					}
				numberString = "";
				HUD.setText(numberString);
				prev_sign = 2;
			} else if (e.getSource() == multi_bt) {
				if (numberString != "")
					if (currentTotal == 0) {
						currentTotal = Double.parseDouble(numberString);		// currentTotal * numberString, so if currentTotal is 0, you need to set it to numberString
					} else {
						currentTotal = Calc.multiply(currentTotal,Double.parseDouble(numberString));
						}
				numberString = "";
				HUD.setText(numberString);
				prev_sign = 3;
			} else if (e.getSource() == div_bt) {
				if (numberString != "")
					  if ( 0 == Double.parseDouble(numberString)) {
						  if (prev_sign == 0) {
							  // do nothing because you just started
						  } else {
							  JOptionPane.showMessageDialog(null,"You cannot divide by 0", "zero divion alert", JOptionPane.PLAIN_MESSAGE); 
							  }
						} else if (currentTotal == 0) {
							currentTotal = Double.parseDouble(numberString);			//  currentTotal/numberString; so if currentTotal is 0, you need to set it to numberString
						} else {
							currentTotal = Calc.divide(currentTotal, Double.parseDouble(numberString));
						}
				numberString = "";
				HUD.setText(numberString);
				prev_sign = 4;
			} else if (e.getSource() == mod_bt) {
				if (numberString != "")
					if (currentTotal == 0) {
						currentTotal = Double.parseDouble(numberString);
					} else {
						currentTotal = Calc.modulus(currentTotal, Double.parseDouble(numberString));
					}
				numberString = "";
				HUD.setText(numberString);
				prev_sign = 5;
			} else if (e.getSource() == exp_bt) {
				if (numberString != "")
					if (currentTotal == 0) {
						currentTotal = Double.parseDouble(numberString);
					} else {
						currentTotal = Calc.exponent(currentTotal, Double.parseDouble(numberString));
					}
				numberString = "";
				HUD.setText(numberString);
				prev_sign = 6;
			} else if (e.getSource() == exp2_bt) {
				if (numberString != "")
					if (currentTotal == 0) {
						currentTotal = Double.parseDouble(numberString);
						} else {
							currentTotal = Calc.exponent2(currentTotal);
							}
				numberString = "";
				HUD.setText(numberString);
				prev_sign = 7;
			} else if (e.getSource() == clear_bt) {
				numberString = "";
				currentTotal = 0;
				HUD.setText(numberString);
				prev_sign = 0;
			} else if (e.getSource() == equal_bt) {
				// need to perform previous sign button action
				switch (prev_sign) {
				case 1:
					if (numberString != "")
						currentTotal = Calc.add(currentTotal,Double.parseDouble(numberString));
					break;
				case 2:
					if (numberString != "")
						currentTotal = Calc.subtract(currentTotal,Double.parseDouble(numberString));
					break;
				case 3:
					if (numberString != "")
						currentTotal = Calc.multiply(currentTotal,Double.parseDouble(numberString));
					break;
				case 4:
					if (numberString != "")
						if ( 0 == Double.parseDouble(numberString)) {
							JOptionPane.showMessageDialog(null,"You cannot divide by 0", "zero divion alert", JOptionPane.PLAIN_MESSAGE);
							} else {
								currentTotal = Calc.divide(currentTotal, Double.parseDouble(numberString));
								}
					break;
				case 5:
					if (numberString != "")
						currentTotal = Calc.modulus(currentTotal, Double.parseDouble(numberString));
					break;
				case 6:
					if (numberString != "")
						currentTotal = Calc.exponent(currentTotal, Double.parseDouble(numberString));
					break;
				case 7:
					currentTotal = Calc.exponent2(currentTotal);
					break;
				default:
					break;
				}
				HUD.setText(Double.toString(currentTotal));		// show the current total
				numberString = "";
			}
			
			
		}
	}
	
	
}

/**
 * Conventionally, it is better not to extend the JFrame class without a need. You should extend when adding extra functionality to JFrame class
 * 
 * So it is preferable to extend the JPanel class... Additonaly, the JPanel goes inside the JFrame...
 * 
 * "A Swing GUI cannot exist without a top level container like (JWindow, Window, JFrame Frame or Applet), while it may exist without JPanels."
 * 
 * You can have multiple JPanels inside of a JFrame
 * 
 * I think you can also have JPanels inside of JPanels XD
 * 
 */
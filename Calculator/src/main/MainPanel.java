package main;

import java.awt.Button;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements ActionListener {

	ArrayList<JButton> buttonList;

	CalculationPanel calculatorPanel;

	
	// each button used for the calculator
	String[] buttonText = {"AC","DEL","+","-","0","1",
			"2","*","3","4","5","÷","6","7","8","(-/+)",
			".","9","!"};
	
	/**
	 * 
	 * @param calculatorPanel used to display the current calculation and solution
	 */
	public MainPanel(CalculationPanel calculatorPanel) {

		super();

		this.calculatorPanel = calculatorPanel;

		int layoutRows = 0;
		int layoutColumns = 4;
		int layoutHGap = 3;
		int layoutVGap = 3;

		setLayout(new GridLayout(layoutRows, layoutColumns, layoutHGap, layoutVGap));

		buttonList = new ArrayList<JButton>();

		createButtons();

	}

	/**
	 * Creates all the clickable buttons
	 * 
	 * @param numberOfButtons how many Buttons should be created
	 */
	public void createButtons() {

		for (int i = 0; i < buttonText.length; i++) {

			JButton btn = new JButton();

			btn.addActionListener(this);

			String btnText = buttonText[i];
			
			btn.setText(btnText);
			
			btn.setFocusable(false);

			add(btn);

		}

	}
	
	public void setCalculationText(String Text) {
		
		String bufferText = calculatorPanel.getCalculation();
		
		Text = bufferText + Text;
		
		System.out.println(Text);
		
		calculatorPanel.setCalculation(Text);
		
	}
	
	
	public void checkButton(String buttonValue) {
		
		switch (buttonValue){
			case "0","1","2","3","4","5","6","7","8","9",".": 
				setCalculationText(buttonValue);
				break;
			case "+":
				
			default:// default is the all clear button
				
				break;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		JButton source = (JButton) e.getSource();
		
		String buttonValue = source.getText();
		
		checkButton(buttonValue);
	}
}

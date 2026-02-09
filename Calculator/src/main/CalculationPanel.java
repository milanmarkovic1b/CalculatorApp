package main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculationPanel extends JPanel {

	JTextField calculationField;

	public CalculationPanel() {

		super();

		setLayout(new GridLayout(0, 1));
		setPreferredSize(new Dimension(300, 100));

		calculationField = new JTextField();
		calculationField.setHorizontalAlignment(calculationField.RIGHT);
		calculationField.setEditable(false);
		calculationField.setFocusable(false);
		calculationField.setFont(new Font("Arial",Font.PLAIN,25));
		add(calculationField);

	}

	
	public String getCalculation() {
		return calculationField.getText();
	}
	
	/**
	 * sets a new Text
	 * 
	 * @param newText
	 */
	public void setCalculation(String newText) {

		calculationField.setText(newText);

	}

}

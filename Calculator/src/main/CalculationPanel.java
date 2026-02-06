package main;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculationPanel extends JPanel {

	JTextField calculationField;

	public CalculationPanel() {

		super();

		setLayout(new GridLayout(0, 1));
		setPreferredSize(new Dimension(300, 100));

		calculationField = new JTextField("audkawdioawdoiawd");
		calculationField.setHorizontalAlignment(calculationField.RIGHT);
		calculationField.setEditable(false);
		calculationField.setFocusable(false);
		add(calculationField);

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

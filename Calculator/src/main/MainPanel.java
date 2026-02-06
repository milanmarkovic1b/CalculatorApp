package main;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements ActionListener {

	ArrayList<JButton> buttonList;

	CalculationPanel calculatorPanel;

	/**
	 * 
	 * @param calculatorPanel used to display the current calculation and solution
	 */
	public MainPanel(CalculationPanel calculatorPanel) {

		super();

		this.calculatorPanel = calculatorPanel;

		int layoutRows = 0;
		int layoutColumns = 3;
		int layoutHGap = 10;
		int layoutVGap = 10;

		setLayout(new GridLayout(layoutRows, layoutColumns, layoutHGap, layoutVGap));

		buttonList = new ArrayList<JButton>();

		createButtons(9);

	}

	/**
	 * Creates all the clickable buttons
	 * 
	 * @param numberOfButtons how many Buttons should be created
	 */
	public void createButtons(int numberOfButtons) {

		for (int i = 0; i <= numberOfButtons; i++) {

			JButton btn = new JButton();

			btn.addActionListener(this);

			btn.setText("" + i);

			add(btn);

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("clicked");

	}
}

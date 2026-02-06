package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Window extends JFrame{

	
	/**
	 * 
	 * @param windowWidth sets width of the window
	 * @param WindowHeight sets the height of the window
	 */
	public Window(int windowWidth,int WindowHeight) {
		
		super();
		
		String windowTitle = "Calculator - Milan© 2026";
		
		setLayout(new BorderLayout());
		setSize(windowWidth,WindowHeight);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(windowTitle);
		setLocationRelativeTo(null); //sets location of the window to the middle
		
		CalculationPanel calcPanel = new CalculationPanel();
		MainPanel mainPanel = new MainPanel(calcPanel);
		
		add(mainPanel, BorderLayout.CENTER);
		
		
		add(calcPanel, BorderLayout.NORTH);
		
		setVisible(true);
	}
	
}

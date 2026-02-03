package main;

import javax.swing.JFrame;

public class Window extends JFrame{

	
	/**
	 * 
	 * @param windowWidth sets width of the window
	 * @param WindowHeight sets the height of the window
	 */
	public Window(int windowWidth,int WindowHeight) {
		
		super();
		
		String windowTitle = "Calculator";
		
		setSize(windowWidth,WindowHeight);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(windowTitle);
		setLocationRelativeTo(null); //sets location of the window to the middle
		
		MainPanel mainPanel = new  MainPanel();
		
		add(mainPanel);
		
		setVisible(true);
	}
	
}

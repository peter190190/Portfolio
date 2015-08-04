package uk.ac.qub.lottery;

// Import resources
import java.util.Arrays;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 * @author Peter
 * 
 * A class that generates 6 random lottery numbers via a 
 * 'generate lottery numbers' button and displays the results 
 * within a swing GUI.
 */
public class Lottery {

	/**
	 * Default constructor
	 */
	public Lottery() {
		
	}

	/**
	 * Call the method to instantiate and display the GUI
	 * @param args
	 */
	public static void main(String[] args) {
	    
		// 
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
	
	/**
	 * Method that focuses on creating the user interface with a simple
	 * frame, textField and button
	 */
	public static void createAndShowGUI() {
		
	    // Create Swing JFrame
	    JFrame frame1=new JFrame("Peter's Lottery Generator");//creating instance of JFrame  
	    frame1.setSize(new Dimension(300,400));//400 width and 400 height
	    frame1.setResizable(false); // Can't resize window
	    frame1.setLayout(new GridLayout(2,0));//layout manager, 2 rows 1 column 
	    frame1.setVisible(true);//making the frame visible 
	    frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    
	    // Set frame position on start-up
	    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); 
	    frame1.setLocation(dim.width/2-frame1.getSize().width/2, dim.height/2-frame1.getSize().height/2);
	    
	    // Create JTextField to hold lottery numbers
	    final JTextField jText=new JTextField(); // Creating instance of JTextField
	    jText.setHorizontalAlignment(JTextField.CENTER); // Ensure text is centred in the JFrame
	    jText.setFont(new Font("Arial", Font.PLAIN, 20)); // Typeface
	    jText.setEditable(false); // Disallow user input
	    
	    // Create JButton to generate lottery numbers
	    JButton button=new JButton();//creating instance of JButton  
	    Border border = new LineBorder(frame1.getBackground(), 50); // Set a border to match background colour
	    button.setHorizontalAlignment(button.CENTER);
	    button.setText("<html><center>Generate<br />Lottery<br />Numbers<center></html>"); // Use of HTML to ensure button text is centred
	    button.setFont(new Font("Arial", Font.PLAIN, 20));
	    button.setBorder(border);
	    button.setFocusable(false);
	    
	    frame1.add(button);//adding button in JFrame  
	    frame1.add(jText);
	    
	    // Set the functionality of the button
	    button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				generateLotteryNumbers(jText);
				
			}
		});
    	
    }
	
	/**
	 * Method that generates and stores 6 random numbers within an array
	 * @param jText
	 */
	public static void generateLotteryNumbers(JTextField jText) {
		
		// Create lottery number array
		int[] lottery = new int[6];
		// Variables that will store random numbers and define a value range adheres to lottery standards (1-49)
	    int randomNum, min, max;
	    min = 1;
	    max = 50;
	     
	    // Iterate through 6 random numbers
	    for (int i = 0; i < lottery.length; i++) {
	        randomNum = (int) (Math.random() * (max-min) +min ); // Random number created here.
	        for (int x = 0; x < i; x++) {
	            if (lottery[x] == randomNum) // Check for repetition of numbers
	            {
	                randomNum = (int) (Math.random() * (max-min) +min);// If random number is same, another number generated.
	                x = -1; // restart the loop
	            }

	        }
	        lottery[i] = randomNum;
	    }

	    // Sort numbers ascending
	    Arrays.sort(lottery);
	    
	    // Display lottery array within textField
	    StringBuilder builder = new StringBuilder();
	    for (int i=0; i<lottery.length; i++) {
	        builder.append(lottery[i]);
	        if(i + 1 != lottery.length) 
	            builder.append(", ");
	    }
	    jText.setText(builder.toString());
    }
	
}
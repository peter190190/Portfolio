package uk.ac.qub.noughtsandcrosses;

// Resource Imports
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 * @author Peter
 *
 */
public class Main {

	// Create 3x3 Grid of buttons
	public JButton[] grid = new JButton[9];
	// Icons will be in the form of .png files
	public ImageIcon xIcon, oIcon;
	
	public int[] board = new int[9];
	public boolean won = false;
	
	public int currentPlayer = 1;
	
	/**
	 * 
	 * @param id
	 */
	public void play(int id) {
		
		System.out.println("Playing square" +id);
		
		if(attemptChange(id)) {
			currentPlayer = (currentPlayer == 1) ? 2 : 1;
			checkWin();
		}
	}
	
	/**
	 * 
	 * @param square
	 * @return
	 */
	public boolean attemptChange(int square) {
		if(board[square] != 0) {
			return false;
		}
		
		board[square] = currentPlayer;
		grid[square].setIcon(currentPlayer == 1 ? xIcon : oIcon);
		return true;
	}
	
	/**
	 * 
	 */
	public void checkWin() {
		
		// Check horizontal_______________________________________________________
		if((board[0] == board[1]) && (board[1] == board[2]) && (board[2] != 0) ) {
			win(0);
		}
		if((board[3] == board[4]) && (board[4] == board[5]) && (board[5] != 0) ) {
			win(5);
		}
		if((board[6] == board[7]) && (board[7] == board[8]) && (board[8] != 0) ) {
			win(8);
		}
		
		// Check vertical_________________________________________________________
		if((board[0] == board[3]) && (board[3] == board[6]) && (board[6] != 0) ) {
			win(6);
		}
		if((board[1] == board[4]) && (board[4] == board[7]) && (board[7] != 0) ) {
			win(7);
		}
		if((board[2] == board[5]) && (board[5] == board[8]) && (board[8] != 0) ) {
			win(8);
		}
		
		// Check diagnol__________________________________________________________
		if((board[0] == board[4]) && (board[4] == board[8]) && (board[8] != 0) ) {
			win(8);
		}
		if((board[6] == board[4]) && (board[4] == board[2]) && (board[2] != 0) ) {
			win(2);
		}
		
		for(int i = 0; i < board.length; i++) {
			if(board[i] == 0)return;
		}
		
		if(!won)
			draw();
		
	}
	
	/**
	 * 
	 * @param square
	 */
	public void win(int square) {
		
		won = true;
		
		String winner = board[square] == 1 ? "X" : "O";
		
		if(JOptionPane.showConfirmDialog(new JFrame("Winner! Congratulations " +winner), "Player " +winner +" has won! Would you like to play again?") == JOptionPane.YES_OPTION) {
			restart();
		}else{
			System.exit(0);
		}
			
		
	}
	
	/**
	 * 
	 */
	public void restart() {
		
		won = false;
		currentPlayer = 1;
		
		for(int i = 0; i <9; i++) {
			board[i] = 0;
			grid[i].setIcon(null);
		}
	}
	
	/**
	 * 
	 */
	public void draw() {
		
		if(JOptionPane.showConfirmDialog(new JFrame("It's a draw!"), "It's a draw! Would you like to play again?") == JOptionPane.YES_OPTION) {
			restart();
		}else{
			System.exit(0);
		}
	}
	
	/**
	 * 
	 */
	public void init_components() {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(450, 450);
		
		JPanel panel = new JPanel();
		frame.setContentPane(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		panel.addComponentListener(new ComponentListener() {
			
			
			public void componentShown(ComponentEvent e) {
				
			}
			
			
			public void componentResized(ComponentEvent e) {
				init_icons();
			}

			
			public void componentHidden(ComponentEvent e) {
				
			}

			
			public void componentMoved(ComponentEvent e) {
				
			}
			
		});
		
		for(int i = 0; i < 9; i++){
			final int pos = i;
			
			grid[i] = new JButton();
			grid[i].addActionListener(new ActionListener() {
				
				int id = pos;
				
				public void actionPerformed(ActionEvent e) {
					play(id);
				}
			});
			
			panel.add(grid[i]);
		}
		
		frame.setSize(450, 450);
	}
	
	/**
	 * 
	 */
	public void init_icons() {
		
		try{
			Image x = ImageIO.read(Main.class.getResource("/icon_x.png"));
			Image o = ImageIO.read(Main.class.getResource("/icon_o.png"));
			
			xIcon = new ImageIcon(x.getScaledInstance(grid[0].getWidth(), grid[0].getHeight(), Image.SCALE_SMOOTH));
			oIcon = new ImageIcon(o.getScaledInstance(grid[0].getWidth(), grid[0].getHeight(), Image.SCALE_SMOOTH));

			for(int i = 0; i < 9; i++) {
				if(grid[i].getIcon() != null)
					grid[i].setIcon(board[i] == 1? xIcon : oIcon); {
					
				}
			}
			
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		

	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Main m = new Main();
		m.init_components();
		m.init_icons();
	}
}

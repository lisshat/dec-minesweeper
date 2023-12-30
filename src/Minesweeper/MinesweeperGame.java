package Minesweeper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JButton;

public class MinesweeperGame {
	public final static int MINE=-1;  // mines represented by -1
	public final static int FLAG=0;
	public final static int SAFETILES = 1; //safetiles represented by 1 
    private int[][] minesweeperBoard; 
    private MinesweeperGUI minesweeperGUI; 
    public MinesweeperGame() {
    	mines();
       
    }

    // Add methods to update the Minesweeper board and GUI
    public void mines() {
        Random random = new Random();
        int totalMines = 8; //change depending on level later 
        
        for (int i = 0; i < totalMines; i++) {
            int row = random.nextInt(minesweeperBoard.length);
            int col = random.nextInt(minesweeperBoard[0].length);

            // Check if there is already a mine at the chosen position
            while (minesweeperBoard[row][col] == MINE) {
                row = random.nextInt(minesweeperBoard.length);
                col = random.nextInt(minesweeperBoard[0].length);
            }

            // Place a mine at the chosen position
            minesweeperBoard[row][col] = MINE;
        }
    }
    
  
    	
    }

    	 
    
    


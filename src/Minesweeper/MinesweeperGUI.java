package Minesweeper;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperGUI extends JPanel {

    private JButton[][] buttons;  // grid of buttons

    public MinesweeperGUI(int rows, int cols) {
        // Initialize the minesweeper jpanel
        setSize(700, 700);
        setLayout(new GridLayout(rows, cols));

        // Initialize 2D array of buttons
        buttons = new JButton[rows][cols];

        // Create buttons and add them to the JFrame
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                buttons[i][j] = new JButton();
                add(buttons[i][j]);
            }
        }

        // Display the JFrame
        setVisible(true);
    }

}

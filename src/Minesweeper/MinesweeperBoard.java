package Minesweeper;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinesweeperBoard extends JPanel {

    private int rows;
    private int cols;
    private JButton[][] buttons;  // grid of buttons
    private boolean[][] cells;    // grid of cells

    public MinesweeperBoard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        setPreferredSize(new Dimension(400, 400));
        buttons = new JButton[rows][cols];
        cells = new boolean[rows][cols];

        // Initialize buttons and add action listeners
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].addActionListener(new ButtonClickListener(i, j));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Calculate cell size based on the panel size and number of rows/cols
        int cellWidth = getWidth() / cols;
        int cellHeight = getHeight() / rows;

        // Loop through cells and draw basic shapes
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int x = j * cellWidth;
                int y = i * cellHeight;

                // Draw a filled rectangle for each cell
                g.setColor(cells[i][j] ? Color.PINK : Color.WHITE);
                g.fillRect(x, y, cellWidth, cellHeight);

                // Draw a border for each cell
                g.setColor(Color.BLACK);
                g.drawRect(x, y, cellWidth, cellHeight);
                
                buttons[i][j].setBounds(x, y, cellWidth, cellHeight);
                add(buttons[i][j]);
            }
        }
    }

    private class ButtonClickListener implements ActionListener {
        private int row;
        private int col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Handle button click here
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setVisible(false);
            cells[row][col] = true;
            repaint();  
        }
    }
}



    



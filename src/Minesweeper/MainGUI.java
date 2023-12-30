package Minesweeper;

import java.awt.*;

import javax.swing.*;

public class MainGUI extends JFrame {
    private JButton resetButton;

    public MainGUI() {
        super("Minesweeper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MinesweeperBoard board = new MinesweeperBoard(8, 8);

        JPanel boardPanel = new JPanel(new BorderLayout());
        boardPanel.add(board, BorderLayout.CENTER);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(boardPanel, BorderLayout.CENTER);

        // (reset button, timer, mine count) to other regions as needed
        JPanel controlPanel = new JPanel();
        resetButton = new JButton("Reset");
        controlPanel.add(resetButton);
        
        contentPane.add(controlPanel, BorderLayout.NORTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainGUI());
    }
}

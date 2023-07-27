import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame {

    private JLabel statusbar;

    public Tetris() {

        initUI();
    }

    private void initUI() {
        // Initializes the user interface

        statusbar = new JLabel(" 0"); // Create a status bar label
        add(statusbar, BorderLayout.SOUTH); // Add the status bar to the bottom of the frame

        var board = new Board(this); // Create the game board
        add(board); // Add the game board to the center of the frame
        board.start(); // Start the game

        setTitle("Tetris"); // Set the title of the frame
        setSize(200, 400); // Set the size of the frame
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Set the default close operation
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    JLabel getStatusBar() {
        // Getter method for the status bar label
        return statusbar;
    }

    public static void main(String[] args) {
        // Main method to start the game

        EventQueue.invokeLater(() -> {
            // Use EventQueue to ensure that the GUI components are created on the Event Dispatch Thread (EDT)

            var game = new Tetris(); // Create an instance of the Tetris class
            game.setVisible(true); // Make the frame visible
        });
    }
}

import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {

    public HomePage() {
        // Set up the frame
        setTitle("UofTrackMyGames");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a main panel with a vertical box layout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Title label
        JLabel titleLabel = new JLabel("UofTrackMyGames", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(titleLabel);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));  // Spacer

        // Search by Title section
        JLabel searchTitleLabel = new JLabel("Search by Title");
        searchTitleLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        searchTitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(searchTitleLabel);

        JPanel titleSearchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titleSearchPanel.add(new JLabel("Title "));
        JTextField titleTextField = new JTextField(15);
        titleSearchPanel.add(titleTextField);
        panel.add(titleSearchPanel);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));  // Spacer

        // Search by Filters section
        JLabel searchFilterLabel = new JLabel("Search by Filters");
        searchFilterLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        searchFilterLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(searchFilterLabel);

        JPanel filterSearchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        filterSearchPanel.add(new JLabel("Filters "));
        JTextField filterTextField = new JTextField(15);
        filterSearchPanel.add(filterTextField);
        panel.add(filterSearchPanel);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));  // Spacer

        // Buttons for "My list" and "I'm Feeling Lucky"
        JButton myListButton = new JButton("My list");
        JButton luckyButton = new JButton("I'm Feeling Lucky");

        myListButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        luckyButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(myListButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));  // Spacer
        panel.add(luckyButton);

        // Add panel to frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }
}

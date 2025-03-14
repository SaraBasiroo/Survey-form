import javax.swing.*;
import packages.informationPage;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 20);

        // Create and configure the main frame
        JFrame frame = new JFrame("Survey form");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);

        // Create title label
        JLabel title = new JLabel("Survey form");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(10, 10, 100, 20);
        title.setFont(font);

        // Create start button
        JButton startButton = new JButton("Start!");
        startButton.setHorizontalAlignment(JLabel.CENTER);
        startButton.setBounds(10, 40, 100, 20);
        startButton.setHorizontalAlignment(JButton.CENTER);
        startButton.setFont(font);

        // Add components to the panel
        panel.add(title);
        panel.add(startButton);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

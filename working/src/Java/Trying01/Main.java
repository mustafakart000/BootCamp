package Java.Trying01;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("UI Elements Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Submit");

        JTextField textField = new JTextField(20);

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(textField);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}






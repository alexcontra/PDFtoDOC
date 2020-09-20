package GUI;

import javax.swing.*;

public class createGui {
    public JFrame mainFrame = new JFrame();
    public JPanel mainPanel = JPanel();

    public createGui()
    {
        mainFrame.setSize(500,500);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.add(mainPanel);
        mainPanel.setLayout(null);

    }
}

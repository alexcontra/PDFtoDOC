package GUI;

import generateDOC.generate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createGui implements ActionListener {
    public JFrame mainFrame = new JFrame();
    public JPanel mainPanel = new JPanel();
    public JTextField numeleFisieruluiPDF = new JTextField();
    public JLabel nume = new JLabel("Name of file");
    public JButton generate = new JButton("Generate Word Document");
    public createGui()
    {
        mainFrame.setSize(650,250);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.add(mainPanel);
        mainPanel.setLayout(null);
    }
    public void implement()
    {
        nume.setBounds(100,40,170,30);
        mainPanel.add(nume);

        numeleFisieruluiPDF.setBounds(100,65,370,30);
        mainPanel.add(numeleFisieruluiPDF);

        generate.setBounds(180,105,240,30);
        generate.addActionListener(this);
        mainPanel.add(generate);
    }
    public void actionPerformed(ActionEvent actionEvent) {
            if(actionEvent.getSource()==generate)
            {
                generate g = new generate(numeleFisieruluiPDF.getText());
            }
    }
}

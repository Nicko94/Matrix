package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public static void createAndShowGUI(){
        JFrame frame = new JFrame("Windowed App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("This is a label");
        JPanel panel = new JPanel();
        JButton button = new JButton("Ok");
        button.addActionListener(new ActionListener(){
           //@override
           public void actionPerformed(ActionEvent e){
               label.setText("Done");
           }
        });

        panel.add(label);
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Centered window
        frame.setVisible(true);

    }
}

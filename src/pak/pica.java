package pak;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class pica {

	public static void main(String[] args) {
		String options[]= {"Pica ar desu","Vegetara","Pica ar ananasiem","Ferrara"};
		String izmers[]= {"Pilna pica","1/2 daļa","1/4 daļa"};
		int x = JOptionPane.showOptionDialog(null, null, null, 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, null);
        
        JFrame frame = new JFrame();
//        frame.getContentPane().setBackground(Color.red);
        frame.setBounds(300, 300, 500, 350);
        frame.setVisible(true);

        int izm = JOptionPane.showOptionDialog(frame, 
                "Kāda izmēra picu tu gribi?", "izvēlies izmēru!", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                new ImageIcon("C:\\_tools\\java-duke-sm.jpg"), 
                izmers, izmers[0]);
        
        if (izm == 0) {
            JOptionPane.showMessageDialog(frame, "Pilna pica.");
        }
        if (izm == 1) {
            JOptionPane.showMessageDialog(frame, "1/2 daļa.");
        }
        if (izm == 2) {
            JOptionPane.showMessageDialog(frame, "1/4 daļa.");
        }

	}

}

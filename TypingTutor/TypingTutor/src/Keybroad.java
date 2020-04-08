import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Keybroad extends JPanel {

   
    public JPanel parent = new JPanel(new GridLayout(0, 1));
    public JPanel[] panel;
    public JButton[][] button;
    public String[][] key = {
         {"Q", "W", "E", "R", "T", "Y", "U", "I",
            "O", "P"}, {
            "A", "S", "D", "F", "G", "H", "J", "K", "L"}, 
            {"Z", "X", "C", "V", "B",
            "N","M"},
        {"              Space             " }};

    public Keybroad() {

        panel = new JPanel[6];
        for (int row = 0; row < key.length; row++) {
            panel[row] = new JPanel();
            button = new JButton[20][20];
            for (int column = 0; column < key[row].length; column++) {
                button[row][column] = new JButton(key[row][column]);
                button[row][column].putClientProperty("column", column);
                button[row][column].putClientProperty("row", row);
                button[row][column].putClientProperty("key", key[row][column]);
                button[row][column].addActionListener(new MyActionListener());
                panel[row].add(button[row][column]);
            }
            parent.add(panel[row]);
        }

        add(parent);
     
        setVisible(true);
    }

    public class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            
        }
    }
}
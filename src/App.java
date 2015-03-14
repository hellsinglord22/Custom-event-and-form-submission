import javax.swing.*;

/**
 * @Author: Scorpion
 * @Date: 3/14/2015.
 */
public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame("Custom events and form Submission");
            }
        });
    }
}

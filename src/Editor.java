import javax.swing.*;
import java.awt.*;

/**
 * @Author: Scorpion
 * @Date: 3/16/2015.
 */
public class Editor extends JPanel {
    // Attributes //
    private JTextArea customTextArea;


    /*Constructor*/
    public Editor() {
        /// Initialize Attributes ///
        customTextArea = new JTextArea();

        /// Properties ///
        setLayout(new BorderLayout());

        /// add textArea ///
        add(customTextArea);


    }

    /*Methods*/
    public void append(String text) {
        this.customTextArea.append(text);
    }
}

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Scorpion
 * @Date: 3/14/2015.
 */


//// This class is the Controller of this small project ///

public class MainFrame extends JFrame {

    /*Attributes*/
    private Form customForm;
    private Container myContainer;


    /*Constructor*/
    public MainFrame(String text) {
        /// set properties ///
        super(text);
        setLayout(new BorderLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);

        /// Initialize Attributes //
        customForm =new Form();
        myContainer = getContentPane();

        /// add elements to the frame (Windows) ///
        myContainer.add(customForm, BorderLayout.CENTER);
    }
}

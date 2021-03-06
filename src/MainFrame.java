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
    private Editor myEditor;


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
        myEditor = new Editor();

        /// add elements to the frame (Windows) ///
        myContainer.add(customForm, BorderLayout.WEST);
        myContainer.add(myEditor, BorderLayout.CENTER);


        /// Rooting communication ////
        customForm.addFormListener(new FormListener() {
            @Override
            public void formEventOccurred(FormEvent e) {
                myEditor.append(e.getUsername() + "|" + e.getEmail()+"\n");
            }
        });

    }
}

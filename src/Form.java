import com.sun.javafx.css.FontUnits;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Scorpion
 * @Date: 3/14/2015.
 */
public class Form extends JPanel {

    /*Attributes*/
    private JLabel usernameLabel, emailLabel;
    private JTextField usernameTextField, emailTextField;
    private JButton okButton , closeButton;
    private GridBagConstraints myConstraints;
    private Border innerBorder , outerBorder;

    /*Constructor*/
    public Form() {

        // Initialize attributes ///
        innerBorder = BorderFactory.createTitledBorder("Special form");
        outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        usernameLabel = new JLabel("user name: ");
        emailLabel = new JLabel("email: ");
        usernameTextField = new JTextField(20);
        emailTextField = new JTextField(20);
        okButton = new JButton("OK");
        closeButton = new JButton("CLOSE");
        myConstraints = new GridBagConstraints();

        // properties ///
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        /// Elements properties ///
        myConstraints.fill = GridBagConstraints.NONE;

        /// Weight of first two row ///
        myConstraints.weighty = 0.1;

        /// Row One ///
        myConstraints.anchor = GridBagConstraints.LINE_END;
        setElementPosition(0, 0);
        add(usernameLabel, myConstraints);

        myConstraints.anchor = GridBagConstraints.LINE_START;
        setElementPosition(0, 1);
        add(usernameTextField, myConstraints);

        /// Row Two ///
        myConstraints.anchor = GridBagConstraints.LINE_END;

        setElementPosition(1, 0);
        add(emailLabel, myConstraints);

        myConstraints.anchor = GridBagConstraints.LINE_START;
        add(emailTextField, myConstraints);

        /// Row Three ///

        /// Weight of the last row ///
        myConstraints.weighty = 2;

        setElementPosition(2, 0);
        add(okButton, myConstraints);

        myConstraints.anchor = GridBagConstraints.LINE_END;
        setElementPosition(2, 1);
        add(closeButton, myConstraints);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String email = emailTextField.getText();
            }
        });



    }

    /*Methods*/
    private void setElementPosition(int row , int column) {
        myConstraints.gridy = row;
        myConstraints.gridx = column;
    }



}

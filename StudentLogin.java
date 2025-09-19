import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentLogin extends JFrame implements ActionListener {
    private JTextField userTextField;
    private JPasswordField passField;
    private JButton loginButton;
    private JLabel messageLabel;

    public StudentLogin() {
        setTitle("Student Login Page");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // UI Components
        add(new JLabel("Username:"));
        userTextField = new JTextField();
        add(userTextField);

        add(new JLabel("Password:"));
        passField = new JPasswordField();
        add(passField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        messageLabel = new JLabel("");
        add(messageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userTextField.getText();
        String password = new String(passField.getPassword());

        // Dummy validation
        if ("student".equals(username) && "password".equals(password)) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid credentials.");
        }
    }

    public static void main(String[] args) {
        new StudentLogin();
    }
}
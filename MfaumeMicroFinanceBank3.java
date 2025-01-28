/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfaumemicrofinancebank3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MfaumeMicroFinanceBank3 {
    private JFrame frame;
    private JTextField nameTextField;
    private JTextField middleNameTextField;
    private JTextField surnameTextField;
    private JTextField accountNumberTextField;
    private JTextField nationalIdNumberTextField;
    private JTextField dateOfBirthTextField;
    private JComboBox<String> genderComboBox;
    private JTextField locationNameTextField;
    private JTextField loanAmountTextField;
    private JTextField nextOfKin1NameTextField;
    private JTextField nextOfKin1NationalIdNumberTextField;
    private JTextField nextOfKin2NameTextField;
    private JTextField nextOfKin2NationalIdNumberTextField;
    private JTextField nextOfKin3NameTextField;
    private JTextField nextOfKin3NationalIdNumberTextField;
    private JCheckBox counsellingCheckBox;
    private JCheckBox freeEscortCheckBox;
    private JCheckBox freeDeliveryCheckBox;
    private JLabel deptLabel;
    private JLabel rateLabel;
    private JLabel balanceLabel;
    private String username;
    private String password;

    public MfaumeMicroFinanceBank3() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("MFAUME MICROFINANCE BANK");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create panel for title
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        JLabel titleLabel = new JLabel("MFAUME MICROFINANCE BANK");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(titleLabel);

        // Create panel for subtitle
        JPanel subtitlePanel = new JPanel();
        subtitlePanel.setLayout(new FlowLayout());
        JLabel subtitleLabel = new JLabel("<html><u><font color='red'><b>The Bank That Cares</b></font></u></html>");
        subtitleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        subtitleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 30));
        subtitlePanel.add(subtitleLabel);

        // Create panel for login form
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(0, 2));
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameTextField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new LoginButtonListener(usernameTextField, passwordField));
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameTextField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(new JLabel(""));
        loginPanel.add(loginButton);

        // Create panel for registration form
        JPanel registrationPanel = new JPanel();
        registrationPanel.setLayout(new GridLayout(0, 2));
        JLabel nameLabel = new JLabel("Name:");
        nameTextField = new JTextField();
        JLabel middleNameLabel = new JLabel("Middle Name:");
        middleNameTextField = new JTextField();
        JLabel surnameLabel = new JLabel("Surname:");
        surnameTextField = new JTextField();
        JLabel accountNumberLabel = new JLabel("Account Number:");
        accountNumberTextField = new JTextField();
        JLabel nationalIdNumberLabel = new JLabel("National ID Number:");
        nationalIdNumberTextField = new JTextField();
        JLabel dateOfBirthLabel = new JLabel("Date of Birth:");
        dateOfBirthTextField = new JTextField();
        JLabel genderLabel = new JLabel("Gender:");
        String[] genders = {"Male", "Female"};
        genderComboBox = new JComboBox<>(genders);
        JLabel locationNameLabel = new JLabel("Location Name:");
        locationNameTextField = new JTextField();
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new RegisterButtonListener());
        registrationPanel.add(nameLabel);
        registrationPanel.add(nameTextField);
        registrationPanel.add(middleNameLabel);
        registrationPanel.add(middleNameTextField);
        registrationPanel.add(surnameLabel);
        registrationPanel.add(surnameTextField);
        registrationPanel.add(accountNumberLabel);
        registrationPanel.add(accountNumberTextField);
        registrationPanel.add(nationalIdNumberLabel);
        registrationPanel.add(nationalIdNumberTextField);
        registrationPanel.add(dateOfBirthLabel);
        registrationPanel.add(dateOfBirthTextField);
        registrationPanel.add(genderLabel);
        registrationPanel.add(genderComboBox);
        registrationPanel.add(locationNameLabel);
        registrationPanel.add(locationNameTextField);
        registrationPanel.add(new JLabel(""));
        registrationPanel.add(registerButton);

        // Create panel for loan form
        JPanel loanPanel = new JPanel();
        loanPanel.setLayout(new GridLayout(0, 2));
        JLabel loanAmountLabel = new JLabel("Loan Amount:");
        loanAmountTextField = new JTextField();
        JLabel nextOfKin1NameLabel = new JLabel("Next of Kin 1 Name:");
        nextOfKin1NameTextField = new JTextField();
        JLabel nextOfKin1NationalIdNumberLabel = new JLabel("Next of Kin 1 National ID Number:");
        nextOfKin1NationalIdNumberTextField = new JTextField();
        JLabel nextOfKin2NameLabel = new JLabel("Next of Kin 2 Name:");
        nextOfKin2NameTextField = new JTextField();
        JLabel nextOfKin2NationalIdNumberLabel = new JLabel("Next of Kin 2 National ID Number:");
        nextOfKin2NationalIdNumberTextField = new JTextField();
        JLabel nextOfKin3NameLabel = new JLabel("Next of Kin 3 Name:");
        nextOfKin3NameTextField = new JTextField();
        JLabel nextOfKin3NationalIdNumberLabel = new JLabel("Next of Kin 3 National ID Number:");
        nextOfKin3NationalIdNumberTextField = new JTextField();
        JButton applyForLoanButton = new JButton("Apply for Loan");
       
        loanPanel.add(loanAmountLabel);
        loanPanel.add(loanAmountTextField);
        loanPanel.add(nextOfKin1NameLabel);
        loanPanel.add(nextOfKin1NameTextField);
        loanPanel.add(nextOfKin1NationalIdNumberLabel);
        loanPanel.add(nextOfKin1NationalIdNumberTextField);
        loanPanel.add(nextOfKin2NameLabel);
        loanPanel.add(nextOfKin2NameTextField);
        loanPanel.add(nextOfKin2NationalIdNumberLabel);
        loanPanel.add(nextOfKin2NationalIdNumberTextField);
        loanPanel.add(nextOfKin3NameLabel);
        loanPanel.add(nextOfKin3NameTextField);
        loanPanel.add(nextOfKin3NationalIdNumberLabel);
        loanPanel.add(nextOfKin3NationalIdNumberTextField);
        loanPanel.add(new JLabel(""));
        loanPanel.add(applyForLoanButton);

        // Create panel for free services
        JPanel freeServicesPanel = new JPanel();
        freeServicesPanel.setLayout(new GridLayout(0, 2));
        counsellingCheckBox = new JCheckBox("Counselling on how to invest money");
        freeEscortCheckBox = new JCheckBox("Free Escort for large amount of money");
        freeDeliveryCheckBox = new JCheckBox("Free Delivery of money at your door step");
        freeServicesPanel.add(counsellingCheckBox);
        freeServicesPanel.add(freeEscortCheckBox);
        freeServicesPanel.add(freeDeliveryCheckBox);

        // Create panel for dept and rate
        JPanel deptAndRatePanel = new JPanel();
        deptAndRatePanel.setLayout(new GridLayout(0, 2));
        JLabel deptTextLabel = new JLabel("Dept:");
        deptLabel = new JLabel("0");
        JLabel rateTextLabel = new JLabel("Rate:");
        rateLabel = new JLabel("0");
        JLabel balanceTextLabel = new JLabel("Balance:");
        balanceLabel = new JLabel("0");
        deptAndRatePanel.add(deptTextLabel);
        deptAndRatePanel.add(deptLabel);
        deptAndRatePanel.add(rateTextLabel);
        deptAndRatePanel.add(rateLabel);
        deptAndRatePanel.add(balanceTextLabel);
        deptAndRatePanel.add(balanceLabel);

        // Add panels to frame
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(subtitlePanel, BorderLayout.CENTER);
        frame.add(loginPanel, BorderLayout.EAST);
        frame.add(registrationPanel, BorderLayout.WEST);
        frame.add(loanPanel, BorderLayout.SOUTH);
        frame.add(freeServicesPanel, BorderLayout.SOUTH);
        frame.add(deptAndRatePanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    private class LoginButtonListener implements ActionListener {
        private JTextField usernameTextField;
        private JPasswordField passwordField;

        public LoginButtonListener(JTextField usernameTextField, JPasswordField passwordField) {
            this.usernameTextField = usernameTextField;
            this.passwordField = passwordField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            username = usernameTextField.getText();
            password = new String(passwordField.getPassword());

            // Validate login credentials
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all login credentials");
                return;
            }

            // Login user
            JOptionPane.showMessageDialog(frame, "Login successful");

            // Create new frame for loan application
            JFrame loanFrame = new JFrame("Loan Application");
            loanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loanFrame.setLayout(new BorderLayout());

            // Create panel for loan form
            JPanel loanPanel = new JPanel();
            loanPanel.setLayout(new GridLayout(0, 2));
            JLabel loanAmountLabel = new JLabel("Loan Amount:");
            JTextField loanAmountTextField = new JTextField();
            JLabel nextOfKin1NameLabel = new JLabel("Next of Kin 1 Name:");
            JTextField nextOfKin1NameTextField = new JTextField();
            JLabel nextOfKin1NationalIdNumberLabel = new JLabel("Next of Kin 1 National ID Number:");
            JTextField nextOfKin1NationalIdNumberTextField = new JTextField();
            JLabel nextOfKin2NameLabel = new JLabel("Next of Kin 2 Name:");
            JTextField nextOfKin2NameTextField = new JTextField();
            JLabel nextOfKin2NationalIdNumberLabel = new JLabel("Next of Kin 2 National ID Number:");
            JTextField nextOfKin2NationalIdNumberTextField = new JTextField();
            JLabel nextOfKin3NameLabel = new JLabel("Next of Kin 3 Name:");
            JTextField nextOfKin3NameTextField = new JTextField();
            JLabel nextOfKin3NationalIdNumberLabel = new JLabel("Next of Kin 3 National ID Number:");
            JTextField nextOfKin3NationalIdNumberTextField = new JTextField();
            JButton applyForLoanButton = new JButton("Apply for Loan");
            applyForLoanButton.addActionListener(new ApplyForLoanButtonListener(loanAmountTextField, nextOfKin1NameTextField, nextOfKin1NationalIdNumberTextField, nextOfKin2NameTextField, nextOfKin2NationalIdNumberTextField, nextOfKin3NameTextField, nextOfKin3NationalIdNumberTextField));
            loanPanel.add(loanAmountLabel);
            loanPanel.add(loanAmountTextField);
            loanPanel.add(nextOfKin1NameLabel);
            loanPanel.add(nextOfKin1NameTextField);
            loanPanel.add(nextOfKin1NationalIdNumberLabel);
            loanPanel.add(nextOfKin1NationalIdNumberTextField);
            loanPanel.add(nextOfKin2NameLabel);
            loanPanel.add(nextOfKin2NameTextField);
            loanPanel.add(nextOfKin2NationalIdNumberLabel);
            loanPanel.add(nextOfKin2NationalIdNumberTextField);
            loanPanel.add(nextOfKin3NameLabel);
            loanPanel.add(nextOfKin3NameTextField);
            loanPanel.add(nextOfKin3NationalIdNumberLabel);
            loanPanel.add(nextOfKin3NationalIdNumberTextField);
            loanPanel.add(new JLabel(""));
            loanPanel.add(applyForLoanButton);

            // Add panel to frame
            loanFrame.add(loanPanel, BorderLayout.CENTER);

            loanFrame.pack();
            loanFrame.setVisible(true);
        }
    }

    private class RegisterButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameTextField.getText();
            String middleName = middleNameTextField.getText();
            String surname = surnameTextField.getText();
            String accountNumber = accountNumberTextField.getText();
            String nationalIdNumber = nationalIdNumberTextField.getText();
            String dateOfBirth = dateOfBirthTextField.getText();
            String gender = (String) genderComboBox.getSelectedItem();
            String locationName = locationNameTextField.getText();

            // Validate registration details
            if (name.isEmpty() || middleName.isEmpty() || surname.isEmpty() || accountNumber.isEmpty() || nationalIdNumber.isEmpty() || dateOfBirth.isEmpty() || locationName.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all registration details");
                return;
            }

            // Register user
            JOptionPane.showMessageDialog(frame, "Registration successful");
        }
    }

    private class ApplyForLoanButtonListener implements ActionListener {
        private JTextField loanAmountTextField;
        private JTextField nextOfKin1NameTextField;
        private JTextField nextOfKin1NationalIdNumberTextField;
        private JTextField nextOfKin2NameTextField;
        private JTextField nextOfKin2NationalIdNumberTextField;
        private JTextField nextOfKin3NameTextField;
        private JTextField nextOfKin3NationalIdNumberTextField;

        public ApplyForLoanButtonListener(JTextField loanAmountTextField, JTextField nextOfKin1NameTextField, JTextField nextOfKin1NationalIdNumberTextField, JTextField nextOfKin2NameTextField, JTextField nextOfKin2NationalIdNumberTextField, JTextField nextOfKin3NameTextField, JTextField nextOfKin3NationalIdNumberTextField) {
            this.loanAmountTextField = loanAmountTextField;
            this.nextOfKin1NameTextField = nextOfKin1NameTextField;
            this.nextOfKin1NationalIdNumberTextField = nextOfKin1NationalIdNumberTextField;
            this.nextOfKin2NameTextField = nextOfKin2NameTextField;
            this.nextOfKin2NationalIdNumberTextField = nextOfKin2NationalIdNumberTextField;
            this.nextOfKin3NameTextField = nextOfKin3NameTextField;
            this.nextOfKin3NationalIdNumberTextField = nextOfKin3NationalIdNumberTextField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String loanAmount = loanAmountTextField.getText();
            String nextOfKin1Name = nextOfKin1NameTextField.getText();
            String nextOfKin1NationalIdNumber = nextOfKin1NationalIdNumberTextField.getText();
            String nextOfKin2Name = nextOfKin2NameTextField.getText();
            String nextOfKin2NationalIdNumber = nextOfKin2NationalIdNumberTextField.getText();
            String nextOfKin3Name = nextOfKin3NameTextField.getText();
            String nextOfKin3NationalIdNumber = nextOfKin3NationalIdNumberTextField.getText();

            // Validate loan application details
            if (loanAmount.isEmpty() || nextOfKin1Name.isEmpty() || nextOfKin1NationalIdNumber.isEmpty() || nextOfKin2Name.isEmpty() || nextOfKin2NationalIdNumber.isEmpty() || nextOfKin3Name.isEmpty() || nextOfKin3NationalIdNumber.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all loan application details");
                return;
            }

            // Check if user has another debt in the bank
            // For simplicity, this check is not implemented

            // Calculate dept and rate
            int loanAmountInt = Integer.parseInt(loanAmount);
            double dept = loanAmountInt;
            double rate = loanAmountInt * 0.2;

            // Update dept and rate labels
            deptLabel.setText(String.valueOf(dept));
            rateLabel.setText(String.valueOf(rate));

            // Display loan application result
            JOptionPane.showMessageDialog(frame, "Loan application successful. Your dept is " + dept + " and your rate is " + rate);

            // Calculate balance
            double balance = dept - rate;
            balanceLabel.setText(String.valueOf(balance));

            // Display receipt
            String receipt = "Receipt\n";
            receipt += "Dept: " + dept + "\n";
            receipt += "Rate: " + rate + "\n";
            receipt += "Balance: " + balance + "\n";
            JOptionPane.showMessageDialog(frame, receipt);
        }
    }

    public static void main(String[] args) {
        new MfaumeMicroFinanceBank3();
    }
}

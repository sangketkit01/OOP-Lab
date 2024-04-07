package Lab11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class problem1 implements ActionListener {

    private JFrame frame;
    private JTextField num1Field;
    private JTextField num2Field;
    private JButton plusButton, minosButton, timesButton, divideButton;
    private JLabel outputLabel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    problem1 window = new problem1();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public problem1() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 650, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel intLabel = new JLabel("กรุณากำหนดจำนวนเต็ม");
        intLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        intLabel.setBounds(46, 64, 148, 17);
        frame.getContentPane().add(intLabel);

        num1Field = new JTextField();
        num1Field.setBounds(92, 109, 162, 32);
        frame.getContentPane().add(num1Field);
        num1Field.setColumns(10);

        num2Field = new JTextField();
        num2Field.setColumns(10);
        num2Field.setBounds(315, 109, 162, 32);
        frame.getContentPane().add(num2Field);

        plusButton = new JButton("+");
        plusButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
        plusButton.setForeground(new Color(255, 0, 128));
        plusButton.setBounds(93, 201, 85, 44);
        frame.getContentPane().add(plusButton);
        plusButton.addActionListener(this);

        minosButton = new JButton("-");
        minosButton.setForeground(new Color(255, 0, 128));
        minosButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
        minosButton.setBounds(212, 201, 85, 44);
        frame.getContentPane().add(minosButton);
        minosButton.addActionListener(this);

        timesButton = new JButton("*");
        timesButton.setForeground(new Color(255, 0, 128));
        timesButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
        timesButton.setBounds(340, 201, 85, 44);
        frame.getContentPane().add(timesButton);
        timesButton.addActionListener(this);

        divideButton = new JButton("/");
        divideButton.setForeground(new Color(255, 0, 128));
        divideButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
        divideButton.setBounds(459, 201, 85, 44);
        frame.getContentPane().add(divideButton);
        divideButton.addActionListener(this);

        outputLabel = new JLabel("");
        outputLabel.setForeground(new Color(128, 0, 255));
        outputLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
        outputLabel.setBounds(247, 342, 200, 71);
        frame.getContentPane().add(outputLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (num1Field.getText().isEmpty() || num2Field.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid input");
        } else {
            try {
                if (e.getSource() == plusButton) {
                    outputLabel.setText(String.format("%.2f",
                            Double.parseDouble(num1Field.getText()) + Double.parseDouble(num2Field.getText())));

                } else if (e.getSource() == minosButton) {
                    outputLabel.setText(String.format("%.2f",
                            Double.parseDouble(num1Field.getText()) - Double.parseDouble(num2Field.getText())));
                } else if (e.getSource() == timesButton) {
                    outputLabel.setText(String.format("%.2f",
                            Double.parseDouble(num1Field.getText()) * Double.parseDouble(num2Field.getText())));
                } else if (e.getSource() == divideButton) {

                    double x = ((double) Integer.parseInt(num1Field.getText())
                            / (double) Integer.parseInt(num2Field.getText()));
                    outputLabel.setText(String.format("%.2f", x));
                }
            } catch (ArithmeticException arith) {
                JOptionPane.showMessageDialog(null, "Cannot divide by zero");
            } catch (NumberFormatException format) {
                JOptionPane.showMessageDialog(null, "Please enter an integer");
            }
        }
    }
}

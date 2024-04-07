package Lab12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class problem01 implements ActionListener {

    private JFrame frame;
    private JTextField nameField;
    private JTextField idField;
    private JButton submitButton;
    private JRadioButton csRadio, itRadio, gisRadio;
    private ButtonGroup buttonGroup;
    private boolean isSelected = true;
    private String major = "";
    private JComboBox<String> yearBox;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    problem01 window = new problem01();
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
    public problem01() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        Font font = new Font("Tahoma", Font.PLAIN, 14);
        UIManager.put("OptionPane.messageFont", font);

        frame = new JFrame();
        frame.setBounds(100, 100, 838, 502);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel nameLabel = new JLabel("ชื่อ-สกุล");
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        nameLabel.setBounds(43, 75, 65, 43);
        frame.getContentPane().add(nameLabel);

        nameField = new JTextField();
        nameField.setFont(new Font("Tahoma", Font.PLAIN, 12));
        nameField.setBounds(140, 86, 222, 26);
        frame.getContentPane().add(nameField);
        nameField.setColumns(10);

        idField = new JTextField();
        idField.setFont(new Font("Tahoma", Font.PLAIN, 12));
        idField.setColumns(10);
        idField.setBounds(140, 131, 222, 26);
        frame.getContentPane().add(idField);

        JLabel idLabel = new JLabel("รหัสนักศึกษา");
        idLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        idLabel.setBounds(43, 120, 78, 43);
        frame.getContentPane().add(idLabel);

        JLabel majorLabel = new JLabel("หลักสูตร");
        majorLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        majorLabel.setBounds(43, 168, 78, 43);
        frame.getContentPane().add(majorLabel);

        csRadio = new JRadioButton("CS");
        csRadio.setFont(new Font("Tahoma", Font.PLAIN, 12));
        csRadio.setBounds(140, 181, 54, 21);
        frame.getContentPane().add(csRadio);

        itRadio = new JRadioButton("IT");
        itRadio.setFont(new Font("Tahoma", Font.PLAIN, 12));
        itRadio.setBounds(215, 181, 54, 21);
        frame.getContentPane().add(itRadio);

        gisRadio = new JRadioButton("GIS");
        gisRadio.setFont(new Font("Tahoma", Font.PLAIN, 12));
        gisRadio.setBounds(289, 180, 65, 21);
        frame.getContentPane().add(gisRadio);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(itRadio);
        buttonGroup.add(csRadio);
        buttonGroup.add(gisRadio);

        yearBox = new JComboBox<>();
        yearBox.setBounds(140, 221, 96, 21);
        frame.getContentPane().add(yearBox);
        for (int i = 1; i <= 4; i++) {
            yearBox.addItem(String.valueOf(i));
        }

        JLabel yearLabel = new JLabel("ชั้นปีที่");
        yearLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        yearLabel.setBounds(43, 211, 78, 43);
        frame.getContentPane().add(yearLabel);

        ImageIcon pic = new ImageIcon("C:\\Coding\\KKU Java Eclipse\\OOP_6633804887\\src\\Lab12\\picture.jpg");
        Image newPic = pic.getImage().getScaledInstance(371, 300, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newPic);

        JLabel picLabel = new JLabel(newIcon);
        picLabel.setBounds(191, 266, 371, 300);
        frame.getContentPane().add(picLabel);

        submitButton = new JButton("บันทึก");
        submitButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        submitButton.setBounds(640, 387, 135, 57);
        frame.getContentPane().add(submitButton);

        submitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Enumeration<AbstractButton> radios = buttonGroup.getElements();
        while (radios.hasMoreElements()) {
            JRadioButton radio = (JRadioButton) radios.nextElement();
            if (radio.isSelected()) {
                isSelected = false;
                major = radio.getText();
            }
        }

        if (e.getSource() == submitButton) {
            if (nameField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "กรุณากรอกชื่อ", "ข้อมูลไม่ครบ", JOptionPane.WARNING_MESSAGE);
            } else if (idField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "กรุณากรอกรหัสนักศึกษา", "ข้อมูลไม่ครบ",
                        JOptionPane.WARNING_MESSAGE);
            } else if (isSelected) {
                JOptionPane.showMessageDialog(null, "กรุณาเลือกหลักสูตร", "ข้อมูลไม่ครบ",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    FileWriter writer = new FileWriter(
                            "C:\\Coding\\KKU Java Eclipse\\OOP_6633804887\\src\\Lab12\\student.txt", true);
                    writer.write(String.format("%s,%s,%s,%s%n", idField.getText(), nameField.getText(), major,
                            yearBox.getSelectedItem()));
                    JOptionPane.showMessageDialog(null, "บันทึกข้อมูลสำเร็จ");
                    nameField.setText("");
                    idField.setText("");
                    buttonGroup.clearSelection();
                    yearBox.setSelectedIndex(0);
                    isSelected = true;
                    writer.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}

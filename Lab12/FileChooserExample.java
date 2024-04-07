package Lab12;

import javax.swing.*;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileChooserExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Chooser Example");
        frame.setBounds(100, 100, 1000, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Choose File");
        button.setBounds(50, 50, 100, 50);

        JLabel label = new JLabel("Hahaha");
        label.setBounds(50, 101, 300, 300);
        frame.add(label);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a file chooser
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setCurrentDirectory(new File("C:/"));

                // Show open dialog; this method blocks until the dialog is closed
                int result = fileChooser.showOpenDialog(null);

                // If the user chooses a file, get the path of the selected file
                if (result == JFileChooser.APPROVE_OPTION) {
                    String isImage = fileChooser.getSelectedFile().toString();
                    if (isImage.endsWith(".jpg") || isImage.endsWith(".jpeg") || isImage.endsWith("png")
                            || isImage.endsWith("gif")) {

                        Path sourcePath = Paths.get(fileChooser.getSelectedFile().getAbsolutePath());
                        Path destinationFolder = Paths.get("C:\\Coding\\KKU Java Eclipse\\OOP_6633804887\\src\\Lab12");

                        Path destinationPath = destinationFolder.resolve(sourcePath.getFileName());
                        try {
                            Files.copy(sourcePath, destinationPath);
                            ImageIcon icon = new ImageIcon("foodpic2.jpg");
                            Image image = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
                            ImageIcon newIcon = new ImageIcon(image);
                            label.setIcon(newIcon);
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }

                    } else {
                        System.out.println("It's not an image idiot");
                    }
                    // String[] filePath =
                    // fileChooser.getSelectedFile().getAbsolutePath().split("\\\\");
                    // System.out.println(fileChooser.getSelectedFile().getAbsolutePath());
                    // System.out.println(filePath[filePath.length - 1]);
                }
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}

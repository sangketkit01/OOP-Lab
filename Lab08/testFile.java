package Lab08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testFile {
    public static void main(String[] args) {
        File file = new File("C:/Coding/KKU Java Eclipse/OOP_6633804887/src/Lab08");
        if (file.exists() && file.isDirectory()) {       
            for (File sub_file : file.listFiles()) {
                if (sub_file.getName().equals("Computer.java")) {
                    Scanner scan;
                    try {
                        scan = new Scanner(new File(sub_file.getPath()));
                        while (scan.hasNext()) {
                            System.out.println(scan.nextLine());
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}

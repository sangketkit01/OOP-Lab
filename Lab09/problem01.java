package Lab09;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class problem01 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.print("Enter dirrectory name : ");
        String directoryName = kbd.nextLine();
        File directory = new File("C:/Coding/KKU Java Eclipse/OOP_6633804887/src/Lab09/" + directoryName);
        if (!directory.exists()) {
            directory.mkdirs();
        }
            System.out.print("Enter filename  : ");
            String fileName = kbd.nextLine();
            try {
                File file = new File(directory.getPath() + "/" + dateFormat.format(new Date()).split(" ")[1].replace(":", "") + "-" + fileName);
                file.createNewFile();
                FileWriter writer = new FileWriter(file.getPath());
                writer.write(dateFormat.format(new Date()));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        
        kbd.close();

    }
}

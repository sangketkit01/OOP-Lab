package Lab09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        int count = 1;
        @SuppressWarnings("resource")
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter directory name : ");
        String directoryName = kbd.nextLine();
        File directory = new File("C:/Coding/KKU Java Eclipse/OOP_6633804887/src/Lab09/"+directoryName);

        if(!directory.exists()){
            System.out.printf("Directory '%s' is not found.%n",directoryName);
        }else{
            if(directory.listFiles().length == 0){
                System.out.println("Empty Directory.");
            }else{
                System.out.println("=== Choose file ===");
                for(File file : directory.listFiles()){
                    System.out.println(count + ". " +file.getName());
                    count++;
                }
                for(;;){
                    System.out.print("Enter file number : ");
                    int fileNumber = kbd.nextInt();
                    if(fileNumber < 0 || fileNumber > directory.listFiles().length){
                        System.out.println("Select number from 1 to " + directory.listFiles().length);
                    }
                    else{
                        try {
                            @SuppressWarnings("resource")
                            Scanner reader = new Scanner(new File(directory.listFiles()[fileNumber-1].getPath()));
                            while(reader.hasNext()){
                                System.out.println(reader.nextLine());
                            }
                            break;
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            
        }
        kbd.close();
        
    }
}

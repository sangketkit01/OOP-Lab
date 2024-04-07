package Lab04;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        try (Scanner kbd = new Scanner(System.in)) {
            for(;;){
                System.out.print("Enter real number[1-10] : ");
                double number = kbd.nextDouble();
                if(number < 0.0 || number >= 10.00){
                    continue;
                }else{
                    System.out.println("Pronounce:"+readNumber(String.valueOf(number)));
                    break;
                }
            }
            kbd.close();
        }
        
    }
    public static String readNumber(String s){
        String result = "";
        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i) == '.'){
                result += "point ";
            }else{
                result += number[Integer.valueOf(String.valueOf(s.charAt(i)))]+" ";
            }
        }
        return result;
    }
}

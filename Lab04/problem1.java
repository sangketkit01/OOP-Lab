package Lab04;

import java.util.Arrays;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter list of number: ");
        String[] number = kbd.nextLine().split(" ");
        Arrays.sort(number);
        countNumber(number);   
        kbd.close();     

    }

     public static void countNumber(String[] s) {
        Arrays.sort(s);
        String prev = "";
        int count = 0;
        int countMax = 0;
        String num = "";
        for(int i = 0 ; i<s.length;i++){
            if(!prev.equals(s[i])){
                count = 0;
            }else{
                if(count > countMax){
                    countMax = count;
                }
                num = prev;
                count++;
                countMax ++;
            }
            prev = s[i];
        }
        System.out.println("Hehe "+num+" "+countMax);
    }
    /*  public static boolean in(String s , int[][] arr){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j< arr.length ; j++){
                if(s.equals(String.valueOf(arr[i][j]))){
                    return true;
                }
            }
        }
        return false;
    } */
    
}

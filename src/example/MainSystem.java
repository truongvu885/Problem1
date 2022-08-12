package example;

import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        System.out.print("Input string: ");
        String str = new Scanner(System.in).nextLine();
        str = str.trim();
        str = str.replaceAll("( )+", " ");
        String [] arr = str.split(" ");

        int max = arr[0].length();
        String strMax = arr[0];
        for (String string : arr) {
            if(string.length()>max) {
                max = string.length();
                strMax = string;
            }
        }
        System.out.println(strMax);
    }
}

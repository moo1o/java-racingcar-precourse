package utils;

import java.util.Scanner;

public class InputApi {
    public static String input(){
        Scanner sc = new Scanner(System.in);
        String ret = sc.nextLine();
        return ret;
    }
}

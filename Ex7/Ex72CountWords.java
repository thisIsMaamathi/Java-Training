package Ex7;

import java.util.Scanner;

public class Ex72CountWords {

    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        str=sc.nextLine();
 
        String[] strArray = str.split(" ");
        System.out.println("Number of words in a string = " + strArray.length);
    }
}


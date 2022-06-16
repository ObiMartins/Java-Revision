import revision.Basic1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        Basic1 bb = new Basic1();
        System.out.println(bb.evenOddNumber(num));
    }
}
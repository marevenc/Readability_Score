package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String read = scanner.nextLine();
        if(read.length() <= 100){
            System.out.println("EASY");
        } else {
            System.out.println("HARD");
        }
    }
}

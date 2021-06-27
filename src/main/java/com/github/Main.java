package com.github;

import java.util.Random;
import java.util.Scanner;

public class Main {
static Scanner scan = new Scanner(System.in);
static Random random = new Random();

    public static void main(String[] args) {
        String[] words =  {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                           "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                           "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"    };
        int rand = random.nextInt(24);
        String text;
        boolean b = true;
        int l;

        while(true) {
            System.out.println(" Угадайте слово: ");
            text = scan.nextLine();

            if (words[rand].length() > text.length()) {
                l = text.length();
            } else { l = words[rand].length(); }

            for (int i = 0; i < l; i++) {
                if (words[rand].charAt(i) == text.charAt(i)) {
                    System.out.print(text.charAt(i));
                } else { System.out.print("#"); }
            }

            if (text.equals(words[rand])) {
                System.out.println("  Вы угадали слово: " + words[rand]);
                break;
            } else {
                for (int i = 0; i < 15; i++) { System.out.print("#");}
            }
        }
        scan.close();
    }
}

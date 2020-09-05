package by.homework.arrays;

public class Palindrom {

    public static boolean isPalindrom(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zа-я]", "");

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            if (ch[i] != ch[ch.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

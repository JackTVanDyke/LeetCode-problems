package easy;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Hello", "Goodbye"));
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        return Arrays.equals(Arrays.stream(s.split("")).sorted().toArray(), Arrays.stream(t.split("")).sorted().toArray());
    }
}

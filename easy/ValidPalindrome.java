package easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("Race a car"));
        System.out.println(isPalindrome(" "));

    }

    public static boolean isPalindrome(String s) {
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                content.append(s.charAt(i));
            }
        }
        content = new StringBuilder(content.toString().toLowerCase());
        String value = content.toString();
        return value.equals(content.reverse().toString());
    }
}

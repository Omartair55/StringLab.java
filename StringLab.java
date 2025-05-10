import java.util.Scanner;


public class StringLab {
    public static void main(String[] args) {

        String str = " Welcome to the Java String Lab! ";
        System.out.println("Original String: \"" + str + "\"");

        System.out.println("length: " + str.length());

        System.out.println("Character at index 7: " + str.charAt(7));

        System.out.println("Substring 'Java': " + str.substring(17, 21));

        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("index of 'Java': " + str.indexOf("Java"));

        System.out.println("Contains 'Lab': " + str.contains("Lab"));

        System.out.println("Replace 'Java' with 'Java Programming': " + str.replace("Java", "Java Programming"));

        System.out.println("Split by space:");
        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isEmpty())
            System.out.println(word);
        }

        System.out.println("Trimmed String: \"" + str.trim() + "\"");


        String compareStr = "java string lab!";
        System.out.println("Equals: " + str.equals(compareStr));
        System.out.println("Equals Ignore case: " + str.trim().toLowerCase().contains(compareStr.toLowerCase()));

        int vowelCount = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if ("aeiou".indexOf(ch) !=-1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        String word = "racecar";
        int start = 0, end = word.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                isPalindrome = false;
            }
            start++;
            end--;
        }
        System.out.println(word + "is palindrome? " + isPalindrome);

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Enter a sentence containing 'Java': ");
            input = scanner.nextLine();
        } while (!input.contains("Java"));
        System.out.println("Thank you!");


        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        sb.delete(sb.indexOf("Learning"), sb.indexOf("learing") + "learning".length());
        sb.reverse();
        System.out.println("StringBuilder result: " + sb);

        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        sbf.append(" -Java");
        sbf.insert(sbf.indexOf("Lab") + 3, " is cool");
        sbf.delete(sbf.indexOf("Java"), sbf.indexOf("Java") + 4);
        sbf.reverse();
        System.out.println("StringBuffer result: " + sbf);

        scanner.close();
    }
}
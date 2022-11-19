import java.util.Scanner;
import java.util.*;

class stringQuestion {

    // 1 Reverse a STRING
    void stringReverse() {

        // Using STRING BULDER
        StringBuilder sb = new StringBuilder("hellouit");

        for (int i = 0; i < sb.length() / 2; i++) {
            int start = i;
            int end = sb.length() - 1 - i;

            char startChar = sb.charAt(start);
            char endChar = sb.charAt(end);

            sb.setCharAt(start, endChar);
            sb.setCharAt(end, startChar);
        }
        System.out.println(sb);

    }

    // 2 Check Palindrome
    void checkPalindrome(String s) {

        // APPROACH 1
        /*
         * char[] ch = new char[s.length()];
         * 
         * int i=0;
         * int e=ch.length-1;
         * 
         * while(i<e) {
         * if(ch[i]!=ch[e]) {
         * return false;
         * }
         * else {
         * i++;
         * e--;
         * }
         * }
         * return true;
         */

        s = s.toLowerCase();
        StringBuilder new1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                new1.append(s.charAt(i));
            }
        }
        for (int i = 0; i < new1.length(); i++) {
            if (new1.charAt(i) != new1.charAt(new1.length() - i - 1)) {
                System.out.println("NOT");
            }
        }
        System.out.println("YES");

    }

    // 4 Replace Spaces
    void replaceSpaces(String s) {

        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                temp.append("@40");
            } else {
                temp.append((s.charAt(i)));
            }
        }
        System.out.println(temp);
    }

    // 5 Maximum Occurrences Character in String
    void maxOccurrencesCharacter(String s) {

        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[26];

        // Construct character count array from the input
        // string.
        int len = s.length();
        for (int i = 0; i < len; i++)
            count[s.charAt(i)]++;

        int max = -1; // Initialize max count
        char result = ' '; // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[s.charAt(i)]) {
                max = count[s.charAt(i)];
                result = s.charAt(i);
            }
        }

        System.out.println(result);

    }

}

public class stringBasics {

    void stringBascis() {

        String firstName = "Yash";
        String lastName = "Goyal";

        String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // To Calculate Length of String
        System.out.println(fullName.length());

        // charAt TO print Char
        for (int i = 0; i < fullName.length(); i++) {
            // System.out.println(fullName.charAt(i));
        }

        // Compare TO String
        String s1 = "Rohan";
        String s2 = "Gupta";
        if (s1.compareTo(s2) == 0) {
            // System.out.println("String are Equal");
        } else {
            // System.out.println("String are Not equal");
        }
    }

    void stringLength() {

        String str = "sample String";
        int i = 0;
        for (char c : str.toCharArray()) {
            System.out.print(c);
            i++;
        }
        System.out.println("Length of the given string ::" + i);

    }

    public static void main(String[] args) {

        //
        stringBasics jb = new stringBasics();
        // jb.stringBascis();
        // jb.stringLength();

        stringQuestion sq = new stringQuestion();
        // sq.stringReverse();
        // sq.checkPalindrome("heelo");
        // sq.maxOccurrencesCharacter("output");
        sq.replaceSpaces("My name is Yash Goyal");

    }
}

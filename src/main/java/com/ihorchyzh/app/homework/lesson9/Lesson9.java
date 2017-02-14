package com.ihorchyzh.app.homework.lesson9;

/**
 * Created by ihorchyzh on 2/14/17.
 */
public class Lesson9 {

    public String palindromeVer1(String stringValue) {
        stringValue = stringValue.toLowerCase();
        String result = null;
        for (int i = 0; i < stringValue.length() / 2; i++) {
            if (stringValue.charAt(i) == stringValue.charAt(stringValue.length() - i - 1)) {
                result = "Palindrome";
            } else {
                result = "Not palindrome";
            }
        }
        return result;
    }

    public String palindromeVer2(char[] charArray) {
        String result = null;
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            if (Character.toLowerCase(charArray[start]) == Character.toLowerCase(charArray[end])) {
                result = "Palindrome";
            } else {
                result = "Not palindrome";
            }
            ++start;
            --end;
        }
        return result;
    }

    public String palindromeVer3(String stringValue) {
        stringValue = stringValue.toLowerCase();
        String result = null;
        if (stringValue.equals(new StringBuilder(stringValue).reverse().toString())) {
            result = "Palindrome";
        } else {
            result = "Not palindrome";
        }
        return result;
    }

    public String palindromeVer4(String stringValue) {
        String result = null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stringValue);
        stringBuilder.reverse();
        if (stringValue.equalsIgnoreCase(stringBuilder.toString())) {
            result = "Palindrome";
        } else {
            result = "Not palindrome";
        }
        return result;
    }

    public String palindromeVer5(String stringValue) {
        String result = null;
        String reverse = "";
        for (int i = stringValue.length() - 1; i >= 0; i--) {
            reverse = reverse + stringValue.charAt(i);
        }
        if (stringValue.equalsIgnoreCase(reverse))
            result = "Palindrome";
        else
            result = "Not palindrome";
        return result;
    }

}
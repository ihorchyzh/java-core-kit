package com.ihorchyzh.app.homework.lesson9;

/**
 * Created by ihorchyzh on 2/14/17.
 */
public class Palindrome {

    public String palindromeCharAtMethod(String stringValue) {
        stringValue = stringValue.toLowerCase();
        String result = "";
        for (int i = 0; i < stringValue.length() / 2; i++) {
            if (stringValue.charAt(i) == stringValue.charAt(stringValue.length() - i - 1)) {
                result = "Palindrome";
            } else {
                result = "Not palindrome";
            }
        }
        return result;
    }

    public String palindromeToLowerCaseMethod(char[] charArray) {
        String result = "";
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

    public String palindromeReverseMethod(String stringValue) {
        stringValue = stringValue.toLowerCase();
        String result;
        if (stringValue.equals(new StringBuilder(stringValue).reverse().toString())) {
            result = "Palindrome";
        } else {
            result = "Not palindrome";
        }
        return result;
    }

    public String palindromeEqualsIgnoreMethod(String stringValue) {
        String result;
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

    public String palindromeReverseCharAtMethod(String stringValue) {
        String result;
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
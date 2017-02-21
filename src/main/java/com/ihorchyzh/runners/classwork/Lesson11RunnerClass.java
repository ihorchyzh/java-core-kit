package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.homework.lesson9.Palindrome;

import java.io.*;

/**
 * Created by ihorchyzh on 2/20/17.
 */
public class Lesson11RunnerClass {

    public static final String INPUT = "src/test/resources/lesson11Data/input.txt";
    public static final String OUTPUT = "src/test/resources/lesson11Data/output.txt";


    public static void main(String[] args) throws IOException {

//    Read string from input.txt file
//    and write if this string is
//    palindrome or not to output.txt
//    file in same directory
        Palindrome palindrome = new Palindrome();

        System.out.println((palindrome.palindromeCharAtMethod(Lesson11RunnerClass.readFileThrows())).toString());


    }

    public static String readFileThrows() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(INPUT)
        );
        String line;
        String result = "";
        while ((line = bufferedReader.readLine()) != null) {
            result = line;
        }
        bufferedReader.close();
        return result;
    }

    public static void readFileTryCatch() {
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(INPUT));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
    }

    public static void writeFile() throws IOException {
        String firstLine = "The first line";
        String secondLine = "The second line";
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(OUTPUT)));

        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();
    }


}
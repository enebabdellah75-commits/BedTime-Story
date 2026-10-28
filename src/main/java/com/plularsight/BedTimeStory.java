package com.plularsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BedTimeStory {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //asking for whta bed story they want

        System.out.println("eneter bed time story");
        String storyname=scanner.nextLine();

        try {
            // open the file with a BufferedReader
            BufferedReader bufReader = new BufferedReader(new FileReader(filename));

            String input;
            int lineNumber = 1;

            // readLine() returns null at the end of the file
            while ((input = bufReader.readLine()) != null) {
                System.out.println(lineNumber + ". " + input);
                lineNumber++;
            }

            bufReader.close();


        }catch (FileNotFoundException){
            // file name was wrong or file isn't in the project folder
            System.out.println("Sorry, I couldn't find a story named \"" + fileName + "\".");
            throw new RuntimeException();
        }


    }
}

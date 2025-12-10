package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
public static String starStaircase(int height){
    String staircase = "";
    for(int i = 1; i <= height; i++) {
        for(int j = 1; j <= i; j++) {
            staircase += "*";
        }
        if(i != height) staircase += "\n";
    }
    return staircase;
}
          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){
    String staircase = "";
    for(int i = height; i > 0; i--) {
        for(int j = 1; j <= i; j++) {
            staircase += "*";
        }
        if (i != 1) staircase += "\n";
    }
    return staircase;
}
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {
        if(width == 1 || height == 1) return "";
        String box = "";
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                if(i == 0 || i == height-1) {
                    box += "*";
                }
                else if(j == 0 || j == width-1) {
                    box += "*";
                }
                else {
                    box += " ";
                }
            }
            if(i != height-1) box += "\n";
        }
        return box;
    }
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String rectangle = word + "\n";
        if(rows == 1) return word;
        String lastLine = word;
        for(int i = 1; i < rows; i++) {
            String line = "";
            for(int j = 1; j <= word.length(); j++) {
                line += String.valueOf(lastLine.charAt(j % word.length()));
            }
            lastLine = line;
            if(i != rows-1) line += "\n";
            rectangle += line;
        }
        return rectangle;
    }
}
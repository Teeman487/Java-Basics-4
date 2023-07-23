package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//  IO Exception is a Superclass of FileNotFoundException, thats why it overrided FileNotFoundException
public class ThrowsKeyword {
    public static void main(String[] args) throws IOException, InterruptedException {
        // piece of code below will read the code froom the text file
        FileReader fr=null;
        fr = new FileReader("C:\\ProgramFiles\\Test.txt");

        BufferedReader bfr = new BufferedReader(fr);
        System.out.println(bfr.readLine());
        Thread.sleep(5000);


    }
}

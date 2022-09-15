import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.*;

public class filhantering {
    public static void main(String[] args) {
        String file = "intrandom.text";
        BufferedReader inFile = openTextFileReadning(file);
        ArrayList<String> fileContent = readAllText(inFile);
        //DataOutputStream outFile = openBinaryFileForWriting("info.dat");
        //writeTextAsBinary(fileContent);
    }

    private static ArrayList<String> readAllText(BufferedReader inFile) {

    }

    //ska läsa filen med data
    private static BufferedReader openTextFileReadning(String inFile) {
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(inFile);
            br = new BufferedReader(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return br;
    }
}


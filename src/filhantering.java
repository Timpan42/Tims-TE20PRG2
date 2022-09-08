import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.*;

public class filhantering {
    public static void main(String[] args) {
        BufferedWriter inFile = openTextFileReadning ("info.text");
        ArrayList<String> fileContent = readAllText(inFile);
        DataOutputStream outFile = openBinaryFileForWriting("info.dat");
        writeTextAsBinary(fileContent);
    }

    private static void writeTextAsBinary(ArrayList<String> fileContent) {
    }

    private static DataOutputStream openBinaryFileForWriting(String s) {
    }

    private static ArrayList<String> readAllText(BufferedWriter inFile) {
    }

    private static BufferedWriter openTextFileReadning(String fileName) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(in);

        }
    }
}

package Crypterings_program;

import java.io.*;
import java.util.Scanner;

public class Model {
    private char kry_svar;

// ska läsa fillen med datan
    public String fileReader(){
        String fileInput = "krypt_fill.txt";
        String data = null;
        try {
            File input = new File(fileInput);
            Scanner reader = new Scanner(input);
            while (reader.hasNextLine()){
                data = reader.nextLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ingen file eller kunde inte läsa file");
            e.printStackTrace();
        }
        return data;
    }
    public void kryptering (String data){
        char[] chars = data.toCharArray();
        for (int i = 0; i < data.length(); i++) {
            chars[i] = data.charAt(i);
        }
        for (int i = 0; i < chars.length; i++) {

        }
    }

    // ska över den krypterade informationen till en fill
    /* public void fileWriter(){
        String filOutbut = "outbut.txt";
        try {
            FileWriter fw = new FileWriter(filOutbut);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } */
}

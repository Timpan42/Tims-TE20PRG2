import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class intRandom {
    public static void main(String[] args) {
        ArrayList<Integer> inList = new ArrayList<>();
        String y = "intrandom.txt";
        int x;
        int w = 1920;
        int h = 1080;
        Random r = new Random();
// gör slumpnumer
        for (int i = 0; i <= w * h; i++) {
            x = r.nextInt(0xffffff);
            inList.add(x);
        }
        try {
            FileWriter fw = new FileWriter(y);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < inList.size(); i++){
                pw.println(inList.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class randomnumber {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        String y = "mo.txt";
        int x;
        int w = 1920;
        int h = 1080;
        Random r = new Random();

        for (int i = 0; i <= w * h; i++) {
            x = r.nextInt(0xffffff);
            intList.add(x);

        }
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new FileOutputStream(y));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        for (int i = 0; i < intList.size(); i++){
            try {
                out.writeInt(intList.get(i));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

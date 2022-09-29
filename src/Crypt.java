import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Crypt {
    String key;
    String filnamn;
    String meddelande;
    Random r = new Random();

    //ska öppna och läsa en text fil
    public String readTextFile(String filnamn){
        String mes = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filnamn));
            mes = br.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
        return mes;
    }

// det crypterande medelande sparas
    public void crypt(String key, String meddelande){
        if (key == null)
            key = readKey();
        encrypt(meddelande, key);

    }
    //gör nyckeln
    private String readKey(){
        String[] rKeys = {"U","8","1"};
        key = rKeys[r.nextInt(rKeys.length)];
        return key;
    }

    // krypteraren
    public void encrypt(String meddelande, String key){

    }
}

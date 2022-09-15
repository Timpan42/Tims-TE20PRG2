import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Crypt {
    String filnamn;
    String meddelande;
    String key;
    public void readTextFile(String filnamn){
        try {
            BufferedReader br = new BufferedReader(new FileReader(filnamn));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void crypt(String key, String meddelande){
        if (key == null)
            readKey();
        encrypt(meddelande, key);

    }
    public void  readKey(){

    }
    public void encrypt(String meddelande, String key){

    }
}

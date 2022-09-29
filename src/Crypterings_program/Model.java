package Crypterings_program;

public class Model {
    private char kry_svar;


    public void fileReader(){

    }

    public void kryptering (char meddelande, char key){
        meddelande = 'd';
        key = 'y';
        kry_svar = (char) (meddelande^key);
    }
}

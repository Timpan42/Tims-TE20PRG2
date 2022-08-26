import javax.swing.*;
public class greetings {
    public static void main(String[] args){
        String x = JOptionPane.showInputDialog("say hey");
        String[] found = x.split("");
        int y = found.length - 2;
        int z = y*2;
        String s = "";
        for (int i = 0; i < z; i++){
            s = s + "e";
        }
        System.out.print("h" + s + "y");
    }
}

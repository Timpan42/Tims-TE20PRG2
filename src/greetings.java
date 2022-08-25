import javax.swing.*;

public class greetings {
    public static void main(String[] args){
        String e = JOptionPane.showInputDialog("say hej");
        String[] found = e.split("");
        int p = found.length - 2;
        int s = p*2;

        System.out.print("h" + s + "y");
    }
}

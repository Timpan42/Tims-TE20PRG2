import java.util.Scanner;
import java.util.Random;

public class prat_app {
    public static void main (String[]args){
        Random rand = new Random();
        String[] good ={"va bra","trevligt"};
        String[] bad ={"du dålig","vem fan är du!"};
        String n = "\n";
        String[] ansers = {""};
        Scanner sc = new Scanner(System.in);


        System.out.print("Hej min vän, hur är det i dag?" + n + ":");
        String str = sc.nextLine();
        System.out.println(""+ bad[rand.nextInt(bad.length)]);

        for (int i=0; i<5; i++){
            System.out.print("?" + n + ":");
            ansers = sc.nextLine();
            System.out.println(""+ bad[rand.nextInt(bad.length)]);
        }
    }
}

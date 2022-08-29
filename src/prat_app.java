import java.util.Scanner;
import java.util.Random;

public class prat_app {
    public static void main (String[]args){
        Random rand = new Random();
        String n = "\n";
        String[] bot ={
                "Va bra",
                "Trevligt",
                "Du dålig",
                "Vem fan är du!",
                "Din moder",
                "Jag försöker räkna ut vad du sa och jag kom fram till att du har fel",
                "Jag tycker synd om dig",
                "Du borde söka en bättre psykolog",
                "Jag är ingen robot ;)",
                ">:[",
                ":|"
        };
        String[] questions = {
                "Det känns lite onödigt?",
                "Varför kom du hit?",
                "Har du tänkt på att sova?",
                "Är du en psykopat?",
                "Har du tänkt att investera i drog industrin?",
                "#) tankar?"
        };
        String pAnswer = "";
        String bQuestion = "";
        String lastQuestion = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Hej min vän, hur är det i dag?" + n + ":");
        String str = n + sc.nextLine();
        System.out.println(""+ bot[rand.nextInt(bot.length)]);

        for (int i=0; i<5; i++){
            bQuestion = questions[rand.nextInt(questions.length)];
            if (bQuestion == lastQuestion) {
                bQuestion = questions[rand.nextInt(questions.length)];
            }
            lastQuestion = bQuestion;
            System.out.print(bQuestion + n + ":");
            pAnswer = pAnswer + n + sc.nextLine();
            System.out.println(""+ bot[rand.nextInt(bot.length)]);
        }
        System.out.print("Svaren från personen" + n + str + pAnswer);
        System.out.print(n + "Några sista åsikter om boten?" + n +":");
        sc.nextLine();
        System.out.print("Tråkigt för dig då");
    }
}

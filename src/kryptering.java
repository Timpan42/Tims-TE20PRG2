import java.util.Scanner;

public class kryptering {

    public static void main(String[] args) {
        String n = "\n";
        char me = 'h';
        char ke = 'r';
        char cr = (char)(me^ke);
        System.out.println(cr);
        System.out.println((char)(cr^ke));

        Scanner sc = new Scanner(System.in);
        System.out.println(n + "Skriv vad du vill" + n + ":");
        String str = sc.nextLine();
        char[] ch = new char[str.length()];
        for (int i = 0; i <= str.length(); i++){
            ch[i] = str.charAt(i);
        }
        System.out.println(ch[2]);
    }
    public static void krypt1(){
        int m = 123;
        int k = 567813;
        int c = m^k;
        System.out.println(Integer.toBinaryString(c));
        System.out.println(c^k);
    }
}

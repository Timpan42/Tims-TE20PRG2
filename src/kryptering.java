
public class kryptering {
    public static void main(String[] args) {
        int m = 123;
        int k = 567813;
        int c = m^k;
        System.out.println(Integer.toBinaryString(c));
        System.out.println(c^k);

        char me = 'h';
        char cr = (char)(me^k);
        System.out.println(cr);
        System.out.println((char)(cr^k));
    }
}

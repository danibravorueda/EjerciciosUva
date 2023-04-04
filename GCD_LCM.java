import java.io.PrintWriter;
import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int casos = sc.nextInt();
        while (casos-->0){
            int G = sc.nextInt();
            int L = sc.nextInt();
            if (L%G!=0){
                pw.println("-1\n");
                break;
            }
            pw.println(G+" "+L);
        }
        pw.close();
    }
}

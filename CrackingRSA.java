import java.io.PrintWriter;
import java.util.Scanner;

public class CrackingRSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int casos = sc.nextInt();
        while (casos -- > 0){
            int [] array = new int[2];
            for (int pos = 0 ; pos < array.length ; pos++){
                array[pos] = sc.nextInt();
            }

            pw.println(obtenerSingeNumero(array));
        }
        pw.close();
    }

    private static int obtenerSingeNumero(int [] array){
        int res = 0;

        return res;
    }
}

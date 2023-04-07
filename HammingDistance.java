import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HammingDistance {
    static int N ;
    static int H ;

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        boolean first = true;
        while (T -- > 0){
            if (first) first = false;
            else sb.append("\n");
            N = sc.nextInt();
            H = sc.nextInt();
            int mask = (1 << N) - 1;
            ArrayList<String> validStrings = new ArrayList<>();
            while (mask >= 0){
                int ones = 0 ;
                for (int i = 0 ; i < N ; ++i)
                    if (((1 << i) & mask) != 0)
                        ++ ones;
                if (ones == H) validStrings.add(makeString(mask));
                mask -- ;
            }
            Collections.sort(validStrings);
            for (int i = 0 ; i < validStrings.size() ; ++i)
                sb.append(validStrings.get(i) + "\n");
        }
        out.print(sb);
        out.flush();
        out.close();
    }

    static String makeString (int mask){
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < N ; ++i)
            if (((1 << i) & mask) != 0) sb.append('1');
            else sb.append('0');
        return sb.toString();
    }
}

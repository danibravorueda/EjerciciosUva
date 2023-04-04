import java.io.PrintWriter;
import java.util.Scanner;

public class TextQuotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String res;
        boolean open = true;
        String cad;
        String line;
        while (sc.hasNextLine()) {
            res = "";
            line = sc.nextLine();
            cad = "";
            for (int pos = 0; pos < line.length(); pos++) {
                if (line.charAt(pos) == '\"') {
                    if (open) {
                        cad += "``";
                        open = false;
                    } else if (!open) {
                        cad += "''";
                        open = true;
                    }
                } else {
                    cad += line.charAt(pos);
                }
            }
           res += cad;
            System.out.println(res);
            pw.println(res+"rwrfwe");
        }
        pw.close();
    }

}

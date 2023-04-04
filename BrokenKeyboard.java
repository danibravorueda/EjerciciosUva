
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrokenKeyboard {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            int contador = 0;
            List<Character> list =  new ArrayList<>();
            StringBuilder res = new StringBuilder();
            for (char c : line.toCharArray()){
                if (c=='[')
                    contador=0;
                else if (c==']')
                    contador=list.size();
                else
                    list.add(contador++,c);
            }

            for (char c : list)
                res.append(c);
            System.out.println(res);
            //pw.println(res);
        }
        pw.close();
    }


}

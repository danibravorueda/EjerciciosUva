
import java.io.PrintWriter;
import java.util.Scanner;

public class BilliardBounces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        while(sc.hasNextLine()) {
            String [] line = sc.nextLine().split(" ");
             int a = Integer.parseInt(line[0]);
            int b =  Integer.parseInt(line[1]);
            int v = Integer.parseInt(line[2]);
            int theta = Integer.parseInt(line[3]);
            int time = Integer.parseInt(line[4]);
            if(a==0 && b==0 && v==0 && theta==0 && time==0)
                break;
            double distance = ((1.0)*v/2)*time;
            double x = (((1.0)*distance)*Math.cos(theta*Math.PI/180));
            double y = (((1.0)*distance)*Math.sin(theta*Math.PI/180));
            int ans1 = (int) ((x+(a/2))/a);
            int ans2 = (int) ((y+(b/2))/b);
            pw.println(ans1+" "+ans2);
        }
        pw.flush();
    }
}

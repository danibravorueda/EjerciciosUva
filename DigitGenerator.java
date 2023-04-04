import java.io.PrintWriter;
import java.util.Scanner;

public class DigitGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int casos = sc.nextInt();
        while (casos-->0){
            int num = sc.nextInt();
            pw.println(obtenerGeneradorMinimo(num));
        }
        pw.close();
    }

    private static int obtenerGeneradorMinimo(int num){
        int res;
         final int tam = 1000010;
         int array [] = new int[tam];
         for (int pos = 1 ; pos < tam;pos++){
               int mark = sumadorDigit(pos)+pos;
               if (mark<tam && array[mark]==0){
                   array[mark] = pos;
               }
         }
         res = array[num];

        return res;
    }

    private static int sumadorDigit(int num){
        int sum = 0;
        while (num!=0){
            sum+=(num%10);
            num/=10;
        }
        return sum;
    }
}

import java.io.PrintWriter;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int tam = sc.nextInt();
        int [] array = new int[tam];
        for (int pos = 0 ; pos < array.length;pos++){
            array[pos] = sc.nextInt();
        }
        pw.println(obtenerCantidadSumasNegativas(array));
        pw.close();
    }

    private static int obtenerCantidadSumasNegativas(int [] array){
        int contador = 0;
        for (int pos = 0 ; pos < array.length ; pos++){
            for (int j = pos ; j < array.length ;j++){
              int sum = 0;
              for (int k = pos ; k <=j ; k++){
                  sum+=array[k];
              }

              if (sum<0){
                  contador++;
              }
            }
        }

        return contador;
    }

}

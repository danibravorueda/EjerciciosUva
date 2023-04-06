public class Prueba {
    static  int [] array = {2,4,6,8,10,12};
    public static void main(String[] args) {
      dosFores();
       tresFores();
    }

    /** SALIDA
     * 0
     * 0 1
     * 0 1 2
     * 0 1 2 3
     * 0 1 2 3 4
     * 0 1 2 3 4 5
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     * 2
     * 2 3
     * 2 3 4
     * 2 3 4 5
     * 3
     * 3 4
     * 3 4 5
     * 4
     * 4 5
     * 5
     *
     * */

    private static void tresFores(){
        for (int pos = 0 ; pos < array.length ; pos++){
            for (int j = pos ; j < array.length ; j++){
                for (int k = pos ; k<=j ; k++){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
    }

    /** SALIDA
     * 2 4 6 8 10 12
     * 4 6 8 10 12
     * 6 8 10 12
     * 8 10 12
     * 10 12
     * 12
     *
     * */
    private static void dosFores(){
        for (int pos = 0 ; pos < array.length ; pos++){
            for (int j = pos ; j < array.length ; j++){
                System.out.print(array[j]+" ");
            }
            System.out.println();
        }
    }
}

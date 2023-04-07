package busqueda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binaria {
    static int [] array = {2,3,4,5,6};
    static int [] array2 = {1,2,3,4,4,4,6,7,8};

    public static void main(String[] args) {
        //System.out.println(obtenerPosElem(6));
        mostrar(obtenerPosicionesElementosRepetidos(4));
    }

    private static List<Integer> obtenerPosicionesElementosRepetidos(int elemBusq){
        List<Integer> lista = new ArrayList<>(10);
        int inicio = 0 ;
        int fin = array2.length-1;
        while (inicio<=fin){
           int medio = (inicio+fin)/2;
           if (array2[medio] == elemBusq){
               lista.add(medio);
               if(array2[medio-1]==elemBusq){
                   lista.add(medio-1);
               }
               inicio=medio+1;

           }

        }

        return lista;
    }

    private static int obtenerPosElem(int elemBusq){
        int pos = -1;
        int inicio =0;
        int fin = array.length-1;
        boolean bandera = false;

        while (inicio<=fin && !bandera){
            int medio = (inicio+fin)/2;
            if (array[medio]==elemBusq){
                pos = medio;
                bandera = true;

            }else if (array[medio]>elemBusq){
              fin=medio-1;
            }else if (array[medio]<elemBusq){
                inicio = medio+1;
            }
        }
        return pos;
    }

    private static void mostrar(List<Integer> list){
        for (Integer elem : list){
            System.out.print(elem+" ");
        }
    }
}

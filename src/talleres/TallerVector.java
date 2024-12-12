
package talleres;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TallerVector {
    public static void main(String[] args) {
        int v[] =  {6,6,2,5,6,3};
        contarRepetidosYNoRepetidos(v);
    }
    

    public static void contarRepetidosYNoRepetidos(int[] vector) {
        int repetidos = 0;
        int noRepetidos = 0;
        for (int i = 0; i < vector.length; i++) {
            int count = 0;
            for (int j = 0; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    count++;
                }
            }
            if (count > 1) {
                boolean yaContado = false;
                for (int k = 0; k < i; k++) {
                    if (vector[i] == vector[k]) {
                        yaContado = true;
                        break;
                    }
                }
                if (!yaContado) {
                    repetidos++;
                }
            } else if (count == 1) {
                noRepetidos++;
            }
        }
        System.out.println("Cantidad de números repetidos: " + repetidos);
        System.out.println("Cantidad de números no repetidos: " + noRepetidos);
    }
    
}

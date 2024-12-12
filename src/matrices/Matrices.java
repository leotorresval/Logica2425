package matrices;

import java.util.Random;

public class Matrices {

    public static void main(String[] args) {
        contarVocalesVector();
        System.out.println("IMPRESION DE LA MATRIZ");
        ejercicio10();
    }

    public static int[][] definicionMatriz() {
        //DEFINICION
        int[][] m = new int[7][6];
        //ASIGNAR UN VALOR
        m[6][5] = 1000;
        //RECUPERACION DE VALORES
        int a = m[3][4];
        Random rd = new Random();
        int columna = m[0].length;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < columna; j++) {
                m[i][j] = rd.nextInt(2);
            }
        }
        return m;
    }

    public static void imprimir(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void ejercicio10() {
        String[][] m = {{"sol", "despues"},
        {"casa", "perro"},
        {"murcielago", "triceratops"}};
        int fila = m.length;
        int columna = m[0].length;
        int[][] v = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                int c = 0;
                String p = m[i][j];
                for (int k = 0; k < p.length(); k++) {
                    char letra = p.charAt(k);
                    if (letra == 'a' || letra == 'e'
                            || letra == 'i' || letra == 'o'
                            || letra == 'u') {
                        c++;
                    }
                }
                v[i][j] = c;
                System.out.print(v[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int contarVocalesPalabra(String p) {
        int c = 0;
        p = p.toLowerCase();
        for (int i = 0; i < p.length(); i++) {
            char letra = p.charAt(i);
            if (letra == 'a' || letra == 'e'
                    || letra == 'i' || letra == 'o'
                    || letra == 'u') {
                c++;
            }
        }
        System.out.println("Hay" + c + "vocales");
        return c;
    }

    public static void contarVocalesVector() {
        String m[] = {"sol", "casa", "aterciopelados"};
        int fila = m.length;
        int[] v = new int[fila];
        for (int i = 0; i < m.length; i++) {
            int c = 0;
            String p = m[i];
            for (int j = 0; j < p.length(); j++) {
                char letra = p.charAt(j);
                if (letra == 'a' || letra == 'e'
                        || letra == 'i' || letra == 'o'
                        || letra == 'u') {
                    c++;
                }
            }
            v[i] = c;
            System.out.println(v[i]);

        }
    }

}

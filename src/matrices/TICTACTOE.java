package matrices;

import controldatos.ControlDatos;
import java.util.Scanner;

public class TICTACTOE {

    static char m[][] = new char[3][3];
    static char n[][] = new char[3][3];

    public static void main(String[] args) {
        System.out.println("JUEGO TIC TAC TOE");
        llenar();
        imprimir();
        System.out.println("JUGADOR 1: X");
        System.out.println("JUGADOR 2: O");
        System.out.println("COMENZAR");
        boolean bandera = true;
        //REPETIR HASTA QUE HAYA UN 
        //GANADOR O EMPATE
        while (bandera) {
            System.out.println("TURNO JUGADOR 1 [X]");
            int j1 = lecturaCasillas("Ingrese la casilla a llenar [1-9]");
            llenarMatriz(j1, 'x');
            boolean r = verificarGanancia();
            imprimir();
            if (r) {
                System.out.println("Gana jugador 1");
                break;
            }
            System.out.println("TURNO JUGADOR 2 [O]");
            int j2 = lecturaCasillas("Ingrese la casilla a llenar [1-9]");
            llenarMatriz(j2, 'O');
            imprimir();
            r = verificarGanancia();
            if (r) {
                System.out.println("Gana jugador 2");
                break;
            }

        }
    }

    //IMPRIME LA MATRIZ
    public static void imprimir() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void llenar() {
        int c = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = '-';
                n[i][j] = (char) c;
                c++;
            }
        }
    }

    public static int lecturaCasillas(String texto) {
        boolean correcto = true;
        int valor = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.print(texto + ": ");
                valor = teclado.nextInt();
                if (valor >= 1 && valor <= 9) {
                    if (verificarCasilla(valor)) {
                        correcto = false;
                    } else {
                        System.out.println("Casilla ocupada");
                    }
                } else {
                    System.out.println("Ingrese en el rango indicado");
                }
            } catch (Exception e) {
                System.out.println("Ingrese solo enteros");
            }
        } while (correcto == true);
        return valor;
    }

    //VERIFICA QUE LA CASILLA ESTE LIBRE
    public static boolean verificarCasilla(int casilla) {
        int v[] = obtenerPosiciones(casilla);
        if (m[v[0]][v[1]] == '-') {
            return true;
        } else {
            return false;
        }
    }

    public static int[] obtenerPosiciones(int casilla) {
        int i = 0, j = 0;
        int[] v = new int[2];
        switch (casilla) {
            case 1:
                v[0] = 0;
                v[1] = 0;
                break;
            case 2:
                v[0] = 0;
                v[1] = 1;
                break;
            case 3:
                v[0] = 0;
                v[1] = 2;
                break;
            case 4:
                v[0] = 1;
                v[1] = 0;
                break;
            case 5:
                v[0] = 1;
                v[1] = 1;
                break;
            case 6:
                v[0] = 1;
                v[1] = 2;
                break;
            case 7:
                v[0] = 2;
                v[1] = 0;
                break;
            case 8:
                v[0] = 2;
                v[1] = 1;
                break;
            case 9:
                v[0] = 2;
                v[1] = 2;
                break;
        }
        return v;
    }

    public static void llenarMatriz(int casilla, char c) {
        int v[] = obtenerPosiciones(casilla);
        m[v[0]][v[1]] = c;
        n[v[0]][v[1]] = c;

    }

    public static boolean verificarGanancia() {
        if ((n[0][0] == n[0][1] && n[0][0] == n[0][2])
                || (n[1][0] == n[1][1] && n[1][0] == n[1][2])
                || (n[2][0] == n[2][1] && n[2][0] == n[2][2])
                || (n[0][0] == n[1][0] && n[0][0] == n[2][0])
                || (n[0][1] == n[1][1] && n[0][1] == n[2][1])
                || (n[0][2] == n[1][2] && n[0][2] == n[2][2])
                || (n[0][0] == n[2][2] && n[0][0] == n[1][1])
                || (n[0][2] == n[1][1] && n[0][2] == n[2][0])) {
            return true;
        } else {
            return false;
        }
    }
}

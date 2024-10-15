package metodos;

import controldatos.ControlDatos;

public class PruebaAleatorios {

    public static void main(String[] args) {
        boolean bandera = true;
        do {
            System.out.println("1. Lanzamiendo de 1 dado");
            System.out.println("2. Lanzamiendo de 2 dados");
            System.out.println("3. Generacion de placa vehicular");
            System.out.println("4. Generacion de contraseña de 8 caracteres");
            System.out.println("5. Salir");
            int opcion = ControlDatos.lecturaEnteros("Ingrese una opcion");
            switch (opcion) {
                case 1:
                    System.out.println("Lanzamiento");
                    System.out.println(DatosAleatorios.aleatorio(1, 7));
                    break;
                case 2:
                    break;
                case 3:
                    String placa = "";
                    for (int i = 0; i < 3; i++) {
                        placa += DatosAleatorios.letraAleatoria();
                    }
                    placa += "-";
                    for (int i = 0; i < 4; i++) {
                        placa += DatosAleatorios.aleatorio(0, 10);
                    }
                    System.out.println("Placa: " + placa);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while (bandera);
    }
}

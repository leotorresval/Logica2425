package vectores;

public class DeberVector {

    public static void main(String[] args) {
        String palabra = "SALAS";
        String[] vector = {"abeja", "hormiga", "mosco",
            "mosco", "hormiga", "abeja"};
        System.out.println("Longitud: "+vector.length);
        boolean r = capicua(vector);
        System.out.println("Vector capicua: "+r);
    }

    public static boolean capicua(String[] vector) {
        boolean respuesta =true;
        int j=vector.length-1;
        for (int i = 0; i < vector.length; i++) {
            String palabraInicio = vector[i];
            String palabraFin =vector[j];
            if (!palabraInicio.equals(palabraFin)) {
                respuesta = false;
                break;
            }
            j--;
        }
        return respuesta;
    }
}

package tallerherencia;

public class Lavadora extends Electrodomestico {

    private int capacidad;

    public void impresion() {
        System.out.println("Consumo electrico: " + getConsumoElec());
        System.out.println("Estado: " + isEstado());
        System.out.println("capacidad: " + capacidad);
        
    }

}


package tallerherencia;

public class Electrodomestico {
    private double consumoElec;
    private boolean estado;

    public Electrodomestico() {
    }

    public Electrodomestico(double consumoElec, boolean estado) {
        this.consumoElec = consumoElec;
        this.estado = estado;
    }

    public double getConsumoElec() {
        return consumoElec;
    }

    public void setConsumoElec(double consumoElec) {
        this.consumoElec = consumoElec;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void imprimir(){
        System.out.println("Consumo electrico: "+getConsumoElec());
        System.out.println("Estado: "+isEstado());
    }
    
}

package herencia;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado, String color, int ejeX, int ejeY) {
        super(color, ejeX, ejeY);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void calcularArea() {
        double area = lado*lado;
        System.out.println("El area de un cuadrado es: "+area);
    }
    
    
    
}

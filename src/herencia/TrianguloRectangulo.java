
package herencia;

public class TrianguloRectangulo extends Figura {
    private double base, altura;

    public TrianguloRectangulo() {
    }

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void calcularArea(){
        double area = (base*altura)/2;
        System.out.println("El area del triangulo rectangulo es "+area);
    }
    
}

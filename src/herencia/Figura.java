package herencia;

public abstract class Figura {

    private String color;
    private int ejeX, ejeY;

    public Figura() {
    }

    public Figura(String color, int ejeX, int ejeY) {
        this.color = color;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEjeX() {
        return ejeX;
    }

    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }

    public int getEjeY() {
        return ejeY;
    }

    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
    }
    
    public abstract void calcularArea();

    //public abstract double calcularPerimetro(double valor);
}


package herencia;

public class Pruebas {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        c1.setLado(5);
        c1.calcularArea();
        //INSTANCIA DEL TRIANGULO RECTANGULO
        //CON BASE = 4
        //CON ALTURA = 3.2
        TrianguloRectangulo t1 = new TrianguloRectangulo(4, 3.2);
        t1.calcularArea();
        Circulo ci1= new Circulo(5);
        ci1.calcularArea();
    }
}

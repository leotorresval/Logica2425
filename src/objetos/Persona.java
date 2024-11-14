package objetos;

public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private double estatura;
    private boolean donante;

    //CONSTRUCTOR PREDETERMINADO
    //CONSTRUCTOR PARAMETRIZADO
    public Persona(String cedula, String nombre, String apellido, int edad,
            double estatura, boolean donante) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.donante = donante;
    }

    public Persona(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    //GETTERS Y SETTERS
    public String getCedula() {
        return this.cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public boolean isDonante() {
        return donante;
    }

    public void setDonante(boolean donante) {
        this.donante = donante;
    }

    public void Saludo() {
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi cedula es: " + cedula);
    }

    public void CantLetras() {
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi nombre tiene "+nombre.length()
        +" letras");
    }
    
    public String obtenerProvincia(){
        String p= "";
        int codigo= Integer.parseInt(cedula.substring(0, 2));
        switch(codigo){
            case 01: p="Azuay";break;
            case 17: p="Pichinchia";break;
            case 18: p="Tungurahua";break;
            default: p="Cedula incorrecta";
        }
        System.out.println(p);
        return p;
    }
}

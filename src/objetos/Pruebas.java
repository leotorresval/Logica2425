package objetos;

public class Pruebas {

    public static void main(String[] args) {
        Persona leo = new Persona("1801", "Leonardo");
        leo.setApellido("Torres");
        leo.setEdad(31);
        leo.setEstatura(1.73);
        leo.setDonante(true);
        System.out.println("Hola " + leo.getNombre());

        Persona juan = new Persona("1802", "Juan", "Perez", 25, 1.80, false);

        System.out.println("Hola " + juan.getNombre());

        Persona maria = new Persona("1803", "Maria", "Mendez");
        System.out.println("Hola " + maria.getNombre());
        Persona persona = new Persona("18010", "Andres");
        persona.setNombre("Jose");
        Persona mikel = new Persona("0104", "Mikel");
        Persona santiago = new Persona("1701", "Santiago");
        
        leo.Saludo();
        juan.Saludo();
        persona.Saludo();
        maria.CantLetras();
        maria.obtenerProvincia();
        mikel.obtenerProvincia();
        santiago.obtenerProvincia();
        
        Cliente jorge = new Cliente("1701","Jorge");
        jorge.Saludo();
        jorge.obtenerProvincia();
    }
}

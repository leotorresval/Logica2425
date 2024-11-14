
package objetos;

public class Cliente extends Persona {
    private String tipoCliente;
    
    public String getTipoCliente(){
        return tipoCliente;
    }
    
    public void setTipoCliente(String tipoCliente){
        this.tipoCliente=tipoCliente;
    }
    
    public Cliente(String cedula, String nombre) {
        super(cedula,nombre);
    }
}

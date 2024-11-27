
package tallerherencia;

public class Refrigerador extends Electrodomestico {
    private double temperatura;
    
    public Refrigerador(double consumoElec, boolean estado,
            double temperatura){
        super(consumoElec, estado);
        this.temperatura=temperatura;
    }
    
    public void imprimir(){
        
    }
    
}

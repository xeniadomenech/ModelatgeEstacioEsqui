
package pro2.model;

public class CintaTransportadora extends Remuntador {
    
    private final String tipus = "Cinta Transportadora";
    
    // Constructor amb parametres    
    /**
    * Constructor de CintaTransbordadora
    * @param nom
    * @param sector
    * @param estat
    * @param limitVent
    * @param visible
    */
    public CintaTransportadora(String nom, String sector, String estat, int limitVent, boolean visible){
        super(nom, sector, estat, limitVent, visible);
    }
    


    //Mètodes
    /**
    * Mètode tipus
    *@return el tipus de remuntador que és
    */
    @Override
    public String tipus(){
        return tipus;
    }
    
}

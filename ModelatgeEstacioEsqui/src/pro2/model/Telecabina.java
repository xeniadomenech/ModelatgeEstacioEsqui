
package pro2.model;

public class Telecabina extends Remuntador {
    
    private final String tipus = "Telecabina";
    
    // Constructor amb parametres    
    /**
    * Constructor de Telecabina 
    * @param nom
    * @param sector
    * @param estat
    * @param limitVent
    * @param visible
    */
    public Telecabina(String nom, String sector, String estat, int limitVent, boolean visible){
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

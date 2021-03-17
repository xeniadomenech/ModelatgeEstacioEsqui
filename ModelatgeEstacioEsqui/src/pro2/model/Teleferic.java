
package pro2.model;

public class Teleferic extends Remuntador {
    
    private final String tipus = "Teleferic";
    
    // Constructor amb parametres    
    /**
    * Constructor de Telefèric 
    * @param nom
    * @param sector
    * @param estat
    * @param limitVent
    * @param visible
    */
    public Teleferic(String nom, String sector, String estat, int limitVent, boolean visible){
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
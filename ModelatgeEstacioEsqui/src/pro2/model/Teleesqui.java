
package pro2.model;


public class Teleesqui extends Remuntador {
    
    private final String tipus = "Teleesqui";
    
    // Constructor amb parametres    
    /**
    * Constructor de Teleesqui
    * @param nom
    * @param sector
    * @param estat
    * @param limitVent
    * @param visible
    */
    public Teleesqui(String nom, String sector, String estat, int limitVent, boolean visible){
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

package pro2.model;

public abstract class Remuntador {
    
    private String nom;
    private String sector;
    private String estat;
    private int limitVent;
    private boolean visible;
    
    // Constructor amb parametres    
    /**
    * Constructor de Pista 
    * @param nom
    * @param sector
    * @param estat
    * @param limitVent
    * @param visible
    */
    public Remuntador(String nom, String sector, String estat, int limitVent, boolean visible) {
        this.nom = nom;
        this.sector = sector;
        this.estat = estat;
        this.limitVent = limitVent;
        this.visible = visible;
    }
    
    //Setters
    /**
    * Setter setNom de
    * @param nom
    */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
    * Setter setSector de
    * @param sector
    */
    public void setSector(String sector) {
        this.sector = sector;
    }

    /**
    * Setter setEstat de
    * @param estat
    */
    public void setEstat(String estat) {
        this.estat = estat;
    }

    /**
    * Setter setLimitVent de
    * @param limitVent
    */
    public void setLimitVent(int limitVent) {
        this.limitVent = limitVent;
    }

    /**
    * Setter setVisible de
    * @param visible
    */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    //Getters
    /**
    * Getter getNom de
    *@return el nom del remuntador
    */
    public String getNom() {
        return nom;
    }

    /**
    * Getter getSector de
    *@return el sector del remuntador
    */
    public String getSector() {
        return sector;
    }

    /**
    * Getter getEstat de
    *@return l'estat del remuntador
    */
    public String getEstat() {
        return estat;
    }

    /**
    * Getter getLimitVent de
    *@return la velocitat límit del remuntador
    */
    public int getLimitVent() {
        return limitVent;
    }

    /**
    * Getter isVisible de
    *@return si el remuntador està en servei o no
    */
    public boolean isVisible() {
        return visible;
    }
    
    
    
    //Mètodes
    /**
    * Mètode actualitzaEstat actualitza l'estat dels remuntadors
    * @return el tipus de remuntador que tenim
    */
    public abstract String tipus();
    
    /**
    * Mètode actualitzaEstat actualitza l'estat dels remuntadors
    * @param meteo
    */
    public void actualitzaEstat(Meteo meteo){
        boolean mustClose = false;
        if (visible==false){
            if (meteo.getVisibilitat().equals("Bona") && nom.equals("RM9"))
                mustClose = false;
        }else{
            if (meteo.getVisibilitat().equals("Dolenta") && nom.equals("RM9"))
                mustClose = true;
        }
        
        if (meteo.getVelocitatVent() > limitVent)
            mustClose = true; 
        
        if (mustClose){
            estat = "Fora de Servei";
        }else{
            estat = "En Servei";
        }

    }
    
    /**
    * Mètode toString per mostrar per pantalla
    *@return la informació dels remuntadors
    */
    @Override
    public String toString(){
        String result = "Remuntador: " + nom + ", Tipus: "+ tipus()+
                ", Sector: " + sector + ", Estat: " + estat; 
        return result;
    }
    
}


package pro2.model;


public class Meteo {
    
    private int velocitatVent;
    private String visibilitat;
    
    // Constructor amb parametres
    /**
    * Constructor de Pista 
    * @param velocitatVent
    * @param visibilitat
    */
    public Meteo(int velocitatVent, String visibilitat) {
        this.velocitatVent = velocitatVent;
        this.visibilitat= visibilitat;
    }
    
    // Setters
    /**
    * Setter setNom de
    * @param visibilitat
    */
    public void setVisibilitat(String visibilitat) {
        this.visibilitat = visibilitat;
    }
    
    /**
    * Setter setNom de
    * @param velocitatVent
    */
    public void setVelocitatVent(int velocitatVent) {
        this.velocitatVent = velocitatVent;
    }

    //Getter
    /**
    * Getter getVelocitatVent de
    *@return la velocitat del vent
    */
    public int getVelocitatVent() {
        return velocitatVent;
    }

    /**
    * Getter getVisibilitat de
    *@return la visibilitat de la pista
    */
    public String getVisibilitat() {
        return visibilitat;
    }
    
    
    
    // Mètodes
    /**
    * Mètode toString per mostrar per pantalla
    *@return cadena de caràcters que mostrarà per pantalla
    */
    @Override
    public String toString(){
        String result = "*****************************\n" +
                        "**** Meteorologia Actual ****\n" +
                        "*****************************\n" +
                        "     Vent: " + getVelocitatVent() + "Km/h\n" +
                        "     Visibilitat: " + getVisibilitat() + "\n" +
                        "*****************************\n";
        return result;
    }
}

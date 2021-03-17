
package pro2.model;

public class Pista {
    
    private String nom;
    private String color;
    private String sector;
    private float longitud;
    private String estatNeu;
    private String estatPista; 
    private LlistaRemuntadors dependencies;

    // Constructor amb parametres    
    /**
    * Constructor de Pista 
    * @param nom
    * @param sector
    * @param color
    * @param longitud
    * @param estatNeu
    * @param estatPista
    */
    public Pista(String nom, String sector, String color, float longitud, 
            String estatNeu, String estatPista) {
        this.nom = nom;
        this.sector = sector;
        this.color = color;
        this.longitud = longitud;
        this.estatNeu = estatNeu;
        this.estatPista = estatPista;
        this.dependencies = new LlistaRemuntadors();
    }
    
    // Setters
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
    * Setter setColor de
    * @param color
    */
    public void setColor(String color) {
        this.color = color;
    }

    /**
    * Setter setLongitud de
    * @param longitud
    */
    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    /**
    * Setter setEstatNeu de
    * @param estatNeu
    */
    public void setEstatNeu(String estatNeu) {
        this.estatNeu = estatNeu;
    }

    /**
    * Setter setEstatPista de
    * @param estatPista
    */
    public void setEstatPista(String estatPista) {
        this.estatPista = estatPista;
    }

    /**
    * Setter setDependencies de
    * @param dependencies
    */
    public void setDependencies(LlistaRemuntadors dependencies) {
        this.dependencies = dependencies;
    }
    
    // Getters
    /**
    * Getter getNom de
    *@return el nom de la pista
    */
    public String getNom() {
        return nom;
    }

    /**
    * Getter getSector de
    *@return el sector de la pista
    */
    public String getSector() {
        return sector;
    }

    /**
    * Getter getColor de
    *@return el nivell de dificultat de la pista
    */
    public String getColor() {
        return color;
    }

    /**
    * Getter getLongitud de
    *@return la longitud de la pista
    */
    public float getLongitud() {
        return longitud;
    }

    /**
    * Getter getEstatNeu de
    *@return l'estat de la neu
    */
    public String getEstatNeu() {
        return estatNeu;
    }

    /**
    * Getter getEstatPista de
    *@return l'estat de la pista
    */
    public String getEstatPista() {
        return estatPista;
    }

    /**
    * Getter getDependencies de
    *@return els remuntadors de la pista
    */
    public LlistaRemuntadors getDependencies() {
        return dependencies;
    }
    
    
    
    // Mètodes
    /**
    * Mètode actualitzaEstat actualitza l'estat de la pista
    */
    public void actualitzaEstat(){
        if(estatPista.equals("Oberta")){
            setEstatPista("Tancada");
        }else if(estatPista.equals("Tancada")){
            setEstatPista("Oberta");
        }
    }

    public void afegirDependencia(Remuntador rm){
        dependencies.afegirRemuntador(rm);
    }
    
    /**
    * Mètode toString per mostrar per pantalla
    *@return la informació de les pistes
    */
    @Override
    public String toString(){
        String result = "     Pista: " + getNom() + "\n"   +
                        "     Sector: " + getSector() + "\n"   +
                        "     Nivell de dificultat: " + getColor() + "\n" +
                        "     Longitud de la Pista: " + getLongitud() + " Km\n" +
                        "     Estat de la neu: " + getEstatNeu() + "\n" +
                        "     Estat de la Pista: " + getEstatPista() + "\n" +
                        "     Dependencies:" + dependencies.getNoms() +
                        "\n";
        return result;
    }
}

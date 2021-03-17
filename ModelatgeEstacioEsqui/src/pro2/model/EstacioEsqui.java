
package pro2.model;

public class EstacioEsqui {
    
    private String nom;
    private Meteo meteo;
    private LlistaPistes  llistaPistes;
    private LlistaRemuntadors llistaRemuntadors;
    
    //Constructor amb parametres
    /**
    * Constructor de la classe Estacio Esqui
    * @param nom
    * @param visibilitat
    * @param velocitatVent
    */
    public EstacioEsqui(String nom, String visibilitat, int velocitatVent) {
        this.nom = nom;
        this.llistaPistes = new LlistaPistes();
        this.llistaRemuntadors = new LlistaRemuntadors();
        this.meteo = new Meteo(velocitatVent, visibilitat);
    }

    //Setter
    /**
     * Setter setNom de
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
    * Setter setMeteo de
    * @param meteo
    */
    public void setMeteo(Meteo meteo) {
        this.meteo = meteo;
    }


    /**
    * Setter setLlistaPista de
    * @param llistaPistes
    */
    public void setLlistaPista(LlistaPistes llistaPistes) {
        this.llistaPistes = llistaPistes;
    }

    /**
    * Setter setLlistaRemuntador de
    * @param llistaRemuntadors
    */
    public void setLlistaRemuntador(LlistaRemuntadors llistaRemuntadors) {
        this.llistaRemuntadors = llistaRemuntadors;
    }

    //Getter
    /**
    * Getter getNom de
    *@return el nom de l'estació d'esquí
    */
    public String getNom() {
        return nom;
    }

    /**
    * Getter getMeteo de
    * @return meteo
    */
    public Meteo getMeteo() {
        return meteo;
    }
    
    /**
    * Getter LlistaPistes de
    *@return totes les pistes
    */
    public LlistaPistes getLlistaPista() {
        return llistaPistes;
    }

    /**
    * Getter LlistaRemuntadors de
    *@return tots els remuntadors
    */
    public LlistaRemuntadors getLlistaRemuntador() {
        return llistaRemuntadors;
    }

    
    
    //Mètodes
    /**
    * inicialitzaDadesVall2000() llegeix la informació
    */
    public void inicialitzaDadesVall2000() {
        
        /* Remuntadors */
        Telecadira RM1 = new Telecadira("RM1", "Nord", "En Servei", 35, false);      llistaRemuntadors.afegirRemuntador(RM1);
        Teleesqui  RM2 = new Teleesqui ("RM2", "Nord", "En Servei", 35, false);       llistaRemuntadors.afegirRemuntador(RM2);
        Telecadira RM3 = new Telecadira("RM3", "Nord", "En Servei", 35, false);      llistaRemuntadors.afegirRemuntador(RM3);
        Teleesqui  RM4 = new Teleesqui ("RM4", "Nord", "En Servei", 60, false);      llistaRemuntadors.afegirRemuntador(RM4);
        Telecabina RM5 = new Telecabina("RM5", "Nord", "En Servei", 60, false);      llistaRemuntadors.afegirRemuntador(RM5);
        CintaTransportadora RM6 = new CintaTransportadora("RM6", "Nord", "En Servei", 60, false); llistaRemuntadors.afegirRemuntador(RM6);
        Teleesqui  RM7 = new Teleesqui ("RM7", "Sud", "En Servei", 60, false);       llistaRemuntadors.afegirRemuntador(RM7);
        Telecadira RM8 = new Telecadira("RM8", "Sud", "En Servei", 60, false);       llistaRemuntadors.afegirRemuntador(RM8);
        Telecabina RM9 = new Telecabina("RM9", "Sud", "Fora de Servei", 60, true);   llistaRemuntadors.afegirRemuntador(RM9);
        Teleferic RM10 = new Teleferic ("RM10", "Inter-Sector", "En Servei", 60, false); llistaRemuntadors.afegirRemuntador(RM10);
        
        /* Pistes */
        Pista P1  = new Pista("P1",  "Nord", "Negra",    0.8f, "Dura",      "Oberta"); llistaPistes.afegirPista(P1);
        Pista P2  = new Pista("P2",  "Nord", "Vermella", 1.1f, "Dura",      "Oberta");  llistaPistes.afegirPista(P2);
        Pista P3  = new Pista("P3",  "Nord", "Blava",    1.8f, "Pols",      "Oberta");  llistaPistes.afegirPista(P3);
        Pista P4  = new Pista("P4",  "Nord", "Vermella", 1.2f, "Dura",      "Oberta"); llistaPistes.afegirPista(P4);
        Pista P5  = new Pista("P5",  "Nord", "Blava",    2.1f, "Pri mavera", "Oberta");  llistaPistes.afegirPista(P5);
        Pista P6  = new Pista("P6",  "Nord", "Blava",    2.9f, "Pols",      "Oberta");  llistaPistes.afegirPista(P6);
        Pista P7  = new Pista("P7",  "Nord", "Verda",    1.2f, "Primavera", "Oberta");  llistaPistes.afegirPista(P7);
        Pista P8  = new Pista("P8",  "Nord", "Verda",    0.9f, "Pols",      "Oberta");  llistaPistes.afegirPista(P8);
        Pista P9  = new Pista("P9",  "Sud",  "Vermella", 2.1f, "Dura",      "Tancada");  llistaPistes.afegirPista(P9);
        Pista P10 = new Pista("P10", "Sud",  "Negra",    0.6f, "Primavera", "Tancada");  llistaPistes.afegirPista(P10);
        Pista P11 = new Pista("P11", "Sud",  "Vermella", 1.3f, "Primavera", "Oberta");  llistaPistes.afegirPista(P11);
        Pista P12 = new Pista("P12", "Sud",  "Blava",    1.9f, "Pols",      "Oberta");  llistaPistes.afegirPista(P12);
        
        /* Dependencies */
        P1.afegirDependencia(RM1);
        P2.afegirDependencia(RM2); P2.afegirDependencia(RM3);
        P3.afegirDependencia(RM5);
        P4.afegirDependencia(RM5);
        P5.afegirDependencia(RM5);
        P6.afegirDependencia(RM4);
        P7.afegirDependencia(RM5);
        P8.afegirDependencia(RM5); P8.afegirDependencia(RM6);
        P9.afegirDependencia(RM9);
        P10.afegirDependencia(RM9);
        P11.afegirDependencia(RM7); P11.afegirDependencia(RM9);
        P12.afegirDependencia(RM8);
        
        /*HEM VIST QUE LES DADES INCIALS DE PISTES I REMUNTADORS NO QUADREN 
        AMB LES DADES INCIALS DE LA METEOROLOGIA QUE S'INTRODUEIXEN AL MAIN DEL
        PROGRAMA. PER AIXÒ HEM PENSAT DUES OPCIONS PER SOLUCIONAR-HO.
        USAREM LA PRIMERA OPCIÓ, I LA SEGONA LA DEIXAREM COM A COMENTARI
        */
        
        //OPCIÓ 1: Deduim que la velocitatVent<35 i visibilitat = Dolenta
        meteo.setVelocitatVent(10);
        meteo.setVisibilitat("Dolenta");
        
        //OPCIÓ 2: Actualitzem pistes i reumntadors amb la meteorologia del main
        //llistaRemuntadors.actualitzaEstat(meteo);
        //llistaPistes.actualitzaEstat();;
        
        
    }
    
    //VISTA_ESTACIO_ESQUI opcions 1,2,3,4,5 i 6 del menú
    /**
     * Informació de les pistes
     * @param estat
     * @return la informació de les pistes
     */
    public String toStringPistes(String estat){
        return llistaPistes.llistarPistes(estat);
    }
    
    /**
     * Informació dels remuntadors
     * @param estat
     * @return la informació dels remuntadors
     */
    public String toStringRemuntadors(String estat){
        return llistaRemuntadors.llistarRemuntadors(estat);
    }
    
    //VISTA_ESTACIO_ESQUI opció 7 del menú
    /**
     * Busco una pista
     * @param pista
     * @return la pista que buscàvem
     */
    public Pista getPista(String pista){
        return llistaPistes.getPista(pista);
    }
    
    /**
     * Modifico estat neu
     * @param nomPista
     * @param estat
     */
    public void modificoEstatNeu(String nomPista, String estat){
        llistaPistes.getPista(nomPista).setEstatNeu(estat);
    }
    
    //VISTA_ESTACIO_ESQUI opció 8 del menú
    /**
     * Calculo els kms de les pistes
     * @param estat
     * @return els kms (tipus float)
     */
    public float calculaKmsPistes(String estat){
        return llistaPistes.calculaKmsPistes(estat);
    }
    
    //VISTA_ESTACIO_ESQUI opció 9 del menú
    public void modificaVelocitatVent(int velocitatVent){
        //Modifico la meteorologia
        meteo.setVelocitatVent(velocitatVent);
        
        // Modifiquem l'estat de les Pistes i dels remuntadors
        llistaRemuntadors.actualitzaEstat(meteo);
        llistaPistes.actualitzaEstat();
        
    }
    
    //VISTA_ESTACIO_ESQUI opció 10 del menú
    public void modificaVisibilitat(String visibilitat){
        //Modifico la meteorologia
        meteo.setVisibilitat(visibilitat);
        
        // Modifiquem l'estat de les Pistes i dels remuntadors
        llistaRemuntadors.actualitzaEstat(meteo);
        llistaPistes.actualitzaEstat();

    }
    
    //VISTA_ESTACIO_ESQUI opció 11 del menú
    /**
     * Informació de la meteorologia
     * @return la meteorologia actual
     */
    public String toStringMeteo(){
        return meteo.toString();
    }
}

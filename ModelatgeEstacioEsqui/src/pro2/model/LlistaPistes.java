
package pro2.model;

import java.util.ArrayList;

public class LlistaPistes {
    
    private ArrayList<Pista> llista;
    private LlistaRemuntadors llistaRemuntadors;
    
    //Constructor amb paràmetres
    /**
    * Constructor de Llista de Pistes 
    */
    public LlistaPistes(){
        this.llista = new ArrayList<>();
        this.llistaRemuntadors = new LlistaRemuntadors();
    }

    //Setter
    /**
    * Setter setLlista de 
    * @param llista
    */
    public void setLlista(ArrayList<Pista> llista) {    
        this.llista = llista;
    }

    //Getter
    /**
    * Getter getLlista de 
    * @return la llista de les pistes
    */
    public ArrayList<Pista> getLlista() {    
        return this.llista;
    }
    
    

    //Mètodes
    /**
    * Mètode actualitzaEstat actualitza l'estat de les pistes
    */
    public void actualitzaEstat(){
        int remuntadorTancats;
        int midaDependencies;
        String estatPista;
        for (int i = 0; i < llista.size(); ++i){
            //Variables que seran utils per no repetir codi innecessari
            remuntadorTancats=0;
            llistaRemuntadors=llista.get(i).getDependencies();
            midaDependencies=llistaRemuntadors.getLlista().size();
            estatPista=llista.get(i).getEstatPista();
            
            //Comptem quants remuntadors estan "Fora de servei" per la pista (i)
            for (int j=0; j < midaDependencies; ++j){
                if(llistaRemuntadors.getLlista().get(j).getEstat().equals("Fora de Servei"))
                    remuntadorTancats++;
            }
            
            //Comprovo si TOTS els remuntadors de la pista estan "Fora de Servei" i la pista actual està "Oberta"
            if(remuntadorTancats==midaDependencies && estatPista.equals("Oberta")){
                llista.get(i).actualitzaEstat();
            }
            
            //Comprovo si hi ha ALGUN remuntador de la pista està "En Servei" i la pista actual està "Tancada"
            else if(remuntadorTancats!=midaDependencies && estatPista.equals("Tancada")){
                llista.get(i).actualitzaEstat();
            }
        }
    }
    
    /**
    * Mètode afegirPista afegeix la pista requerida
    * @param p
    */
    public void afegirPista (Pista p){
        llista.add(p);
    }
    
    /**
    * Mètode getPista 
    * @param nom
    * @return la pista amb el nom requerit
    */
    public Pista getPista (String nom){
        String nomPista;
        for (int i = 0; i < llista.size(); ++i){
            nomPista = llista.get(i).getNom();
            if (nomPista.equals(nom))
                return llista.get(i);
        }
        return null;
    }
    
    /**
    * Mètode llistarPistes 
    * @param estat
    * @return la llista de les pistes
    */
    public String llistarPistes(String estat){
        String pistesEstat = "";
        String pista;
        if(estat.equals("Tots")){
            for (int i = 0; i < llista.size(); ++i){
                pistesEstat = pistesEstat + llista.get(i).toString() + "\n";
                //EXPLICAR A LA MEMORIA QUE HE CANVIAT getNom() per toString()
            }
        }else{
            for (int i = 0; i < llista.size(); ++i){
                pista = llista.get(i).getEstatPista();
                if (pista.equals(estat))
                    pistesEstat = pistesEstat + llista.get(i).toString() + "\n";
            }
        }
        return pistesEstat;
    }
    
    /**
    * Mètode calculaKmsPistes
    * @param estat
    * @return la suma de les longitud de les pistes que tenen l'estat de neu 
    * requerit
    */
    public float calculaKmsPistes(String estat){
        float kmPistes=0;
        String pista;
        if(estat.equals("Tots")){
            for (int i = 0; i < llista.size(); ++i)
                kmPistes += llista.get(i).getLongitud();
        }else{
            for (int i = 0; i < llista.size(); ++i){
                pista = llista.get(i).getEstatPista();
                if (pista.equals(estat))
                    kmPistes += llista.get(i).getLongitud();
            }
        }
        return kmPistes;
    }
}

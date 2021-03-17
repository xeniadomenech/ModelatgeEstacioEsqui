
package pro2.model;

import java.util.ArrayList;

public class LlistaRemuntadors {
    
    private ArrayList<Remuntador> llista;
    
    //Constructor amb paràmetres
    /**
    * Constructor de Llista de Remuntadors
    */
    public LlistaRemuntadors(){
        this.llista = new ArrayList<>();
    }
    
    //Setter
    /**
    * Setter setLlista de 
    * @param llista
    */
    public void setLlista(ArrayList<Remuntador> llista) {
        this.llista = llista;
    }
    
    //Getter
    /**
    * Getter getLlista de 
    * @return la llista dels remuntadors
    */
    public ArrayList<Remuntador> getLlista() {
        return llista;
    }
    
    
    
    //Mètodes
    /**
    * Mètode actualitzaEstat actualitza l'estat dels remuntadors
    * @param meteo
    */
    public void actualitzaEstat(Meteo meteo){
        for (int i = 0; i < llista.size(); ++i)
            llista.get(i).actualitzaEstat(meteo);    
    }
    
    /**
    * Mètode afegirRemuntador afegeix un remuntador a la llista
    * @param rm
    */
    public void afegirRemuntador (Remuntador rm){
        llista.add(rm);
    }
    
    /**
    * Mètode totsForaDeServei
    * @return un boolea
    */
    public boolean totsForaDeServei(){
        for (int i = 0; i < llista.size(); i++) {
            if (llista.get(i).getEstat().equals("En Servei")){
                return false;
            }
        }
        return true;
    }
    
    /**
    * Mètode llistarRemuntadors 
    * @param estat
    * @return informació sobre els remuntadors
    */
    public String llistarRemuntadors(String estat){
        String remuntadorsEstat="";
        String remuntador;
        if(estat.equals("Tots")){
            for (int i = 0; i < llista.size(); ++i){
                remuntadorsEstat = remuntadorsEstat + llista.get(i).toString() + "\n";
            }
        }else{
            for (int i = 0; i < llista.size(); ++i){
                remuntador = llista.get(i).getEstat();
                if (remuntador.equals(estat))
                    remuntadorsEstat = remuntadorsEstat + llista.get(i).toString() + "\n";
            }
        }
        return remuntadorsEstat;
    } 
    
    /**
    * Mètode getNoms 
    * @return els noms dels remuntadors
    */
    public String getNoms(){
        String noms = " ";
        for (int i = 0; i < llista.size(); ++i){
            noms = noms + llista.get(i).getNom()+" ";
        }
        return noms;
    }
}

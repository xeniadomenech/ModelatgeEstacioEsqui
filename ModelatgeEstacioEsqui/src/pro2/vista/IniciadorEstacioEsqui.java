
package pro2.vista;


public class IniciadorEstacioEsqui {

    
    public static void main(String[] args) {
        // Definim el nom i les condicions meteorologiques inicials a l'estació
        String nomEstacio     = "Vall2000";
        int velocitatVent     = 0;
        String visibilitat    = "Bona";

        // Creem un objecte de la vista i li passem el nom i condicions meteorologiques inicials a l'estació
        VistaEstacioEsqui vistaEstacioVall2000 = new VistaEstacioEsqui(nomEstacio, velocitatVent, visibilitat);
     
        // Inicialitzem l'execució de la vista
        vistaEstacioVall2000.gestioEstacio();
      
    }
    
}

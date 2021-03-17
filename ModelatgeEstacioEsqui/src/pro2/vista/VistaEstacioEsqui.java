
package pro2.vista;

import java.util.Scanner;
import pro2.model.EstacioEsqui;
import java.text.DecimalFormat;

public class VistaEstacioEsqui {
    
    /* Atributs */
    private EstacioEsqui estacio;
    private static DecimalFormat df = new DecimalFormat("0.00");
    
    /* Constructor de la Vista*/
    /**
    * Constructor de Vista Estacio Esqui
     * @param nomEstacio
     * @param velocitatVent
     * @param visibilitat
    */
    public VistaEstacioEsqui(String nomEstacio, int velocitatVent, String visibilitat) {
        this.estacio = new EstacioEsqui(nomEstacio, visibilitat, velocitatVent);
        this.estacio.inicialitzaDadesVall2000();
    }
    
    /* Métodes */

    public static String[] getDescMenu() {
        return descMenu;
    }
    
    public void gestioEstacio() {
        // Creación de un objeto para leer el input desde el teclado
        Scanner sc = new Scanner(System.in);
        // Llamar a la funcion que gestiona el menu
        gestioMenu(sc);
    }
    
    /* ******************************************** */
    /* Gestion, Opciones y Descripcion del Menu (M) */
    /* ******************************************** */
   
    private static enum OpcionesMenu {
        M_Opcion_1_ListarPistas,
        M_Opcion_2_ListarPistasAbiertas,
        M_Opcion_3_ListarPistasCerradas,
        M_Opcion_4_ListarRemontadores,
        M_Opcion_5_ListarRemontadoresEnServicio,
        M_Opcion_6_ListarRemontadoresFueraServicio,
        M_Opcion_7_ModificarEstadoNieve,
        M_Opcion_8_CalcularTotalKms,
        M_Opcion_9_Modificar_Vent,
        M_Opcion_10_Modificar_Visibilitat,
        M_Opcion_11_Report_Meteo,
        M_Opcion_12_Salir
    };
    
    // Descripcion de las opciones del menu principal
    private static final String[] descMenu = {
        "Llistar la informació de totes les pistes", // Opcion 1
        "Llistar la informació de les pistes obertes",  // Opcion 2
        "Llistar la informació de les pistes tancades",  // Opcion 3
        "Llistar la informació de tots els remuntadors mecànics",  // Opcion 4
        "Llistar la informació dels remuntadors en servei",  // Opcion 5
        "Llistar la informació dels remuntadors fora de servei",  // Opcion 6
        "Modificar l'estat de la neu d'una pista",  // Opcion 7
        "Calcular i mostrar el total de kilometres de pistes i de pistes obertes",  // Opcion 8
        "Modificar la velocitat del vent",  // Opcion 9
        "Modificar la visibilitat",  // Opcion 10
        "Mostrar les condicions meteorologiques actuals",  // Opcion 11
        "Sortir del gestor de l'estació"  // Opcion 12
    };
    
    // Funcion que gestiona el menu principal de la aplicacion
    // Tiene 3 pasos principales:
    //   1. Crear el objeto que representa (contiene) el menu
    //   2. Asignar las descripciones del menu
    //   3. Bucle donde se trata la opcion seleccionada por el usuario
    public void gestioMenu(Scanner sc) {
        // Creación del objeto que representa el menu. El primer argumento del constructor es el nombre del menu
        Menu<OpcionesMenu> menuEstacio = new Menu<>("Menu " + estacio.getNom(), OpcionesMenu.values());
        //Menu<OpcionesMenu> menuEstacio = new Menu<>("Menu " + estacio.getNomEstacio(), OpcionesMenu.values());
        
        // Assignar una descripción a cada una de las opciones
        //  - OPCIONAL - Por defecto enseña el nombre de la opción5
        
        menuEstacio.setDescripcions(descMenu);
        
        // Variable (de tipo enumerado igual a las opciones del menu) que contiene la opcion escogida
        OpcionesMenu opcionMenu;
        
        //Variables útils
        String novaDada;
        String nomPista;
        int novaVelocitatVent;

        // Lanzar el bucle principal de la aplicación
        do {
            menuEstacio.mostrarMenu();
            opcionMenu = menuEstacio.getOpcio(sc);
            
            switch(opcionMenu) {
                case M_Opcion_1_ListarPistas:
                    
                    //Informació pistes
                    System.out.println("INFORMACIO DE TOTES LES PISTES\n");
                    System.out.println(estacio.toStringPistes("Tots"));
                    
                    break;
                case M_Opcion_2_ListarPistasAbiertas:
                    
                    //Informació pistes obertes
                    System.out.println("INFORMACIO DE LES PISTES *OBERTES*\n");
                    System.out.println(estacio.toStringPistes("Oberta"));
                    
                    break;
                case M_Opcion_3_ListarPistasCerradas:
                    
//                  //Informació pistes tancades
                    System.out.println("INFORMACIO DE LES PISTES *TANCADES*\n");
                    System.out.println(estacio.toStringPistes("Tancada"));
                    
                    break;
                case M_Opcion_4_ListarRemontadores:
                    
                    //Informació remuntadors
                    System.out.println("INFORMACIO DE TOTS ELS REMUNTADORS\n");
                    System.out.println(estacio.toStringRemuntadors("Tots"));
                    
                    break;
                case M_Opcion_5_ListarRemontadoresEnServicio:
                    
                    //Informació remuntadors en servei
                    System.out.println("INFORMACIO DELS REMUNTADORS *EN SERVEI*\n");
                    System.out.println(estacio.toStringRemuntadors("En Servei"));
                    
                    break;
                case M_Opcion_6_ListarRemontadoresFueraServicio:
                    
                    //Informació remuntadors fora de servei
                    System.out.println("INFORMACIO DELS REMUNTADORS *FORA DE SERVEI*\n");
                    System.out.println(estacio.toStringRemuntadors("Fora de Servei"));
                    
                    break;
                case M_Opcion_7_ModificarEstadoNieve:
                    
                    //Quina pista volem modificar
                    do{
                        System.out.println("De quina pista vol modificar l'estat de la neu?"
                                + " (Recordi que nomes pot introduir pistes que exiteixin)\n");
                        nomPista = sc.nextLine();     
                    }while(estacio.getPista(nomPista)==null);
                    
                    //Quin estat de neu tenim
                    do{
                        System.out.println("Quin és el nou estat de la neu? (Opcions: Pols, Dura o Primavera)\n");
                        novaDada = sc.nextLine();
                    }while(!novaDada.equals("Pols") && !novaDada.equals("Dura") && !novaDada.equals("Primavera"));
                    
                    //Modifiquem l'estat de la Pista desitjada
                    estacio.modificoEstatNeu(nomPista,novaDada);
                   
                    break;
                case M_Opcion_8_CalcularTotalKms:
                    
                    //Calculem els kms de totes les pistes
                    System.out.println("Kms totals de pista: " + df.format(estacio.calculaKmsPistes("Tots")) + "\n" + 
                            "Kms de pista *esquiables*: " + df.format(estacio.calculaKmsPistes("Oberta")) + "\n");
                    
                    break;
                case M_Opcion_9_Modificar_Vent:
                    
                    //Introduim la nova velocitat del vent
                    do{
                        System.out.println("Quina velocitat del vent tenim actualment?\n(Dada en km/h)\n");
                        novaVelocitatVent = sc.nextInt();
                    }while(novaVelocitatVent < 0);
                    
                    //Modifiquem pistes i remuntadors
                    estacio.modificaVelocitatVent(novaVelocitatVent);
                  
                    break;
               case M_Opcion_10_Modificar_Visibilitat:                    
                    //Introduim la nova visibilitat
                    do{
                        System.out.println("Quina visibilitat tenim actualment?\n(Opcions: Bona o Dolenta)\n");
                        novaDada = sc.nextLine();
                    }while(!novaDada.equals("Bona") && !novaDada.equals("Dolenta"));
 
                    //Modifiquem pistes i remuntadors                   
                    estacio.modificaVisibilitat(novaDada);
                    
                    break;
                case M_Opcion_11_Report_Meteo:
                    System.out.println(estacio.toStringMeteo());
                    break;
            }  
        } while(opcionMenu != OpcionesMenu.M_Opcion_12_Salir);
    }
}


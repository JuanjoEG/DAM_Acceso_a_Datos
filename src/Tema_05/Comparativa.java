package Tema_05;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Comparativa {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 05                                       MANEJO DE CONECTORES II
********************************************************************************************************************
*                                                     COMPARATIVA
********************************************************************************************************************
            *                         *     H2     *    DERBY   *  HYPERSQL  *   MYSQL    *  POSTGRESS *
            ********************************************************************************************
            *     BD  EMBEBIDAS       *     SI     *     SI     *     SI     *            *            *
            ********************************************************************************************
            *    BD INDEPENDIENTE     *            *            *            *     SI     *     SI     *
            ********************************************************************************************
            *        JAVA PURO        *     SI     *     SI     *     SI     *     NO     *     NO     *
            ********************************************************************************************
            *      MODO MEMORIA       *     SI     *     SI     *     SI     *     NO     *     NO     *
            ********************************************************************************************
            *      BD ENCRIPTADA      *     SI     *     SI     *     SI     *     NO     *     NO     *
            ********************************************************************************************
            *       DRIVER ODBC       *     SI     *     NO     *     NO     *     SI     *     SI     *
            ********************************************************************************************
            * BÚSQUEDA TEXTO COMPLETO *     SI     *     NO     *     NO     *     SI     *     SI     *
            ********************************************************************************************
            *          MVCC           *     SI     *            *            *     SI     *     SI     *
            ********************************************************************************************
            *    ESPACIO EMBEBIDO     *  ~2.0 MB   *  ~3.0 MB   *  ~1.5 MB   *     --     *     --     *
            ********************************************************************************************
            *    ESPACIO CLIENTE      *  ~500 KB   *  ~600 KB   *  ~1.5 MB   *  ~1.0 MB   *  ~700 KB   *
********************************************************************************************************************
*  0. SALIR.
********************************************************************************************************************

                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                  
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}
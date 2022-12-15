package Tema_07;

import Tema_06.*;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_07 {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""
                               
        *******************************************************************************************************
        *  TEMA 07                          EL MAPEO OBJETO RELACIONAL                                        *
        *******************************************************************************************************
        *                                                                                                     *
        *  1. DEFINICIÓN DEL MAPEO OBJETO RELACIONAL.                                                         *
        *  2. VENTAJAS E INCONVENIENTES DEL MAPEO OBJETO RELACIONAL.                                          *
        *  3. FASES DE MAPEO OBJETO RELACIONAL.                                                               *
        *  4. HERRAMIENTAS ORM.                                                                               *
        *                                                                                                     *
        *  5. DEFINICIÓN DE LA ARQUITECTURA DE HIBERNATE.                                                     *
        *  6. COMPONENTES PRINCIPALES DE HIBERNATE.                                                           *
        *                                                                                                     *
        *  7. TABLA RESUMEN.                                                                                  *
        *                                                                                                     *
        *******************************************************************************************************
        *  0. SALIR.                                                                                          *
        *******************************************************************************************************                          


                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1" -> DefinicMapeoOR.main(args);
                    case "2" -> VentajasInconvenientesORM.main(args);
                    case "3" -> FasesMapeoOR.main(args);
                    case "4" -> HerramientasORM.main(args);
                    case "5" -> DefinicArquitectHibernate.main(args);
                    case "6" -> ComponPrincHibernate.main(args);
                    
                    case "7" -> TablaResumenT07.main(args);
                    
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
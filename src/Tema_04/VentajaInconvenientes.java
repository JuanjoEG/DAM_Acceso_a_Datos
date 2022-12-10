package Tema_04;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class VentajaInconvenientes {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
************************************************************************************************************************************
*  TEMA 04                                       MANEJO DE CONECTORES I                                                            *
************************************************************************************************************************************
*                                     VENTAJAS E INCONVENIENTES DEL USO DE CONECTORES                                              *
************************************************************************************************************************************
* TIPO DRIVER *                VENTAJAS :)                            *                     INCONVENIENTES  :(                     *
************************************************************************************************************************************
************************************************************************************************************************************
*  TIPO 1     *  F�CIL DE ENCONTRAR, SE DISTRIBUYE CON JAVA           *  PEOR RENDIMIENTO: DEMASIADAS CAPAS INTERMEDIAS            *
* PUENTE ODBC *  ACCESO A GRAN CANTIDAD DE DRIVER ODBC                *  LIMITACI�N DE FUNCIONALIDAD                               *
*             *                                                       *  NO FUNCIONAN BIEN CON APPLETS                             *
************************************************************************************************************************************
*  TIPO 2     *  MEJOR RENDIMIENTO QUE EL TIPO 1                      *  NECESITA EL DRIVER INSTALADO EN EL CLIENTE                *
*  API NATIVO *                                                       *  NO SE PUEDE MOVER ENTRE PLATAFORMAS                       *
*             *                                                       *                                                            *
************************************************************************************************************************************
*  TIPO 3     *  NO NECESITA LIBRER�A DEL FABRICANTE EN EL CLIENTE    *  REQUIEREN C�DIGO ESPEC�FICO DE BBDD EN LA CAPA INTERMEDIA *
* MIDDLEWARE  *  MEJOR RENDIMIENTO EN INTERNET                        *  EL SERVIDOR DEBER� ESTAR EQUIPADO CON TODOS LOS DRIVERS   *
*  (3 CAPAS)  *  MUCHAS OPCIONES DE PORTABILIDAD Y ESCALABILIDAD      *  PARA DAR SOPORTE A CUALQUIER M�QUINA CLIENTE              *
************************************************************************************************************************************
*  TIPO 4     *  BUEN RENDIMIENTO                                     *  EL USUARIO NECESITATAR� DISTINTO SOFTWARE DE              *
*  PROTOCOLO  *  NO NECESITAN INSTALAR UN SOFTWARE ESPECIAL           *            CONEXI�N (DRIVER) PARA CADA BBDD                *
*  NATIVO     *  LOS DRIVES SON DE F�CIL ACCESO                       *                                                            *
************************************************************************************************************************************
*  0. SALIR.                                                                                                                       *
************************************************************************************************************************************

                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                  
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}
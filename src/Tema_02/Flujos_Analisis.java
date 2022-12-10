package Tema_02;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Flujos_Analisis {
        
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 02                                       FLUJOS  -  STREAMS  
********************************************************************************************************************
*   1/3                                  CLASES DE ANÁLISIS PARA FLUJOS DE DATOS  
********************************************************************************************************************
  ANÁLISIS PREVIO:
  ANÁLISIS DE DATOS PREVIO DE UN InputStream:
                               
        PushBackInputStream (A NIVEL DE BYTE)          -->  byte A byte
        PushbackReader      (A NIVEL DE CARACTERES)
  
            - LEEN CONTENIDO CON ANTICIPACIÓN PARA SABER QUÉ SE APROXIMA,
              PARA ASÍ PODER INTERPRETAR EL CONTENIDO ACTUAL.
                               
            - ESTOS CONTENIDOS LEÍDOS CON ANTERIORIDAD,
              SERÁN DE NUEVO 'EMPUJADOS' A LA SECUENCIA,
              PARA LEERLOS POSTERIORMENTE CUANDO SE HAGA DE NUEVO read().                      
                               
********************************************************************************************************************

                            """);
        continuar();
        System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 02                                       FLUJOS  -  STREAMS  
********************************************************************************************************************
*   2/3                                  CLASES DE ANÁLISIS PARA FLUJOS DE DATOS  
********************************************************************************************************************
  StreamTokenizer PERMITE ANALIZAR Strem POR tokens.
  TOKEN --> TROZO DEL CONTENIDO DEL FICHERO.
                           
            - EVALUAR LOS TOKENS DETECTA SI SON PALABRAS NÚMEROS.
                           
            - RECONOCE IDENTIFICADORES. (NÚMEROS, COMILLAS, ESPACIOS).
                     ÚTIL EN APLICATIVOS DE ANÁLISIS DE FICHEROS SEGÚN SU TIPOLOGÍA SEA NÚMEROS O CARACTERES.                               
                               
            - DISPONE DE ALGUNOS MÉTODOS ESTÁTICOS QUE DAN INFORMACIÓN DE LOS TOKENS:
                    - TT_EOF:     -->  END OF FILE.
                    - TT_EOL:     -->  END OF LINE.
                    - TT_WORD:    -->  TIPO PALABRA.
                    - TT_NUMBER:  -->  TIPO NÚMERO.
                           
********************************************************************************************************************

                            """);
        continuar();
        System.out.println(""" 

********************************************************************************************************************
*  TEMA 02                                       FLUJOS  -  STREAMS  
********************************************************************************************************************
*   3/3                                  CLASES DE ANÁLISIS PARA FLUJOS DE DATOS  
********************************************************************************************************************
  LineNumberReader  PERMITE ANALIZAR UN Stream POR LÍNEAS.
  LineNumberReader  ES UN OBJETO DE TIPO BufferedReader QUE ALMACENA Y CUENTA EL NÚMERO DE LÍNEAS DE CARACTERES.
                           
        - ESTÁ ORIENTADA A TRABAJAR Y ANALIZAR LÍNEAS COMPLETAS.
        - EMPIEZA LEYENDO POR LA PRIMERA LÍNEA CON EL CONTADOR A 0.
        - CADA VEZ QUE ENCUENTRA UN RETORNO DE CARRO SUMA 1 A SU VALOR.
                           
        - MÉTODOS CLAVE DE ESTA CLASE:
                - getLineNumber()        DEVUELVE EL NÚMERO DE LA LÍNEA EN LA QUE ESTEMOS ACTUALMENTE LEYENDO.
                - setLineNumber()        SE LE PASA COMO PARÁMETRO UN ENTERO, Y SE CONVERTIRÁ EN LA LÍNEA ACTUAL.
                - readLine()             DEVOLVERÁ UN CONJUNTO DE CARACTERES QUE SE LE DEBE ASIGNAR A UNA VARIABLE STRING.
                - read()
                             
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
package Tema_02;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
*   1/3                                  CLASES DE AN�LISIS PARA FLUJOS DE DATOS  
********************************************************************************************************************
  AN�LISIS PREVIO:
  AN�LISIS DE DATOS PREVIO DE UN InputStream:
                               
        PushBackInputStream (A NIVEL DE BYTE)          -->  byte A byte
        PushbackReader      (A NIVEL DE CARACTERES)
  
            - LEEN CONTENIDO CON ANTICIPACI�N PARA SABER QU� SE APROXIMA,
              PARA AS� PODER INTERPRETAR EL CONTENIDO ACTUAL.
                               
            - ESTOS CONTENIDOS LE�DOS CON ANTERIORIDAD,
              SER�N DE NUEVO 'EMPUJADOS' A LA SECUENCIA,
              PARA LEERLOS POSTERIORMENTE CUANDO SE HAGA DE NUEVO read().                      
                               
********************************************************************************************************************

                            """);
        continuar();
        System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 02                                       FLUJOS  -  STREAMS  
********************************************************************************************************************
*   2/3                                  CLASES DE AN�LISIS PARA FLUJOS DE DATOS  
********************************************************************************************************************
  StreamTokenizer PERMITE ANALIZAR Strem POR tokens.
  TOKEN --> TROZO DEL CONTENIDO DEL FICHERO.
                           
            - EVALUAR LOS TOKENS DETECTA SI SON PALABRAS N�MEROS.
                           
            - RECONOCE IDENTIFICADORES. (N�MEROS, COMILLAS, ESPACIOS).
                     �TIL EN APLICATIVOS DE AN�LISIS DE FICHEROS SEG�N SU TIPOLOG�A SEA N�MEROS O CARACTERES.                               
                               
            - DISPONE DE ALGUNOS M�TODOS EST�TICOS QUE DAN INFORMACI�N DE LOS TOKENS:
                    - TT_EOF:     -->  END OF FILE.
                    - TT_EOL:     -->  END OF LINE.
                    - TT_WORD:    -->  TIPO PALABRA.
                    - TT_NUMBER:  -->  TIPO N�MERO.
                           
********************************************************************************************************************

                            """);
        continuar();
        System.out.println(""" 

********************************************************************************************************************
*  TEMA 02                                       FLUJOS  -  STREAMS  
********************************************************************************************************************
*   3/3                                  CLASES DE AN�LISIS PARA FLUJOS DE DATOS  
********************************************************************************************************************
  LineNumberReader  PERMITE ANALIZAR UN Stream POR L�NEAS.
  LineNumberReader  ES UN OBJETO DE TIPO BufferedReader QUE ALMACENA Y CUENTA EL N�MERO DE L�NEAS DE CARACTERES.
                           
        - EST� ORIENTADA A TRABAJAR Y ANALIZAR L�NEAS COMPLETAS.
        - EMPIEZA LEYENDO POR LA PRIMERA L�NEA CON EL CONTADOR A 0.
        - CADA VEZ QUE ENCUENTRA UN RETORNO DE CARRO SUMA 1 A SU VALOR.
                           
        - M�TODOS CLAVE DE ESTA CLASE:
                - getLineNumber()        DEVUELVE EL N�MERO DE LA L�NEA EN LA QUE ESTEMOS ACTUALMENTE LEYENDO.
                - setLineNumber()        SE LE PASA COMO PAR�METRO UN ENTERO, Y SE CONVERTIR� EN LA L�NEA ACTUAL.
                - readLine()             DEVOLVER� UN CONJUNTO DE CARACTERES QUE SE LE DEBE ASIGNAR A UNA VARIABLE STRING.
                - read()
                             
********************************************************************************************************************
*  0. SALIR.
********************************************************************************************************************

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
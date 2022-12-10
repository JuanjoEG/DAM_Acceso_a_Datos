package Tema_03;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class PruebasDocument {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   1/4                           PRUEBAS Y DOCUMENTACIÓN JUnit  
********************************************************************************************************************
   
   - UNA PRUEBA (TEST) ES UNA PIEZA DE SOFTWARE QUE EJECUTA OTRA PIEZA DE SOFTWARE.
    (UN PROGRAMA QUE EJECUTA OTRO PROGRAMA).
           - VALIDA SI LOS RESULTADOS DE UN CÓDIGO ESTÁN EN EL ESTADO QUE SE ESPERA, 
             O EJECUTA LA SECUENCIA ESPERADA DE OPERACIONES O EVENTOS.
           - AYUDAN AL PROGRAMADOR A VERIFICAR QUE UN FRAGMENTO DE CÓDIGO ES CORRECTO.
           - ES UNA BUENA PRÁCTICA QUE LAS PRUEBAS LAS HAGAN PERSONAS O EQUIPOS DIFERENTES
             DE LAS PERSONAS QUE DESARROLLAN LOS PROGRAMAS.
           - EXISTEN DIFERENTES TIPOS DE PRUEBAS; DOS DE LOS MÁS IMPORTANTES SON:
                   - PRUEBAS UNITARIAS (UNIT TESTING) PARA CHEQUEAR UN COMPONENTE DE MANERA INDIVIDUAL.
                     (POR EJEMPLO PARA CHEQUEAR UNA CLASE O UN MÉTODO JAVA).
                   - PRUEBAS INTEGRADAS, COMPRUEBA EL FUNCIONAMIENTO DE VARIOS COMPONENTES TRABAJANDO EN CONJUNTO.
                     (INCLUYE LA COMUNICACIÓN ENTRE ELLOS).                               
                               
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   2/4                           PRUEBAS Y DOCUMENTACIÓN JUnit
********************************************************************************************************************

   - JUnit ES UN MARCO DE TRABAJO (UN FRAMEWORK) PARA HACER PRUEBAS UNITARIAS,
     QUE REALIZA ANOTACIONES @Test PARA IDENTIFICAR TEST A REALIZAR:                           
           - HABITUALMENTE, LOS IDES QUE SOPORTAN JUnit, AL ESCRIBIR LA ANOTACIÓN @Test,
             ENTENDERÁN QUE QUEREMOS INTRODUCIR LIBRERÍAS DE Junit.
           - LO QUE HARÁ JUnit ES CREAR UN MÉTODO QUE ESTÁ EN EL INTERIOR DE UNA CLASE LLAMADA Test class.
           - DE ESTA FORMA, PARA DEFINIR QUE UN MÉTODO FORMA PARTE PARTE DE UN TEST,
             SOLO HAY QUE AÑADIR LA ANOTACIÓN @Test SOBRE LA CABECERA DEL MÉTODO.
           - JUnit UTILIZA ADEMÁS OTRAS ANOTACIONES Y MÉTODOS QUE SON MUY ÚTILES PARA ESCRIBIR TEST UNITARIOS:
                   - ANOTACIÓN @Before: SIEMPRE QUE EJECUTEMOS UN TEST UNITARIO, ANTES,
                     SE EJECUTARÁ EL CÓDIGO DE ESTE MÉTODO CON ANOTACIÓN @Before.
                            - NORMALMENTE SE UTILIZA PARA INSTANCIAR LA MAYOR PARTE
                              DE LAS VARIABLES QUE VAMOS A NECESITAR PARA LOS TEST.
                   - ANOTACIÓM @After: ESTA ANOTACIÓN DEFINE UN MÉTODO QUE SE EJECUTARÁ SIEMPRE
                     AL FINALIZAR CUALQUIER TEST DENTRO DE NUESTRA CLASE.
                             
   - UNA ANOTACIÓN EN JAVA ES UNA CARACTERÍSTICA QUE PERMITE INCRUSTAR INFORMACIÓN SUPLEMENTARIA EN EL CÓDIGO FUENTE.
           - NO CAMBIA LAS ACCIONES DE UN PROGRAMA, PERO PUEDE SER UTILIZADO POR VARIAS HERRAMIENTAS,
             TANTO DURANTE EL DESARROLLO COMO DURANTE EL DESPLIEGUE.
           - LAS ANOTACIONES EN JAVA COMIENZAN CON @.

********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   3/4                           PRUEBAS Y DOCUMENTACIÓN JUnit
********************************************************************************************************************

   - LO PRIMERO VA A SER DECIDIR LAS PRUEBAS A REALIZAR, CASOS DE PRUEBA, ETC...
           - EN NUESTRO CASO VAMOS A USAR EL EJEMPLO DE UNA SENCILLA CLASE Calculadora.
             EL MAIN SE ENCUENTRA EN LA CLASE PruebaUnitaria.
                       
   - UNA VEZ DECIDIDAS LAS PRUEBAS A REALIZAR, PARA UTILIZAR JUnit PARA IMPLEMENTARLAS EN NetNeans:
           - BOTÓN DERECHO SOBRE EL NOMBRE DEL PAQUETE --> NEW --> TEST FOR EXISTING CLASS.
           - O SOBRE EL NOMBRE DE LA CLASE Calculadora --> TOOLS --> CREATE/UPDATE TESTS.
           - SELECCIONAMOS LA CLASE DE LA QUE QUEREMOS HACER LA PRUEBA, Y LOS TIPOS DE PRUEBAS QUE QUEREMOS REALIZAR.
           - SE NOS GENERARÁ UN NUEVO PAQUETE Test Packages, Y DENTRO UNA NUEVA CLASE CalculadoraTest,
             CON UN ESQUELETO CON LAS ANOTACIONES:
                   - EN LA ANOTACIÓN @Test PONDREMOS LA PRUEBAS.
                   - EN LAS ANOTACIONES @Before Y @After PONDREMOS
                     EL CÓDIGO QUE QUEREMOS EJECUTAR ANTES Y DESPUES DE LAS PRUEBAS.
                             
   - EL CÓDIGO QUE APARECE POR DEFECTO EN @Test LO MODIFICAMOS O SUSTITUIMOS POR LAS PRUEBAS QUE QUERAMOS QUE SE HAGAN.
     PODEMOS COPIAR Y PEGAR ESE CÓDIGO LAS VECES QUE QUERAMOS PARA REALIZAR DISTINTAS PRUEBAS JUNTAS.
                             
   - EN LOS PROYECTOS JavaANT  -->  HAY QUE AÑADIR LAS LIBRERÍAS DE JUnit4, JUnit5 Y Hamcrest.
           - PARA ACCEDER A LAS LIBRERÍAS: --> PROPERTIES  --> LIBRARIES  -->  +  --> ADD LIBRARY
                             
   - LAS ANOTACIONES QUE SE GENERAN POR DEFECTO, SON DE VERSIONES ANTIGUAS,
           - HAY QUE SUSTITUIR --> IMPORTAR EN  CalculadoraTest  LOS PAQUETES:
                             
    import org.junit.After;
    import org.junit.AfterClass;
    import org.junit.Before;
    import org.junit.BeforeClass;
    import org.junit.Test;
    import static org.junit.Assert.*; 
                             
   - COMENTAR LA LÍNEA:  -->  //fail("The test case is a prototype.");        
                             
   - BOTÓN DERECHO SOBRE CalculadoraTest --> TEST FILE.
           - EN LA PESTAÑA Test Result TENDRÍAMOS LOS RESULTADOS.
                             
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   4/4                           PRUEBAS Y DOCUMENTACIÓN JUnit
********************************************************************************************************************
                             
   - PARA HACER LA DOCUMENTACION USAMOS JAVADOC:
           
        - SIMILAR EN CIERTO MODO A JUnit, A PARTIR DEL CONTENIDO DEL CÓDIGO FUENTE EN ESTE CASO,
          GENERA DOCUMENTACIÓN EN FORMATO HTML, NAVEGABLE, DESCRIBIENDO MÉTODOS, PARÁMETROS, CLASES, ETC...
                             
        - UTILIZA LA INFORMACIÓN EN LOS COMENTARIOS DEL CÓDIGO:
                - DOS ASTERISCOS ** AL PRINCIPIO DE CADA MÉTODO.
                - UN ASTERISCO Y UNA ARROBA *@ PARA INDICAR LOS COMENTARIOS DE LOS PARÁMETROS.
            
        - EN NetBeans SIMPLEMENTE HAY QUE PULSAR: --> RUN  -->  GENERATE JAVADOC.

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
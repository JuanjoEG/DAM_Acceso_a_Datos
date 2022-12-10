package Tema_03;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
*   1/4                           PRUEBAS Y DOCUMENTACI�N JUnit  
********************************************************************************************************************
   
   - UNA PRUEBA (TEST) ES UNA PIEZA DE SOFTWARE QUE EJECUTA OTRA PIEZA DE SOFTWARE.
    (UN PROGRAMA QUE EJECUTA OTRO PROGRAMA).
           - VALIDA SI LOS RESULTADOS DE UN C�DIGO EST�N EN EL ESTADO QUE SE ESPERA, 
             O EJECUTA LA SECUENCIA ESPERADA DE OPERACIONES O EVENTOS.
           - AYUDAN AL PROGRAMADOR A VERIFICAR QUE UN FRAGMENTO DE C�DIGO ES CORRECTO.
           - ES UNA BUENA PR�CTICA QUE LAS PRUEBAS LAS HAGAN PERSONAS O EQUIPOS DIFERENTES
             DE LAS PERSONAS QUE DESARROLLAN LOS PROGRAMAS.
           - EXISTEN DIFERENTES TIPOS DE PRUEBAS; DOS DE LOS M�S IMPORTANTES SON:
                   - PRUEBAS UNITARIAS (UNIT TESTING) PARA CHEQUEAR UN COMPONENTE DE MANERA INDIVIDUAL.
                     (POR EJEMPLO PARA CHEQUEAR UNA CLASE O UN M�TODO JAVA).
                   - PRUEBAS INTEGRADAS, COMPRUEBA EL FUNCIONAMIENTO DE VARIOS COMPONENTES TRABAJANDO EN CONJUNTO.
                     (INCLUYE LA COMUNICACI�N ENTRE ELLOS).                               
                               
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   2/4                           PRUEBAS Y DOCUMENTACI�N JUnit
********************************************************************************************************************

   - JUnit ES UN MARCO DE TRABAJO (UN FRAMEWORK) PARA HACER PRUEBAS UNITARIAS,
     QUE REALIZA ANOTACIONES @Test PARA IDENTIFICAR TEST A REALIZAR:                           
           - HABITUALMENTE, LOS IDES QUE SOPORTAN JUnit, AL ESCRIBIR LA ANOTACI�N @Test,
             ENTENDER�N QUE QUEREMOS INTRODUCIR LIBRER�AS DE Junit.
           - LO QUE HAR� JUnit ES CREAR UN M�TODO QUE EST� EN EL INTERIOR DE UNA CLASE LLAMADA Test class.
           - DE ESTA FORMA, PARA DEFINIR QUE UN M�TODO FORMA PARTE PARTE DE UN TEST,
             SOLO HAY QUE A�ADIR LA ANOTACI�N @Test SOBRE LA CABECERA DEL M�TODO.
           - JUnit UTILIZA ADEM�S OTRAS ANOTACIONES Y M�TODOS QUE SON MUY �TILES PARA ESCRIBIR TEST UNITARIOS:
                   - ANOTACI�N @Before: SIEMPRE QUE EJECUTEMOS UN TEST UNITARIO, ANTES,
                     SE EJECUTAR� EL C�DIGO DE ESTE M�TODO CON ANOTACI�N @Before.
                            - NORMALMENTE SE UTILIZA PARA INSTANCIAR LA MAYOR PARTE
                              DE LAS VARIABLES QUE VAMOS A NECESITAR PARA LOS TEST.
                   - ANOTACI�M @After: ESTA ANOTACI�N DEFINE UN M�TODO QUE SE EJECUTAR� SIEMPRE
                     AL FINALIZAR CUALQUIER TEST DENTRO DE NUESTRA CLASE.
                             
   - UNA ANOTACI�N EN JAVA ES UNA CARACTER�STICA QUE PERMITE INCRUSTAR INFORMACI�N SUPLEMENTARIA EN EL C�DIGO FUENTE.
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
*   3/4                           PRUEBAS Y DOCUMENTACI�N JUnit
********************************************************************************************************************

   - LO PRIMERO VA A SER DECIDIR LAS PRUEBAS A REALIZAR, CASOS DE PRUEBA, ETC...
           - EN NUESTRO CASO VAMOS A USAR EL EJEMPLO DE UNA SENCILLA CLASE Calculadora.
             EL MAIN SE ENCUENTRA EN LA CLASE PruebaUnitaria.
                       
   - UNA VEZ DECIDIDAS LAS PRUEBAS A REALIZAR, PARA UTILIZAR JUnit PARA IMPLEMENTARLAS EN NetNeans:
           - BOT�N DERECHO SOBRE EL NOMBRE DEL PAQUETE --> NEW --> TEST FOR EXISTING CLASS.
           - O SOBRE EL NOMBRE DE LA CLASE Calculadora --> TOOLS --> CREATE/UPDATE TESTS.
           - SELECCIONAMOS LA CLASE DE LA QUE QUEREMOS HACER LA PRUEBA, Y LOS TIPOS DE PRUEBAS QUE QUEREMOS REALIZAR.
           - SE NOS GENERAR� UN NUEVO PAQUETE Test Packages, Y DENTRO UNA NUEVA CLASE CalculadoraTest,
             CON UN ESQUELETO CON LAS ANOTACIONES:
                   - EN LA ANOTACI�N @Test PONDREMOS LA PRUEBAS.
                   - EN LAS ANOTACIONES @Before Y @After PONDREMOS
                     EL C�DIGO QUE QUEREMOS EJECUTAR ANTES Y DESPUES DE LAS PRUEBAS.
                             
   - EL C�DIGO QUE APARECE POR DEFECTO EN @Test LO MODIFICAMOS O SUSTITUIMOS POR LAS PRUEBAS QUE QUERAMOS QUE SE HAGAN.
     PODEMOS COPIAR Y PEGAR ESE C�DIGO LAS VECES QUE QUERAMOS PARA REALIZAR DISTINTAS PRUEBAS JUNTAS.
                             
   - EN LOS PROYECTOS JavaANT  -->  HAY QUE A�ADIR LAS LIBRER�AS DE JUnit4, JUnit5 Y Hamcrest.
           - PARA ACCEDER A LAS LIBRER�AS: --> PROPERTIES  --> LIBRARIES  -->  +  --> ADD LIBRARY
                             
   - LAS ANOTACIONES QUE SE GENERAN POR DEFECTO, SON DE VERSIONES ANTIGUAS,
           - HAY QUE SUSTITUIR --> IMPORTAR EN  CalculadoraTest  LOS PAQUETES:
                             
    import org.junit.After;
    import org.junit.AfterClass;
    import org.junit.Before;
    import org.junit.BeforeClass;
    import org.junit.Test;
    import static org.junit.Assert.*; 
                             
   - COMENTAR LA L�NEA:  -->  //fail("The test case is a prototype.");        
                             
   - BOT�N DERECHO SOBRE CalculadoraTest --> TEST FILE.
           - EN LA PESTA�A Test Result TENDR�AMOS LOS RESULTADOS.
                             
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   4/4                           PRUEBAS Y DOCUMENTACI�N JUnit
********************************************************************************************************************
                             
   - PARA HACER LA DOCUMENTACION USAMOS JAVADOC:
           
        - SIMILAR EN CIERTO MODO A JUnit, A PARTIR DEL CONTENIDO DEL C�DIGO FUENTE EN ESTE CASO,
          GENERA DOCUMENTACI�N EN FORMATO HTML, NAVEGABLE, DESCRIBIENDO M�TODOS, PAR�METROS, CLASES, ETC...
                             
        - UTILIZA LA INFORMACI�N EN LOS COMENTARIOS DEL C�DIGO:
                - DOS ASTERISCOS ** AL PRINCIPIO DE CADA M�TODO.
                - UN ASTERISCO Y UNA ARROBA *@ PARA INDICAR LOS COMENTARIOS DE LOS PAR�METROS.
            
        - EN NetBeans SIMPLEMENTE HAY QUE PULSAR: --> RUN  -->  GENERATE JAVADOC.

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
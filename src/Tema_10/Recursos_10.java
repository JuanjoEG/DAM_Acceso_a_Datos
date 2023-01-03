package Tema_10;

import static Principal_Main.Main.*;
import static Tema_10.T_10.*;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_10 {
  
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_10 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************
                       
            UNA BASE DE DATOS OBJETO-RELACIONAL ES UNA COMBINACIÓN DE BASE DE DATOS ORIENTADA A OBJETOS
            Y UN MODELO DE BASE DE DATOS RELACIONAL.
                    - SOPORTA OBJETOS, CLASES, HERENCIA, ETC. QUE TENDRÍAMOS EN LOS MODELOS ORIENTADOS A OBJETOS.
                    - TAMBIÉN TIENE SOPORTE PARA TIPOS DE DATOS O ESTRUCTURAS TABULARES (TABLAS), ENTRE OTRAS COSAS,
                      DEL MODELO DE DATOS RELACIONAL.
                       
            UNO DE LOS MAYORES OBJETIVOS DE LOS MODELOS DE BASES DE DATOS OBJETO-RELACIONALES ES ACORTAR DISTANCIAS ENTRE
            LAS BASES DE DATOS RELACIONALES Y LAS PRÁCTICAS ORIENTADAS A OBJETOS REALIZADAS FRECUENTEMENTE
            EN DIFERENTES LENGUAJES COMO C++, JAVA, C#, ETC.
                       
            DE ESTA FORMA, PODRÍAMOS REDEFINIR LA BASE DE DATOS OBJETO-RELACIONAL COMO AQUELLA BASE DE DATOS QUE EVOLUCIONA
            DESDE EL MODELO RELACIONAL HACIA ALGUNAS DE LAS CARACTERÍSTICAS DEL MODELO DE OBJETOS,
            HACIÉNDOLA UNA BASE DE DATOS HÍBRIDA.
                    - ORACLE, UNO DE LOS GESTORES DE BASES DE DATOS MÁS CONOCIDOS,
                      IMPLEMENTA EL MODELO DE OBJETO COMO EXTENSIÓN DEL MODELO RELACIONAL.
                       
            A SU VEZ, MUCHOS LENGUAJES, HAN SABIDO ADAPTARSE CON EXTENSIONES Y FRAMEWORKS
            PARA PODER TRABAJAR CON ESTAS BASES DE DATOS OBJETO RELACIONALES DE ORACLE.
                       
            EL RESULTADO ES UN MODELO RELACIONAL DE OBJETOS QUE OFRECE:
                    - LA INTUICIÓN Y LA ECONOMIA DE UNA INTERFAZ DE OBJETOS.
                    - CONSERVA SU ALTA CONCURRENCIA Y EL RENDIMIENTO DE UNA BASE DE DATOS RELACIONAL.
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """
        ************************************************************************************************************************
            - PODREMOS CREAR NUEVOS TIPOS DE DATOS COMPUESTOS,
            QUE PERMITIRÁN DISEÑAR APLICACIONES CON SOPORTE DE DOMINIOS MÁS COMPLEJOS.
                    - SE PODRÁN DEFINIR, AL MENOS, DOS MÉTODOS:
                            - UNO PARA CONVERTIR DE ESTE TIPO COMPUESTO A CARACTERES ASCII.
                            - OTRO QUE HAGA LA INVERSA, DESDE CARACTERES ASCII HASTA NUEVOS TIPOS DE DATOS.
                    - SE SOPORTARÁN DISTINTOS TIPOS COMPLEJOS COMO, POR EJEMPLO:
                            - REGISTROS.
                            - LISTAS Y ARRAIS.
                            - REFERENCIAS.
                            - PILAS Y COLAS.
                    - CON ESTOS TIPOS DE DATOS, SE PUEDEN CREAR FUNCIONES CON CÓDIGO EN LENGUAJES, COMO SQL, JAVA O C#.
                       
            - DISPONIBILIDAD DE MÁS CAPACIDAD DE EXPRESIÓN PARA DEFINIR CONCEPTOS Y ASOCIACIONES.
                       
            - POSIVILIDAD DE CREACIÓN DE OPERADORES ASIGNANDO NOMBRE Y EXISTENCIA DE AQUELLAS CONSULTAS MÁS COMPLEJAS.
                    - TAMBIÉN SE CREAN OPERADORES USANDO MÉTODOS, ESTOS MÉTODOS SERÁN, EN CIERTO MODO, OPERADORES.
                       
             - EN LOS TIPOS DE REGISTRO, ESTILO RELACIONAL, PODREMOS USAR ENCADENAMIENTO Y HERENCIA.
                       
             - POSIBILIDAD DE USO DE LA REUSABILIDAD, COMPARTIENDO BIBLIOTECAS DE CLASES DEFINIDAS PREVIAMENTE.
                       
             - POSIBILIDAD DE INTRODUCIR COMPROBACIÓN DE REGLAS DE INTEGRIDAD POR MEDIO DE TRIGGERS.
                    - TRIGGER: SCRIPT DE CÓDIGO QUE PUEDE ESTAR ESCRITO EN DIFERNTES LENGUAJES,
                      QUE SE EJECUTA AUTOMÁTICAMENTE CUANDO SE REALIZAN DETERMINADAS OPERACIONES
                      EN LA INFORMACIÓN DE LA BASE DE DATOS.
                       
            - LAS BASES DE DATOS OBJETO-RELACIONALES ESTÁN MÁS ORIENTADAS A LA PROGRAMACIÓN,
              Y APORTAN A LA BASE DE DATOS CARACTERÍSTICAS DE LA ORIENTACIÓN A OBJETOS:
                     (ENCADENAMIENTO, HERENCIA, REUSABILIDAD, TIPOS DE DATOS COMPUESTOS, ETC...)
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_03 + """
        ************************************************************************************************************************
                       
            EN ORACLE, CON LA BASE DE DATOS OBJETO-RELACIONAL, TENDREMOS LA OPCIÓN DE DEFINIR NUESTROS PROPIOS TIPOS DE DATOS,
            PARTIENDO DE LOS TIPOS 'BÁSICOS' DE LOS QUE YA DISPONEMOS EN EL SISTEMA.
            NUESTROS NUEVOS TIPOS PODRÁN SER:
                    - TIPOS DE OBJETOS:      -->  PARA ELLO SE USARÁ  -->      OBJECT TYPE  (SOLO TIENE UN ELEMENTO)
                    - TIPOS DE COLECCIONES:  -->  PARA ELLO SE USARÁ  -->  COLLECTION TYPE  (TENDRÁ UNA COLECCIÓN DE ELEMENTOS)
                       
            DE ESTA FORMA, AHORA EN LA BASE DE DATOS,
            UN OBJETO REPRESENTA UNA ENTIDAD EN EL MUNDO REAL
            Y SE COMPONE DE:
                    - NOMBRE:
                            CON EL QUE IDENTIFICAMOS EL TIPO DE OBJETO.
                       
                    - ATRIBUTOS:
                            CON EL QUE DEFINIMOS LA ESTRUCTURA.
                                    - PUEDEN SER DE TIPO BÁSICO DEL SISTEMA.
                                    - PUENEN SER DE TIPO CREADO POR EL USUARIO.
                                     
                    - MÉTODOS:       
                            - PUEDEN SER FUNCIONES.        (DEVUELVEN UN VALOR)
                            - PUEDEN SER PROCEDIMIENTOS.   (NO DEVUELVEN NINGÚN VALOR)
                            - ESTÁN ESCRITOS EN:
                                    - CÓDIGO PL/SQL CUANDO ESTÁN ALMACENADOS EN LA PROPIA BASE DE DATOS.
                                    - EN EL LENGUAJE C CUANDO SE ALMACENAN EXTERNAMENTE.
                            - CREACIÓN DE UN MÉTODO EN ORACLE:
                                    - SE REALIZA JUNTO A LA CREACIÓN DE SU TIPOLOGÍA.
                                    - DEBE LLEVAR SIEMPRE UNA ESPECIFICACIÓN DEL TIPO DE COMPILACIÓN,
                                      PARA INDICAR CÓMO SE VA A GESTIONAR LA MANIPULACIÓN DE LOS DATOS O VARIABLES PL/SQL.
                                            - PRAGMA_RESTRICT_REFERENCIE --> EVITA DICHA MANIPULACIÓN.
                       
            RESPECTO A LOS NULOS:
                    HABRÁ QUE TENER EN CUENTA QUE EN ESTOS NUEVOS TIPOS DE DATOS,
                    SERÁ DIFERENTE UN OBJETO CUYO VALOR SEA NULL,   -->   SERÍA COMO SI TODAVÍA EL OBJETO NO EXISTE.
                    QUE DENOMINAREMOS UN OBJETO ATÓMICAMENTE NULO, 
                    Y NO SERÁ LO MISMO QUE UN OBJETO QUE TENGA TODOS SUS ATRIBUTOS A NULL.
                    EN ESE CASO, EL OBJETO EXISTE, AUNQUE SIN ATIBUTOS TODAVÍA.

                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        ************************************************************************************************************************
                       
                       
                CREATE TYPE address_t AS OBJECT (                      address_t   -> NOMBRE DEL TIPO DE DATO.
                street VARCHAR2(200),                                  street      -> ATRIBUTO BÁSICO.
                city VARCHAR2(200),                                    city        -> ATRIBUTO BÁSICO.
                prov CHAR(2),                                          prov        -> ATRIBUTO BÁSICO.
                poscode VARCHAR2(20));                                 poscode     -> ATRIBUTO BÁSICO.
                       

                CREATE TYPE vehiculo_t AS OBJECT (                     vehiculo_t  -> NOMBRE DEL TIPO DE DATO.
                nRuedas NUMBER,                                        nRuedas     -> ATRIBUTO BÁSICO.
                peso NUMBER,                                           peso        -> ATRIBUTO BÁSICO.
                largo NUMBER;                                          largo       -> ATRIBUTO BÁSICO.
                       

                CREATE TYPE coche_t AS OBJECT (                        coche_t     -> NOMBRE DEL TIPO DE DATO.
                tipo vehiculo_t,                                       tipo        -> ATRIBUTO CREADO POR EL USUARIO. HERENCIA.
                marca VARCHAR2(50);                                    marca       -> ATRIBUTO BÁSICO.
                       
                       
                CREATE TABLE vehiculos_año_tab OF vehiculo_t           CREA UNA TABLA DE OBJETOS DE TIPO vehiculo_t
                (numVehiculo PRIMARY KEY);                             CADA OBJETO CON SU PROPIO ID.

                CREATE TABLE vehiculos_antiguos_tab                    CREA UNA TABLA
                ( anio NUMBER, vehiculo vehiculo_t);                   UNA DE SUS COLUMNAS ES DE TIPO OBJETO.
                       
                       
                CREATE OR REPLACE TYPE Tipo:Cubo AS OBJECT (
                largo INTEGER,
                ancho INTEGER,
                alto INTEGER,
                MEMBER FUNCTION superficie RETURN INTEGER,
                MEMBER FUNCTION volumen RETURN INTEGER);
                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_05 + """
        ************************************************************************************************************************
                                            TABLAS Y TIPOS DE OBJETOS: EXPLOTACIÓN.
                       
            UNA VEZ SE HA REALIZADO LA DEFINICIÓN DE TIPOS, 
            PODEMOS TENER DISTINTOS OBJETIVOS PARA ESOS NUEVOS DATOS:
                    - PARA DEFINIR NUEVOS TIPOS.
                    - PARA ALMACENARLOS EN TABLAS DE ESE TIPO DE DATOS.
                    - PARA DEFINIR LOS DISTINTOS ATRIBUTOS DE UNA TABLA.
                       
            UNA TABLA DE OBJETOS ES UNA CLASE ESPECÍFICA DE TABLA QUE:
                    - ALMACENARÁ UN OBJETO POR CADA FILA.
                    - AL MISMO TIEMPO, FACILITA EL INGRESO DE LOS ATRIBUTOS DEL OBJETO, 
                      COMO SI FUERAN CUALQUIER OTRO TIPO DE COLUMNAS NORMALES DE LA TABLA.
                       
            SIN EMBARGO HAY QUE TENER EN CUENTA QUE NO ES LO MISMO UNA TABLA DE OBJETOS
            Y UNA TABLA EN LA QUE UNO DE SUS ATRIBUTOS ES UN OBJETO.
                    - UNA TABLA DE OBJETOS ALMACENA OBJETOS CON SU PROPIO ID.
                    - UNA TABLA DONDE UNO DE SUS ATRIBUTOS ES UN OBJETO,
                      ES UNA TABLA CON UNA COLUMNA CON UN TIPO DE DATO COMPLEJO,
                      PERO SIN IDENTIDAD DE OBJETO.
                       
            ORACLE PERMITE TAMBIÉN DEFINIR COMO TABLA:
                    - UNA COLUMNA CON TIPOLOGÍA DE OBJETO.
                    - UNA TABLA CON EL MISMO NÚMERO DE COLUMNAS
                      COMO ATRIBUTOS QUE ALMACENA, CONTIENE, EL OBJETO.                       
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_06 + """
        ************************************************************************************************************************
                       
            REM   Script: DAM 2 Acceso a Datos - Tema 10 - Ejemplo sencillo BD Objeto Relacionales
            REM   Ejemplo sencillo de creacion de un tipo de objeto, con metodos asociados, y consulta y ejecucion de metodos.
                         
            CREATE OR REPLACE TYPE Tipo_Cubo AS OBJECT (
                largo INTEGER,
                ancho INTEGER,
                alto INTEGER,
                MEMBER FUNCTION superficie RETURN INTEGER,
                MEMBER FUNCTION volumen RETURN INTEGER
            );
                         
            /
                         
            CREATE OR REPLACE TYPE BODY Tipo_Cubo AS
                MEMBER FUNCTION volumen RETURN INTEGER IS
                BEGIN
                    RETURN ( largo * ancho * alto );
                END;
                MEMBER FUNCTION superficie RETURN INTEGER IS
                BEGIN
                    RETURN 2 * ( (largo * ancho) + (largo * alto) + (ancho * alto) );
                END;
            END;
                         
            /
                         
            CREATE TABLE Cubos OF Tipo_Cubo
            ;
                         
            INSERT INTO Cubos VALUES(Tipo_Cubo (10, 10, 10))
            ;
                         
            INSERT INTO Cubos VALUES(Tipo_Cubo (3, 4, 5))
            ;
                         
            SELECT * FROM Cubos
            ;
                         
            SELECT c.volumen(), c.superficie()
            FROM Cubos c
            WHERE c.largo = 10
            ;
                         
            SELECT c.largo, c.ancho, c.alto, c.volumen(), c.superficie()
            FROM Cubos c
            WHERE c.largo = 10
            ;
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_07 + """
        ************************************************************************************************************************
                       
            PARA PODER ESTABLECER RELACIONES 'UNO A MUCHOS' (1:N), ORACLE NOS PERMITE DEFINIR COLECCIONES.
                    - UNA COLECCIÓN ESTÁ FORMADA POR UN NÚMERO NO DEFINIDO DE ELEMENTOS.
                    - TODOS LOS ELEMENTOS SON DEL MISMO TIPO.
                       
            SE PUEDEN DIVIDIR LOS TIPOS DE COLECCIÓN OBJETO-RELACIONAL EN ORACLE EN:
                    - VARRAYS.
                    - TABLAS ANIDADAS.
                       
            SE DEFINE UN ARRAY COMO UNA SERIE DE ELEMENTOS ORDENADOS QUE SON DEL MISMO TIPO.
                    - ESTOS ELEMENTOS TIENEN UN ÍNDICE QUE NOS SIRVE PARA SABER SU POSICIÓN DENTRO DEL ARRAY.
                    - ORACLE PERMITE QUE EL TIPO VARRAY SEA UN TIPO VARIABLE, PERO SE DEBE ESTABLECER EL MÁXIMO DE ELEMENTOS.
                       
            EN GENERAL, PODEMOS UTILIZAR EL VARRAY PARA:
                    - DEFINIR LA TIPOLOGÍA DE UNA COLUMNA DE UNA TABLA RELACIONAL.
                    - DEFINIR LA TIPOLOGÍA DE UN ATRIBUTO DE TIPO OBJETO.
                    - DEFINIR UNA VARIABLE DEL LENGUAJE PL/SQL.
                       
            UNA VEZ SE DECLARA UN OBJETO VARRAY, NO SE RESERVA REALMENTE NINGUNA CANTIDAD DE ESPACIO:
                    - SI EL ESPACIO ESTÁ DISPONIBLE, SE ALMACENA IGUAL QUE EL RESTO DE COLUMNAS.
                    - SI POR EL CONTRARIO, ES SUPERIOR A 4.000 BYTES, SE ALMACENARÁ EN UNA TABLA APARTE,
                      COMO DATO DE TIPO BLOB (BINARY LARGE OBJECTS).
                       
                    - CREAMOS UN VARRAY LLAMADO numeros:
                       
                            CREATE TYPE numeros AS VARRAY(10)          <-- CON MÁXIMO 10 ELEMENTOS DE TIPO NUMBER.
                            OF NUMBER(10);                             <-- CON MÁXIMO 10 CIFRAS CADA ELEMENTO.
                            numeros ('6', '18', '75870'); 
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_08 + """
        ************************************************************************************************************************
                       
            UNA TABLA ANIDADA ES UNA LISTA DE ELEMENTOS NO ORDENADOS QUE MANTIENEN UNA MISMA TIPOLOGÍA. (MISMO TIPO).
                    - EL MÁXIMO NO ESTÁ ESPECIFICADO EN LA DEFINICIÓN DE LA TABLA.
                    - EL ORDEN DE LOS ELEMENTOS NO EXISTE, POR TANTO NO SE MANTIENE.
                       
            LAS INSTRUCCIONES:
                    SELECT, INSERT, DELETE Y UPDATE 
                    SE REALIZAN DE LA MISMA FORMA QUE CON LAS TABLAS COMUNES, 
                    CON UNA DIFERENCIA, USANDO LA EXPRESIÓN TABLE.
                       
            UNA TABLA ANIDADA PUEDE SER VISTA O INTERPRETADA COMO UNA TABLA CON UNA ÚNICA COLUMNA,
            SIN NÚMERO MÁXIMO DE ELEMENTOS, Y ELEMENTOS NO ORDENADOS.
                    EN PARTICULAR SI ESTA COLUMNA DE LA TABLA ANIDADA ES UN TIPO DE OBJETO DE 'usuario',
                    LA TABLA PUEDE SER VISTA COMO UNA TABLA MULTICOLUMNA,
                    TENDRÁ UNA COLUMNA POR CADA ATRIBUTO DEL OBJETO 'usuario' QUE FUÉ DEFINIDO.
                       
            LA SINTAXIS PARA CREAR UNA TABLA ANIDADA 'tabla_tipo', CONTENIENDO OBJETOS DE TIPO 'usuario nombre_tipo':
                       
                                CREATE TYPE nombre_tipo AS TABLE OF tabla_tipo;
                       
            UNA VEZ DEFINIDO EL TIPO, PODEMOS USARLO PARA: (SON LOS MISMOS USOS QUE LE PODEMOS DAR AL VARAY).
                    - EL TIPO DE DATO DE UNA TABLA RELACIONAL.
                    - UN ATRIBUTO DE UN OBJETO DE TIPO 'usuario'.
                    - UNA VARIABLE PL/SQL, UN PARÁMETRO O UNA FUNCIÓN QUE DEVUELVA UN TIPO.
                       
            LA DEFINICIÓN DE LA TABLA DE 'usuario' TAMPOCO ASIGNARÁ ESPACIO. 
                    (AL IGUAL QUE CON LOS VARRAY, NO SE RESERVA ESPACIO EN EL MOMENTO DE LA CREACIÓN).
                                      
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_09 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_09 + """
        ************************************************************************************************************************
               
            LA BASE DE DATOS OBJETO-RELACIONAL ORACLE PERMITE QUE LOS IDENTIFICADORES ÚNICOS 
            QUE SE LES ASIGNA A LOS OBJETOS DE UNA TABLA PUEDAN SER REFERIDOS: 
                    UNOS OBJETOS TENDRÁN UN IDENTIFICADOR ÚNICO 
                    Y OTROS OBJETOS PODRÁN APUNTAR A ESOS IDENTIFICADORES.
                       
                            - DESDE LOS ATRIBUTOS DE OTROS OBJETOS DISTINTOS.
                                    PARA ELLO EN LOS OBJETOS UTILIZAREMOS UN ATRIBUTO QUE SE ESPECIFICARÁ COMO  -->  REF,
                                    Y QUE GUARDARÁ UNA REFERENCIA (UN ENLACE) A OTRO OBJETO,
                                    GENERANDO UNA RELACIÓN ENTRE AMBOS OBJETOS.
                                    AMBOS OBJETOS ESTARÁN UNIDOS.
                       
                            - DESDE LA COLUMNA DE UNA TABLA.
                                    UNA VEZ HEMOS DEFINIDO UNA COLUMNA DE TIPO REF,
                                    SE PUEDE ACORTAR EL ALCANCE A LOS OBJETOS QUE SE GUARDEN EN UNA DETERMINADA TABLA,
                                    UTILIZANDO LA CLÁUSULA  -->  SCOPE FOR () IS.
                       
            ESTE TIPO DE REFERENCIAS:
                    - SE USARÁN PARA ACCEDER A LOS OBJETOS RELACIONADOS Y ACTUALIZADOS.
                    - NO ES POSIBLE REALIZAR OPERACIONES DIRECTAMENTE SOBRE LAS REFERENCIAS,
                      TENEMOS QUE TENER EN CUENTA QUE SON IDENTIFICADORES DE OBJETOS.
                    - PARA USAR UNA RESERENCIA O ACTUALIZARLA, USAREMOS:
                            REF   -->  PARA CAMBIAR A OTRA REFENCIA.
                            NULL  -->  PARA ELIMINAR LA REFERENCIA.
                       
                       
            CREATE TABLE clientes_tab OF cliente_t;            -->  CREACIÓN DE UNA TABLA DE OBJETOS DEL TIPO DEFINIDO cliente_t

            CREATE TYPE ordenes_t AS OBJECT (                  -->  CREACIÓN DE UN TIPO DE OBJETO ordenes_t
            ordennum NUMBER,                                   -->  ATRIBUTO BÁSICO.
            cliente REF clientes_t,                            -->  ATRIBUTO REFERENCIA A UN OBJETO DEL TIPO DEFINIDO cliente_t
            fechapedido DATE,                                  -->  ATRIBUTO BÁSICO.
            direntrega direccion_t);                           -->  ATRIBUTO CREADO POR EL USUARIO. HERENCIA.

            CREATE TABLE ordenes_tab OF ordenes_t (            -->  CREACIÓN DE UNA TABLA DE OBJETOS DEL TIPO DEFINIDO ordenes_t
            PRIMARY KEY (ordennum),                            -->  ATRIBUTO CLAVE PRIMARIA QUE SERÁ UN ...
            SCOPE FOR (cliente) IS clientes_tab);              -->  ATRIBUTO ACOTADO A LOS OBJETOS DE LA TABLA clientes_tab
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_10 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_10 + """
        ************************************************************************************************************************
                       
            LA HERENCIA DE TIPOS NOS PERMITE CREAR JERARQUÍAS DE TIPOS.
                    - UNA JERARQUÍA DE TIPOS ES UNA SERIE DE NIVELES SUCESIVOS DE SUBTIPOS,
                      CADA VEZ MÁS ESPECIALIZADOS, QUE DERIVAN DE UN TIPO DE OBJETO ANCESTRO COMÚN, DENOMINADO SUPERTIPO.
                            - LOS SUPERTIPOS DERIVADOS:
                                    - HEREDARÁN LAS CARACTERÍSTICAS DEL TIPO DE OBJETO PRINCIPAL.
                                    - PUEDEN AMPLIAR LA DEFINICIÓN DEL TIPO OBJETO PRINCIPAL,
                                      LOS TIPOS ESPECIALIZADOS PUEDEN:
                                            - AÑADIR NUEVOS ATRIBUTOS O MÉTODOS.
                                            - REDEFINIR MÉTODOS HEREDADOS DE LA CLASE TIPO PADRE.
                       
            LA JERARQUÍA DEL TIPO RESULTANTE FACILITA UN NIVEL SUPERIOR DE ABSTRACCIÓN
            PARA MANEJAR LA COMPLEJIDAD DE UN MODELO DE UNA APLICACIÓN.
               
            ES EL MISMO CONCEPTO USADO EN PROGRAMACIÓN ORIENTADA A OBJETOS, COMO POR EJEMPLO EN JAVA.
                       
                          Persona                Persona POSEERÁ UNOS ATRIBUTOS QUE SERÁN HEREDADOS POR Estudiante Y Empleado.
                          /     \\
                         /       \\
                  Estudiante    Empleado         Estudiante Y Empleado AGREGARÁN NUEVOS ATRIBUTOS.
                       /
                      /
            Estudiante_TiempoParcial             Estudiante_TiempoParcial HEREDARÁ LOS ATRIBUTOS DE Persona Y Estudiante.
                                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;    
    
    public static void recurso(String opcion) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            
            switch (opcion) {                
                case "1" -> System.out.println(recurso_01);
                case "2" -> System.out.println(recurso_02);
                case "3" -> System.out.println(recurso_03);
                case "4" -> System.out.println(recurso_04);
                case "5" -> System.out.println(recurso_05);                
                case "6" -> System.out.println(recurso_06);
                case "7" -> System.out.println(recurso_07);
                case "8" -> System.out.println(recurso_08);
                case "9" -> System.out.println(recurso_09);
                case "10" -> System.out.println(recurso_10);
                case "11" -> {
                    System.out.println(recurso_01);
                    continuar();
                    System.out.println(recurso_02);
                    continuar();
                    System.out.println(recurso_03);
                    continuar();
                    System.out.println(recurso_04);
                    continuar();
                    System.out.println(recurso_05);
                    continuar();
                    System.out.println(recurso_06);
                    continuar();
                    System.out.println(recurso_07);
                    continuar();
                    System.out.println(recurso_08);
                    continuar();
                    System.out.println(recurso_09);
                    continuar();
                    System.out.println(recurso_10);
                }
            }
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
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
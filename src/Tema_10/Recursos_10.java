package Tema_10;

import static Principal_Main.Main.*;
import static Tema_10.T_10.*;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_10 {
  
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_10 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************
                       
            UNA BASE DE DATOS OBJETO-RELACIONAL ES UNA COMBINACI�N DE BASE DE DATOS ORIENTADA A OBJETOS
            Y UN MODELO DE BASE DE DATOS RELACIONAL.
                    - SOPORTA OBJETOS, CLASES, HERENCIA, ETC. QUE TENDR�AMOS EN LOS MODELOS ORIENTADOS A OBJETOS.
                    - TAMBI�N TIENE SOPORTE PARA TIPOS DE DATOS O ESTRUCTURAS TABULARES (TABLAS), ENTRE OTRAS COSAS,
                      DEL MODELO DE DATOS RELACIONAL.
                       
            UNO DE LOS MAYORES OBJETIVOS DE LOS MODELOS DE BASES DE DATOS OBJETO-RELACIONALES ES ACORTAR DISTANCIAS ENTRE
            LAS BASES DE DATOS RELACIONALES Y LAS PR�CTICAS ORIENTADAS A OBJETOS REALIZADAS FRECUENTEMENTE
            EN DIFERENTES LENGUAJES COMO C++, JAVA, C#, ETC.
                       
            DE ESTA FORMA, PODR�AMOS REDEFINIR LA BASE DE DATOS OBJETO-RELACIONAL COMO AQUELLA BASE DE DATOS QUE EVOLUCIONA
            DESDE EL MODELO RELACIONAL HACIA ALGUNAS DE LAS CARACTER�STICAS DEL MODELO DE OBJETOS,
            HACI�NDOLA UNA BASE DE DATOS H�BRIDA.
                    - ORACLE, UNO DE LOS GESTORES DE BASES DE DATOS M�S CONOCIDOS,
                      IMPLEMENTA EL MODELO DE OBJETO COMO EXTENSI�N DEL MODELO RELACIONAL.
                       
            A SU VEZ, MUCHOS LENGUAJES, HAN SABIDO ADAPTARSE CON EXTENSIONES Y FRAMEWORKS
            PARA PODER TRABAJAR CON ESTAS BASES DE DATOS OBJETO RELACIONALES DE ORACLE.
                       
            EL RESULTADO ES UN MODELO RELACIONAL DE OBJETOS QUE OFRECE:
                    - LA INTUICI�N Y LA ECONOMIA DE UNA INTERFAZ DE OBJETOS.
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
            QUE PERMITIR�N DISE�AR APLICACIONES CON SOPORTE DE DOMINIOS M�S COMPLEJOS.
                    - SE PODR�N DEFINIR, AL MENOS, DOS M�TODOS:
                            - UNO PARA CONVERTIR DE ESTE TIPO COMPUESTO A CARACTERES ASCII.
                            - OTRO QUE HAGA LA INVERSA, DESDE CARACTERES ASCII HASTA NUEVOS TIPOS DE DATOS.
                    - SE SOPORTAR�N DISTINTOS TIPOS COMPLEJOS COMO, POR EJEMPLO:
                            - REGISTROS.
                            - LISTAS Y ARRAIS.
                            - REFERENCIAS.
                            - PILAS Y COLAS.
                    - CON ESTOS TIPOS DE DATOS, SE PUEDEN CREAR FUNCIONES CON C�DIGO EN LENGUAJES, COMO SQL, JAVA O C#.
                       
            - DISPONIBILIDAD DE M�S CAPACIDAD DE EXPRESI�N PARA DEFINIR CONCEPTOS Y ASOCIACIONES.
                       
            - POSIVILIDAD DE CREACI�N DE OPERADORES ASIGNANDO NOMBRE Y EXISTENCIA DE AQUELLAS CONSULTAS M�S COMPLEJAS.
                    - TAMBI�N SE CREAN OPERADORES USANDO M�TODOS, ESTOS M�TODOS SER�N, EN CIERTO MODO, OPERADORES.
                       
             - EN LOS TIPOS DE REGISTRO, ESTILO RELACIONAL, PODREMOS USAR ENCADENAMIENTO Y HERENCIA.
                       
             - POSIBILIDAD DE USO DE LA REUSABILIDAD, COMPARTIENDO BIBLIOTECAS DE CLASES DEFINIDAS PREVIAMENTE.
                       
             - POSIBILIDAD DE INTRODUCIR COMPROBACI�N DE REGLAS DE INTEGRIDAD POR MEDIO DE TRIGGERS.
                    - TRIGGER: SCRIPT DE C�DIGO QUE PUEDE ESTAR ESCRITO EN DIFERNTES LENGUAJES,
                      QUE SE EJECUTA AUTOM�TICAMENTE CUANDO SE REALIZAN DETERMINADAS OPERACIONES
                      EN LA INFORMACI�N DE LA BASE DE DATOS.
                       
            - LAS BASES DE DATOS OBJETO-RELACIONALES EST�N M�S ORIENTADAS A LA PROGRAMACI�N,
              Y APORTAN A LA BASE DE DATOS CARACTER�STICAS DE LA ORIENTACI�N A OBJETOS:
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
                       
            EN ORACLE, CON LA BASE DE DATOS OBJETO-RELACIONAL, TENDREMOS LA OPCI�N DE DEFINIR NUESTROS PROPIOS TIPOS DE DATOS,
            PARTIENDO DE LOS TIPOS 'B�SICOS' DE LOS QUE YA DISPONEMOS EN EL SISTEMA.
            NUESTROS NUEVOS TIPOS PODR�N SER:
                    - TIPOS DE OBJETOS:      -->  PARA ELLO SE USAR�  -->      OBJECT TYPE  (SOLO TIENE UN ELEMENTO)
                    - TIPOS DE COLECCIONES:  -->  PARA ELLO SE USAR�  -->  COLLECTION TYPE  (TENDR� UNA COLECCI�N DE ELEMENTOS)
                       
            DE ESTA FORMA, AHORA EN LA BASE DE DATOS,
            UN OBJETO REPRESENTA UNA ENTIDAD EN EL MUNDO REAL
            Y SE COMPONE DE:
                    - NOMBRE:
                            CON EL QUE IDENTIFICAMOS EL TIPO DE OBJETO.
                       
                    - ATRIBUTOS:
                            CON EL QUE DEFINIMOS LA ESTRUCTURA.
                                    - PUEDEN SER DE TIPO B�SICO DEL SISTEMA.
                                    - PUENEN SER DE TIPO CREADO POR EL USUARIO.
                                     
                    - M�TODOS:       
                            - PUEDEN SER FUNCIONES.        (DEVUELVEN UN VALOR)
                            - PUEDEN SER PROCEDIMIENTOS.   (NO DEVUELVEN NING�N VALOR)
                            - EST�N ESCRITOS EN:
                                    - C�DIGO PL/SQL CUANDO EST�N ALMACENADOS EN LA PROPIA BASE DE DATOS.
                                    - EN EL LENGUAJE C CUANDO SE ALMACENAN EXTERNAMENTE.
                            - CREACI�N DE UN M�TODO EN ORACLE:
                                    - SE REALIZA JUNTO A LA CREACI�N DE SU TIPOLOG�A.
                                    - DEBE LLEVAR SIEMPRE UNA ESPECIFICACI�N DEL TIPO DE COMPILACI�N,
                                      PARA INDICAR C�MO SE VA A GESTIONAR LA MANIPULACI�N DE LOS DATOS O VARIABLES PL/SQL.
                                            - PRAGMA_RESTRICT_REFERENCIE --> EVITA DICHA MANIPULACI�N.
                       
            RESPECTO A LOS NULOS:
                    HABR� QUE TENER EN CUENTA QUE EN ESTOS NUEVOS TIPOS DE DATOS,
                    SER� DIFERENTE UN OBJETO CUYO VALOR SEA NULL,   -->   SER�A COMO SI TODAV�A EL OBJETO NO EXISTE.
                    QUE DENOMINAREMOS UN OBJETO AT�MICAMENTE NULO, 
                    Y NO SER� LO MISMO QUE UN OBJETO QUE TENGA TODOS SUS ATRIBUTOS A NULL.
                    EN ESE CASO, EL OBJETO EXISTE, AUNQUE SIN ATIBUTOS TODAV�A.

                       
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
                street VARCHAR2(200),                                  street      -> ATRIBUTO B�SICO.
                city VARCHAR2(200),                                    city        -> ATRIBUTO B�SICO.
                prov CHAR(2),                                          prov        -> ATRIBUTO B�SICO.
                poscode VARCHAR2(20));                                 poscode     -> ATRIBUTO B�SICO.
                       

                CREATE TYPE vehiculo_t AS OBJECT (                     vehiculo_t  -> NOMBRE DEL TIPO DE DATO.
                nRuedas NUMBER,                                        nRuedas     -> ATRIBUTO B�SICO.
                peso NUMBER,                                           peso        -> ATRIBUTO B�SICO.
                largo NUMBER;                                          largo       -> ATRIBUTO B�SICO.
                       

                CREATE TYPE coche_t AS OBJECT (                        coche_t     -> NOMBRE DEL TIPO DE DATO.
                tipo vehiculo_t,                                       tipo        -> ATRIBUTO CREADO POR EL USUARIO. HERENCIA.
                marca VARCHAR2(50);                                    marca       -> ATRIBUTO B�SICO.
                       
                       
                CREATE TABLE vehiculos_a�o_tab OF vehiculo_t           CREA UNA TABLA DE OBJETOS DE TIPO vehiculo_t
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
                                            TABLAS Y TIPOS DE OBJETOS: EXPLOTACI�N.
                       
            UNA VEZ SE HA REALIZADO LA DEFINICI�N DE TIPOS, 
            PODEMOS TENER DISTINTOS OBJETIVOS PARA ESOS NUEVOS DATOS:
                    - PARA DEFINIR NUEVOS TIPOS.
                    - PARA ALMACENARLOS EN TABLAS DE ESE TIPO DE DATOS.
                    - PARA DEFINIR LOS DISTINTOS ATRIBUTOS DE UNA TABLA.
                       
            UNA TABLA DE OBJETOS ES UNA CLASE ESPEC�FICA DE TABLA QUE:
                    - ALMACENAR� UN OBJETO POR CADA FILA.
                    - AL MISMO TIEMPO, FACILITA EL INGRESO DE LOS ATRIBUTOS DEL OBJETO, 
                      COMO SI FUERAN CUALQUIER OTRO TIPO DE COLUMNAS NORMALES DE LA TABLA.
                       
            SIN EMBARGO HAY QUE TENER EN CUENTA QUE NO ES LO MISMO UNA TABLA DE OBJETOS
            Y UNA TABLA EN LA QUE UNO DE SUS ATRIBUTOS ES UN OBJETO.
                    - UNA TABLA DE OBJETOS ALMACENA OBJETOS CON SU PROPIO ID.
                    - UNA TABLA DONDE UNO DE SUS ATRIBUTOS ES UN OBJETO,
                      ES UNA TABLA CON UNA COLUMNA CON UN TIPO DE DATO COMPLEJO,
                      PERO SIN IDENTIDAD DE OBJETO.
                       
            ORACLE PERMITE TAMBI�N DEFINIR COMO TABLA:
                    - UNA COLUMNA CON TIPOLOG�A DE OBJETO.
                    - UNA TABLA CON EL MISMO N�MERO DE COLUMNAS
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
                    - UNA COLECCI�N EST� FORMADA POR UN N�MERO NO DEFINIDO DE ELEMENTOS.
                    - TODOS LOS ELEMENTOS SON DEL MISMO TIPO.
                       
            SE PUEDEN DIVIDIR LOS TIPOS DE COLECCI�N OBJETO-RELACIONAL EN ORACLE EN:
                    - VARRAYS.
                    - TABLAS ANIDADAS.
                       
            SE DEFINE UN ARRAY COMO UNA SERIE DE ELEMENTOS ORDENADOS QUE SON DEL MISMO TIPO.
                    - ESTOS ELEMENTOS TIENEN UN �NDICE QUE NOS SIRVE PARA SABER SU POSICI�N DENTRO DEL ARRAY.
                    - ORACLE PERMITE QUE EL TIPO VARRAY SEA UN TIPO VARIABLE, PERO SE DEBE ESTABLECER EL M�XIMO DE ELEMENTOS.
                       
            EN GENERAL, PODEMOS UTILIZAR EL VARRAY PARA:
                    - DEFINIR LA TIPOLOG�A DE UNA COLUMNA DE UNA TABLA RELACIONAL.
                    - DEFINIR LA TIPOLOG�A DE UN ATRIBUTO DE TIPO OBJETO.
                    - DEFINIR UNA VARIABLE DEL LENGUAJE PL/SQL.
                       
            UNA VEZ SE DECLARA UN OBJETO VARRAY, NO SE RESERVA REALMENTE NINGUNA CANTIDAD DE ESPACIO:
                    - SI EL ESPACIO EST� DISPONIBLE, SE ALMACENA IGUAL QUE EL RESTO DE COLUMNAS.
                    - SI POR EL CONTRARIO, ES SUPERIOR A 4.000 BYTES, SE ALMACENAR� EN UNA TABLA APARTE,
                      COMO DATO DE TIPO BLOB (BINARY LARGE OBJECTS).
                       
                    - CREAMOS UN VARRAY LLAMADO numeros:
                       
                            CREATE TYPE numeros AS VARRAY(10)          <-- CON M�XIMO 10 ELEMENTOS DE TIPO NUMBER.
                            OF NUMBER(10);                             <-- CON M�XIMO 10 CIFRAS CADA ELEMENTO.
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
                       
            UNA TABLA ANIDADA ES UNA LISTA DE ELEMENTOS NO ORDENADOS QUE MANTIENEN UNA MISMA TIPOLOG�A. (MISMO TIPO).
                    - EL M�XIMO NO EST� ESPECIFICADO EN LA DEFINICI�N DE LA TABLA.
                    - EL ORDEN DE LOS ELEMENTOS NO EXISTE, POR TANTO NO SE MANTIENE.
                       
            LAS INSTRUCCIONES:
                    SELECT, INSERT, DELETE Y UPDATE 
                    SE REALIZAN DE LA MISMA FORMA QUE CON LAS TABLAS COMUNES, 
                    CON UNA DIFERENCIA, USANDO LA EXPRESI�N TABLE.
                       
            UNA TABLA ANIDADA PUEDE SER VISTA O INTERPRETADA COMO UNA TABLA CON UNA �NICA COLUMNA,
            SIN N�MERO M�XIMO DE ELEMENTOS, Y ELEMENTOS NO ORDENADOS.
                    EN PARTICULAR SI ESTA COLUMNA DE LA TABLA ANIDADA ES UN TIPO DE OBJETO DE 'usuario',
                    LA TABLA PUEDE SER VISTA COMO UNA TABLA MULTICOLUMNA,
                    TENDR� UNA COLUMNA POR CADA ATRIBUTO DEL OBJETO 'usuario' QUE FU� DEFINIDO.
                       
            LA SINTAXIS PARA CREAR UNA TABLA ANIDADA 'tabla_tipo', CONTENIENDO OBJETOS DE TIPO 'usuario nombre_tipo':
                       
                                CREATE TYPE nombre_tipo AS TABLE OF tabla_tipo;
                       
            UNA VEZ DEFINIDO EL TIPO, PODEMOS USARLO PARA: (SON LOS MISMOS USOS QUE LE PODEMOS DAR AL VARAY).
                    - EL TIPO DE DATO DE UNA TABLA RELACIONAL.
                    - UN ATRIBUTO DE UN OBJETO DE TIPO 'usuario'.
                    - UNA VARIABLE PL/SQL, UN PAR�METRO O UNA FUNCI�N QUE DEVUELVA UN TIPO.
                       
            LA DEFINICI�N DE LA TABLA DE 'usuario' TAMPOCO ASIGNAR� ESPACIO. 
                    (AL IGUAL QUE CON LOS VARRAY, NO SE RESERVA ESPACIO EN EL MOMENTO DE LA CREACI�N).
                                      
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
               
            LA BASE DE DATOS OBJETO-RELACIONAL ORACLE PERMITE QUE LOS IDENTIFICADORES �NICOS 
            QUE SE LES ASIGNA A LOS OBJETOS DE UNA TABLA PUEDAN SER REFERIDOS: 
                    UNOS OBJETOS TENDR�N UN IDENTIFICADOR �NICO 
                    Y OTROS OBJETOS PODR�N APUNTAR A ESOS IDENTIFICADORES.
                       
                            - DESDE LOS ATRIBUTOS DE OTROS OBJETOS DISTINTOS.
                                    PARA ELLO EN LOS OBJETOS UTILIZAREMOS UN ATRIBUTO QUE SE ESPECIFICAR� COMO  -->  REF,
                                    Y QUE GUARDAR� UNA REFERENCIA (UN ENLACE) A OTRO OBJETO,
                                    GENERANDO UNA RELACI�N ENTRE AMBOS OBJETOS.
                                    AMBOS OBJETOS ESTAR�N UNIDOS.
                       
                            - DESDE LA COLUMNA DE UNA TABLA.
                                    UNA VEZ HEMOS DEFINIDO UNA COLUMNA DE TIPO REF,
                                    SE PUEDE ACORTAR EL ALCANCE A LOS OBJETOS QUE SE GUARDEN EN UNA DETERMINADA TABLA,
                                    UTILIZANDO LA CL�USULA  -->  SCOPE FOR () IS.
                       
            ESTE TIPO DE REFERENCIAS:
                    - SE USAR�N PARA ACCEDER A LOS OBJETOS RELACIONADOS Y ACTUALIZADOS.
                    - NO ES POSIBLE REALIZAR OPERACIONES DIRECTAMENTE SOBRE LAS REFERENCIAS,
                      TENEMOS QUE TENER EN CUENTA QUE SON IDENTIFICADORES DE OBJETOS.
                    - PARA USAR UNA RESERENCIA O ACTUALIZARLA, USAREMOS:
                            REF   -->  PARA CAMBIAR A OTRA REFENCIA.
                            NULL  -->  PARA ELIMINAR LA REFERENCIA.
                       
                       
            CREATE TABLE clientes_tab OF cliente_t;            -->  CREACI�N DE UNA TABLA DE OBJETOS DEL TIPO DEFINIDO cliente_t

            CREATE TYPE ordenes_t AS OBJECT (                  -->  CREACI�N DE UN TIPO DE OBJETO ordenes_t
            ordennum NUMBER,                                   -->  ATRIBUTO B�SICO.
            cliente REF clientes_t,                            -->  ATRIBUTO REFERENCIA A UN OBJETO DEL TIPO DEFINIDO cliente_t
            fechapedido DATE,                                  -->  ATRIBUTO B�SICO.
            direntrega direccion_t);                           -->  ATRIBUTO CREADO POR EL USUARIO. HERENCIA.

            CREATE TABLE ordenes_tab OF ordenes_t (            -->  CREACI�N DE UNA TABLA DE OBJETOS DEL TIPO DEFINIDO ordenes_t
            PRIMARY KEY (ordennum),                            -->  ATRIBUTO CLAVE PRIMARIA QUE SER� UN ...
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
                       
            LA HERENCIA DE TIPOS NOS PERMITE CREAR JERARQU�AS DE TIPOS.
                    - UNA JERARQU�A DE TIPOS ES UNA SERIE DE NIVELES SUCESIVOS DE SUBTIPOS,
                      CADA VEZ M�S ESPECIALIZADOS, QUE DERIVAN DE UN TIPO DE OBJETO ANCESTRO COM�N, DENOMINADO SUPERTIPO.
                            - LOS SUPERTIPOS DERIVADOS:
                                    - HEREDAR�N LAS CARACTER�STICAS DEL TIPO DE OBJETO PRINCIPAL.
                                    - PUEDEN AMPLIAR LA DEFINICI�N DEL TIPO OBJETO PRINCIPAL,
                                      LOS TIPOS ESPECIALIZADOS PUEDEN:
                                            - A�ADIR NUEVOS ATRIBUTOS O M�TODOS.
                                            - REDEFINIR M�TODOS HEREDADOS DE LA CLASE TIPO PADRE.
                       
            LA JERARQU�A DEL TIPO RESULTANTE FACILITA UN NIVEL SUPERIOR DE ABSTRACCI�N
            PARA MANEJAR LA COMPLEJIDAD DE UN MODELO DE UNA APLICACI�N.
               
            ES EL MISMO CONCEPTO USADO EN PROGRAMACI�N ORIENTADA A OBJETOS, COMO POR EJEMPLO EN JAVA.
                       
                          Persona                Persona POSEER� UNOS ATRIBUTOS QUE SER�N HEREDADOS POR Estudiante Y Empleado.
                          /     \\
                         /       \\
                  Estudiante    Empleado         Estudiante Y Empleado AGREGAR�N NUEVOS ATRIBUTOS.
                       /
                      /
            Estudiante_TiempoParcial             Estudiante_TiempoParcial HEREDAR� LOS ATRIBUTOS DE Persona Y Estudiante.
                                       
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
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
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
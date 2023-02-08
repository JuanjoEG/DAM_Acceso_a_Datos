package Tema_15;

import static Principal_Main.Main.*;
import static Tema_15.T_15.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_15 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_15 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
            
            COMENZAREMOS ESTA �LTIMA UNIDAD DEL M�DULO,
            CONOCIENDO EL SIGNIFICADO DE LOS COMPONENTES EN JAVA ORIENTADOS A BEANS:
                    EJB (ENTERPRISE JAVA BEAN).
                         
            LA TECNOLOG�A ENTRERPRISE JAVABEANS (EJB) PERMITE DEFINIR COMPONENTES (ENTRERPRISE BEANS)
            QUE IMPLEMENTAN L�GICA DE NEGOCIO Y QUE SON GESTIONADOS POR UN SERVIDOR DE APLICACIONES JAVA EE(ENTERPRISE EDITION)
                         
            LOS JAVABEAN O BEAN,
            COMO COMPONENTES SOFTWARE,
            SE PODR�N REUTILIZAR E INCLUSO MODIFICAR TOTAL O PARCIALMENTE SU PROGRAMACI�N JAVA.
                         
            POR TANTO, 
            TENEMOS QUE CON LA TECNOLOG�A J2EE ENTERPRISE JAVABEANS
            ES POSIBLE DESARROLLAR COMPONENTES (ENTRERPRISE BEANS)
            QUE LUEGO PODREMOS REUTILIZAR Y ENSAMBLAR EN DISTINTAS APLICACIONES QUE TENGAS QUE HACER PARA LA EMPRESA.
                         
            POR EJEMPLO, PODR�AMOS DESARROLLAR UN BEAN CLIENTE QUE REPRESENTE UN CLIENTE EN BASE DE DATOS.
            Y USAR DESPU�S ESE BEAN CLIENTE EN UN PROGRAMA DE CONTABILIDAD O EN UNA APLICACI�N DE COMERCIO ELECTR�NICO
            O EN CUALQUIER PROGRAMA EN EL QUE SE NECESITE REPRESENTAR UN CLIENTE.
                         
            JAKARTA ES EL NOMBRE ACTUAL DE LO QUE ANTIGUAMENTE SE LLAMABA JAVA PLATFORM ENTERPRISE EDITION
            O JAVA EE, TAMBI�N LLAMADA COLOQUIALMENTE "JAVA EMPRESARIAL".
            EN 2018 PAS� A GESTIONARLO LA FUNDACI�N ECLIPSE, COMO JAVA ES UNA MARCA REGISTRADA DE ORACLE,
            SE VIERON FORZADOS TAMBI�N A CAMBIARLE EL NOMBRE, POR JAKARTA.
                         
            SER�A POSIBLE QUE EL DESARROLLADOR DEL BEAN Y EL ENSAMBLADOR DE LA APLICACI�N NO FUERAN LA MISMA PERSONA,
            O QUE NI SIQUIERA TRABAJARAN EN LA MISMA EMPRESA,
            YA QUE VA A SER POSIBLE REALIZAR UNA INTEGRACI�N ENTRE COMPONENTES DE TERCEROS.
                         
            DE ESTA FORMA, EL DESARROLLO BASADO EN COMPONENTES ES UN PASO M�S EN EL CAMINO DE LA PROGRAMACI�N ORIENTADA A OBJETOS.
                         
            CON LA PROGRAMACI�N ORIENTADA A OBJETOS PUEDES REUTILIZAR CLASES,
            PERO CON COMPONENTES ES POSIBLE REUTILIZAR UN MAYOR NIVEL DE FUNCIONALIDADES E INCLUSO
            ES POSIBLE MODIFICAR ESTAS FUNCIONALIDADES Y ADAPTARLAS A CADA ENTORNO DE TRABAJO PARTICULAR
            SIN TOCAR EL C�DIGO DEL COMPONENTE DESARROLLADO.
                         
            TAMBI�N ESTUDIAREMOS SUS PROPIEDADES, ATRIBUTOS Y DIFERENTES EVENTOS, AS� COMO SU PROPAGACI�N.
                         
            POR �LTIMO, 
            NOMBRAREMOS ALGUNOS DE LOS IDES DE DESARROLLO QUE PODREMOS UTILIZAR PARA PROGRAMAR COMPONENTES EN JAVA.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """
        **********************************************************************************************************************************
                       
            GENERALMENTE,
            UN COMPONENTE ES UNA UNIDAD DE SOFTWARE (PROGRAMA)
            QUE ENCAPSULA UN SEGMENTO DE C�DIGO CON CIERTAS FUNCIONES,
            PARA DAR ESAS FUNCIONALIDADES.
                         
            LOS ESTILOS DE ESTOS COMPONENTES PUEDEN SER:
                         
                    * ESTILOS PROPORCIONADOS POR EL ENTORNO DE DESARROLLO.
                      INCLUIDOS EN LA INTERFAZ DE USUARIO GUI.
                         
                    * ESTILOS NO VISUALES,
                      SIENDO SUS FUNCIONES SIMILARES A LAS DE LAS BIBLIOTECAS REMOTAS.
                      POR EJEMPLO LAS APIS.
                         
            LOS COMPONENTES DEL SOFTWARE TIENEN LAS SIGUIENTES CARACTER�STICAS PRINCIPALES:
                         
                    * UNIDAD EJECUTABLE:
                            UN COMPONENTE ES UNA UNIDAD EJECUTABLE
                            QUE SE PUEDE INSTALAR Y UTILIZAR DE FORMA INDEPENDIENTE.
                         
                    * INTERACTUAR Y OPERAR:
                            CON OTROS COMPONENTES DESARROLLADOS POR TERCEROS,
                            ES DECIR, EMPRESAS O DESARROLLADORES PUEDEN UTILIZAR COMPONENTES
                            Y AGREGARLOS A LAS OPERACIONES QUE SE REALIZAN.
                                    * LO QUE SIGNIFICA QUE A SU VEZ UN COMPONENTE PUEDEN ESTAR COMPUESTOS POR OTROS COMPONENTES,
                                      PROPIOS O DE TERCEROS.
                         
                    * NO TIENE ESTADO: STATELESS.
                            AL MENOS SU ESTADO NO ES VISIBLE DESDE FUERA.
                            O AL MENOS, DESDE FUERA PARECIERA QUE NO LO TIENE.
                         
            DE ESTA FORMA, LA PROGRAMACI�N ORIENTADA A COMPONENTES O UN COMPONENTE,
            SE PUEDE ENTENDER COMO LOS DISTINTOS ENGRANAJES ELECTR�NICOS QUE, EN SU CONJUNTO, FORMAN UN SISTEMA M�S GRANDE.
 
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_03 + """
        **********************************************************************************************************************************
                                    
            PODEMOS AFIRMAR QUE UN COMPONENTE SER� FORMADO POR LOS SIGUIENTES ELEMENTOS:

                    * ATRIBUTOS, OPERACIONES Y EVENTOS:
                            ES PARTE DE LA INTERFAZ DEL COMPONENTE. TODO EN SU JUNTO REPRESENTAR�A EL NIVEL SINT�CTICO.

                    * COMPORTAMIENTO:
                            REPRESENTA LA PARTE SEM�NTICA.
                            POR EJEMPLO, FUNCIONALIDADES Y OBJETIVO DEL COMPONENTE.

                    * PROTOCOLOS Y ESCENARIOS:
                            * REPRESENTA LA COMPATIBILIDAD DE LAS SECUENCIAS DE LOS MENSAJES CON OTROS COMPONENTES.
                            * REPRESENTA LA FORMA DE ACTUAR QUE TENDR� EL COMPONENTE
                              EN DIFERENTES ESCENARIOS DONDE LLEGAR� A SER EJECUTADO.

                    * PROPIEDADES:
                            LAS DIFERENTES CARACTER�STICAS QUE PUEDE TENER EL COMPONENTE.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        **********************************************************************************************************************************
                       
            SAB�AS QUE ... 
                    LOS ATRIBUTOS Y LAS PROPIEDADES DE LOS BEANS DE JAVA DEBEN MANTENER SU SCOPE (ALCANCE) PRIVADO.

                    DE ESTA FORMA FOMENTAMOS LA SEGURIDAD Y EL ACCESO A DICHAS PROPIEDADES Y ATRIBUTOS,
                    Y S�LO SE PROPAGAR�N LOS CAMBIOS LLAMANDO AL M�TODO DETERMINADO DE DICHA PROPIEDAD.

                    SE PUEDE VERIFICAR Y MODIFICAR LAS PROPIEDADES DEL COMPONENTE
                    ACCEDIENDO AL M�TODO DEL COMPONENTE O LA FUNCI�N DE ACCESO.
                         
            A TRAV�S DE LAS PROPIEDADES DE UN COMPONENTE, PODEMOS SABER CU�L ES SU ESTADO,
            Y TAMBI�N DIFERENCIARLO DEL RESTO DE COMPONENTES.
                         
            PROPIEDADES DEL COMPONENTE:  DETERMINAN SU ESTADO Y LO DISTINGUEN DEL RESTO.
             
            ES POR ESTE MOTIVO QUE LAS PROPIEDADES SON UNO DE LOS ASPECTOS RELEVANTES DE LA INTERFAZ DEL COMPONENTE:
                         
                    * SON ELEMENTOS QUE FORMAN PARTE DE LA VISTA EXTERNA DEL COMPONENTE (REPRESENTADA COMO VISTA P�BLICA).
                    * ADEM�S, DESDE EL PUNTO DE VISTA DEL CONTROL Y USO DE COMPONENTES,
                      ESTAS CARACTER�STICAS OBSERVABLES VAN A SER MUY IMPORTANTE,
                      PORQUE DE HECHO SER�N LA BASE PARA QUE PODAMOS CARACTERIZAR OTROS ASPECTOS Y COMPORTAMIENTOS DE LOS COMPONENTES.
                         
            SE HA ADELANTADO ANTERIORMENTE QUE ESTOS COMPONENTES CARECEN DE ESTADO,
            LO QUE SE HAR� SER� UTILIZAR UNA SERIE DE PROPIEDADES DE LOS COMPONENTES,
            A LAS QUE SE PUEDE ACCEDER Y MODIFICAR DE DIFERENTES FORMAS.
                         
            EN FUNCI�N DE SUS CARACTER�STICAS Y FORMAS DE ACCESO, LAS PROPIEDADES DE LOS COMPONENTES SE DIVIDEN EN:
                    - SIMPLES.
                    - INDEXADAS.
                    - COMPARTIDAS.
                    - RESTRINGIDAS.
          
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_05 + """
        **********************************************************************************************************************************
             
            SE PUEDE VERIFICAR Y MODIFICAR LAS PROPIEDADES DEL COMPONENTE ACCEDIENDO AL M�TODO DEL COMPONENTE O LA FUNCI�N DE ACCESO.                          
            HAY DOS TIPOS DE ESTAS FUNCIONES:

                    * EL M�TODO GET:
                            SE UTILIZA PARA CONSULTAR O LEER EL VALOR DE UN ATRIBUTO.
                            LA SINTAXIS GENERAL ES LA SIGUIENTE:

                            Tipo getNombrePropiedad()

                    * EL M�TODO SET:
                            SE UTILIZA PARA ASIGNAR O CAMBIAR EL VALOR DE UN ATRIBUTO.
                            SU SINTAXIS GENERAL EN JAVA ES:

                            SetNombrePropiedad(Tipo valor)
                                   
            CENTR�NDONOS EN LAS PROPIEDADES O ATRIBUTOS INDEXADOS Y SIMPLES,
            PODEMOS DECIR,
            QUE LOS ATRIBUTOS SIMPLES:
                    SON ATRIBUTOS QUE REPRESENTAN UN SOLO VALOR.
                    POR EJEMPLO, SI HAY UN BOT�N EN LA INTERFAZ GR�FICA,
                    LOS ATRIBUTOS SIMPLES SER�N ATRIBUTOS RELACIONADOS CON SU TAMA�O, COLOR DE FONDO, ETIQUETA, ETC. 

            ADEM�S DE LAS PROPIEDADES DE LOS VALORES SIMPLES Y �NICOS,
            EXISTE OTRO TIPO DE PROPIEDADES M�S COMPLEJAS
            QUE SON MUY SIMILARES A UN CONJUNTO DE VALORES: LOS �NDICES. 

            TODOS LOS ELEMENTOS DE ESTE TIPO DE ATRIBUTO COMPARTEN EL MISMO TIPO DE DATO
            Y SE PUEDE ACCEDER A ELLOS POR �NDICE, POSICI�N.

            CONCRETAMENTE,
            SE PUEDE ACCEDER MEDIANTE EL M�TODO DE ACCESO QUE SE MENCION� ANTERIORMENTE (get / set),
            AUNQUE LA LLAMADA DE ESTOS M�TODOS VARIAR�, PARA INCLUIR LA PROPIEDAD A LA QUE SE QUIERE ACCEDER,
            AS� COMO EL �NDICE, YA QUE SOLO SE PUEDE ACCEDER A CADA PROPIEDAD A TRAV�S DE SU �NDICE, POSICI�N. 

            LA SINTAXIS QUE ENCONTRAMOS EN JAVA SER�A:

                setPropertyName (int index, PropertyType value)
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_06 + """
        **********************************************************************************************************************************
                       
            ADEM�S DE LOS ATRIBUTOS SIMPLES Y LOS ATRIBUTOS INDEXADOS,
            LOS COMPONENTES TAMBI�N TIENEN OTROS DOS TIPOS DE ATRIBUTOS:
                    * ATRIBUTOS COMPARTIDOS.
                    * ATRIBUTOS RESTRINGIDOS.
            
            LOS ATRIBUTOS COMPARTIDOS SE REFIEREN
            A LOS DATOS MEDIANTE LOS QUE INFORMA A TODOS LOS INTERESADOS SOBRE EL ATRIBUTO,
            CUANDO CAMBIAN, POR LO QUE SOLO SE LES NOTIFICA CUANDO CAMBIA EL ATRIBUTO.    
            LOS ATRIBUTOS COMPARTIDOS SON DATOS CUYA MODIFICACI�N ES INFORMADA A TODOS LOS INTERESADOS,
            PERO �NICAMENTE SE PRODUCE ESTE CAMBIO EN EL ATRIBUTO.
                    - EL MECANISMO DE NOTIFICACI�N SE BASA EN EVENTOS, ES DECIR,
                      HAY UN COMPONENTE DE ORIGEN QUE NOTIFICA AL COMPONENTE RECEPTOR
                      CUANDO UN ATRIBUTO COMPARTIDO CAMBIA A TRAV�S DE UN EVENTO.
                    - DEBE QUEDAR CLARO QUE ESTAS PROPIEDADES NO SON BIDIRECCIONALES,
                      POR LO QUE EL COMPONENTE RECEPTOR NO PUEDE RESPONDER.
                    - PARA QUE UN COMPONENTE PERMITA PROPIEDADES COMPARTIDAS,
                      DEBE ADMITIR DOS M�TODOS, QUE SON LOS QUE USAR� PARA REGISTRAR COMPONENTES
                      QUE EST�N INTERESADOS EN CAMBIOS DE PROPIEDAD.
                            * UN M�TODO PARA AGREGAR  COMPONENTES INTERESADOS.
                            * OTRO PARA ELIMINARLOS.
                         
            SINTAXIS GENERAL M�TODO PARA A�ADIR COMPONENTES INTERSADOS EN ATRIBUTOS COMPARTIDOS EN JAVA:
                         
                            * addPropertyChangeListener (PropertyChangeListener x)
                         
            SINTAXIS GENERAL M�TODO PARA ELIMINAR COMPONENTES INTERSADOS EN ATRIBUTOS COMPARTIDOS EN JAVA:
                         
                            * removePropertyChangeListener (PropertyChange Listener x).
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_07 + """
        **********************************************************************************************************************************

            LAS PROPIEDADES RESTRINGIDAS BUSCAR�N LA APROBACI�N DE OTROS COMPONENTES ANTES DE CAMBIAR SU VALOR.
            AL IGUAL QUE CON LOS ATRIBUTOS COMPARTIDOS, SE DEBEN PROPORCIONAR DOS M�TODOS DE REGISTRO PARA EL RECEPTOR. 

            EN ESTE CASO, LOS COMPONENTES OYENTES IMPLEMENTAR�N UNA INTERFAZ   -->   VetoableChangeListener
            MEDIANTE LA QUE ACEPTAN O RECHAZAN LA PROPOSICI�N DE UN CAMBIO 
            EN LA PROPIEDAD RESTRINGIDA DEL COMPONENTE FUENTE, ORIGEN.

            SINTAXIS GENERAL M�TODO PARA A�ADIR COMPONENTES A LOS QUE CONSULTAR LA APROBACI�N EN ATRIBUTOS RESTRINGIDOS EN JAVA:

                            * addVetoableChangeListener (VetoableChangeListener x) 

            SINTAXIS GENERAL M�TODO PARA ELIMINAR COMPONENTES A LOS QUE CONSULTAR LA APROBACI�N EN ATRIBUTOS EN JAVA:

                            * removeVetoableChangeListener (Vetoabl eChange Listener x).

            LAS PROPIEDADES SON UNO DE LOS ASPECTOS RELEVANTES DE LA INTERFAZ DEL COMPONENTE
            PORQUE SON ELEMENTOS QUE FORMAN PARTE DE LA VISTA EXTERNA DEL COMPONENTE
            (REPRESENTADA COMO UNA VISTA P�BLICA).
            DESDE LA PERSPECTIVA DEL CONTROL Y USO DE COMPONENTES,
            ESTOS ELEMENTOS OBSERVABLES SON PARTICULARMENTE IMPORTANTES
            Y SON LA BASE PARA CARACTERIZAR OTROS ASPECTOS DE LOS COMPONENTES.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_08 + """
        **********************************************************************************************************************************
                       
            LLEGADOS A ESTE PUNTO, ES UNA DUDA HABITUAL PREGUNTARSE CU�L ES, EN LA PR�CTICA,
            LA DIFERENCIA REAL ENTRE LOS COMPONENTES BEANS,
            Y LAS CLASES Y OBJETOS JAVA CON LOS QUE HEMOS ESTADO TRABAJANDO HASTA AHORA.
                    * LAS CLASES Y OBJETOS JAVA CON LOS QUE HEMOS ESTADO TRABAJANDO HASTA AHORA,
                      HAN SIDO CLASES POJOS (INICIALES DE PLAIN OLD JAVA OBJECT)
                      UN POJO ES UNA INSTANCIA DE UNA CLASE QUE NO EXTIENDE NI IMPLEMENTA NADA EN ESPECIAL.
                      SIRVE PARA ENFATIZAR EL USO DE CLASES SIMPLES Y QUE NO DEPENDEN DE UN FRAMEWORK EN ESPECIAL.
                    * UN BEAN EN JAVA SE DEFINE EN LA ESPECIFICACI�N ENTERPRISE JAVABEAN: SON TAMBI�N CLASES SIMPLES EN JAVA,
                      PERO TIENEN QUE CUMPLIR ADEM�S CON CIERTAS CONDICIONES Y NORMAS CON LOS NOMBRES DE SUS PROPIEDADES Y M�TODOS,
                      Y SU VISIBILIDAD, QUE SE INDICAN EN LAS DIFERENTES VERSIONES DE LAS ESPECIFICACIONES
                      QUE CADA CIERTO TIEMPO PUBLICA EL FABRICANTE,
                      PARA SOPORTAR FUNCIONALIDADES DE JAVA ENTERPRISE EDITION:
                            - IMPLEMENTAN LA INTERFAZ SERIALIZABLE.
                            - LOS CAMPOS DEL BEAN TIENEN QUE SER OBLIGATORIAMENTE PRIVADOS.
                            - LOS BEANS PUEDEN TENER UN CONSTRUCTOR SIN ARGUMENTOS.
                            - A LOS CAMPOS SOLO SE PUEDE ACCEDER POR CONSTRUCTOR, GETTER O SETTER.
                            - LOS GETTERS Y LOS SETTERS TIENEN QUE SER P�BLICOS.
                            - LOS NOMBRES DE LOS GETTERS Y SETTERS
                              TIENEN QUE CUMPLIR UNAS NORMAS DE NOMENCLATURA SEG�N EL NOMBRE DE LOS ATRIBUTOS.
                         
            POR TANTO, TODOS LOS BEANS SON POJOS, PERO NO TODOS LOS POJOS SON BEANS.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_09 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_09 + """
        **********************************************************************************************************************************
                         
            /**
             * ESTA CLASE ES UN EJEMPLO DE UN POJO JAVA,
             * PERO NO ES UN JAVA BEANS.
             * 
             * VEAMOS DIFERENCIAS CON LOS BEANS.
             * 
             * TODOS LOS BEANS SON TAMBI�N POJOS, PERO NO TODOS LOS POJOS TIENEN QUE SER BEANS.
             * 
             * ESTA CLASE POJO NO ES SERIALIZABLE.
             * ESTA CLASE POJO NO TIENE TODOS LOS ATRIBUTOS PRIVADOS.
             * ESTA CLASE POJO NO TIENE CONSTRUCTOR SIN PAR�METROS.
             * ESTA CLASE POJO NO TIENE DEFINIDOS TODOS LOS SETTERS Y GETTERS.
             * ESTA CLASE POJO NO TIENE UNA NOMENCLATURA FIJA PARA LOS SETTERS Y GETTERS. 
             * 
             * ESTA CLASE POJO --> NO ES UNA CLASE JAVA BEAN.
             * 
             * @author Juan Jos� Est�vez Gonz�lez
             */
            public class Employee {                     // LOS BEANS IMPLEMENTAN LA INTERFAZ SERIALIZABLE.
                                                        // LOS ATRIBUTOS DE LOS BEANS TIENEN QUE SER TODOS PRIVADOS.
                // ATRIBUTOS:                           // PARA ACCEDER A LOS ATRIBUTOS ES OBLIGATORIO HACERLO CON LOS GETTERS Y SETTERS.
                // CAMPO POR DEFECTO.                   // POR TANTO, LOS GETTERS Y SETTERS TIENEN QUE SER P�BLICOS.
                String nombre;

                //CAMPO P�BLICO.
                public String id;

                // CAMPO PRIVADO.
                private double salary;

                // CONSTRUCTOR CON PAR�METROS PARA INICIALIZAR LOS CAMPOS.
                public Employee(String nombre, String id, double salary) {
                    this.nombre = nombre;
                    this.id = id;
                    this.salary = salary;
                }

                // LOS JAVA BEANS DEBEN DE TENER UN CONSTRUCTOR SIN PAR�METROS.


                // GETTERS.
                public String muestraNombre() {
                    return nombre;
                }
                 public double muestraSalary() {
                    return salary;
                }

                // SETTERS.
                public void modificaNombre(String nombre) {
                    this.nombre = nombre;
                }
                public void modificaSalary(double salary) {
                    this.salary = salary;
                }

                // TOSTRING.
                @Override
                public String toString() {
                    return "Employee{" + "nombre=" + nombre + ", id=" + id + ", salary=" + salary + '}';
                }
            }

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_10 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_10 + """
        **********************************************************************************************************************************
            import java.io.Serializable;
            
            /**
             * EJEMPLO DE CLASE JAVA BEANS,
             * Y POR TANTO, TAMBI�N ES UN POJO.
             * 
             * @author Juan Jos� Est�vez Gonz�lez
             */
            public class Persona  implements Serializable {                         // LOS BEANS IMPLEMENTAN LA INTERFAZ SERIALIZABLE.
                                                                                    // LOS ATRIBUTOS DE LOS BEANS TIENEN QUE SER TODOS PRIVADOS.
                // ATRIBUTOS.                                                       // PARA ACCEDER A LOS ATRIBUTOS ES OBLIGATORIO HACERLO CON LOS GETTERS Y SETTERS.
                private String nombre;                                              // POR TANTO, LOS GETTERS Y SETTERS TIENEN QUE SER P�BLICOS.
                private String apellidos;
                private int edad;
                
                // CONSTRUCTOR CON PAR�METROS PARA INICIALIZAR LOS CAMPOS.          // LOS CONSTRUCTORES TIENEN QUE SER P�BLUCOS.
                public Persona(String nombre, String apellidos, int edad) {
                    super();
                    this.nombre = nombre;
                    this.apellidos = apellidos;
                    this.edad = edad;
                }
                
                // CONSTRUCTOR SIN PAR�METROS.                                      // LOS JAVA BEANS DEBEN DE TENER UN CONSTRUCTOR SIN PAR�METROS Y P�BLICO.
                public Persona() {
                    super();
                }
                
                // GETTERS. 
                public String getNombre() {
                    return nombre;
                }
                public String getApellidos() {
                    return apellidos;
                }
                public int getEdad() {
                    return edad;
                }
                
                // SETTERS.
                public void setNombre(String nombre) {
                    this.nombre = nombre;
                }
                public void setApellidos(String apellidos) {
                    this.apellidos = apellidos;
                }
                public void setEdad(int edad) {
                    this.edad = edad;
                }
            }
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_11 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_11 + """
        **********************************************************************************************************************************
             
            CONTROL ACTIVO:
                    ES LA FORMA M�S COM�N DE INVOCAR OPERACIONES
                    PARA ITERACIONES ENTRE COMPONENTES.
                        
            LA ITERACI�N ENTRE COMPONENTES SE DENOMINA CONTROL ACTIVO,
            ES DECIR, EL FUNCIONAMIENTO DE UN COMPONENTE SE ACTIVA MEDIANTE LA LLAMADA DE OTRO COMPONENTE.
             
            CONTROL REACTIVO:    
            ADEM�S DEL CONTROL ACTIVO (LA FORMA M�S COM�N DE INVOCAR OPERACIONES),
            EXISTE OTRO M�TODO LLAMADO CONTROL REACTIVO,
            QUE SE REFIERE A EVENTOS DE COMPONENTES,
            COMO LOS PERMITIDOS POR EL MODELO DE COMPONENTES EJB.
                         
            EN EL CONTROL REACTIVO,
                    1.- LOS COMPONENTES PUEDEN GENERAR EVENTOS CORRESPONDIENTES A SOLICITUDES DE INVOCACI�N DE OPERACIONES.
                    2.- COMO REACCI�N SE GENERAR�N SOLICITUDES DE INVOCACI�N DE OPERACIONES.    
                    3.- POSTERIORMENTE, OTROS COMPONENTES DEL SISTEMA RECOLECTAR�AN ESTAS SOLICITUDES,
                        Y ACTIVAR�AN LLAMADAS A OPERACIONES PARA SUS PROP�SITOS DE PROCESAMIENTO.
                         
            POR EJEMPLO, CUANDO EL PUNTERO DEL MOUSE PASA SOBRE EL �CONO DEL ESCRITORIO,
            SI LA FORMA DEL �CONO DEL ESCRITORIO CAMBIA,
            EL COMPONENTE DE ICONO EMITIR�A EVENTOS RELACIONADOS CON LA OPERACI�N DE CAMBIAR LA FORMA DEL ICONO.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_12 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_12 + """
        **********************************************************************************************************************************
                      
            �QU� ES LA INTROSPECCI�N?
                    LAS HERRAMIENTAS DE DESARROLLO DESCUBREN LAS CARACTER�STICAS DE LOS COMPONENTES
                    (ES DECIR, PROPIEDADES DE LOS COMPONENTES, M�TODOS Y EVENTOS)
                    A TRAV�S DE UN PROCESO LLAMADO INTROSPECCI�N.
                         
                    LA INTROSPECCI�N, POR TANTO,
                    ES EL MECANISMO A TRAV�S DEL CUAL SE PUEDEN DESCUBRIR
                    LAS PROPIEDADES, M�TODOS Y EVENTOS CONTENIDOS EN EL COMPONENTE. 
                         
            PODEMOS HACER INTROSPECCI�N SOBRE LOS COMPONENTES DE DOS FORMAS: 
                         
                    1.- MEDIANTE EL USO DE CONVENCIONES DE NOMENCLATURA ESPEC�FICA:
                            MEDIANTE EL USO DE CONVENCIONES DE NOMENCLATURA ESPEC�FICAS,
                            QUE SE CONOCEN AL NOMBRAR LAS CARACTER�STICAS DE LOS COMPONENTES.
                         
                                    * SI UN COMPONENTE TIENE UN ATRIBUTO XXX,
                                      SE ESTABLECE LA NORMA DE QUE TIENE QUE EXISTIR UN M�TODO  -->  getXXX
                         
                                    * DENTRO DE JAVA, PARA EJB, LA CLASE   -->   Introspector
                                      TIENE M�TODOS QUE COMPRUEBAN EL EJB
                                      PARA ENCONTRAR ESOS PATRONES DE DISE�O
                                      Y DESCUBRIR SUS CARACTER�STICAS.
                         
                    2.- ATRIBUTOS, M�TODOS O EVENTOS:
                            OTRA FORMA SER�A DIRECTAMENTE, AL PUBLICAR EL COMPONENTE,                         
                            PROPORCIONANDO INFORMACI�N CLARA SOBRE ATRIBUTOS, M�TODOS O EVENTOS DE CLASES RELACIONADAS.
                         
            EN PARTICULAR, EJB ADMITE M�LTIPLES NIVELES DE INTROSPECCI�N. 
                         
            EN EL NIVEL M�S BAJO TENEMOS LA INTROSPECCI�N POR REFLEXI�N:
                         
            ESTA INTROSPECCI�N SE PUEDE LOGRAR MEDIANTE LA POSIBILIDAD DE REFLEXI�N.
                         
            LA REFLEXI�N ES UNA CARACTER�STICA QUE PERMITEN A LOS OBJETOS JAVA DESCUBRIR INFORMACI�N SOBRE M�TODOS P�BLICOS,
            CAMPOS Y CONSTRUCTORES DE CLASES CARGADOS DURANTE LA EJECUCI�N DEL PROGRAMA.
                         
            LA REFLEXI�N PERMITE LA INTROSPECCI�N DE TODOS LOS COMPONENTES DEL SOFTWARE,
            Y TODO LO QUE SE TIENE QUE HACER ES DECLARAR EL M�TODO O VARIABLE COMO P�BLICO
            PARA QUE PUEDA SER DESCUBIERTO A TRAV�S DE LA REFLEXI�N.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_13 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_13 + """
        **********************************************************************************************************************************

                package Tema_15;

                import java.io.PrintWriter;
                import java.lang.reflect.Field;

                /**
                 *
                 * @author Juan Jos� Est�vez Gonz�lez
                 */
                public class InspectorDeClases {

                    public static void main(String[] args) {

                        introspeccion(String.class, new PrintWriter(System.out));
                    }

                    private static void introspeccion (Class aClass, PrintWriter printer) {

                        printer.println("Un '" + aClass.getSimpleName() + "'");
                        for (Field field : aClass.getDeclaredFields()) {

                            printer.print("\tTiene: ");
                            printer.print(field.getName());
                            printer.println("  -->  De Tipo " + field.getType().getSimpleName());
                        }
                        printer.flush();
                    }
                }
                /*            RESULTADO:
                Un 'String'
                        Tiene: value  -->  De Tipo byte[]
                        Tiene: coder  -->  De Tipo byte
                        Tiene: hash  -->  De Tipo int
                        Tiene: hashIsZero  -->  De Tipo boolean
                        Tiene: serialVersionUID  -->  De Tipo long
                        Tiene: COMPACT_STRINGS  -->  De Tipo boolean
                        Tiene: serialPersistentFields  -->  De Tipo ObjectStreamField[]
                        Tiene: REPL  -->  De Tipo char
                        Tiene: CASE_INSENSITIVE_ORDER  -->  De Tipo Comparator
                        Tiene: LATIN1  -->  De Tipo byte
                        Tiene: UTF16  -->  De Tipo byte
                */

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_14 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_14 + """
        **********************************************************************************************************************************
                       
            PARA EJB,
            LA PERSISTENCIA SE PROPORCIONA CON LA BIBLIOTECA JPA DE JAVA.
            (JAVA PERSISTENCE API).
            HOY EN D�A PODEMOS ENCONTRAR TAL ESPECIFICACI�N EN ORACLE.
                         
            PARA USAR JPA,
            SE REQUIERE EL USO AL MENOS DEL JDK 1.5 (CONOCIDO COMO JAVA 5) EN ADELANTE,
            YA QUE AMPL�A LAS NUEVAS ESPECIFICACIONES DEL LENGUAJE JAVA, COMO SON LAS ANOTACIONES.
                         
            PARA UTILIZAR LA BIBLIOTECA JPA,
            ES ESENCIAL TENER UN CONOCIMIENTO S�LIDO DE POO (PROGRAMACI�N ORIENTADA A OBJETOS),
            JAVA, Y LENGUAJE DE CONSULTA ESTRUCTURADO.
                         
            EN LA CLASE javax.persistence DISPONDREMOS DE ANOTACIONES JPA (O ANOTACIONES EJB 3.0)
            QUE SON UTILIZADAS POR MUCHOS IDES QUE ADMITEN JDK5 O SUPERIORES
            (COMO NETBEANS, ECLIPSE, INTELLIJ IDEA)
            YA QUE POSEEN UTILIDADES Y COMPLEMENTOS PARA EXPORTAR CLASES DE ENTIDAD
            USANDO ESTAS DIFERENTES ANOTACIONES JPA PARTIENDO DE LA ARQUITECTURA DE LA BASE DE DATOS.

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_15 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_15 + """
        **********************************************************************************************************************************
                                     
            LAS CLASES QUE COMPONEN JPA SON LAS SIGUIENTES:

                    - Persistence:
                            LA CLASE javax.persistence.Persistence CONTIENE UN M�TODO AUXILIAR EST�TICO,
                            EL CUAL USAMOS PARA TENER UN OBJETO EntityManagerFactory
                            DE FORMA INDEPENDIENTE DEL QUE SE OBTIENE A TRAV�S DE JPA.

                    - EntityManagerFactory:
                            LA  CLASE javax.persistence.EntityManagerFactory
                            EXTRAEMOS OBJETOS DE TIPO EntityManager
                            USANDO EL CONOCIDO PATR�N DE FACTORY.

                    - EntityManager:
                            LA CLASE javax.persistence.EntityManager
                            ES LA INTERFAZ JPA PRINCIPAL PARA LA PERSISTENCIA DE APLICACIONES.
                            CADA EntityManager PUEDE CREAR, LEER, MODIFICAR Y ELIMINAR UN GRUPO DE OBJETOS PERSISTENTES. 

                    - Entity:
                            LA CLASE Entity ES UNA ANOTACI�N JAVA.
                            LA ENCONTRAMOS AL MISMO NIVEL QUE LAS CLASES JAVA SERIALIZABLES.
                            CADA UNA DE ESTAS ENTIDADES LAS REPRESENTAMOS COMO REGISTROS DIFERENTES EN BASE DE DATOS.

                    - EntityTransaction:
                            PERMITE OPERACIONES CONJUNTAS CON DATOS PERSISTENTES,
                            DE TAL FORMA, QUE PUEDEN CREAR GRUPOS PARA PERSISTIR DISTINTAS OPERACIONES.
                            SI TODO EL GRUPO REALIZA LAS OPERACIONES SIN NING�N PROBLEMA SE PERSISTIR�,
                            DE LO CONTRARIO, TODOS LOS INTENTOS FALLAR�N. 
                            EN CASO DE ERROR, LA BASE DE DATOS REALIZAR� ROLLBACK Y VOLVER� AL ESTADO ANTERIOR.

                    - Query:
                            CADA PROVEEDOR DE JPA HA IMPLEMENTADO LA INTERFAZ javax.persistence.Query
                            PARA ENCONTRAR OBJETOS PERSISTENTES PROCESANDO CIERTAS CONDICIONES DE B�SQUEDA.
                            JPA UTILIZA JPQL Y SQL PARA ESTANDARIZAR EL SOPORTE DE CONSULTAS.
                            PODREMOS OBTENER UN OBJETO Query A TRAV�S DEL EntityManager.

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_16 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_16 + """
        **********************************************************************************************************************************
                                     
            ORACLE TIENE PUBLICADOS VARIOS TUTORIALES, EN FUNCI�N DE LA VERSI�N DE JAVA,
            PARA EL DESARROLLO DE COMPONENTES EJB EN LOS QUE SE MUESTRAN 
            LOS REQUISITOS Y LAS INSTRUCCIONES PASO A PASO.
                         
                    - JAVA 7: https://docs.oracle.com/javaee/7/tutorial/title.html 
                         
                    - JAVA 8: https://javaee.github.io/tutorial/ 

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_17 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_17 + """
        **********************************************************************************************************************************
                                     
            EL PROYECTO JAVA EE DE ORACLE AHORA SE HA RENOMBRADO A JAKARTA EE,
            Y TODA LA DOCUMENTACI�N EST� EN OTRAS WEB DIFERENTES.
                         
                    - https://projects.eclipse.org/projects/ee4j
                         
                    - https://start.jakarta.ee/
                         
                    - https://eclipse-ee4j.github.io/jakartaee-tutorial/

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_18 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_18 + """
        **********************************************************************************************************************************
                                     
            A CONTINUACI�N,
            MOSTRAREMOS EL C�DIGO POR MEDIO DEL CUAL PERSISTIREMOS 2 OBJETOS DE LA CLASE PERSONA.
            PRIMERO NOS CREAREMOS LOS DIFERENTES OBJETOS MEDIANTE CONSTRUCTOR:
                         
                    Persona persona1 = new Persona("pedro",25, ?calle 1?);
                    Persona persona2 = new Persona("pedro",25, ?calle 7?);
                         
            Y DESPU�S, PROCEDEMOS A CREAR EntityManagerFactory
            Y A PERSISTIR LOS DIFERENTES OBJETOS:
                         
                    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("FactoryPersonas");
                    EntityManager em = emf.createEntityManager();
                    try {
                        em.getTransaction().begin();
                        em.persist(persona1);
                        em.persist(persona2);
                        em.getTransaction().commit();
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        em.close();
                    }
                         
            SE NOS PROPONE TRABAJAR SOBRE EL OBJETO EntityTransaction,
            PARA ELLO VEREMOS UN EJEMPLO,
            DONDE HAREMOS USO DE DICHO OBJETO PARA REALIZAR LA PERSISTENCIA EN LA CAPA DE ACCESO A DATOS:
                         
                    private static void agregarEntidad {
                        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCIA");
                        EntityManager entityManager = entityManagerFactory.createEntityManager();
                        EntityTransaction entityTransaction = entityManager.getTransaction();
                        entityTransaction.begin();
                        Student estudiante = new Student("Juan", "Lopez", "micorreo@codigos.com");
                        entityManager.persist(estudiante);
                        entityTransaction commit();
                        entityManager.close();
                        entityManagerFactory.close();
                    }
                         
            COMO PODEMOS OBSERVAR EN EL C�DIGO EXPUESTO,
            ENGLOBAMOS EN UN M�TODO PRIVADO, EL M�TODO QUE NOS HAR� DICHAS FUNCIONES.
            EN �L, EN PRIMER LUGAR, CREAMOS UNA VARIABLE DE TIPO EntityManagerFactory
            DONDE DAMOS NOMBRE A NUESTRA FACTOR�A.
            A CONTINUACI�N CREAMOS UN entityManager
            DEL CUAL EXTRAEMOS LA TRANSACCI�N CON getTransaction()
            PARA PODER EMPEZAR A REALIZAR OPERACIONES.
            CREAMOS UN ESTUDIANTE 'NORMAL', COMO EJEMPLO,
            LO PERSISTIMOS, Y CON NUESTRA TRANSACCI�N HACEMOS commit() PARA QUE SEA EFECTIVA.
            DE ESTE MODO USAREMOS NUESTRO OBJETO PARA PERSISTIR LOS DIFERENTES COMPONENTES Y OBJETOS JAVA EN GENERAL.

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_19 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_19 + """
        **********************************************************************************************************************************
                
            A LA HORA DE DISTRIBUIR Y DESPLEGAR LOS COMPONENTES REALIZADOS,
            DEBEMOS TENER EN CUENTA QUE LO QUE LLAMAREMOS UN M�DULO J2EE, PODR�A CONSTAR DE:
                                              
            * UN M�DULO J2EE:
                         
                    * CONSTA DE UNO O M�S COMPONENTES J2EE DEL MISMO TIPO DE CONTENEDOR.
                         
                    * DESCRIPTORES DE IMPLEMENTACI�N DE COMPONENTES DE ESTE TIPO.
                            - EL DESCRIPTOR DE DESPLIEGUE DEL M�DULO EJB SER� EL QUE
                              ESPECIFIQUE LOS DISTINTOS ATRIBUTOS DE NUESTRA TRANSACCI�N
                              Y LA AUTORIZACI�N DE SEGURIDAD DEL EJB.
                         
                    * LOS M�DULOS JAVAEE QUE NO TENGAN O NO NECESITEN DESCRIPTORES DE IMPLEMENTACI�N DE APLICACIONES
                      SE PODR�N IMPLEMENTAR COMO M�DULOS SEPARADOS.
                         
            * ANTES DE EJB 3.1 TODOS LOS EJB DEB�AN ESTAR EMPAQUETADOS EN ESTOS ARCHIVOS.
                         
            POR OTRO LADO, LO HABITUAL ES QUE LA MAYOR�A DE LA APLICACIONES J2EE, CONTENGAN:
                         
                    * UNA PARTE FRONTAL, PARA LA INTERACCI�N CON LOS USUARIOS O CLIENTES, --> front-end web.
                    * UNA PARTE TRASERA DEL SERVIDOR, --> back-end EJB.
                         
            LO QUE SIGNIFICA, QUE ES UNA BUENA PRACTICA, O QUE SE DEBE CREAR UN FICHERO .ear 
            QUE CONTENGA UNA APLICACI�N CON DOS M�DULOS: 
                         
                    * .war  
                    * ejb-jar
                         
            �STA ES UNA BUENA PR�CTICA EN EL SENTIDO DE:
                        
                    * ESTABLECER  UNA CLARA SEPARACI�N ESTRUCTURAL ENTRE LA PARTE 'DELANTERA' Y LA 'TRASERA'.
                    * NO OBSTANTE, ESTA DIFERENCIACI�N SER� COMPLICADO DELIMITARLA EN APLICACIONES SIMPLES.

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_20 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_20 + """
        **********************************************************************************************************************************
                                     
            HAY CUATRO TIPOS DE M�DULOS J2EE PARA APLICACIONES WEB EJB:
                         
                    - M�DULOS EJB:
                            QUE CONTIENEN ARCHIVOS CON CLASES EJB Y DESCRIPTORES DE DESPLIEGUE EJB.
                            EL M�DULO EJB EST� EMPAQUETADO COMO UN ARCHIVO JAR CON EXTENSI�N .jar. (JAVA ARCHIVE).
                         
                    - EL M�DULO WEB:
                            QUE CONTIENE ARCHIVOS CON Servlet, ARCHIVOS JSP, (JAVA SERVER PAGES),
                            ARCHIVOS DE SOPORTE DE CLASES, ARCHIVOS GIF Y HTML
                            Y DESCRIPTORES DE IMPLEMENTACI�N DE APLICACIONES WEB.
                            EL M�DULO WEB EST� EMPAQUETADO COMO UN ARCHIVO JAR (JAVA ARCHIVE) CON UNA EXTENSI�N .war (WEB ARCHIVE).
                         
                    - EL M�DULO DE LA APLICACI�N CLIENTE:
                            QUE CONTIENE ARCHIVOS CON CLASES Y DESCRIPTORES DE LA APLICACI�N CLIENTE.
                            EL M�DULO DE LA APLICACI�N CLIENTE EST� EMPAQUETADO COMO UN ARCHIVO JAR CON EXTENSI�N .jar.
                         
                    - M�DULO ADAPTADOR DE RECURSOS:
                            QUE CONTIENE TODAS LAS INTERFACES, CLASES, BIBLIOTECAS NATIVAS
                            Y OTROS DOCUMENTOS DE JAVA Y SUS DESCRIPTORES DE IMPLEMENTACI�N DEL ADAPTADOR DE RECURSOS.

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_21 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_21 + """
        **********************************************************************************************************************************
                                     
            ACTUALMENTE,
            LOS ENTORNOS DE DESARROLLO DE COMPONENTES M�S UTILIZADOS SON: 
                         
                    - Intellij.
                    - NetBeans.
                    - Eclipse.
                         
            ECLIPSE SE UTILIZA PRINCIPALMENTE PARA EL DESARROLLO DE COMPONENTES JAVA (COMO EJB),
            Y Microsoft.NET PARA EL DESARROLLO DE ENSAMBLAJES (COM +, DCOM). 
                         
            ESTOS ENTORNOS PROPORCIONAN UNA ALTERNATIVA A LA GENERACI�N AUTOM�TICA DE C�DIGO 
            Y FACILITAN ENORMEMENTE EL DESARROLLO DE APLICACIONES QUE UTILIZAN COMPONENTES.
                         
            INFORMACI�N ADICIONAL:
                         
            https://docs.oracle.com/javaee/7/tutorial/title.htm
            
            https://projects.eclipse.org/projects/ee4j
            
            https://start.jakarta.ee/
                         
            https://docs.oracle.com/javaee/5/tutorial
            
            https://eclipse-ee4j.github.io/jakartaee-tutorial/
            
            HolaMundo con EJB en Java EE 8: 
            https://itoo.dev/courses/1049264/lectures/22222034
            
            Introducci�n Jakarta EE 9 - Configurando nuestro entorno de desarrollo con #OpenJDK y #NetBeans
            https://www.youtube.com/watch?v=Ex9bXopBYc4
            
            JSF-EJB-JPA-Crud-Example||CRUD Enterprise Application in NetBeans:
            https://www.youtube.com/watch?v=-V6BVYbF-ow
            
            Ejemplo JEE: JPA + EJB + JSF: 
            https://www.youtube.com/playlist?list=PLtqGwSACq5Q3CtX94FnBFizOItR7THOJO
            
            Configurando #IntelliJ IDEA para #Jakarta EE 9:
            https://www.youtube.com/watch?v=Z0fB4Mkmi3A
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    public static void recurso(String opcion) {
        
        String menu="";
        do {
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
                case "11" -> System.out.println(recurso_11);
                case "12" -> System.out.println(recurso_12);
                case "13" -> System.out.println(recurso_13);
                case "14" -> System.out.println(recurso_14);
                case "15" -> System.out.println(recurso_15);
                case "16" -> System.out.println(recurso_16);
                case "17" -> System.out.println(recurso_17);
                case "18" -> System.out.println(recurso_18);
                case "19" -> System.out.println(recurso_19);
                case "20" -> System.out.println(recurso_20);
                case "21" -> System.out.println(recurso_21);
                case "22" -> {
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
                    continuar();
                    System.out.println(recurso_11);
                    continuar();
                    System.out.println(recurso_12);
                    continuar();
                    System.out.println(recurso_13);
                    continuar();
                    System.out.println(recurso_14);
                    continuar();
                    System.out.println(recurso_15);
                    continuar();
                    System.out.println(recurso_16);
                    continuar();
                    System.out.println(recurso_17);
                    continuar();
                    System.out.println(recurso_18);
                    continuar();
                    System.out.println(recurso_19);
                    continuar();
                    System.out.println(recurso_20);
                    continuar();
                    System.out.println(recurso_21);
                }
            }
            try {                
                menu = miTryRecursos();                
                switch (menu) {                   
                    case "0" -> {}
                    default -> {
                            miDefault();
                            }
                }
            }  catch (Exception e) {
                miError(e);
            }
        } while (!"0".equals(menu));   
    }
}
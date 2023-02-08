package Tema_15;

import static Principal_Main.Main.*;
import static Tema_15.T_15.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_15 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_15 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
            
            COMENZAREMOS ESTA ÚLTIMA UNIDAD DEL MÓDULO,
            CONOCIENDO EL SIGNIFICADO DE LOS COMPONENTES EN JAVA ORIENTADOS A BEANS:
                    EJB (ENTERPRISE JAVA BEAN).
                         
            LA TECNOLOGÍA ENTRERPRISE JAVABEANS (EJB) PERMITE DEFINIR COMPONENTES (ENTRERPRISE BEANS)
            QUE IMPLEMENTAN LÓGICA DE NEGOCIO Y QUE SON GESTIONADOS POR UN SERVIDOR DE APLICACIONES JAVA EE(ENTERPRISE EDITION)
                         
            LOS JAVABEAN O BEAN,
            COMO COMPONENTES SOFTWARE,
            SE PODRÁN REUTILIZAR E INCLUSO MODIFICAR TOTAL O PARCIALMENTE SU PROGRAMACIÓN JAVA.
                         
            POR TANTO, 
            TENEMOS QUE CON LA TECNOLOGÍA J2EE ENTERPRISE JAVABEANS
            ES POSIBLE DESARROLLAR COMPONENTES (ENTRERPRISE BEANS)
            QUE LUEGO PODREMOS REUTILIZAR Y ENSAMBLAR EN DISTINTAS APLICACIONES QUE TENGAS QUE HACER PARA LA EMPRESA.
                         
            POR EJEMPLO, PODRÍAMOS DESARROLLAR UN BEAN CLIENTE QUE REPRESENTE UN CLIENTE EN BASE DE DATOS.
            Y USAR DESPUÉS ESE BEAN CLIENTE EN UN PROGRAMA DE CONTABILIDAD O EN UNA APLICACIÓN DE COMERCIO ELECTRÓNICO
            O EN CUALQUIER PROGRAMA EN EL QUE SE NECESITE REPRESENTAR UN CLIENTE.
                         
            JAKARTA ES EL NOMBRE ACTUAL DE LO QUE ANTIGUAMENTE SE LLAMABA JAVA PLATFORM ENTERPRISE EDITION
            O JAVA EE, TAMBIÉN LLAMADA COLOQUIALMENTE "JAVA EMPRESARIAL".
            EN 2018 PASÓ A GESTIONARLO LA FUNDACIÓN ECLIPSE, COMO JAVA ES UNA MARCA REGISTRADA DE ORACLE,
            SE VIERON FORZADOS TAMBIÉN A CAMBIARLE EL NOMBRE, POR JAKARTA.
                         
            SERÍA POSIBLE QUE EL DESARROLLADOR DEL BEAN Y EL ENSAMBLADOR DE LA APLICACIÓN NO FUERAN LA MISMA PERSONA,
            O QUE NI SIQUIERA TRABAJARAN EN LA MISMA EMPRESA,
            YA QUE VA A SER POSIBLE REALIZAR UNA INTEGRACIÓN ENTRE COMPONENTES DE TERCEROS.
                         
            DE ESTA FORMA, EL DESARROLLO BASADO EN COMPONENTES ES UN PASO MÁS EN EL CAMINO DE LA PROGRAMACIÓN ORIENTADA A OBJETOS.
                         
            CON LA PROGRAMACIÓN ORIENTADA A OBJETOS PUEDES REUTILIZAR CLASES,
            PERO CON COMPONENTES ES POSIBLE REUTILIZAR UN MAYOR NIVEL DE FUNCIONALIDADES E INCLUSO
            ES POSIBLE MODIFICAR ESTAS FUNCIONALIDADES Y ADAPTARLAS A CADA ENTORNO DE TRABAJO PARTICULAR
            SIN TOCAR EL CÓDIGO DEL COMPONENTE DESARROLLADO.
                         
            TAMBIÉN ESTUDIAREMOS SUS PROPIEDADES, ATRIBUTOS Y DIFERENTES EVENTOS, ASÍ COMO SU PROPAGACIÓN.
                         
            POR ÚLTIMO, 
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
            QUE ENCAPSULA UN SEGMENTO DE CÓDIGO CON CIERTAS FUNCIONES,
            PARA DAR ESAS FUNCIONALIDADES.
                         
            LOS ESTILOS DE ESTOS COMPONENTES PUEDEN SER:
                         
                    * ESTILOS PROPORCIONADOS POR EL ENTORNO DE DESARROLLO.
                      INCLUIDOS EN LA INTERFAZ DE USUARIO GUI.
                         
                    * ESTILOS NO VISUALES,
                      SIENDO SUS FUNCIONES SIMILARES A LAS DE LAS BIBLIOTECAS REMOTAS.
                      POR EJEMPLO LAS APIS.
                         
            LOS COMPONENTES DEL SOFTWARE TIENEN LAS SIGUIENTES CARACTERÍSTICAS PRINCIPALES:
                         
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
                         
            DE ESTA FORMA, LA PROGRAMACIÓN ORIENTADA A COMPONENTES O UN COMPONENTE,
            SE PUEDE ENTENDER COMO LOS DISTINTOS ENGRANAJES ELECTRÓNICOS QUE, EN SU CONJUNTO, FORMAN UN SISTEMA MÁS GRANDE.
 
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
                                    
            PODEMOS AFIRMAR QUE UN COMPONENTE SERÁ FORMADO POR LOS SIGUIENTES ELEMENTOS:

                    * ATRIBUTOS, OPERACIONES Y EVENTOS:
                            ES PARTE DE LA INTERFAZ DEL COMPONENTE. TODO EN SU JUNTO REPRESENTARÍA EL NIVEL SINTÁCTICO.

                    * COMPORTAMIENTO:
                            REPRESENTA LA PARTE SEMÁNTICA.
                            POR EJEMPLO, FUNCIONALIDADES Y OBJETIVO DEL COMPONENTE.

                    * PROTOCOLOS Y ESCENARIOS:
                            * REPRESENTA LA COMPATIBILIDAD DE LAS SECUENCIAS DE LOS MENSAJES CON OTROS COMPONENTES.
                            * REPRESENTA LA FORMA DE ACTUAR QUE TENDRÁ EL COMPONENTE
                              EN DIFERENTES ESCENARIOS DONDE LLEGARÁ A SER EJECUTADO.

                    * PROPIEDADES:
                            LAS DIFERENTES CARACTERÍSTICAS QUE PUEDE TENER EL COMPONENTE.
                         
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
                       
            SABÍAS QUE ... 
                    LOS ATRIBUTOS Y LAS PROPIEDADES DE LOS BEANS DE JAVA DEBEN MANTENER SU SCOPE (ALCANCE) PRIVADO.

                    DE ESTA FORMA FOMENTAMOS LA SEGURIDAD Y EL ACCESO A DICHAS PROPIEDADES Y ATRIBUTOS,
                    Y SÓLO SE PROPAGARÁN LOS CAMBIOS LLAMANDO AL MÉTODO DETERMINADO DE DICHA PROPIEDAD.

                    SE PUEDE VERIFICAR Y MODIFICAR LAS PROPIEDADES DEL COMPONENTE
                    ACCEDIENDO AL MÉTODO DEL COMPONENTE O LA FUNCIÓN DE ACCESO.
                         
            A TRAVÉS DE LAS PROPIEDADES DE UN COMPONENTE, PODEMOS SABER CUÁL ES SU ESTADO,
            Y TAMBIÉN DIFERENCIARLO DEL RESTO DE COMPONENTES.
                         
            PROPIEDADES DEL COMPONENTE:  DETERMINAN SU ESTADO Y LO DISTINGUEN DEL RESTO.
             
            ES POR ESTE MOTIVO QUE LAS PROPIEDADES SON UNO DE LOS ASPECTOS RELEVANTES DE LA INTERFAZ DEL COMPONENTE:
                         
                    * SON ELEMENTOS QUE FORMAN PARTE DE LA VISTA EXTERNA DEL COMPONENTE (REPRESENTADA COMO VISTA PÚBLICA).
                    * ADEMÁS, DESDE EL PUNTO DE VISTA DEL CONTROL Y USO DE COMPONENTES,
                      ESTAS CARACTERÍSTICAS OBSERVABLES VAN A SER MUY IMPORTANTE,
                      PORQUE DE HECHO SERÁN LA BASE PARA QUE PODAMOS CARACTERIZAR OTROS ASPECTOS Y COMPORTAMIENTOS DE LOS COMPONENTES.
                         
            SE HA ADELANTADO ANTERIORMENTE QUE ESTOS COMPONENTES CARECEN DE ESTADO,
            LO QUE SE HARÁ SERÁ UTILIZAR UNA SERIE DE PROPIEDADES DE LOS COMPONENTES,
            A LAS QUE SE PUEDE ACCEDER Y MODIFICAR DE DIFERENTES FORMAS.
                         
            EN FUNCIÓN DE SUS CARACTERÍSTICAS Y FORMAS DE ACCESO, LAS PROPIEDADES DE LOS COMPONENTES SE DIVIDEN EN:
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
             
            SE PUEDE VERIFICAR Y MODIFICAR LAS PROPIEDADES DEL COMPONENTE ACCEDIENDO AL MÉTODO DEL COMPONENTE O LA FUNCIÓN DE ACCESO.                          
            HAY DOS TIPOS DE ESTAS FUNCIONES:

                    * EL MÉTODO GET:
                            SE UTILIZA PARA CONSULTAR O LEER EL VALOR DE UN ATRIBUTO.
                            LA SINTAXIS GENERAL ES LA SIGUIENTE:

                            Tipo getNombrePropiedad()

                    * EL MÉTODO SET:
                            SE UTILIZA PARA ASIGNAR O CAMBIAR EL VALOR DE UN ATRIBUTO.
                            SU SINTAXIS GENERAL EN JAVA ES:

                            SetNombrePropiedad(Tipo valor)
                                   
            CENTRÁNDONOS EN LAS PROPIEDADES O ATRIBUTOS INDEXADOS Y SIMPLES,
            PODEMOS DECIR,
            QUE LOS ATRIBUTOS SIMPLES:
                    SON ATRIBUTOS QUE REPRESENTAN UN SOLO VALOR.
                    POR EJEMPLO, SI HAY UN BOTÓN EN LA INTERFAZ GRÁFICA,
                    LOS ATRIBUTOS SIMPLES SERÁN ATRIBUTOS RELACIONADOS CON SU TAMAÑO, COLOR DE FONDO, ETIQUETA, ETC. 

            ADEMÁS DE LAS PROPIEDADES DE LOS VALORES SIMPLES Y ÚNICOS,
            EXISTE OTRO TIPO DE PROPIEDADES MÁS COMPLEJAS
            QUE SON MUY SIMILARES A UN CONJUNTO DE VALORES: LOS ÍNDICES. 

            TODOS LOS ELEMENTOS DE ESTE TIPO DE ATRIBUTO COMPARTEN EL MISMO TIPO DE DATO
            Y SE PUEDE ACCEDER A ELLOS POR ÍNDICE, POSICIÓN.

            CONCRETAMENTE,
            SE PUEDE ACCEDER MEDIANTE EL MÉTODO DE ACCESO QUE SE MENCIONÓ ANTERIORMENTE (get / set),
            AUNQUE LA LLAMADA DE ESTOS MÉTODOS VARIARÁ, PARA INCLUIR LA PROPIEDAD A LA QUE SE QUIERE ACCEDER,
            ASÍ COMO EL ÍNDICE, YA QUE SOLO SE PUEDE ACCEDER A CADA PROPIEDAD A TRAVÉS DE SU ÍNDICE, POSICIÓN. 

            LA SINTAXIS QUE ENCONTRAMOS EN JAVA SERÍA:

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
                       
            ADEMÁS DE LOS ATRIBUTOS SIMPLES Y LOS ATRIBUTOS INDEXADOS,
            LOS COMPONENTES TAMBIÉN TIENEN OTROS DOS TIPOS DE ATRIBUTOS:
                    * ATRIBUTOS COMPARTIDOS.
                    * ATRIBUTOS RESTRINGIDOS.
            
            LOS ATRIBUTOS COMPARTIDOS SE REFIEREN
            A LOS DATOS MEDIANTE LOS QUE INFORMA A TODOS LOS INTERESADOS SOBRE EL ATRIBUTO,
            CUANDO CAMBIAN, POR LO QUE SOLO SE LES NOTIFICA CUANDO CAMBIA EL ATRIBUTO.    
            LOS ATRIBUTOS COMPARTIDOS SON DATOS CUYA MODIFICACIÓN ES INFORMADA A TODOS LOS INTERESADOS,
            PERO ÚNICAMENTE SE PRODUCE ESTE CAMBIO EN EL ATRIBUTO.
                    - EL MECANISMO DE NOTIFICACIÓN SE BASA EN EVENTOS, ES DECIR,
                      HAY UN COMPONENTE DE ORIGEN QUE NOTIFICA AL COMPONENTE RECEPTOR
                      CUANDO UN ATRIBUTO COMPARTIDO CAMBIA A TRAVÉS DE UN EVENTO.
                    - DEBE QUEDAR CLARO QUE ESTAS PROPIEDADES NO SON BIDIRECCIONALES,
                      POR LO QUE EL COMPONENTE RECEPTOR NO PUEDE RESPONDER.
                    - PARA QUE UN COMPONENTE PERMITA PROPIEDADES COMPARTIDAS,
                      DEBE ADMITIR DOS MÉTODOS, QUE SON LOS QUE USARÁ PARA REGISTRAR COMPONENTES
                      QUE ESTÉN INTERESADOS EN CAMBIOS DE PROPIEDAD.
                            * UN MÉTODO PARA AGREGAR  COMPONENTES INTERESADOS.
                            * OTRO PARA ELIMINARLOS.
                         
            SINTAXIS GENERAL MÉTODO PARA AÑADIR COMPONENTES INTERSADOS EN ATRIBUTOS COMPARTIDOS EN JAVA:
                         
                            * addPropertyChangeListener (PropertyChangeListener x)
                         
            SINTAXIS GENERAL MÉTODO PARA ELIMINAR COMPONENTES INTERSADOS EN ATRIBUTOS COMPARTIDOS EN JAVA:
                         
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

            LAS PROPIEDADES RESTRINGIDAS BUSCARÁN LA APROBACIÓN DE OTROS COMPONENTES ANTES DE CAMBIAR SU VALOR.
            AL IGUAL QUE CON LOS ATRIBUTOS COMPARTIDOS, SE DEBEN PROPORCIONAR DOS MÉTODOS DE REGISTRO PARA EL RECEPTOR. 

            EN ESTE CASO, LOS COMPONENTES OYENTES IMPLEMENTARÁN UNA INTERFAZ   -->   VetoableChangeListener
            MEDIANTE LA QUE ACEPTAN O RECHAZAN LA PROPOSICIÓN DE UN CAMBIO 
            EN LA PROPIEDAD RESTRINGIDA DEL COMPONENTE FUENTE, ORIGEN.

            SINTAXIS GENERAL MÉTODO PARA AÑADIR COMPONENTES A LOS QUE CONSULTAR LA APROBACIÓN EN ATRIBUTOS RESTRINGIDOS EN JAVA:

                            * addVetoableChangeListener (VetoableChangeListener x) 

            SINTAXIS GENERAL MÉTODO PARA ELIMINAR COMPONENTES A LOS QUE CONSULTAR LA APROBACIÓN EN ATRIBUTOS EN JAVA:

                            * removeVetoableChangeListener (Vetoabl eChange Listener x).

            LAS PROPIEDADES SON UNO DE LOS ASPECTOS RELEVANTES DE LA INTERFAZ DEL COMPONENTE
            PORQUE SON ELEMENTOS QUE FORMAN PARTE DE LA VISTA EXTERNA DEL COMPONENTE
            (REPRESENTADA COMO UNA VISTA PÚBLICA).
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
                       
            LLEGADOS A ESTE PUNTO, ES UNA DUDA HABITUAL PREGUNTARSE CUÁL ES, EN LA PRÁCTICA,
            LA DIFERENCIA REAL ENTRE LOS COMPONENTES BEANS,
            Y LAS CLASES Y OBJETOS JAVA CON LOS QUE HEMOS ESTADO TRABAJANDO HASTA AHORA.
                    * LAS CLASES Y OBJETOS JAVA CON LOS QUE HEMOS ESTADO TRABAJANDO HASTA AHORA,
                      HAN SIDO CLASES POJOS (INICIALES DE PLAIN OLD JAVA OBJECT)
                      UN POJO ES UNA INSTANCIA DE UNA CLASE QUE NO EXTIENDE NI IMPLEMENTA NADA EN ESPECIAL.
                      SIRVE PARA ENFATIZAR EL USO DE CLASES SIMPLES Y QUE NO DEPENDEN DE UN FRAMEWORK EN ESPECIAL.
                    * UN BEAN EN JAVA SE DEFINE EN LA ESPECIFICACIÓN ENTERPRISE JAVABEAN: SON TAMBIÉN CLASES SIMPLES EN JAVA,
                      PERO TIENEN QUE CUMPLIR ADEMÁS CON CIERTAS CONDICIONES Y NORMAS CON LOS NOMBRES DE SUS PROPIEDADES Y MÉTODOS,
                      Y SU VISIBILIDAD, QUE SE INDICAN EN LAS DIFERENTES VERSIONES DE LAS ESPECIFICACIONES
                      QUE CADA CIERTO TIEMPO PUBLICA EL FABRICANTE,
                      PARA SOPORTAR FUNCIONALIDADES DE JAVA ENTERPRISE EDITION:
                            - IMPLEMENTAN LA INTERFAZ SERIALIZABLE.
                            - LOS CAMPOS DEL BEAN TIENEN QUE SER OBLIGATORIAMENTE PRIVADOS.
                            - LOS BEANS PUEDEN TENER UN CONSTRUCTOR SIN ARGUMENTOS.
                            - A LOS CAMPOS SOLO SE PUEDE ACCEDER POR CONSTRUCTOR, GETTER O SETTER.
                            - LOS GETTERS Y LOS SETTERS TIENEN QUE SER PÚBLICOS.
                            - LOS NOMBRES DE LOS GETTERS Y SETTERS
                              TIENEN QUE CUMPLIR UNAS NORMAS DE NOMENCLATURA SEGÚN EL NOMBRE DE LOS ATRIBUTOS.
                         
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
             * TODOS LOS BEANS SON TAMBIÉN POJOS, PERO NO TODOS LOS POJOS TIENEN QUE SER BEANS.
             * 
             * ESTA CLASE POJO NO ES SERIALIZABLE.
             * ESTA CLASE POJO NO TIENE TODOS LOS ATRIBUTOS PRIVADOS.
             * ESTA CLASE POJO NO TIENE CONSTRUCTOR SIN PARÁMETROS.
             * ESTA CLASE POJO NO TIENE DEFINIDOS TODOS LOS SETTERS Y GETTERS.
             * ESTA CLASE POJO NO TIENE UNA NOMENCLATURA FIJA PARA LOS SETTERS Y GETTERS. 
             * 
             * ESTA CLASE POJO --> NO ES UNA CLASE JAVA BEAN.
             * 
             * @author Juan José Estévez González
             */
            public class Employee {                     // LOS BEANS IMPLEMENTAN LA INTERFAZ SERIALIZABLE.
                                                        // LOS ATRIBUTOS DE LOS BEANS TIENEN QUE SER TODOS PRIVADOS.
                // ATRIBUTOS:                           // PARA ACCEDER A LOS ATRIBUTOS ES OBLIGATORIO HACERLO CON LOS GETTERS Y SETTERS.
                // CAMPO POR DEFECTO.                   // POR TANTO, LOS GETTERS Y SETTERS TIENEN QUE SER PÚBLICOS.
                String nombre;

                //CAMPO PÚBLICO.
                public String id;

                // CAMPO PRIVADO.
                private double salary;

                // CONSTRUCTOR CON PARÁMETROS PARA INICIALIZAR LOS CAMPOS.
                public Employee(String nombre, String id, double salary) {
                    this.nombre = nombre;
                    this.id = id;
                    this.salary = salary;
                }

                // LOS JAVA BEANS DEBEN DE TENER UN CONSTRUCTOR SIN PARÁMETROS.


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
             * Y POR TANTO, TAMBIÉN ES UN POJO.
             * 
             * @author Juan José Estévez González
             */
            public class Persona  implements Serializable {                         // LOS BEANS IMPLEMENTAN LA INTERFAZ SERIALIZABLE.
                                                                                    // LOS ATRIBUTOS DE LOS BEANS TIENEN QUE SER TODOS PRIVADOS.
                // ATRIBUTOS.                                                       // PARA ACCEDER A LOS ATRIBUTOS ES OBLIGATORIO HACERLO CON LOS GETTERS Y SETTERS.
                private String nombre;                                              // POR TANTO, LOS GETTERS Y SETTERS TIENEN QUE SER PÚBLICOS.
                private String apellidos;
                private int edad;
                
                // CONSTRUCTOR CON PARÁMETROS PARA INICIALIZAR LOS CAMPOS.          // LOS CONSTRUCTORES TIENEN QUE SER PÚBLUCOS.
                public Persona(String nombre, String apellidos, int edad) {
                    super();
                    this.nombre = nombre;
                    this.apellidos = apellidos;
                    this.edad = edad;
                }
                
                // CONSTRUCTOR SIN PARÁMETROS.                                      // LOS JAVA BEANS DEBEN DE TENER UN CONSTRUCTOR SIN PARÁMETROS Y PÚBLICO.
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
                    ES LA FORMA MÁS COMÚN DE INVOCAR OPERACIONES
                    PARA ITERACIONES ENTRE COMPONENTES.
                        
            LA ITERACIÓN ENTRE COMPONENTES SE DENOMINA CONTROL ACTIVO,
            ES DECIR, EL FUNCIONAMIENTO DE UN COMPONENTE SE ACTIVA MEDIANTE LA LLAMADA DE OTRO COMPONENTE.
             
            CONTROL REACTIVO:    
            ADEMÁS DEL CONTROL ACTIVO (LA FORMA MÁS COMÚN DE INVOCAR OPERACIONES),
            EXISTE OTRO MÉTODO LLAMADO CONTROL REACTIVO,
            QUE SE REFIERE A EVENTOS DE COMPONENTES,
            COMO LOS PERMITIDOS POR EL MODELO DE COMPONENTES EJB.
                         
            EN EL CONTROL REACTIVO,
                    1.- LOS COMPONENTES PUEDEN GENERAR EVENTOS CORRESPONDIENTES A SOLICITUDES DE INVOCACIÓN DE OPERACIONES.
                    2.- COMO REACCIÓN SE GENERARÁN SOLICITUDES DE INVOCACIÓN DE OPERACIONES.    
                    3.- POSTERIORMENTE, OTROS COMPONENTES DEL SISTEMA RECOLECTARÍAN ESTAS SOLICITUDES,
                        Y ACTIVARÍAN LLAMADAS A OPERACIONES PARA SUS PROPÓSITOS DE PROCESAMIENTO.
                         
            POR EJEMPLO, CUANDO EL PUNTERO DEL MOUSE PASA SOBRE EL ÍCONO DEL ESCRITORIO,
            SI LA FORMA DEL ÍCONO DEL ESCRITORIO CAMBIA,
            EL COMPONENTE DE ICONO EMITIRÍA EVENTOS RELACIONADOS CON LA OPERACIÓN DE CAMBIAR LA FORMA DEL ICONO.
                         
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
                      
            ¿QUÉ ES LA INTROSPECCIÓN?
                    LAS HERRAMIENTAS DE DESARROLLO DESCUBREN LAS CARACTERÍSTICAS DE LOS COMPONENTES
                    (ES DECIR, PROPIEDADES DE LOS COMPONENTES, MÉTODOS Y EVENTOS)
                    A TRAVÉS DE UN PROCESO LLAMADO INTROSPECCIÓN.
                         
                    LA INTROSPECCIÓN, POR TANTO,
                    ES EL MECANISMO A TRAVÉS DEL CUAL SE PUEDEN DESCUBRIR
                    LAS PROPIEDADES, MÉTODOS Y EVENTOS CONTENIDOS EN EL COMPONENTE. 
                         
            PODEMOS HACER INTROSPECCIÓN SOBRE LOS COMPONENTES DE DOS FORMAS: 
                         
                    1.- MEDIANTE EL USO DE CONVENCIONES DE NOMENCLATURA ESPECÍFICA:
                            MEDIANTE EL USO DE CONVENCIONES DE NOMENCLATURA ESPECÍFICAS,
                            QUE SE CONOCEN AL NOMBRAR LAS CARACTERÍSTICAS DE LOS COMPONENTES.
                         
                                    * SI UN COMPONENTE TIENE UN ATRIBUTO XXX,
                                      SE ESTABLECE LA NORMA DE QUE TIENE QUE EXISTIR UN MÉTODO  -->  getXXX
                         
                                    * DENTRO DE JAVA, PARA EJB, LA CLASE   -->   Introspector
                                      TIENE MÉTODOS QUE COMPRUEBAN EL EJB
                                      PARA ENCONTRAR ESOS PATRONES DE DISEÑO
                                      Y DESCUBRIR SUS CARACTERÍSTICAS.
                         
                    2.- ATRIBUTOS, MÉTODOS O EVENTOS:
                            OTRA FORMA SERÍA DIRECTAMENTE, AL PUBLICAR EL COMPONENTE,                         
                            PROPORCIONANDO INFORMACIÓN CLARA SOBRE ATRIBUTOS, MÉTODOS O EVENTOS DE CLASES RELACIONADAS.
                         
            EN PARTICULAR, EJB ADMITE MÚLTIPLES NIVELES DE INTROSPECCIÓN. 
                         
            EN EL NIVEL MÁS BAJO TENEMOS LA INTROSPECCIÓN POR REFLEXIÓN:
                         
            ESTA INTROSPECCIÓN SE PUEDE LOGRAR MEDIANTE LA POSIBILIDAD DE REFLEXIÓN.
                         
            LA REFLEXIÓN ES UNA CARACTERÍSTICA QUE PERMITEN A LOS OBJETOS JAVA DESCUBRIR INFORMACIÓN SOBRE MÉTODOS PÚBLICOS,
            CAMPOS Y CONSTRUCTORES DE CLASES CARGADOS DURANTE LA EJECUCIÓN DEL PROGRAMA.
                         
            LA REFLEXIÓN PERMITE LA INTROSPECCIÓN DE TODOS LOS COMPONENTES DEL SOFTWARE,
            Y TODO LO QUE SE TIENE QUE HACER ES DECLARAR EL MÉTODO O VARIABLE COMO PÚBLICO
            PARA QUE PUEDA SER DESCUBIERTO A TRAVÉS DE LA REFLEXIÓN.
                         
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
                 * @author Juan José Estévez González
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
            HOY EN DÍA PODEMOS ENCONTRAR TAL ESPECIFICACIÓN EN ORACLE.
                         
            PARA USAR JPA,
            SE REQUIERE EL USO AL MENOS DEL JDK 1.5 (CONOCIDO COMO JAVA 5) EN ADELANTE,
            YA QUE AMPLÍA LAS NUEVAS ESPECIFICACIONES DEL LENGUAJE JAVA, COMO SON LAS ANOTACIONES.
                         
            PARA UTILIZAR LA BIBLIOTECA JPA,
            ES ESENCIAL TENER UN CONOCIMIENTO SÓLIDO DE POO (PROGRAMACIÓN ORIENTADA A OBJETOS),
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
                            LA CLASE javax.persistence.Persistence CONTIENE UN MÉTODO AUXILIAR ESTÁTICO,
                            EL CUAL USAMOS PARA TENER UN OBJETO EntityManagerFactory
                            DE FORMA INDEPENDIENTE DEL QUE SE OBTIENE A TRAVÉS DE JPA.

                    - EntityManagerFactory:
                            LA  CLASE javax.persistence.EntityManagerFactory
                            EXTRAEMOS OBJETOS DE TIPO EntityManager
                            USANDO EL CONOCIDO PATRÓN DE FACTORY.

                    - EntityManager:
                            LA CLASE javax.persistence.EntityManager
                            ES LA INTERFAZ JPA PRINCIPAL PARA LA PERSISTENCIA DE APLICACIONES.
                            CADA EntityManager PUEDE CREAR, LEER, MODIFICAR Y ELIMINAR UN GRUPO DE OBJETOS PERSISTENTES. 

                    - Entity:
                            LA CLASE Entity ES UNA ANOTACIÓN JAVA.
                            LA ENCONTRAMOS AL MISMO NIVEL QUE LAS CLASES JAVA SERIALIZABLES.
                            CADA UNA DE ESTAS ENTIDADES LAS REPRESENTAMOS COMO REGISTROS DIFERENTES EN BASE DE DATOS.

                    - EntityTransaction:
                            PERMITE OPERACIONES CONJUNTAS CON DATOS PERSISTENTES,
                            DE TAL FORMA, QUE PUEDEN CREAR GRUPOS PARA PERSISTIR DISTINTAS OPERACIONES.
                            SI TODO EL GRUPO REALIZA LAS OPERACIONES SIN NINGÚN PROBLEMA SE PERSISTIRÁ,
                            DE LO CONTRARIO, TODOS LOS INTENTOS FALLARÁN. 
                            EN CASO DE ERROR, LA BASE DE DATOS REALIZARÁ ROLLBACK Y VOLVERÁ AL ESTADO ANTERIOR.

                    - Query:
                            CADA PROVEEDOR DE JPA HA IMPLEMENTADO LA INTERFAZ javax.persistence.Query
                            PARA ENCONTRAR OBJETOS PERSISTENTES PROCESANDO CIERTAS CONDICIONES DE BÚSQUEDA.
                            JPA UTILIZA JPQL Y SQL PARA ESTANDARIZAR EL SOPORTE DE CONSULTAS.
                            PODREMOS OBTENER UN OBJETO Query A TRAVÉS DEL EntityManager.

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
                                     
            ORACLE TIENE PUBLICADOS VARIOS TUTORIALES, EN FUNCIÓN DE LA VERSIÓN DE JAVA,
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
            Y TODA LA DOCUMENTACIÓN ESTÁ EN OTRAS WEB DIFERENTES.
                         
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
                                     
            A CONTINUACIÓN,
            MOSTRAREMOS EL CÓDIGO POR MEDIO DEL CUAL PERSISTIREMOS 2 OBJETOS DE LA CLASE PERSONA.
            PRIMERO NOS CREAREMOS LOS DIFERENTES OBJETOS MEDIANTE CONSTRUCTOR:
                         
                    Persona persona1 = new Persona("pedro",25, ?calle 1?);
                    Persona persona2 = new Persona("pedro",25, ?calle 7?);
                         
            Y DESPUÉS, PROCEDEMOS A CREAR EntityManagerFactory
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
                         
            COMO PODEMOS OBSERVAR EN EL CÓDIGO EXPUESTO,
            ENGLOBAMOS EN UN MÉTODO PRIVADO, EL MÉTODO QUE NOS HARÁ DICHAS FUNCIONES.
            EN ÉL, EN PRIMER LUGAR, CREAMOS UNA VARIABLE DE TIPO EntityManagerFactory
            DONDE DAMOS NOMBRE A NUESTRA FACTORÍA.
            A CONTINUACIÓN CREAMOS UN entityManager
            DEL CUAL EXTRAEMOS LA TRANSACCIÓN CON getTransaction()
            PARA PODER EMPEZAR A REALIZAR OPERACIONES.
            CREAMOS UN ESTUDIANTE 'NORMAL', COMO EJEMPLO,
            LO PERSISTIMOS, Y CON NUESTRA TRANSACCIÓN HACEMOS commit() PARA QUE SEA EFECTIVA.
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
            DEBEMOS TENER EN CUENTA QUE LO QUE LLAMAREMOS UN MÓDULO J2EE, PODRÍA CONSTAR DE:
                                              
            * UN MÓDULO J2EE:
                         
                    * CONSTA DE UNO O MÁS COMPONENTES J2EE DEL MISMO TIPO DE CONTENEDOR.
                         
                    * DESCRIPTORES DE IMPLEMENTACIÓN DE COMPONENTES DE ESTE TIPO.
                            - EL DESCRIPTOR DE DESPLIEGUE DEL MÓDULO EJB SERÁ EL QUE
                              ESPECIFIQUE LOS DISTINTOS ATRIBUTOS DE NUESTRA TRANSACCIÓN
                              Y LA AUTORIZACIÓN DE SEGURIDAD DEL EJB.
                         
                    * LOS MÓDULOS JAVAEE QUE NO TENGAN O NO NECESITEN DESCRIPTORES DE IMPLEMENTACIÓN DE APLICACIONES
                      SE PODRÁN IMPLEMENTAR COMO MÓDULOS SEPARADOS.
                         
            * ANTES DE EJB 3.1 TODOS LOS EJB DEBÍAN ESTAR EMPAQUETADOS EN ESTOS ARCHIVOS.
                         
            POR OTRO LADO, LO HABITUAL ES QUE LA MAYORÍA DE LA APLICACIONES J2EE, CONTENGAN:
                         
                    * UNA PARTE FRONTAL, PARA LA INTERACCIÓN CON LOS USUARIOS O CLIENTES, --> front-end web.
                    * UNA PARTE TRASERA DEL SERVIDOR, --> back-end EJB.
                         
            LO QUE SIGNIFICA, QUE ES UNA BUENA PRACTICA, O QUE SE DEBE CREAR UN FICHERO .ear 
            QUE CONTENGA UNA APLICACIÓN CON DOS MÓDULOS: 
                         
                    * .war  
                    * ejb-jar
                         
            ÉSTA ES UNA BUENA PRÁCTICA EN EL SENTIDO DE:
                        
                    * ESTABLECER  UNA CLARA SEPARACIÓN ESTRUCTURAL ENTRE LA PARTE 'DELANTERA' Y LA 'TRASERA'.
                    * NO OBSTANTE, ESTA DIFERENCIACIÓN SERÁ COMPLICADO DELIMITARLA EN APLICACIONES SIMPLES.

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
                                     
            HAY CUATRO TIPOS DE MÓDULOS J2EE PARA APLICACIONES WEB EJB:
                         
                    - MÓDULOS EJB:
                            QUE CONTIENEN ARCHIVOS CON CLASES EJB Y DESCRIPTORES DE DESPLIEGUE EJB.
                            EL MÓDULO EJB ESTÁ EMPAQUETADO COMO UN ARCHIVO JAR CON EXTENSIÓN .jar. (JAVA ARCHIVE).
                         
                    - EL MÓDULO WEB:
                            QUE CONTIENE ARCHIVOS CON Servlet, ARCHIVOS JSP, (JAVA SERVER PAGES),
                            ARCHIVOS DE SOPORTE DE CLASES, ARCHIVOS GIF Y HTML
                            Y DESCRIPTORES DE IMPLEMENTACIÓN DE APLICACIONES WEB.
                            EL MÓDULO WEB ESTÁ EMPAQUETADO COMO UN ARCHIVO JAR (JAVA ARCHIVE) CON UNA EXTENSIÓN .war (WEB ARCHIVE).
                         
                    - EL MÓDULO DE LA APLICACIÓN CLIENTE:
                            QUE CONTIENE ARCHIVOS CON CLASES Y DESCRIPTORES DE LA APLICACIÓN CLIENTE.
                            EL MÓDULO DE LA APLICACIÓN CLIENTE ESTÁ EMPAQUETADO COMO UN ARCHIVO JAR CON EXTENSIÓN .jar.
                         
                    - MÓDULO ADAPTADOR DE RECURSOS:
                            QUE CONTIENE TODAS LAS INTERFACES, CLASES, BIBLIOTECAS NATIVAS
                            Y OTROS DOCUMENTOS DE JAVA Y SUS DESCRIPTORES DE IMPLEMENTACIÓN DEL ADAPTADOR DE RECURSOS.

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
            LOS ENTORNOS DE DESARROLLO DE COMPONENTES MÁS UTILIZADOS SON: 
                         
                    - Intellij.
                    - NetBeans.
                    - Eclipse.
                         
            ECLIPSE SE UTILIZA PRINCIPALMENTE PARA EL DESARROLLO DE COMPONENTES JAVA (COMO EJB),
            Y Microsoft.NET PARA EL DESARROLLO DE ENSAMBLAJES (COM +, DCOM). 
                         
            ESTOS ENTORNOS PROPORCIONAN UNA ALTERNATIVA A LA GENERACIÓN AUTOMÁTICA DE CÓDIGO 
            Y FACILITAN ENORMEMENTE EL DESARROLLO DE APLICACIONES QUE UTILIZAN COMPONENTES.
                         
            INFORMACIÓN ADICIONAL:
                         
            https://docs.oracle.com/javaee/7/tutorial/title.htm
            
            https://projects.eclipse.org/projects/ee4j
            
            https://start.jakarta.ee/
                         
            https://docs.oracle.com/javaee/5/tutorial
            
            https://eclipse-ee4j.github.io/jakartaee-tutorial/
            
            HolaMundo con EJB en Java EE 8: 
            https://itoo.dev/courses/1049264/lectures/22222034
            
            Introducción Jakarta EE 9 - Configurando nuestro entorno de desarrollo con #OpenJDK y #NetBeans
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
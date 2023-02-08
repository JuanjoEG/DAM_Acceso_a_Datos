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
        
        printer.println("La Clase: '" + aClass.getSimpleName() + "'\n");
        for (Field field : aClass.getDeclaredFields()) {
        
            printer.print("\tTiene: ");
            printer.print(field.getName());
            printer.println("  -->  De Tipo " + field.getType().getSimpleName());
        }
        printer.flush();
    }
}
/*            RESULTADO:
La Clase: 'String'

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
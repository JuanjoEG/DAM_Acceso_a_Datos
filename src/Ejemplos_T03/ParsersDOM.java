package Ejemplos_T03;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import org.xml.sax.SAXException;

/**
 *
 * @author Juan José Estévez González
 */
public class ParsersDOM {
    
    public static void main(String[] args) {
        
        String ruta = "J:\\Ejercicios\\Books.xml";
        //String ruta = "J:\\Ejercicios\\inputxml.txt";
        
        try {
        
            File file = new File(ruta);
            
            // DocumentBuilderFactory factory = new DocumentBuilderFactory();
            // DocumentBuilderFactory ES ACTRACTO -> NO PODEMOS INSTANCIAR DE MANERA NORMAL.
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            
            // DocumentBuilder builder = new DocumentBuilder(factory);
            // DocumentBuilder ES ACTRACTO -> NO PODEMOS INSTANCIAR DE MANERA NORMAL.
            DocumentBuilder builder = factory.newDocumentBuilder();            

            factory.setValidating(true);                                // ASEGURAR QUE EL XML ESTÉ BIEN VALIDADO

            factory.setIgnoringElementContentWhitespace(true);          // IGNORAR LOS ESPACIOS EN BLANCO

            

            Document doc = builder.parse(file);                               // SE CARGA EL FICHERO EN EL OBJETO
            
        } catch (IOException | SAXException e) {        
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } 
    }    
}
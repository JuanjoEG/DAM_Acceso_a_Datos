package Ejemplos_T03;


import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/**
 *
 * @author Juan José Estévez González
 */
public class ParsersSAX {
    
    public static void main(String[] args) {
        
        String ruta = "E:\\TRABAJO\\Ejercicios\\Books.xml";
        
        try {
        
            // SAXParserFactory factory = new SAXParserFactory();
            // SAXParserFactory ES ACTRACTO -> NO PODEMOS INSTANCIAR DE MANERA NORMAL.
            SAXParserFactory factory = SAXParserFactory.newInstance();

            

            // DocumentBuilder builder = new DocumentBuilder(factory);
            // DocumentBuilder ES ACTRACTO -> NO PODEMOS INSTANCIAR DE MANERA NORMAL.
            SAXParser saxParser = factory.newSAXParser();
            
            factory.setValidating(true);                                // ASEGURAR QUE EL XML ESTÉ BIEN VALIDADO

            File file = new File(ruta);

            saxParser.parse(file, new DefaultHandler());                       // SE CARGA EL FICHERO EN EL OBJETO
            
        } catch (IOException | SAXException e) {        
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } 
    }    
}
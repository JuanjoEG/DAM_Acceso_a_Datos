package Ejemplos_T03;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.xml.sax.SAXException;

/**
 *
 * @author Juan José Estévez González
 */
public class ParsersXPath {
    
    public static void main(String[] args) {
        
        String ruta = "E:\\TRABAJO\\Ejercicios\\inputxml.xml";
        
        try {
            
            File inputFile = new File(ruta);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            
            XPath xPath = XPathFactory.newInstance().newXPath();
            
            String expresion = "/class/student";
            NodeList nodeList = (NodeList) xPath.compile(expresion).evaluate(doc, XPathConstants.NODESET);
            
            for (int i=0; i<nodeList.getLength(); i++) {
            
                Node nNode = nodeList.item(i);
                System.out.println("\nElemento actual : " + nNode.getNodeName());
                
                if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                
                    Element eElement = (Element) nNode;
                    System.out.println("Número de Estudiante : " + eElement.getAttribute("rollno"));
                    System.out.println("Nombre : "
                    
                            + eElement
                            .getElementsByTagName("firstname")
                            .item(0)
                            .getTextContent()
                    );
                    System.out.println("Apellido : "
                    
                            + eElement
                            .getElementsByTagName("lastname")
                            .item(0)
                            .getTextContent()
                    );
                    System.out.println("Apodo : "
                    
                            + eElement
                            .getElementsByTagName("nickname")
                            .item(0)
                            .getTextContent()
                    );
                    System.out.println("Marca : "
                    
                            + eElement
                            .getElementsByTagName("marks")
                            .item(0)
                            .getTextContent()
                    );
                }                
            }
        }catch (ParserConfigurationException e) {        
            e.printStackTrace();
        }catch (SAXException e) {        
            e.printStackTrace();
        }catch (IOException e) {        
            e.printStackTrace();
        } catch (XPathExpressionException e) {        
            e.printStackTrace();
        }
    }    
}
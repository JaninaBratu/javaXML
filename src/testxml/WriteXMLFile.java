/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testxml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteXMLFile {

    
    public static void main(String argv[]) {

	  try {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("UserAccount");
		doc.appendChild(rootElement);

		Element usernameElem = doc.createElement("userName");
                usernameElem.appendChild(doc.createTextNode("user.getFullName()"));
		rootElement.appendChild(usernameElem);

                
		Element generatedLink = doc.createElement("generatedLink");
		generatedLink.appendChild(doc.createTextNode("url"));
		rootElement.appendChild(generatedLink);

		
		Element linkName = doc.createElement("linkName");
		linkName.appendChild(doc.createTextNode("url"));
		rootElement.appendChild(linkName);

                String resultXML = Util.toString(doc);
                System.out.println(resultXML);

	  } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	  } 
	}
}

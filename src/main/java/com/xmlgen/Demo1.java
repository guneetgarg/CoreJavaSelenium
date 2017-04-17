package com.xmlgen;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Demo1 {

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {

		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = dBuilder.parse("src\\main\\java\\com\\xmlgen\\aa.xml");
		doc.getDocumentElement().normalize();

		XPath xpath = XPathFactory.newInstance().newXPath();
		XPathExpression expr = xpath.compile("//TEST_CASE[@execution='TRUE']");

		NodeList nodeSet = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

		for (int i = 0; i < nodeSet.getLength(); i = i + 8) {
			Element ele = (Element) nodeSet.item(i);
			System.out.println(ele.getAttribute("name"));
			NodeList propertiesNodes = nodeSet.item(i).getChildNodes();
			for (int j = 0; j < propertiesNodes.getLength(); j++) {
				System.out.println(propertiesNodes.item(j).getNodeName() + "-->"
						+ propertiesNodes.item(j).getFirstChild().getNodeValue());

			}
		}
	}
}
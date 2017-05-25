package JavaXSLTExample;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XSLTTest {
	public static void main(String[] args) {

		String dataXML = "src\\main\\java\\JavaXSLTExample\\LangXml.xml";
		String inputXSL = "src/main/java/JavaXSLTExample/NewXsl.xsl";
		String outputHTML = "converted.xml";

		XSLTTest st = new XSLTTest();
		try {
			st.transform(dataXML, inputXSL, outputHTML);
		} catch (TransformerConfigurationException e) {
			System.err.println("TransformerConfigurationException");
			System.err.println(e);
		} catch (TransformerException e) {
			System.err.println("TransformerException");
			System.err.println(e);
		}
	}

	public void transform(String dataXML, String inputXSL, String outputHTML)
			throws TransformerConfigurationException, TransformerException {

		TransformerFactory factory = TransformerFactory.newInstance();
		StreamSource xslStream = new StreamSource(inputXSL);
		Transformer transformer = factory.newTransformer(xslStream);
		StreamSource in = new StreamSource(dataXML);
		StreamResult out = new StreamResult(outputHTML);
		transformer.transform(in, out);
		System.out.println("The generated HTML file is:" + outputHTML);
		
		
		
		
		
		
		
		
		
		
/*		
		TransformerFactory factory = TransformerFactory.newInstance();
		StreamSource xslStream = new StreamSource(xslPath);
		Transformer transformer;

		transformer = factory.newTransformer(xslStream);
		Iterator<Map.Entry<String, String>> entries = paramMap.entrySet().iterator();
		if (!(paramMap.isEmpty())) {
			while (entries.hasNext()) {
				Map.Entry<String, String> entry = entries.next();
				String key = entry.getKey();
				String value = entry.getValue();
				transformer.setParameter(key, value);
			}
		}
		StreamSource in = new StreamSource(test_path);
		StreamResult out = new StreamResult(transTestFile);

		transformer.transform(in, out);*/
		
		
		
	}
}
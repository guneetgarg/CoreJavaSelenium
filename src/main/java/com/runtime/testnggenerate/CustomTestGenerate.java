package com.runtime.testnggenerate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.ITestNGListener;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlSuite.ParallelMode;
import org.testng.xml.XmlTest;

public class CustomTestGenerate {
	Map<String, String> parameters = new HashMap<String, String>();

	public void setSuiteParameter() {
		parameters.put("config-file", "c:\\test.xml");
		parameters.put("broewser", "chrome");
	}

	public void generateTestNG() {

		XmlSuite suite = new XmlSuite();
		suite.setName("TmpSuite");
		suite.setFileName("tt.xml");
		suite.setParallel(ParallelMode.TESTS);
		suite.setParameters(parameters);

		XmlTest test = new XmlTest(suite);
		test.setName("TmpTest");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("com.dummy.Simple"));
		test.setXmlClasses(classes);

		XmlTest test1 = new XmlTest(suite);
		test1.setName("test set 2");
		List<XmlClass> classes1 = new ArrayList<XmlClass>();
		classes1.add(new XmlClass("com.dummy.Simple"));

		test1.setXmlClasses(classes1);

		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		
		List<Class<? extends ITestNGListener>> clssListener = new ArrayList<Class<? extends ITestNGListener>>();
		clssListener.add(ListenerTest.class);
		tng.setListenerClasses(clssListener);
		
		tng.run();
	}

	public static void main(String[] args) {
		new CustomTestGenerate().generateTestNG();

	}
}

package com.freeyourcode.testgenerator.test.agent.generated;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.testng.annotations.Test;

import com.freeyourcode.test.utils.GeneratedTestCase;
import com.freeyourcode.prettyjson.JsonSerialisationUtils;
import java.lang.Double;
import com.freeyourcode.testgenerator.test.TestedClass;
import com.freeyourcode.testgenerator.test.TestedBean;

/**
* Test generated by a FreeYourCode agent at 2016-02-11T21:48:05.799+0100
*/
@PrepareForTest({TestedClass.class, TestedBean.class})
public class GeneratedByInclusionExclusionTest extends GeneratedTestCase {

	@InjectMocks
	private TestedBean testedBean;
	@InjectMocks
	private TestedClass testedClass;

	@Test
	public void testgetValue_0() throws Exception {
		//Call to tested method
		Object testedMethodResult = testedBean.getValue();
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"int\"}"), testedMethodResult);
	}

	@Test
	public void testmyMethod1ParamResult_1() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":2.0}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":2.0}")};
		Object testedMethodResult = testedClass.myMethod1ParamResult((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":4.0}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

}
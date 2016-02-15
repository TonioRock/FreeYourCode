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
import com.freeyourcode.testgenerator.test.TestedBean;
import java.lang.Double;
import com.freeyourcode.testgenerator.test.TestedClass;

/**
* Test generated by a FreeYourCode agent at 2016-02-15T19:11:04.371+0100
*/
@PrepareForTest({TestedClass.class})
public class GeneratedByAgentTestGeneratorPluginTest extends GeneratedTestCase {

	@InjectMocks
	private TestedClass testedClass;

	@Test
	public void testmyStaticMethodCallingAPrivateOne_0() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}")};
		Object testedMethodResult = TestedClass.myStaticMethodCallingAPrivateOne((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":180.8}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyStaticMethod_1() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}")};
		Object testedMethodResult = TestedClass.myStaticMethod((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":135.60000000000002}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testcheckSerializedValueIsDifferentWithSameObject_2() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"value\":7}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"value\":14}")};
		Object testedMethodResult = testedClass.checkSerializedValueIsDifferentWithSameObject((TestedBean)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"value\":14}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_3() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object testedMethodResult = testedClass.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_4() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object testedMethodResult = testedClass.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_5() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object testedMethodResult = testedClass.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod1ParamNoResult_6() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":17.14}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":17.14}")};
		testedClass.myMethod1ParamNoResult((Double)inputParams_enter[0]);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod1ParamNoResult_7() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{null};
		Object[] inputParams_exit = new Object[]{null};
		testedClass.myMethod1ParamNoResult((Double)inputParams_enter[0]);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod1ParamPrimitifResultPrimitif_8() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":4.0003}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":4.0003}")};
		Object testedMethodResult = testedClass.myMethod1ParamPrimitifResultPrimitif((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0006}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod1ParamPrimitifResultPrimitif_9() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}")};
		Object testedMethodResult = testedClass.myMethod1ParamPrimitifResultPrimitif((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod1ParamResult_10() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":9.0}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":9.0}")};
		Object testedMethodResult = testedClass.myMethod1ParamResult((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":18.0}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test(expectedExceptions = NullPointerException.class)
	public void testmyMethod1ParamResult_11() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{null};
		testedClass.myMethod1ParamResult((Double)inputParams_enter[0]);
	}

	@Test
	public void testmyMethod2ParamNoResult_12() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"lib\",\"value\":1,\"valueObject\":2}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"lib\",\"value\":1,\"valueObject\":2}")};
		testedClass.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod2ParamNoResult_13() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), null};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), null};
		testedClass.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod2ParamNoResult_14() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"valueObject\":0}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"valueObject\":0}")};
		testedClass.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod2ParamNoResult_15() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		testedClass.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod2ParamNoResult_16() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		testedClass.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_17() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object testedMethodResult = testedClass.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_18() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object testedMethodResult = testedClass.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethod2ParamResult_19() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object testedMethodResult = testedClass.myMethod2ParamResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

	@Test
	public void testmyMethodNoParamNoResult_20() throws Exception {
		//Call to tested method
		testedClass.myMethodNoParamNoResult();
	}

	@Test
	public void testmyMethodNoParamResult_21() throws Exception {
		//Call to tested method
		Object testedMethodResult = testedClass.myMethodNoParamResult();
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":2.0}"), testedMethodResult);
	}

	@Test
	public void testmyMethodNoParamResultPrimitif_22() throws Exception {
		//Call to tested method
		Object testedMethodResult = testedClass.myMethodNoParamResultPrimitif();
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":2.0}"), testedMethodResult);
	}

	@Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp = "Exception for tests")
	public void testmyMethodThrowingAnException_23() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}")};
		testedClass.myMethodThrowingAnException((Double)inputParams_enter[0]);
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_24() throws Exception {
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"set\":{\"@type\":\"java.util.HashSet\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"set\":{\"@type\":\"java.util.HashSet\"}}")};
		Object testedMethodResult = testedClass.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
	}

}
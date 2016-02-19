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
import com.freeyourcode.testgenerator.test.TestedClass;
import com.freeyourcode.testgenerator.test.ClassCallingTestedClassWithNewInstance;
import java.lang.Double;

/**
* Test generated by a FreeYourCode agent
*/
@PrepareForTest({ClassCallingTestedClassWithNewInstance.class})
public class GeneratedByAgentTestMockPluginWithNewInstance extends GeneratedTestCase {

	@Mock
	private TestedClass testedClassStub;
	@InjectMocks
	private ClassCallingTestedClassWithNewInstance classCallingTestedClassWithNewInstance;

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_0() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}");
		Mockito.when(testedClassStub.myMethod2ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod2ParamPrimitifResultPrimitif_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamPrimitifResultPrimitif_enter_0[1]))).then(exitAnswer(myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object testedMethodResult = classCallingTestedClassWithNewInstance.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_1() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}");
		Mockito.when(testedClassStub.myMethod2ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod2ParamPrimitifResultPrimitif_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamPrimitifResultPrimitif_enter_0[1]))).then(exitAnswer(myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object testedMethodResult = classCallingTestedClassWithNewInstance.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_2() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}");
		Mockito.when(testedClassStub.myMethod2ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod2ParamPrimitifResultPrimitif_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamPrimitifResultPrimitif_enter_0[1]))).then(exitAnswer(myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object testedMethodResult = classCallingTestedClassWithNewInstance.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod1ParamNoResult_3() throws Exception {
		//Mock the stub methods
		Object[] myMethod1ParamNoResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":17.14}")};
		Object[] myMethod1ParamNoResult_diffsOnExit_1 = new Object[]{null};
		Mockito.doAnswer(exitAnswer(myMethod1ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod1ParamNoResult(Mockito.eq((Double)myMethod1ParamNoResult_enter_0[0]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":17.14}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":17.14}")};
		classCallingTestedClassWithNewInstance.myMethod1ParamNoResult((Double)inputParams_enter[0]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamNoResult((Double)Mockito.any());
	}

	@Test
	public void testmyMethod1ParamNoResult_4() throws Exception {
		//Mock the stub methods
		Object[] myMethod1ParamNoResult_enter_0 = new Object[]{null};
		Object[] myMethod1ParamNoResult_diffsOnExit_1 = new Object[]{null};
		Mockito.doAnswer(exitAnswer(myMethod1ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod1ParamNoResult(Mockito.eq((Double)myMethod1ParamNoResult_enter_0[0]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{null};
		Object[] inputParams_exit = new Object[]{null};
		classCallingTestedClassWithNewInstance.myMethod1ParamNoResult((Double)inputParams_enter[0]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamNoResult((Double)Mockito.any());
	}

	@Test
	public void testmyMethod1ParamPrimitifResultPrimitif_5() throws Exception {
		//Mock the stub methods
		Object[] myMethod1ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":4.0003}")};
		Object[] myMethod1ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0006}");
		Mockito.when(testedClassStub.myMethod1ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod1ParamPrimitifResultPrimitif_enter_0[0]))).then(exitAnswer(myMethod1ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":4.0003}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":4.0003}")};
		Object testedMethodResult = classCallingTestedClassWithNewInstance.myMethod1ParamPrimitifResultPrimitif((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0006}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamPrimitifResultPrimitif(Mockito.anyDouble());
	}

	@Test
	public void testmyMethod1ParamPrimitifResultPrimitif_6() throws Exception {
		//Mock the stub methods
		Object[] myMethod1ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}")};
		Object[] myMethod1ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}");
		Mockito.when(testedClassStub.myMethod1ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod1ParamPrimitifResultPrimitif_enter_0[0]))).then(exitAnswer(myMethod1ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}")};
		Object testedMethodResult = classCallingTestedClassWithNewInstance.myMethod1ParamPrimitifResultPrimitif((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamPrimitifResultPrimitif(Mockito.anyDouble());
	}

	@Test
	public void testmyMethod1ParamResult_7() throws Exception {
		//Mock the stub methods
		Object[] myMethod1ParamResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":9.0}")};
		Object[] myMethod1ParamResult_diffsOnExit_1 = new Object[]{null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":18.0}");
		Mockito.when(testedClassStub.myMethod1ParamResult(Mockito.eq((Double)myMethod1ParamResult_enter_0[0]))).then(exitAnswer(myMethod1ParamResult_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":9.0}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":9.0}")};
		Object testedMethodResult = classCallingTestedClassWithNewInstance.myMethod1ParamResult((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":18.0}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamResult((Double)Mockito.any());
	}

	@Test(expectedExceptions = NullPointerException.class)
	public void testmyMethod1ParamResult_8() throws Exception {
		//Mock the stub methods
		Object[] myMethod1ParamResult_enter_0 = new Object[]{null};
		Mockito.when(testedClassStub.myMethod1ParamResult(Mockito.eq((Double)myMethod1ParamResult_enter_0[0]))).thenThrow((Throwable)JsonSerialisationUtils.deserialize("{\"@id\":1,\"@type\":\"java.lang.NullPointerException\",\"cause\":{\"@ref\":1},\"stackTrace\":[],\"suppressedExceptions\":{\"@type\":\"java.util.Collections$UnmodifiableRandomAccessList\"}}"));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{null};
		classCallingTestedClassWithNewInstance.myMethod1ParamResult((Double)inputParams_enter[0]);
	}

	@Test
	public void testmyMethod2ParamNoResult_9() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamNoResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"lib\",\"value\":1,\"valueObject\":2}")};
		Object[] myMethod2ParamNoResult_diffsOnExit_1 = new Object[]{null, null};
		Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod2ParamNoResult(Mockito.eq((Double)myMethod2ParamNoResult_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamNoResult_enter_0[1]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"lib\",\"value\":1,\"valueObject\":2}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"lib\",\"value\":1,\"valueObject\":2}")};
		classCallingTestedClassWithNewInstance.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamNoResult_10() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamNoResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), null};
		Object[] myMethod2ParamNoResult_diffsOnExit_1 = new Object[]{null, null};
		Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod2ParamNoResult(Mockito.eq((Double)myMethod2ParamNoResult_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamNoResult_enter_0[1]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), null};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), null};
		classCallingTestedClassWithNewInstance.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamNoResult_11() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamNoResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"valueObject\":0}")};
		Object[] myMethod2ParamNoResult_diffsOnExit_1 = new Object[]{null, null};
		Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod2ParamNoResult(Mockito.eq((Double)myMethod2ParamNoResult_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamNoResult_enter_0[1]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"valueObject\":0}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"valueObject\":0}")};
		classCallingTestedClassWithNewInstance.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamNoResult_12() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamNoResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		Object[] myMethod2ParamNoResult_diffsOnExit_1 = new Object[]{null, null};
		Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod2ParamNoResult(Mockito.eq((Double)myMethod2ParamNoResult_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamNoResult_enter_0[1]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		classCallingTestedClassWithNewInstance.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamNoResult_13() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamNoResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		Object[] myMethod2ParamNoResult_diffsOnExit_1 = new Object[]{null, null};
		Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod2ParamNoResult(Mockito.eq((Double)myMethod2ParamNoResult_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamNoResult_enter_0[1]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		classCallingTestedClassWithNewInstance.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_14() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}");
		Mockito.when(testedClassStub.myMethod2ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod2ParamPrimitifResultPrimitif_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamPrimitifResultPrimitif_enter_0[1]))).then(exitAnswer(myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object testedMethodResult = classCallingTestedClassWithNewInstance.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_15() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}");
		Mockito.when(testedClassStub.myMethod2ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod2ParamPrimitifResultPrimitif_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamPrimitifResultPrimitif_enter_0[1]))).then(exitAnswer(myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object testedMethodResult = classCallingTestedClassWithNewInstance.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamResult_16() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] myMethod2ParamResult_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}");
		Mockito.when(testedClassStub.myMethod2ParamResult(Mockito.eq((Double)myMethod2ParamResult_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamResult_enter_0[1]))).then(exitAnswer(myMethod2ParamResult_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object testedMethodResult = classCallingTestedClassWithNewInstance.myMethod2ParamResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamResult((Double)Mockito.any(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethodNoParamNoResult_17() throws Exception {
		//Mock the stub methods
		Mockito.doNothing().when(testedClassStub).myMethodNoParamNoResult();
		
		//Call to tested method
		classCallingTestedClassWithNewInstance.myMethodNoParamNoResult();
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethodNoParamNoResult();
	}

	@Test
	public void testmyMethodNoParamResult_18() throws Exception {
		//Mock the stub methods
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":2.0}");
		Mockito.when(testedClassStub.myMethodNoParamResult()).thenReturn((Double)response0);
		
		//Call to tested method
		Object testedMethodResult = classCallingTestedClassWithNewInstance.myMethodNoParamResult();
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":2.0}"), testedMethodResult);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethodNoParamResult();
	}

	@Test
	public void testmyMethodNoParamResultPrimitif_19() throws Exception {
		//Mock the stub methods
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":2.0}");
		Mockito.when(testedClassStub.myMethodNoParamResultPrimitif()).thenReturn((Double)response0);
		
		//Call to tested method
		Object testedMethodResult = classCallingTestedClassWithNewInstance.myMethodNoParamResultPrimitif();
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":2.0}"), testedMethodResult);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethodNoParamResultPrimitif();
	}

}
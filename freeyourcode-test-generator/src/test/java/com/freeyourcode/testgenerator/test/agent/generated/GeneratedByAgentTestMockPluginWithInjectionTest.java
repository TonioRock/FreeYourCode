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
import java.lang.Double;
import com.freeyourcode.testgenerator.test.ClassCallingTestedClassWithFieldInjection;

/**
* Test generated by a FreeYourCode agent
*/
@PrepareForTest({TestedClass.class, ClassCallingTestedClassWithFieldInjection.class})
public class GeneratedByAgentTestMockPluginWithInjectionTest extends GeneratedTestCase {

	@Mock
	private TestedClass testedClassStub;
	@InjectMocks
	private ClassCallingTestedClassWithFieldInjection classCallingTestedClassWithFieldInjection;

	@Test
	public void testmyStaticMethod_0() throws Exception {
		//Mock the stub methods
		PowerMockito.mockStatic(TestedClass.class);
		Object[] myStaticMethod_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}")};
		Object[] myStaticMethod_diffsOnExit_1 = new Object[]{null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":135.60000000000002}");
		Mockito.when(TestedClass.myStaticMethod(Mockito.eq((Double)myStaticMethod_enter_0[0]))).then(exitAnswer(myStaticMethod_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}")};
		Object testedMethodResult = ClassCallingTestedClassWithFieldInjection.myStaticMethod((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":135.60000000000002}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		PowerMockito.verifyStatic(Mockito.times(1));
		TestedClass.myStaticMethod((Double)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_1() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}");
		Mockito.when(testedClassStub.myMethod2ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod2ParamPrimitifResultPrimitif_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamPrimitifResultPrimitif_enter_0[1]))).then(exitAnswer(myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_2() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}");
		Mockito.when(testedClassStub.myMethod2ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod2ParamPrimitifResultPrimitif_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamPrimitifResultPrimitif_enter_0[1]))).then(exitAnswer(myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_3() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}");
		Mockito.when(testedClassStub.myMethod2ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod2ParamPrimitifResultPrimitif_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamPrimitifResultPrimitif_enter_0[1]))).then(exitAnswer(myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod1ParamNoResult_4() throws Exception {
		//Mock the stub methods
		Object[] myMethod1ParamNoResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":17.14}")};
		Object[] myMethod1ParamNoResult_diffsOnExit_1 = new Object[]{null};
		Mockito.doAnswer(exitAnswer(myMethod1ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod1ParamNoResult(Mockito.eq((Double)myMethod1ParamNoResult_enter_0[0]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":17.14}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":17.14}")};
		classCallingTestedClassWithFieldInjection.myMethod1ParamNoResult((Double)inputParams_enter[0]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamNoResult((Double)Mockito.any());
	}

	@Test
	public void testmyMethod1ParamNoResult_5() throws Exception {
		//Mock the stub methods
		Object[] myMethod1ParamNoResult_enter_0 = new Object[]{null};
		Object[] myMethod1ParamNoResult_diffsOnExit_1 = new Object[]{null};
		Mockito.doAnswer(exitAnswer(myMethod1ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod1ParamNoResult(Mockito.eq((Double)myMethod1ParamNoResult_enter_0[0]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{null};
		Object[] inputParams_exit = new Object[]{null};
		classCallingTestedClassWithFieldInjection.myMethod1ParamNoResult((Double)inputParams_enter[0]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamNoResult((Double)Mockito.any());
	}

	@Test
	public void testmyMethod1ParamPrimitifResultPrimitif_6() throws Exception {
		//Mock the stub methods
		Object[] myMethod1ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":4.0003}")};
		Object[] myMethod1ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0006}");
		Mockito.when(testedClassStub.myMethod1ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod1ParamPrimitifResultPrimitif_enter_0[0]))).then(exitAnswer(myMethod1ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":4.0003}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":4.0003}")};
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod1ParamPrimitifResultPrimitif((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0006}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamPrimitifResultPrimitif(Mockito.anyDouble());
	}

	@Test
	public void testmyMethod1ParamPrimitifResultPrimitif_7() throws Exception {
		//Mock the stub methods
		Object[] myMethod1ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}")};
		Object[] myMethod1ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}");
		Mockito.when(testedClassStub.myMethod1ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod1ParamPrimitifResultPrimitif_enter_0[0]))).then(exitAnswer(myMethod1ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}")};
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod1ParamPrimitifResultPrimitif((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\"}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamPrimitifResultPrimitif(Mockito.anyDouble());
	}

	@Test
	public void testmyMethod1ParamResult_8() throws Exception {
		//Mock the stub methods
		Object[] myMethod1ParamResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":9.0}")};
		Object[] myMethod1ParamResult_diffsOnExit_1 = new Object[]{null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":18.0}");
		Mockito.when(testedClassStub.myMethod1ParamResult(Mockito.eq((Double)myMethod1ParamResult_enter_0[0]))).then(exitAnswer(myMethod1ParamResult_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":9.0}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":9.0}")};
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod1ParamResult((Double)inputParams_enter[0]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":18.0}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamResult((Double)Mockito.any());
	}

	@Test(expectedExceptions = NullPointerException.class)
	public void testmyMethod1ParamResult_9() throws Exception {
		//Mock the stub methods
		Object[] myMethod1ParamResult_enter_0 = new Object[]{null};
		Mockito.when(testedClassStub.myMethod1ParamResult(Mockito.eq((Double)myMethod1ParamResult_enter_0[0]))).thenThrow((Throwable)JsonSerialisationUtils.deserialize("{\"@id\":1,\"@type\":\"java.lang.NullPointerException\",\"cause\":{\"@ref\":1},\"stackTrace\":[],\"suppressedExceptions\":{\"@type\":\"java.util.Collections$UnmodifiableRandomAccessList\"}}"));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{null};
		classCallingTestedClassWithFieldInjection.myMethod1ParamResult((Double)inputParams_enter[0]);
	}

	@Test
	public void testmyMethod2ParamNoResult_10() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamNoResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"lib\",\"value\":1,\"valueObject\":2}")};
		Object[] myMethod2ParamNoResult_diffsOnExit_1 = new Object[]{null, null};
		Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod2ParamNoResult(Mockito.eq((Double)myMethod2ParamNoResult_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamNoResult_enter_0[1]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"lib\",\"value\":1,\"valueObject\":2}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"lib\",\"value\":1,\"valueObject\":2}")};
		classCallingTestedClassWithFieldInjection.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamNoResult_11() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamNoResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), null};
		Object[] myMethod2ParamNoResult_diffsOnExit_1 = new Object[]{null, null};
		Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod2ParamNoResult(Mockito.eq((Double)myMethod2ParamNoResult_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamNoResult_enter_0[1]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), null};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), null};
		classCallingTestedClassWithFieldInjection.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamNoResult_12() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamNoResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"valueObject\":0}")};
		Object[] myMethod2ParamNoResult_diffsOnExit_1 = new Object[]{null, null};
		Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod2ParamNoResult(Mockito.eq((Double)myMethod2ParamNoResult_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamNoResult_enter_0[1]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"valueObject\":0}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"valueObject\":0}")};
		classCallingTestedClassWithFieldInjection.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
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
		classCallingTestedClassWithFieldInjection.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamNoResult_14() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamNoResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		Object[] myMethod2ParamNoResult_diffsOnExit_1 = new Object[]{null, null};
		Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_diffsOnExit_1)).when(testedClassStub).myMethod2ParamNoResult(Mockito.eq((Double)myMethod2ParamNoResult_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamNoResult_enter_0[1]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\"}")};
		classCallingTestedClassWithFieldInjection.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_15() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}");
		Mockito.when(testedClassStub.myMethod2ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod2ParamPrimitifResultPrimitif_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamPrimitifResultPrimitif_enter_0[1]))).then(exitAnswer(myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamPrimitifResultPrimitif_16() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamPrimitifResultPrimitif_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}");
		Mockito.when(testedClassStub.myMethod2ParamPrimitifResultPrimitif(Mockito.eq((Double)myMethod2ParamPrimitifResultPrimitif_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamPrimitifResultPrimitif_enter_0[1]))).then(exitAnswer(myMethod2ParamPrimitifResultPrimitif_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8,\"subBean\":{\"value2\":\"test\"}}")};
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethod2ParamResult_17() throws Exception {
		//Mock the stub methods
		Object[] myMethod2ParamResult_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] myMethod2ParamResult_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}");
		Mockito.when(testedClassStub.myMethod2ParamResult(Mockito.eq((Double)myMethod2ParamResult_enter_0[0]), Mockito.eq((TestedBean)myMethod2ParamResult_enter_0[1]))).then(exitAnswer(myMethod2ParamResult_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":45.2}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"coucou\",\"value\":7,\"valueObject\":8}")};
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod2ParamResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":90.4}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamResult((Double)Mockito.any(), (TestedBean)Mockito.any());
	}

	@Test
	public void testgetModifiedValue2FromMyMethodIsModifyingInput_18() throws Exception {
		//Mock the stub methods
		Object[] myMethodIsModifyingInput_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"l1\",\"value\":1,\"valueObject\":2,\"subBean\":{\"value2\":\"v2\"}}")};
		Object[] myMethodIsModifyingInput_diffsOnExit_1 = new Object[]{null, JsonSerialisationUtils.deserialize("{\"@type\":\"java.util.HashMap\",\"libelle\":\"NewLibelle\",\"subBean.value2\":\"NewValueOnSubBean\"}")};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.test.utils.InputPointerResolver\",\"pathToInput\":\"1.subBean.value2\"}");
		Mockito.when(testedClassStub.myMethodIsModifyingInput(Mockito.eq((Double)myMethodIsModifyingInput_enter_0[0]), Mockito.eq((TestedBean)myMethodIsModifyingInput_enter_0[1]))).then(exitAnswer(myMethodIsModifyingInput_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"l1\",\"value\":1,\"valueObject\":2,\"subBean\":{\"value2\":\"v2\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"NewLibelle\",\"value\":1,\"valueObject\":2,\"subBean\":{\"value2\":\"NewValueOnSubBean\"}}")};
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.getModifiedValue2FromMyMethodIsModifyingInput((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("\"NewValueOnSubBean\""), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethodIsModifyingInput(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethodIsReturningSubBean_19() throws Exception {
		//Mock the stub methods
		Object[] myMethodIsReturningSubBean_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"l1\",\"value\":1,\"valueObject\":2,\"subBean\":{\"value2\":\"v2\"}}")};
		Object[] myMethodIsReturningSubBean_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.test.utils.InputPointerResolver\",\"pathToInput\":\"1.subBean\"}");
		Mockito.when(testedClassStub.myMethodIsReturningSubBean(Mockito.eq((Double)myMethodIsReturningSubBean_enter_0[0]), Mockito.eq((TestedBean)myMethodIsReturningSubBean_enter_0[1]))).then(exitAnswer(myMethodIsReturningSubBean_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"l1\",\"value\":1,\"valueObject\":2,\"subBean\":{\"value2\":\"v2\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"l1\",\"value\":1,\"valueObject\":2,\"subBean\":{\"value2\":\"v2\"}}")};
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethodIsReturningSubBean((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedSubBean\",\"value2\":\"v2\"}"), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethodIsReturningSubBean(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethodIsReturningSubBeanValue_20() throws Exception {
		//Mock the stub methods
		Object[] myMethodIsReturningSubBeanValue_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"l1\",\"value\":1,\"valueObject\":2,\"subBean\":{\"value2\":\"v2\"}}")};
		Object[] myMethodIsReturningSubBeanValue_diffsOnExit_1 = new Object[]{null, null};
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.test.utils.InputPointerResolver\",\"pathToInput\":\"1.subBean.value2\"}");
		Mockito.when(testedClassStub.myMethodIsReturningSubBeanValue(Mockito.eq((Double)myMethodIsReturningSubBeanValue_enter_0[0]), Mockito.eq((TestedBean)myMethodIsReturningSubBeanValue_enter_0[1]))).then(exitAnswer(myMethodIsReturningSubBeanValue_diffsOnExit_1, response0));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"l1\",\"value\":1,\"valueObject\":2,\"subBean\":{\"value2\":\"v2\"}}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":8.0}"), JsonSerialisationUtils.deserialize("{\"@type\":\"com.freeyourcode.testgenerator.test.TestedBean\",\"libelle\":\"l1\",\"value\":1,\"valueObject\":2,\"subBean\":{\"value2\":\"v2\"}}")};
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethodIsReturningSubBeanValue((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);
		assertEquals(JsonSerialisationUtils.deserialize("\"v2\""), testedMethodResult);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethodIsReturningSubBeanValue(Mockito.anyDouble(), (TestedBean)Mockito.any());
	}

	@Test
	public void testmyMethodNoParamNoResult_21() throws Exception {
		//Mock the stub methods
		Mockito.doNothing().when(testedClassStub).myMethodNoParamNoResult();
		
		//Call to tested method
		classCallingTestedClassWithFieldInjection.myMethodNoParamNoResult();
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethodNoParamNoResult();
	}

	@Test
	public void testmyMethodNoParamResult_22() throws Exception {
		//Mock the stub methods
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":2.0}");
		Mockito.when(testedClassStub.myMethodNoParamResult()).thenReturn((Double)response0);
		
		//Call to tested method
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethodNoParamResult();
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":2.0}"), testedMethodResult);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethodNoParamResult();
	}

	@Test
	public void testmyMethodNoParamResultPrimitif_23() throws Exception {
		//Mock the stub methods
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":2.0}");
		Mockito.when(testedClassStub.myMethodNoParamResultPrimitif()).thenReturn((Double)response0);
		
		//Call to tested method
		Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethodNoParamResultPrimitif();
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":2.0}"), testedMethodResult);
		
		//Check the number of calls to stub methods
		Mockito.verify(testedClassStub, Mockito.times(1)).myMethodNoParamResultPrimitif();
	}

}
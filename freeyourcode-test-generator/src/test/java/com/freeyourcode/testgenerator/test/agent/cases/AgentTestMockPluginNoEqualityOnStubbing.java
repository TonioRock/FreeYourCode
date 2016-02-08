package com.freeyourcode.testgenerator.test.agent.cases;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freeyourcode.testgenerator.agent.constant.AgentProperties;
import com.freeyourcode.testgenerator.test.ClassCallingTestedClassWithFieldInjection;
import com.freeyourcode.testgenerator.test.HibernateProxyTestedBean;
import com.freeyourcode.testgenerator.test.HibernateProxyTestedSubBean;
import com.freeyourcode.testgenerator.test.TestedBean;
import com.freeyourcode.testgenerator.test.TestedClass;
import com.freeyourcode.testgenerator.test.TestedSubBean;
import com.freeyourcode.testgenerator.test.agent.AgentOneTestedClassTest;

/**
 * Same test as AgentTestMockPluginWithFullInjectionTest but we would like to ensure that there won't be a NPE
 * when we are going to execute the generated tests (ensure that injections are managed by Mockito correctly).
 *
 */
public class AgentTestMockPluginNoEqualityOnStubbing extends AgentOneTestedClassTest {
	
	@Override
	protected Class<?> getTestedClass() {
		return ClassCallingTestedClassWithFieldInjection.class;
	}
	
	@BeforeClass
	public  void lancementAgent(){
		lancementAgent(AgentProperties.CONFIG_FILE_PATH+"=./src/test/java/agentTestMockPluginConfigNoEqualityOnStubbing.xml");
	}
	
	@BeforeMethod
	public  void resetBetweenTwoTests(){
		resetTestChecker();
	}
	
	@Override
	protected <T> T createNewInstanceOfTestedClass(Class<T> cls) throws Exception {
		T instance = super.createNewInstanceOfTestedClass(cls);
		//we simulate an injection by any framework
		 Field field = cls.getDeclaredField("testedClass");
		field.setAccessible(true);
		field.set(instance, loadClass(TestedClass.class).newInstance());
		field.setAccessible(false);
		return instance;
	}

	
	@Test
	public void testMyMethodNoParamNoResult() throws Exception{
		
		invokeMethod("myMethodNoParamNoResult");
		assertTestIs("@Test" + 
				"public void testmyMethodNoParamNoResult_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Mockito.doNothing().when(testedClassStub).myMethodNoParamNoResult();" + 
				"" + 
				"//Call to tested method" + 
				"classCallingTestedClassWithFieldInjection.myMethodNoParamNoResult();" + 
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethodNoParamNoResult();" + 
				"}");
		
		}
	
	@Test
	public void testMyMethodNoParamResult() throws Exception{
		
		invokeMethod("myMethodNoParamResult");
		assertTestIs("@Test" + 
				"public void testmyMethodNoParamResult_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object response0 = JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":2.0}\");" + 
				"Mockito.when(testedClassStub.myMethodNoParamResult()).thenReturn((Double)response0);" + 
				"" + 
				"//Call to tested method" + 
				"Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethodNoParamResult();" + 
				"assertEquals(JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":2.0}\"), testedMethodResult);" + 
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethodNoParamResult();" + 
				"}");
	}
	
	
	@Test
	public void testMyMethodNoParamResultPrimitif() throws Exception{
		
		invokeMethod("myMethodNoParamResultPrimitif");
		assertTestIs("@Test" + 
				"public void testmyMethodNoParamResultPrimitif_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object response0 = JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":2.0}\");" + 
				"Mockito.when(testedClassStub.myMethodNoParamResultPrimitif()).thenReturn((Double)response0);" + 
				"" + 
				"//Call to tested method" + 
				"Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethodNoParamResultPrimitif();" + 
				"assertEquals(JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":2.0}\"), testedMethodResult);" + 
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethodNoParamResultPrimitif();" + 
				"}");
	}
	
	@Test
	public void testMyMethod1ParamNoResult() throws Exception{
		
		invokeMethod("myMethod1ParamNoResult", 17.14);
		assertTestIs("@Test" + 
				"public void testmyMethod1ParamNoResult_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod1ParamNoResult_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":17.14}\")};"+
				"Mockito.doAnswer(exitAnswer(myMethod1ParamNoResult_exit0)).when(testedClassStub).myMethod1ParamNoResult((Double)Mockito.any());" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":17.14}\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":17.14}\")};" + 
				"classCallingTestedClassWithFieldInjection.myMethod1ParamNoResult((Double)inputParams_enter[0]);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamNoResult((Double)Mockito.any());" + 
				"}");
	}
	
	@Test
	public void testMyMethod1ParamNoResult_ParamDefaultValue() throws Exception{
		
		invokeMethod("myMethod1ParamNoResult", new Object[]{null});
		assertTestIs("@Test" + 
				"public void testmyMethod1ParamNoResult_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod1ParamNoResult_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"null\")};" + 
				"Mockito.doAnswer(exitAnswer(myMethod1ParamNoResult_exit0)).when(testedClassStub).myMethod1ParamNoResult((Double)Mockito.any());" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"null\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"null\")};" + 
				"classCallingTestedClassWithFieldInjection.myMethod1ParamNoResult((Double)inputParams_enter[0]);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamNoResult((Double)Mockito.any());" + 
				"}");
	}
	
	
	@Test
	public void testMyMethod1ParamResult() throws Exception{
		
		invokeMethod("myMethod1ParamResult", 9d);
		assertTestIs("@Test" + 
				"public void testmyMethod1ParamResult_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod1ParamResult_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":9.0}\")};" + 
				"Object response0 = JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":18.0}\");" + 
				"Mockito.when(testedClassStub.myMethod1ParamResult((Double)Mockito.any())).then(exitAnswer(myMethod1ParamResult_exit0, response0));" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":9.0}\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":9.0}\")};" + 
				"Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod1ParamResult((Double)inputParams_enter[0]);" + 
				"assertEquals(JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":18.0}\"), testedMethodResult);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamResult((Double)Mockito.any());" + 
				"}");
	}
	
	@Test
	public void testMyMethod1ParamResult_NPEException() throws Exception{
		
		try{
			invokeMethod("myMethod1ParamResult", new Object[]{null});
		}
		catch(InvocationTargetException e){
			//L'appel � myMethod1ParamResult a g�n�r�e une exception dans la m�thode, celle-ci doit donc �tre enregistr�e
			//dans les tests
			Assert.assertEquals(NullPointerException.class, e.getCause().getClass());
		}
		assertTestIs("@Test(expectedExceptions = NullPointerException.class)" + 
				"public void testmyMethod1ParamResult_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Mockito.when(testedClassStub.myMethod1ParamResult((Double)Mockito.any())).thenThrow((Throwable)JsonSerialisationUtils.deserialize(\"{\\\"@id\\\":1,\\\"@type\\\":\\\"java.lang.NullPointerException\\\",\\\"cause\\\":{\\\"@ref\\\":1},\\\"stackTrace\\\":[],\\\"suppressedExceptions\\\":{\\\"@type\\\":\\\"java.util.Collections$UnmodifiableRandomAccessList\\\"}}\"));" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"null\")};" + 
				"classCallingTestedClassWithFieldInjection.myMethod1ParamResult((Double)inputParams_enter[0]);" + 
				"}");
	}
	
	@Test
	public void testMyMethod1ParamPrimitifResultPrimitif() throws Exception{
		
		invokeMethod("myMethod1ParamPrimitifResultPrimitif", 4.0003);
		assertTestIs("@Test" + 
				"public void testmyMethod1ParamPrimitifResultPrimitif_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod1ParamPrimitifResultPrimitif_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":4.0003}\")};" + 
				"Object response0 = JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0006}\");" + 
				"Mockito.when(testedClassStub.myMethod1ParamPrimitifResultPrimitif(Mockito.anyDouble())).then(exitAnswer(myMethod1ParamPrimitifResultPrimitif_exit0, response0));" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":4.0003}\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":4.0003}\")};" + 
				"Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod1ParamPrimitifResultPrimitif((Double)inputParams_enter[0]);" + 
				"assertEquals(JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0006}\"), testedMethodResult);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamPrimitifResultPrimitif(Mockito.anyDouble());" + 
				"}");
	}
	
	@Test
	public void testMyMethod1ParamPrimitifResultPrimitif_defaultPrimitiveValue_defaultResultValue() throws Exception{
		
		invokeMethod("myMethod1ParamPrimitifResultPrimitif", 0.0);
		assertTestIs("@Test" + 
				"public void testmyMethod1ParamPrimitifResultPrimitif_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod1ParamPrimitifResultPrimitif_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\"}\")};" + 
				"Object response0 = JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\"}\");" + 
				"Mockito.when(testedClassStub.myMethod1ParamPrimitifResultPrimitif(Mockito.anyDouble())).then(exitAnswer(myMethod1ParamPrimitifResultPrimitif_exit0, response0));" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\"}\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\"}\")};" + 
				"Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod1ParamPrimitifResultPrimitif((Double)inputParams_enter[0]);" + 
				"assertEquals(JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\"}\"), testedMethodResult);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod1ParamPrimitifResultPrimitif(Mockito.anyDouble());" + 
				"}");
	}
	
	@Test
	public void testMyMethod2ParamNoResult_withParamFieldDefaultValues() throws Exception{
		
		invokeMethod("myMethod2ParamNoResult", 8d, new TestedBean());
		assertTestIs("@Test" + 
				"public void testmyMethod2ParamNoResult_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod2ParamNoResult_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\"}\")};" + 
				"Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_exit0)).when(testedClassStub).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\"}\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\"}\")};" + 
				"classCallingTestedClassWithFieldInjection.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());" + 
				"}");
	}
	
	@Test
	public void testMyMethod2ParamNoResult_withParamFieldDefaultValuesPassedInParameters() throws Exception{
		
		invokeMethod("myMethod2ParamNoResult", 8d, new TestedBean(null,0,null));
		assertTestIs("@Test" + 
				"public void testmyMethod2ParamNoResult_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod2ParamNoResult_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\"}\")};" + 
				"Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_exit0)).when(testedClassStub).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\"}\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\"}\")};" + 
				"classCallingTestedClassWithFieldInjection.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());" + 
				"}");
	}
	
	@Test
	public void testMyMethod2ParamNoResult_0ForIntegerIsNotADefaultValue() throws Exception{
		
		invokeMethod("myMethod2ParamNoResult", 8d, new TestedBean(null,0,0));
		assertTestIs("@Test" + 
				"public void testmyMethod2ParamNoResult_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod2ParamNoResult_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"valueObject\\\":0}\")};" + 
				"Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_exit0)).when(testedClassStub).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"valueObject\\\":0}\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"valueObject\\\":0}\")};" + 
				"classCallingTestedClassWithFieldInjection.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());" + 
				"}");
	}
	
	
	@Test
	public void testMyMethod2ParamNoResult() throws Exception{
		
		invokeMethod("myMethod2ParamNoResult", 8d, new TestedBean("lib", 1, 2));
		assertTestIs("@Test" + 
				"public void testmyMethod2ParamNoResult_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod2ParamNoResult_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"libelle\\\":\\\"lib\\\",\\\"value\\\":1,\\\"valueObject\\\":2}\")};" + 
				"Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_exit0)).when(testedClassStub).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"libelle\\\":\\\"lib\\\",\\\"value\\\":1,\\\"valueObject\\\":2}\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"libelle\\\":\\\"lib\\\",\\\"value\\\":1,\\\"valueObject\\\":2}\")};" + 
				"classCallingTestedClassWithFieldInjection.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());" + 
				"}");
	}
	
	
	@Test
	public void testMyMethod2ParamNoResultWithParamNull() throws Exception{
		
		invokeMethod("myMethod2ParamNoResult", 8d, null);
		assertTestIs("@Test" + 
				"public void testmyMethod2ParamNoResult_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod2ParamNoResult_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"null\")};" + 
				"Mockito.doAnswer(exitAnswer(myMethod2ParamNoResult_exit0)).when(testedClassStub).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"null\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":8.0}\"), JsonSerialisationUtils.deserialize(\"null\")};" + 
				"classCallingTestedClassWithFieldInjection.myMethod2ParamNoResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamNoResult((Double)Mockito.any(), (TestedBean)Mockito.any());" + 
				"}");
	}
	
	@Test
	public void testMyMethod2ParamResult() throws Exception{
		
		invokeMethod("myMethod2ParamResult", 45.2d, new TestedBean("coucou",7,8));
		assertTestIs("@Test" + 
				"public void testmyMethod2ParamResult_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod2ParamResult_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":45.2}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"libelle\\\":\\\"coucou\\\",\\\"value\\\":7,\\\"valueObject\\\":8}\")};" + 
				"Object response0 = JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":90.4}\");" + 
				"Mockito.when(testedClassStub.myMethod2ParamResult((Double)Mockito.any(), (TestedBean)Mockito.any())).then(exitAnswer(myMethod2ParamResult_exit0, response0));" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":45.2}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"libelle\\\":\\\"coucou\\\",\\\"value\\\":7,\\\"valueObject\\\":8}\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":45.2}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"libelle\\\":\\\"coucou\\\",\\\"value\\\":7,\\\"valueObject\\\":8}\")};" + 
				"Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod2ParamResult((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);" + 
				"assertEquals(JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":90.4}\"), testedMethodResult);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamResult((Double)Mockito.any(), (TestedBean)Mockito.any());" + 
				"}");
	}
	
	private void assertTestMyMethod2ParamPrimitifResultPrimitif() throws Exception{
		assertTestIs("@Test" + 
				"public void testmyMethod2ParamPrimitifResultPrimitif_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod2ParamPrimitifResultPrimitif_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":45.2}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"libelle\\\":\\\"coucou\\\",\\\"value\\\":7,\\\"valueObject\\\":8}\")};" + 
				"Object response0 = JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":90.4}\");" + 
				"Mockito.when(testedClassStub.myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any())).then(exitAnswer(myMethod2ParamPrimitifResultPrimitif_exit0, response0));" + 
				"" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":45.2}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"libelle\\\":\\\"coucou\\\",\\\"value\\\":7,\\\"valueObject\\\":8}\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":45.2}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"libelle\\\":\\\"coucou\\\",\\\"value\\\":7,\\\"valueObject\\\":8}\")};" + 
				"Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);" + 
				"assertEquals(JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":90.4}\"), testedMethodResult);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any());" + 
				"}");
	}
	
	@Test
	public void testMyMethod2ParamPrimitifResultPrimitif() throws Exception{
		
		invokeMethod("myMethod2ParamPrimitifResultPrimitif", 45.2d, new TestedBean("coucou",7,8));
		assertTestMyMethod2ParamPrimitifResultPrimitif();
	}
	
	@Test
	public void testHibernateProxy_testMyMethod2ParamPrimitifResultPrimitif() throws Exception{
		
		HibernateProxyTestedBean hibernateProxyObject = new HibernateProxyTestedBean(new TestedBean("coucou",7,8));
		invokeMethod("myMethod2ParamPrimitifResultPrimitif", 45.2d, hibernateProxyObject);
		assertTestMyMethod2ParamPrimitifResultPrimitif();
	}
	
	private void assertTestMyMethod2ParamPrimitifResultPrimitif_withSubBeanRenseignee() throws Exception{
		assertTestIs("@Test" + 
				"public void testmyMethod2ParamPrimitifResultPrimitif_"+nextTestId()+"() throws Exception {" + 
				"//Mock the stub methods" + 
				"Object[] myMethod2ParamPrimitifResultPrimitif_exit0 = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":45.2}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"libelle\\\":\\\"coucou\\\",\\\"value\\\":7,\\\"valueObject\\\":8,\\\"subBean\\\":{\\\"value2\\\":\\\"test\\\"}}\")};" + 
				"Object response0 = JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":90.4}\");" + 
				"Mockito.when(testedClassStub.myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any())).then(exitAnswer(myMethod2ParamPrimitifResultPrimitif_exit0, response0));" + 
				"//Call to tested method" + 
				"Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":45.2}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"libelle\\\":\\\"coucou\\\",\\\"value\\\":7,\\\"valueObject\\\":8,\\\"subBean\\\":{\\\"value2\\\":\\\"test\\\"}}\")};" + 
				"Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":45.2}\"), JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"com.freeyourcode.testgenerator.test.TestedBean\\\",\\\"libelle\\\":\\\"coucou\\\",\\\"value\\\":7,\\\"valueObject\\\":8,\\\"subBean\\\":{\\\"value2\\\":\\\"test\\\"}}\")};" + 
				"Object testedMethodResult = classCallingTestedClassWithFieldInjection.myMethod2ParamPrimitifResultPrimitif((Double)inputParams_enter[0], (TestedBean)inputParams_enter[1]);" + 
				"assertEquals(JsonSerialisationUtils.deserialize(\"{\\\"@type\\\":\\\"double\\\",\\\"value\\\":90.4}\"), testedMethodResult);" + 
				"assertEquals(inputParams_exit, inputParams_enter);"+
				"" + 
				"//Check the number of calls to stub methods" + 
				"Mockito.verify(testedClassStub, Mockito.times(1)).myMethod2ParamPrimitifResultPrimitif(Mockito.anyDouble(), (TestedBean)Mockito.any());" + 
				"}");
	}
	
	@Test
	public void testMyMethod2ParamPrimitifResultPrimitif_withSubBeanRenseignee() throws Exception{
		
		invokeMethod("myMethod2ParamPrimitifResultPrimitif", 45.2d, new TestedBean("coucou",7,8, new TestedSubBean("test")));
		assertTestMyMethod2ParamPrimitifResultPrimitif_withSubBeanRenseignee();
	}
	
	@Test
	public void testHibernateProxySubBeanOnly_testMyMethod2ParamPrimitifResultPrimitif_withSubBeanRenseignee() throws Exception{
		
		HibernateProxyTestedSubBean hibernateProxySubObject = new HibernateProxyTestedSubBean(new TestedSubBean("test"));
		invokeMethod("myMethod2ParamPrimitifResultPrimitif", 45.2d, new TestedBean("coucou",7,8, hibernateProxySubObject));
		assertTestMyMethod2ParamPrimitifResultPrimitif_withSubBeanRenseignee();
	}
	
	@Test
	public void testHibernateProxy_testMyMethod2ParamPrimitifResultPrimitif_withSubBeanRenseignee() throws Exception{
		
		HibernateProxyTestedSubBean hibernateProxySubObject = new HibernateProxyTestedSubBean(new TestedSubBean("test"));
		HibernateProxyTestedBean hibernateProxyObject = new HibernateProxyTestedBean(new TestedBean("coucou",7,8, hibernateProxySubObject));
		invokeMethod("myMethod2ParamPrimitifResultPrimitif", 45.2d, hibernateProxyObject);
		assertTestMyMethod2ParamPrimitifResultPrimitif_withSubBeanRenseignee();
	}
	
}
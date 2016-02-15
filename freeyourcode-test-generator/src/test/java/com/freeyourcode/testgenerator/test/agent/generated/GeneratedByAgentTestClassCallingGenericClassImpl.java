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
import com.freeyourcode.testgenerator.test.GenericClassImpl;
import com.freeyourcode.testgenerator.test.ClassCallingGenericClassImpl;
import java.lang.Double;

/**
* Test generated by a FreeYourCode agent at 2016-02-15T18:35:39.081+0100
*/
@PrepareForTest({ClassCallingGenericClassImpl.class})
public class GeneratedByAgentTestClassCallingGenericClassImpl extends GeneratedTestCase {

	@InjectMocks
	private ClassCallingGenericClassImpl classCallingGenericClassImpl;
	@Mock
	private GenericClassImpl genericClassImplStub;

	@Test
	public void testabstractCompute_0() throws Exception {
		//Mock the stub methods
		Object[] abstractCompute_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":7.0}")};
		Object[] abstractCompute_diffsOnExit_1 = new Object[]{null};
		Mockito.doAnswer(exitAnswer(abstractCompute_diffsOnExit_1)).when(genericClassImplStub).abstractCompute(Mockito.eq((Double)abstractCompute_enter_0[0]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":7.0}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":7.0}")};
		classCallingGenericClassImpl.abstractCompute((Double)inputParams_enter[0]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(genericClassImplStub, Mockito.times(1)).abstractCompute((Double)Mockito.any());
	}

	@Test
	public void testcompute_1() throws Exception {
		//Mock the stub methods
		Object response0 = JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":7.0}");
		Mockito.when(genericClassImplStub.compute()).thenReturn((Double)response0);
		
		//Call to tested method
		Object testedMethodResult = classCallingGenericClassImpl.compute();
		assertEquals(JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":7.0}"), testedMethodResult);
		
		//Check the number of calls to stub methods
		Mockito.verify(genericClassImplStub, Mockito.times(1)).compute();
	}

	@Test
	public void testcompute_2() throws Exception {
		//Mock the stub methods
		Object[] compute_enter_0 = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":7.0}")};
		Object[] compute_diffsOnExit_1 = new Object[]{null};
		Mockito.doAnswer(exitAnswer(compute_diffsOnExit_1)).when(genericClassImplStub).compute(Mockito.eq((Double)compute_enter_0[0]));
		
		//Call to tested method
		Object[] inputParams_enter = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":7.0}")};
		Object[] inputParams_exit = new Object[]{JsonSerialisationUtils.deserialize("{\"@type\":\"double\",\"value\":7.0}")};
		classCallingGenericClassImpl.compute((Double)inputParams_enter[0]);
		assertEquals(inputParams_exit, inputParams_enter);
		
		//Check the number of calls to stub methods
		Mockito.verify(genericClassImplStub, Mockito.times(1)).compute((Double)Mockito.any());
	}

}
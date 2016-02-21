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
import com.freeyourcode.testgenerator.test.ClassWithNewObjectWithoutCall;
import com.freeyourcode.testgenerator.test.TestedClass;

/**
* Test generated by a FreeYourCode agent
*/
@PrepareForTest({ClassWithNewObjectWithoutCall.class})
public class GeneratedByAgentTestMockPluginConfigWithNewObjectWithoutCall extends GeneratedTestCase {

	@Mock
	private TestedClass testedClassStub;
	@InjectMocks
	private ClassWithNewObjectWithoutCall classWithNewObjectWithoutCall;

	@Test
	public void testmyMethodIsCreatingANewInstanceOfTestedClassInitializedWithAlreadySetField_0() throws Exception {
		//Call to tested method
		classWithNewObjectWithoutCall.myMethodIsCreatingANewInstanceOfTestedClassInitializedWithAlreadySetField();
	}

}
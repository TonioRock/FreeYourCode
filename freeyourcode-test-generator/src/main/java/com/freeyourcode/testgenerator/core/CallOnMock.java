package com.freeyourcode.testgenerator.core;

import com.freeyourcode.prettyjson.JsonSerialisationUtils;
import com.freeyourcode.test.utils.InputPointerResolver;
import com.freeyourcode.test.utils.deepanalyser.DeepFinder;

public class CallOnMock {

	private final MethodDescriptor descriptor;
	private final MethodParameters parameters;
	private Object response;
	private String responsePointer;
	private String serializedResponse;
	private boolean hasAlreadySearchedForResponsePointer;
	private Exception exception;
	private final Class<?> returnedClass;

	public CallOnMock(MethodDescriptor descriptor, Object[] parameters, Class<?> returnedClass) {
		this.descriptor = descriptor;
		this.parameters = new MethodParameters(parameters);
		this.returnedClass = returnedClass;
	}

	public Object getResponse() {
		return response;
	}

	public CallOnMock setResponse(Object response) {
		this.response = response;
		return this;
	}

	public void freezeResponse() throws Exception {
		if (response != null && serializedResponse == null) {
			String pathToInputRef = findResponsePointer();
			serializedResponse = JsonSerialisationUtils.writeObjectInJava(pathToInputRef != null ? new InputPointerResolver(pathToInputRef) : response);
		}
	}

	public String findResponsePointer() throws Exception {
		// TODO seulement pr hibernate cette gestion...
		if (response != null && !hasAlreadySearchedForResponsePointer) {
			responsePointer = DeepFinder.find(response, parameters.getInputParams());
			hasAlreadySearchedForResponsePointer = true;
		}
		return responsePointer;
	}

	public String getSerializedResponse() {
		return serializedResponse;
	}

	public Exception getException() {
		return exception;
	}

	public CallOnMock setException(Exception exception) {
		this.exception = exception;
		return this;
	}

	public MethodDescriptor getDescriptor() {
		return descriptor;
	}

	public Class<?> getReturnedClass() {
		return returnedClass;
	}

	public MethodParameters getParameters() {
		return parameters;
	}

}
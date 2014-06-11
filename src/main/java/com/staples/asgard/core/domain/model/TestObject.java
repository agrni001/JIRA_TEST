package com.staples.asgard.core.domain.model;

import java.io.Serializable;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Component
@JsonAutoDetect(getterVisibility = Visibility.PUBLIC_ONLY, setterVisibility = Visibility.PUBLIC_ONLY, fieldVisibility = Visibility.PUBLIC_ONLY)
@JsonInclude(Include.NON_NULL)
public class TestObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2391031514357299298L;

	private String testString = "";
	private String errors = null;

	public TestObject() {
		super();
	}

	public TestObject(String testString) {
		super();
		this.testString = testString;
	}

	public TestObject(
			@SuppressWarnings("rawtypes") org.springframework.util.LinkedMultiValueMap requestParaMultiValueMap) {
		super();
		try {

			if (requestParaMultiValueMap.containsKey("test")) {
				setTestString(requestParaMultiValueMap.get("test").toString());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}

	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

	@ServiceActivator
	public TestObject changeTestString(TestObject obj) {

		// ((TestObject)obj).setTestString(((TestObject)obj).getTestString() +
		// " - date " + new
		// GregorianCalendar(TimeZone.getDefault()).toString());
		obj.setTestString(obj.getTestString() + " - date "
				+ String.valueOf(System.currentTimeMillis()));
		return obj;
	}

}

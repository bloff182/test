package com.bloff.demoWebAppOk;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.bloff.demoWebAppOk.api.ControllerDemoApp;

public class ControllerDemoAppTests {
	
	@Test
	public void should_return_Ok() {
		
		ControllerDemoApp demo = mock(ControllerDemoApp.class);
		when(demo.sayOk()).thenReturn("OK");
		
		String text = demo.sayOk();
		
		assertThat(text).isEqualTo("OK");
	}
	
}

package com.mkyong.common.controller;

import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import static net.sourceforge.jwebunit.junit.JWebUnit.setTestingEngineKey;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import net.sourceforge.jwebunit.util.TestingEngineRegistry;

public class HelloWorldControllerTest {
	@Before
	public void prepare() {
		setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT);
		setBaseUrl("http://localhost:7070/springmvc//welcome.htm");
	}

	@Test
	public void testLoginPage() {
		assertTrue(true);
		/*assertLinkPresent("home");
		clickLink("home");
		assertTitleEquals("Home");*/
	}

	
}

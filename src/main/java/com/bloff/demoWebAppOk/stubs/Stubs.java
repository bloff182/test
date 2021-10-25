package com.bloff.demoWebAppOk.stubs;

import org.mockserver.integration.ClientAndServer;
import static org.mockserver.integration.ClientAndServer.startClientAndServer;

public class Stubs {
	
	private ClientAndServer mockServer;
	
//	@BeforeEach
	public void setUp() {
		mockServer = ClientAndServer.startClientAndServer(1080);
	}

}

package com.akash.withDIp;

public class ClientApp {
	
	private ServiceApp serviceApp;
	
	
	/*
	 * Dependency is injected via the constructor
	 */
	public ClientApp(ServiceApp serviceApp) {
		this.serviceApp = serviceApp;
	}
	
	public void doSomething() {
		serviceApp.serve();
	}

}

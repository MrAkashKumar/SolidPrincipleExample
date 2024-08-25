package com.akash.withDIp;
/**
 * 
 */
public class Runner {

	public static void main(String[] args) {
		// TODO 
		
		ServiceApp serviceApp = new ServiceApp();
		ClientApp clientApp = new ClientApp(serviceApp);
		clientApp.doSomething();

	}

}

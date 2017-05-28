package com.abelhzo.bus.soap.activator;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.abelhzo.client.bus.roles.ListRolSOAPResponse;

@Component("usersEndpoint")
public class UsersEndpoint {
	
	@ServiceActivator(inputChannel = "requestChannelRoles", autoStartup = "true")
	public ListRolSOAPResponse responseRoles(ListRolSOAPResponse response) {
		System.out.println("**************************");
		System.out.println(response);
		System.out.println("**************************");
		return response;
	}

}

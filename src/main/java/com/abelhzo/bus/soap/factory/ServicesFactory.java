package com.abelhzo.bus.soap.factory;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.abelhzo.client.bus.roles.RolesServiceSOAP;
import com.abelhzo.client.bus.users.UsersServiceSOAP;

public class ServicesFactory {

	private ServicesFactory() {

	}

	public static UsersServiceSOAP getUsersService() {
		URL urlWSDL = null;
		try {
			urlWSDL = new URL("http://localhost:8085/UsersManagementSOAP/UsersServiceSOAP?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		QName SERVICE_ROLES = new QName("http://abelhzo.users/", "RolesServiceSOAP");
		Service service = Service.create(urlWSDL, SERVICE_ROLES);
		QName portName = new QName("UsersServicePortSOAP");
		UsersServiceSOAP usersServiceSOAP = service.getPort(portName, UsersServiceSOAP.class);
		return usersServiceSOAP;
	}

	public static RolesServiceSOAP getRolesService() {
		URL urlWSDL = null;
		try {
			urlWSDL = new URL("http://localhost:8085/UsersManagementSOAP/RolesServiceSOAP?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		QName SERVICE_ROLES = new QName("http://abelhzo.roles/", "RolesServiceSOAP");
		Service service = Service.create(urlWSDL, SERVICE_ROLES); 
		QName portName = new QName("RolesServicePortSOAP");
		RolesServiceSOAP rolesServiceSOAP = service.getPort(portName, RolesServiceSOAP.class);
		return rolesServiceSOAP;
	}

}

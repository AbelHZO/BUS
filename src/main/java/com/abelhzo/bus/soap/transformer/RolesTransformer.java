package com.abelhzo.bus.soap.transformer;

import javax.xml.bind.JAXBElement;

import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

import com.abelhzo.client.bus.roles.GetRolSOAPResponse;
import com.abelhzo.client.bus.roles.ListRolSOAPResponse;

@Component("rolesTransformer")
public class RolesTransformer {

	@Transformer
	public ListRolSOAPResponse responseListRol(JAXBElement<ListRolSOAPResponse> jaxb) {
		return jaxb.getValue();
	}
	
	@Transformer
	public GetRolSOAPResponse responseGetRol(JAXBElement<GetRolSOAPResponse> jaxb) {
		return jaxb.getValue();
	}
	
}
